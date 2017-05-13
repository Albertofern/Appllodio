/**
 * 
 */
package com.ipartek.formacion.api.restfulclients.interfaces;

import java.util.List;

import com.ipartek.formacion.dbms.persistence.Contacto;



/**
 * @author Alberto
 *
 */
public interface ContactoRestClient {

	final static String URL = "http://localhost:8080/gestiondocente/api/contactos";

	public List<Contacto> getAll();

	public Contacto getById(int codigo);

	public Contacto update(Contacto contacto);

	public Contacto create(Contacto contacto);

	public void delete(int codigo);
	
}
