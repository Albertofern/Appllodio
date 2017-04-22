/**
 * 
 */
package com.ipartek.formacion.service.interfaces;

import java.util.List;

import com.ipartek.formacion.dbms.persistence.Restaurante;

/**
 * @author Alberto
 *
 */
public interface RestauranteService {

	public Restaurante create(Restaurante restaurante);

	public List<Restaurante> getAll();

	public Restaurante getById(int codigo);

	public Restaurante update(Restaurante restaurante);

	public void delete(int codigo);
	
	public Restaurante getByNombre(String nombre);
	
}
