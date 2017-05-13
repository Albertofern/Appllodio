/**
 * 
 */
package com.ipartek.formacion.api.restfulclients;

import java.net.URI;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ipartek.formacion.api.restfulclients.interfaces.FiestaRestClient;
import com.ipartek.formacion.dbms.persistence.Fiesta;

/**
 * @author Alberto
 *
 */

@Service
public class FiestaRestClientImp implements FiestaRestClient{

	@Override
	public List<Fiesta> getAll() {
		List<Fiesta> fiestas = null;
		RestTemplate template = new RestTemplate();
		// el parse de JSON/XML a Objeto Java lo hace JACKSON.
		fiestas = template.getForObject(FiestaRestClient.URL, List.class);

		return fiestas;
	}

	@Override
	public Fiesta getById(int codigo) {
		Fiesta fiesta = null;
		RestTemplate template = new RestTemplate();
		fiesta = template.getForObject(FiestaRestClient.URL + "/" + codigo, Fiesta.class);
		return fiesta;
	}

	@Override
	public Fiesta update(Fiesta fiesta) {
		RestTemplate template = new RestTemplate();
		template.put(FiestaRestClient.URL + "/" + fiesta.getCodigo(), fiesta);
		return fiesta;
	}

	@Override
	public Fiesta create(Fiesta fiesta) {
		RestTemplate template = new RestTemplate();
		// Fiesta fies = template.postForObject(FiestaRestClient.URL, fiesta,
		// Fiesta.class);

		URI uri = template.postForLocation(FiestaRestClient.URL, fiesta);
		Fiesta fies = template.getForObject(uri, Fiesta.class);
		return fies;
	}

	@Override
	public void delete(int codigo) {
		RestTemplate template = new RestTemplate();
		template.delete(FiestaRestClient.URL + "/" + codigo);
		
	}

}
