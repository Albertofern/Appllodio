/**
 * 
 */
package com.ipartek.formacion.dbms.dao.interfaces;

import java.util.List;

import com.ipartek.formacion.dbms.persistence.Barrio;

/**
 * @author Alberto Fernandez
 *
 */
public interface BarrioDAO extends DAOSetter {
	
	public Barrio create(Barrio barrio);
	 	
	public List<Barrio> getAll();
	
	public Barrio getById(int codigo);
	 	
	public Barrio update(Barrio barrio);
	
	public void delete(int codigo);

	public Barrio getByNombre(String nombre);
	
	public Barrio getInforme(int codigo);
}
