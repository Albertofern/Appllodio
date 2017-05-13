/**
 * 
 */
package com.ipartek.formacion.api.restfulservers.fiesta;

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

import com.ipartek.formacion.dbms.persistence.Fiesta;
import com.ipartek.formacion.service.interfaces.FiestaService;

/**
 * @author Alberto
 *
 */

@RestController
@RequestMapping(value = "/api/fiestas")
public class FiestaRestController {

	private static final Logger logger = LoggerFactory.getLogger(FiestaRestController.class);
	
	@Autowired
	FiestaService fS;

	// http://gestionllodio/api/Fiesta/{1}
	// PUT ---->
	// DELETE ->
	// GET ---->
	// http://gestionformacion/api/fiesta
	// POST --->
	// GET ---->
	
	@RequestMapping(value = "/{codigo}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Fiesta> getById(@PathVariable("codigo") int id) {
		Fiesta fiesta = fS.getById(id);
		
		ResponseEntity<Fiesta> response = null;
		if(fiesta == null){
			response = new ResponseEntity<Fiesta>(HttpStatus.NOT_FOUND);
			logger.info("codigo barrio: " + id);
		} else { // 200 // el ResponseEntity usa el constructor con BODY que nos
		// enviara contacto!
		response = new ResponseEntity<Fiesta>(fiesta, HttpStatus.OK);
		}
		return response;
	}
	
	@RequestMapping(method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<List<Fiesta>> getAll() {
		List<Fiesta> fiestas = fS.getAll();
		ResponseEntity<List<Fiesta>> response = null;
		if (fiestas == null || fiestas.isEmpty()) {
			response = new ResponseEntity<List<Fiesta>>(HttpStatus.NO_CONTENT);
			logger.info("Pasa por getAll()");
		} else {
			response = new ResponseEntity<List<Fiesta>>(fiestas,HttpStatus.OK);
		}
		return response;
	}
	
	
	@RequestMapping(method = RequestMethod.POST, consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Void> create(@RequestBody Fiesta fiesta, UriComponentsBuilder ucBuilder) {

		Fiesta fies = fS.getById(fiesta.getCodigo());
		ResponseEntity<Void> response = null;

		if (fies != null) {
			response = new ResponseEntity<Void>(HttpStatus.CONFLICT);
		} else {
			// por si algun campo para hacer el create no esta rellenado y lo
			// hemos requerido ! not null, syze...
			Fiesta aux = fS.create(fiesta);
		}
		return response;
	}

	@RequestMapping(value = "/{codigo}", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, method = RequestMethod.PUT, produces = {
					MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Fiesta> update(@PathVariable("codigo") int id, @RequestBody Fiesta fiesta) {

		Fiesta fies = fS.getById(id);
		ResponseEntity<Fiesta> response = null;

		if (fies == null) {
			response = new ResponseEntity<Fiesta>(HttpStatus.NOT_FOUND);
		} else {
			try {
				fies = fS.update(fiesta);
				response = new ResponseEntity<Fiesta>(fies, HttpStatus.ACCEPTED);
			} catch (Exception e) {
				response = new ResponseEntity<Fiesta>(fies, HttpStatus.NOT_ACCEPTABLE);
			}
		}
		return response;
	}

	@RequestMapping(value = "/{codigo}", method = RequestMethod.DELETE, produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Fiesta> deleteById(@PathVariable("codigo") int id) {
		Fiesta fies = fS.getById(id);
		ResponseEntity<Fiesta> response = null;
		if (fies == null) {
			response = new ResponseEntity<Fiesta>(HttpStatus.NOT_FOUND);
		} else {
			fS.delete(id);
			response = new ResponseEntity<Fiesta>(HttpStatus.NO_CONTENT);
		}
		return response;
	}
}
