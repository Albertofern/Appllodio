/**
 * 
 */
package com.ipartek.formacion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipartek.formacion.dbms.dao.interfaces.FiestaDAO;
import com.ipartek.formacion.dbms.persistence.Fiesta;
import com.ipartek.formacion.service.interfaces.FiestaService;

/**
 * @author Alberto Fernandez
 *
 */
@Service
public class FiestaServiceImp implements FiestaService {

	
	@Autowired
	private FiestaDAO fiestaDao;
	
	
	
	@Override
	public Fiesta create(Fiesta fiesta) {
		return fiestaDao.create(fiesta);
	}

	@Override
	public List<Fiesta> getAll() {
		return fiestaDao.getAll();
	}

	@Override
	public Fiesta getById(int codigo) {
		return fiestaDao.getById(codigo);
	}

	@Override
	public Fiesta update(Fiesta fiesta) {
		return fiestaDao.update(fiesta);
	}

	@Override
	public void delete(int codigo) {
		fiestaDao.delete(codigo);
		
	}

}
