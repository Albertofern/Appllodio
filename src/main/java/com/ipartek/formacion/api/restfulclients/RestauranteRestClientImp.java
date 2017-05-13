/**
 * 
 */
package com.ipartek.formacion.api.restfulclients;

import java.net.URI;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ipartek.formacion.api.restfulclients.interfaces.RestauranteRestClient;
import com.ipartek.formacion.dbms.persistence.Restaurante;


/**
 * @author Alberto
 *
 */

@Service
public class RestauranteRestClientImp implements RestauranteRestClient{

	@Override
	public List<Restaurante> getAll() {
		
		List<Restaurante> restaurantes = null;
		RestTemplate template = new RestTemplate();
		// el parse de JSON/XML a Objeto Java lo hace JACKSON.
		restaurantes = template.getForObject(RestauranteRestClient.URL, List.class);

		return restaurantes;
	}

	@Override
	public Restaurante getById(int codigo) {
		Restaurante restaurante = null;
		RestTemplate template = new RestTemplate();
		restaurante = template.getForObject(RestauranteRestClient.URL + "/" + codigo, Restaurante.class);
		return restaurante;
	}

	@Override
	public Restaurante update(Restaurante restaurante) {
		RestTemplate template = new RestTemplate();
		template.put(RestauranteRestClient.URL + "/" + restaurante.getCodigo(), restaurante);
		return restaurante;
	}

	@Override
	public Restaurante create(Restaurante restaurante) {
		RestTemplate template = new RestTemplate();
		// Alumno alum = template.postForObject(AlumnoRestClient.URL, alumno,
		// Alumno.class);

		URI uri = template.postForLocation(RestauranteRestClient.URL, restaurante);
		Restaurante restau = template.getForObject(uri, Restaurante.class);
		return restau;
	}

	@Override
	public void delete(int codigo) {
		RestTemplate template = new RestTemplate();
		template.delete(RestauranteRestClient.URL + "/" + codigo);
		
	}
	
	

}
