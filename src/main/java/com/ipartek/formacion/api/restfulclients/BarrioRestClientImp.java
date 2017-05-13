/**
 * 
 */
package com.ipartek.formacion.api.restfulclients;

import java.net.URI;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ipartek.formacion.api.restfulclients.interfaces.BarrioRestClient;
import com.ipartek.formacion.dbms.persistence.Barrio;

/**
 * @author Alberto
 *
 */

@Service
public class BarrioRestClientImp implements BarrioRestClient {

	@Override
	public List<Barrio> getAll() {
		List<Barrio> barrios = null;
		RestTemplate template = new RestTemplate();
		// el parse de JSON/XML a Objeto Java lo hace JACKSON.
		barrios = template.getForObject(BarrioRestClient.URL, List.class);

		return barrios;
	}

	@Override
	public Barrio getById(int codigo) {
		Barrio barrio = null;
		RestTemplate template = new RestTemplate();
		barrio = template.getForObject(BarrioRestClient.URL + "/" + codigo, Barrio.class);
		return barrio;
	}

	@Override
	public Barrio update(Barrio barrio) {
		RestTemplate template = new RestTemplate();
		template.put(BarrioRestClient.URL + "/" + barrio.getCodigo(), barrio);
		return barrio;	
	}

	@Override
	public Barrio create(Barrio barrio) {
		RestTemplate template = new RestTemplate();
		// Barrio barri = template.postForObject(BarrioRestClient.URL, barrio,
		// Barrio.class);

		URI uri = template.postForLocation(BarrioRestClient.URL, barrio);
		Barrio barri = template.getForObject(uri, Barrio.class);
		return barri;
	}

	@Override
	public void delete(int codigo) {
		RestTemplate template = new RestTemplate();
		template.delete(BarrioRestClient.URL + "/" + codigo);
		
	}

}
