/**
 * 
 */
package com.ipartek.formacion.api.restfulservers.barrio;

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

import com.ipartek.formacion.dbms.persistence.Barrio;
import com.ipartek.formacion.service.interfaces.BarrioService;

/**
 * @author Alberto
 *
 */

@RestController
@RequestMapping(value = "/api/barrios")
public class BarrioRestController {

	private static final Logger logger = LoggerFactory.getLogger(BarrioRestController.class);
	
	@Autowired
	BarrioService bS;
	
	// http://gestionllodio/api/barrios/{1}
	// PUT ---->
	// DELETE ->
	// GET ---->
	// http://gestionformacion/api/barrio
	// POST --->
	// GET ---->
	
	@RequestMapping(value = "/{codigo}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Barrio> getById(@PathVariable("codigo") int id) {
		Barrio barrio = bS.getById(id);
		
		ResponseEntity<Barrio> response = null;
		if(barrio == null){
			response = new ResponseEntity<Barrio>(HttpStatus.NOT_FOUND);
			logger.info("codigo barrio: " + id);
		} else { // 200 // el ResponseEntity usa el constructor con BODY que nos
		// enviara contacto!
		response = new ResponseEntity<Barrio>(barrio, HttpStatus.OK);
		}
		return response;
	}
	
	@RequestMapping(method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<List<Barrio>> getAll() {
		List<Barrio> barrios = bS.getAll();
		ResponseEntity<List<Barrio>> response = null;
		if (barrios == null || barrios.isEmpty()) {
			response = new ResponseEntity<List<Barrio>>(HttpStatus.NO_CONTENT);
			logger.info("Pasa por getAll()");
		} else {
			response = new ResponseEntity<List<Barrio>>(barrios,HttpStatus.OK);
		}
		return response;
	}
	
	
	@RequestMapping(method = RequestMethod.POST, consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Void> create(@RequestBody Barrio barrio, UriComponentsBuilder ucBuilder) {

		Barrio barri = bS.getById(barrio.getCodigo());
		ResponseEntity<Void> response = null;

		if (barri != null) {
			response = new ResponseEntity<Void>(HttpStatus.CONFLICT);
		} else {
			// por si algun campo para hacer el create no esta rellenado y lo
			// hemos requerido ! not null, syze...
			Barrio aux = bS.create(barrio);
		}
		return response;
	}

	@RequestMapping(value = "/{codigo}", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, method = RequestMethod.PUT, produces = {
					MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Barrio> update(@PathVariable("codigo") int id, @RequestBody Barrio barrio) {

		Barrio barri = bS.getById(id);
		ResponseEntity<Barrio> response = null;

		if (barri == null) {
			response = new ResponseEntity<Barrio>(HttpStatus.NOT_FOUND);
		} else {
			try {
				barri = bS.update(barrio);
				response = new ResponseEntity<Barrio>(barri, HttpStatus.ACCEPTED);
			} catch (Exception e) {
				response = new ResponseEntity<Barrio>(barri, HttpStatus.NOT_ACCEPTABLE);
			}
		}
		return response;
	}

	@RequestMapping(value = "/{codigo}", method = RequestMethod.DELETE, produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Barrio> deleteById(@PathVariable("codigo") int id) {
		Barrio barri = bS.getById(id);
		ResponseEntity<Barrio> response = null;
		if (barri == null) {
			response = new ResponseEntity<Barrio>(HttpStatus.NOT_FOUND);
		} else {
			bS.delete(id);
			response = new ResponseEntity<Barrio>(HttpStatus.NO_CONTENT);
		}
		return response;
	}
}
