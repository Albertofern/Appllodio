/**
 * 
 */
package com.ipartek.formacion.service.interfaces;

import java.util.List;

import com.ipartek.formacion.dbms.persistence.Barrio;

/**
 * @author Curso
 *
 */
public interface BarrioService {

	public Barrio create(Barrio barrio);

	public List<Barrio> getAll();

	public Barrio getById(int codigo);

	public Barrio update(Barrio barrio);

	public void delete(int codigo);
	
	public Barrio getByNombre(String nombre);
	
	public Barrio getInforme(int codigo);

}
