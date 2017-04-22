/**
 * 
 */
package com.ipartek.formacion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipartek.formacion.dbms.dao.interfaces.ContactoDAO;
import com.ipartek.formacion.dbms.persistence.Contacto;
import com.ipartek.formacion.service.interfaces.ContactoService;

/**
 * @author Alberto Fernandez
 *
 */

@Service
public class ContactoServiceImp implements ContactoService {

	@Autowired
	private ContactoDAO contactoDao;
	
	
	@Override
	public Contacto create(Contacto contacto) {
		return contactoDao.create(contacto);
	}

	@Override
	public List<Contacto> getAll() {
		return contactoDao.getAll();
	}

	@Override
	public Contacto getById(int codigo) {
		return contactoDao.getById(codigo);
	}

	@Override
	public Contacto update(Contacto contacto) {
		return contactoDao.update(contacto);
	}

	@Override
	public void delete(int codigo) {
		contactoDao.delete(codigo);
	}

}
