/**
 * 
 */
package com.ipartek.formacion.api.restfulservers.restaurante;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.ipartek.formacion.dbms.persistence.Restaurante;
import com.ipartek.formacion.service.interfaces.RestauranteService;

/**
 * @author Alberto
 *
 */

@RestController
@RequestMapping(value = "/api/restaurantes")
public class RestauranteRestController {

private static final Logger logger = LoggerFactory.getLogger(RestauranteRestController.class);
	
	@Autowired
	RestauranteService rS;
	
	// http://gestionllodio/api/restaurantes/{1}
	// PUT ---->
	// DELETE ->
	// GET ---->
	// http://gestionformacion/api/restaurante
	// POST --->
	// GET ---->
	
	@RequestMapping(value = "/{codigo}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Restaurante> getById(@PathVariable("codigo") int id) {
		Restaurante restaurante = rS.getById(id);
		
		ResponseEntity<Restaurante> response = null;
		if(restaurante == null){
			response = new ResponseEntity<Restaurante>(HttpStatus.NOT_FOUND);
			logger.info("codigo barrio: " + id);
		} else { // 200 // el ResponseEntity usa el constructor con BODY que nos
		// enviara contacto!
		response = new ResponseEntity<Restaurante>(restaurante, HttpStatus.OK);
		}
		return response;
	}
	
	@RequestMapping(method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<List<Restaurante>> getAll() {
		List<Restaurante> restaurantes = rS.getAll();
		ResponseEntity<List<Restaurante>> response = null;
		if (restaurantes == null || restaurantes.isEmpty()) {
			response = new ResponseEntity<List<Restaurante>>(HttpStatus.NO_CONTENT);
			logger.info("Pasa por getAll()");
		} else {
			response = new ResponseEntity<List<Restaurante>>(restaurantes,HttpStatus.OK);
		}
		return response;
	}
	
	
	@RequestMapping(method = RequestMethod.POST, consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Void> create(@RequestBody Restaurante restaurante, UriComponentsBuilder ucBuilder) {

		Restaurante restau = rS.getById(restaurante.getCodigo());
		ResponseEntity<Void> response = null;

		if (restau != null) {
			response = new ResponseEntity<Void>(HttpStatus.CONFLICT);
		} else {
			// por si algun campo para hacer el create no esta rellenado y lo
			// hemos requerido ! not null, syze...
			Restaurante aux = rS.create(restaurante);
		}
		return response;
	}

	@RequestMapping(value = "/{codigo}", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, method = RequestMethod.PUT, produces = {
					MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Restaurante> update(@PathVariable("codigo") int id, @RequestBody Restaurante restaurante) {

		Restaurante restau = rS.getById(id);
		ResponseEntity<Restaurante> response = null;

		if (restau == null) {
			response = new ResponseEntity<Restaurante>(HttpStatus.NOT_FOUND);
		} else {
			try {
				restau = rS.update(restaurante);
				response = new ResponseEntity<Restaurante>(restau, HttpStatus.ACCEPTED);
			} catch (Exception e) {
				response = new ResponseEntity<Restaurante>(restau, HttpStatus.NOT_ACCEPTABLE);
			}
		}
		return response;
	}

	@RequestMapping(value = "/{codigo}", method = RequestMethod.DELETE, produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Restaurante> deleteById(@PathVariable("codigo") int id) {
		Restaurante restau = rS.getById(id);
		ResponseEntity<Restaurante> response = null;
		if (restau == null) {
			response = new ResponseEntity<Restaurante>(HttpStatus.NOT_FOUND);
		} else {
			rS.delete(id);
			response = new ResponseEntity<Restaurante>(HttpStatus.NO_CONTENT);
		}
		return response;
	}
}
