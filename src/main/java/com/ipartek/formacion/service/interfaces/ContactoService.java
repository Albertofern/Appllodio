/**
 * 
 */
package com.ipartek.formacion.service.interfaces;

import java.util.List;

import com.ipartek.formacion.dbms.persistence.Contacto;



/**
 * @author Alberto Fernandez
 *
 */
public interface ContactoService {

	public Contacto create(Contacto contacto);

	public List<Contacto> getAll();

	public Contacto getById(int codigo);

	public Contacto update(Contacto contacto);

	public void delete(int codigo);
	
}
