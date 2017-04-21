/**
 * 
 */
package com.ipartek.formacion.dbms.dao.interfaces;

import java.util.List;

import com.ipartek.formacion.dbms.persistence.Fiesta;



/**
 * @author Alberto Fernandez
 *
 */
public interface FiestaDAO  extends DAOSetter{
	
	public Fiesta create(Fiesta fiesta);
 	
	public List<Fiesta> getAll();
	
	public Fiesta getById(int codigo);
	 	
	public Fiesta update(Fiesta fiesta);
	
	public void delete(int codigo);

}
