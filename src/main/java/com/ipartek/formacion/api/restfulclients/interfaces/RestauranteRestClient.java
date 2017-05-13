/**
 * 
 */
package com.ipartek.formacion.api.restfulclients.interfaces;

import java.util.List;

import com.ipartek.formacion.dbms.persistence.Restaurante;

/**
 * @author Alberto
 *
 */
public interface RestauranteRestClient {

	final static String URL = "http://localhost:8080/gestiondocente/api/restaurantes";

	public List<Restaurante> getAll();

	public Restaurante getById(int codigo);

	public Restaurante update(Restaurante restaurante);

	public Restaurante create(Restaurante restaurante);

	public void delete(int codigo);
}
