/**
 * 
 */
package com.ipartek.formacion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipartek.formacion.dbms.dao.interfaces.BarrioDAO;
import com.ipartek.formacion.dbms.persistence.Barrio;
import com.ipartek.formacion.service.interfaces.BarrioService;

/**
 * @author Alberto Fernandez
 *
 */
@Service
public class BarrioServiceImp implements BarrioService{

	@Autowired
	private BarrioDAO barrioDao;
	
	
	@Override
	public Barrio create(Barrio barrio) {
		return barrioDao.create(barrio);
	}

	@Override
	public List<Barrio> getAll() {
		return barrioDao.getAll();
	}

	@Override
	public Barrio getById(int codigo) {
		return barrioDao.getById(codigo);
	}

	@Override
	public Barrio update(Barrio barrio) {
		return barrioDao.update(barrio);
	}

	@Override
	public void delete(int codigo) {
		barrioDao.delete(codigo);
	}

	@Override
	public Barrio getByNombre(String nombre) {
		return barrioDao.getByNombre(nombre);
	}

	@Override
	public Barrio getInforme(int codigo) {
		Barrio barrio = barrioDao.getInforme(codigo);
		return barrio;
	}

}
