/**
 * 
 */
package com.ipartek.formacion.api.restfulclients;

import java.net.URI;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ipartek.formacion.api.restfulclients.interfaces.ContactoRestClient;
import com.ipartek.formacion.dbms.persistence.Contacto;

/**
 * @author Alberto
 *
 */

@Service
public class ContactoRestClientImp implements ContactoRestClient{

	@Override
	public List<Contacto> getAll() {
		List<Contacto> contactos = null;
		RestTemplate template = new RestTemplate();
		// el parse de JSON/XML a Objeto Java lo hace JACKSON.
		contactos = template.getForObject(ContactoRestClient.URL, List.class);
		return contactos;
	}

	@Override
	public Contacto getById(int codigo) {
		Contacto contacto = null;
		RestTemplate template = new RestTemplate();
		
		contacto = template.getForObject(ContactoRestClient.URL + "/" + codigo, Contacto.class);
		
		return contacto;
	}

	@Override
	public Contacto update(Contacto contacto) {
		RestTemplate template = new RestTemplate();
		template.put(ContactoRestClient.URL + "/" + contacto.getCodigo(), contacto);
		return contacto;
	}

	@Override
	public Contacto create(Contacto contacto) {
		RestTemplate template = new RestTemplate();
		// Alumno alum = template.postForObject(AlumnoRestClient.URL, alumno,
		// Alumno.class);

		URI uri = template.postForLocation(ContactoRestClient.URL, contacto);
		Contacto cont = template.getForObject(uri, Contacto.class);
		return cont;
	}

	@Override
	public void delete(int codigo) {
		RestTemplate template = new RestTemplate();
		template.delete(ContactoRestClient.URL + "/" + codigo);
		
	}

}
