/**
 * 
 */
package com.ipartek.formacion.dbms.dao.interfaces;

import java.util.List;

import com.ipartek.formacion.dbms.persistence.Restaurante;

/**
 * @author Alberto
 *
 */
public interface RestauranteDAO extends DAOSetter {

	public Restaurante create(Restaurante restau);
 	
	public List<Restaurante> getAll();
	
	public Restaurante getById(int codigo);
	 	
	public Restaurante update(Restaurante restau);
	
	public void delete(int codigo);
	
	public Restaurante getByNombre(String nombre);
	

}
