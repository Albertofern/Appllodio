/**
 * 
 */
package com.ipartek.formacion.api.restfulclients.interfaces;

import java.util.List;

import com.ipartek.formacion.dbms.persistence.Barrio;

/**
 * @author Alberto
 *
 */
public interface BarrioRestClient {
	
	final static String URL = "http://localhost:8080/gestiondocente/api/barrios";

	public List<Barrio> getAll();

	public Barrio getById(int codigo);

	public Barrio update(Barrio barrio);

	public Barrio create(Barrio barrio);

	public void delete(int codigo);

}
