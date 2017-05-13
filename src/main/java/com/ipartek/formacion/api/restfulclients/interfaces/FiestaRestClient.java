/**
 * 
 */
package com.ipartek.formacion.api.restfulclients.interfaces;

import java.util.List;

import com.ipartek.formacion.dbms.persistence.Fiesta;

/**
 * @author Alberto
 *
 */
public interface FiestaRestClient {
	
	final static String URL = "http://localhost:8080/gestiondocente/api/fiesta";

	public List<Fiesta> getAll();

	public Fiesta getById(int codigo);

	public Fiesta update(Fiesta fiesta);

	public Fiesta create(Fiesta fiesta);

	public void delete(int codigo);

}
