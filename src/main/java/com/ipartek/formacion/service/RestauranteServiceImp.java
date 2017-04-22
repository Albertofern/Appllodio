/**
 * 
 */
package com.ipartek.formacion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipartek.formacion.dbms.dao.interfaces.RestauranteDAO;
import com.ipartek.formacion.dbms.persistence.Restaurante;
import com.ipartek.formacion.service.interfaces.RestauranteService;

/**
 * @author Alberto
 *
 */

@Service
public class RestauranteServiceImp implements RestauranteService {

	@Autowired
	private RestauranteDAO restauranteDao;

	@Override
	public Restaurante create(Restaurante restaurante) {
		return restauranteDao.create(restaurante);
	}

	@Override
	public List<Restaurante> getAll() {
		return restauranteDao.getAll();
	}

	@Override
	public Restaurante getById(int codigo) {

		return restauranteDao.getById(codigo);
	}

	@Override
	public Restaurante update(Restaurante restaurante) {
		return restauranteDao.update(restaurante);
	}

	@Override
	public void delete(int codigo) {
		restauranteDao.delete(codigo);
	}

	@Override
	public Restaurante getByNombre(String nombre) {
		return restauranteDao.getByNombre(nombre);
	}

	

}
