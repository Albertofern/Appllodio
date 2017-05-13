/**
 * 
 */
package com.ipartek.formacion.api.restfulservers.contacto;

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

import com.ipartek.formacion.dbms.persistence.Contacto;
import com.ipartek.formacion.service.interfaces.ContactoService;

/**
 * @author Alberto
 *
 */
@RestController
@RequestMapping(value = "/api/contactos")
public class ContactoRestController {

	private static final Logger logger = LoggerFactory.getLogger(ContactoRestController.class);

	@Autowired
	ContactoService cS;

	// http://gestionllodio/api/contactos/{1}
	// PUT ---->
	// DELETE ->
	// GET ---->
	// http://gestionformacion/api/contacto
	// POST --->
	// GET ---->

	


	@RequestMapping(value = "/{codigo}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Contacto> getById(@PathVariable("codigo") int id) {
		Contacto contacto = cS.getById(id);
		ResponseEntity<Contacto> response = null;

		if (contacto == null) {// 404
			response = new ResponseEntity<Contacto>(HttpStatus.NOT_FOUND);
			logger.info("codigo contacto: " + id);
		} else { // 200 // el ResponseEntity usa el constructor con BODY que nos
					// enviara contacto!
			response = new ResponseEntity<Contacto>(contacto, HttpStatus.OK);
		}
		return response;
	}

	@RequestMapping(method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<List<Contacto>> getAll() {
		List<Contacto> contactos = cS.getAll();
		ResponseEntity<List<Contacto>> response = null;

		if (contactos == null || contactos.isEmpty()) {
			response = new ResponseEntity<List<Contacto>>(HttpStatus.NO_CONTENT);
			logger.info("Pasa por getAll()");
		} else {
			response = new ResponseEntity<List<Contacto>>(contactos, HttpStatus.OK);
		}
		return response;
	}

	@RequestMapping(method = RequestMethod.POST, consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Void> create(@RequestBody Contacto contacto, UriComponentsBuilder ucBuilder) {

		Contacto cont = cS.getById(contacto.getCodigo());
		ResponseEntity<Void> response = null;

		if (cont != null) {
			response = new ResponseEntity<Void>(HttpStatus.CONFLICT);
		} else {
			// por si algun campo para hacer el create no esta rellenado y lo
			// hemos requerido ! not null, syze...
			Contacto aux = cS.create(contacto);
		}
		return response;
	}

	@RequestMapping(value = "/{codigo}", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, method = RequestMethod.PUT, produces = {
					MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Contacto> update(@PathVariable("codigo") int id, @RequestBody Contacto contacto) {

		Contacto cont = cS.getById(id);
		ResponseEntity<Contacto> response = null;

		if (cont == null) {
			response = new ResponseEntity<Contacto>(HttpStatus.NOT_FOUND);
		} else {
			try {
				cont = cS.update(contacto);
				response = new ResponseEntity<Contacto>(cont, HttpStatus.ACCEPTED);
			} catch (Exception e) {
				response = new ResponseEntity<Contacto>(cont, HttpStatus.NOT_ACCEPTABLE);
			}
		}
		return response;
	}

	@RequestMapping(value = "/{codigo}", method = RequestMethod.DELETE, produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Contacto> deleteById(@PathVariable("codigo") int id) {
		Contacto cont = cS.getById(id);
		ResponseEntity<Contacto> response = null;
		if (cont == null) {
			response = new ResponseEntity<Contacto>(HttpStatus.NOT_FOUND);
		} else {
			cS.delete(id);
			response = new ResponseEntity<Contacto>(HttpStatus.NO_CONTENT);
		}
		return response;
	}

}
