/**
 * 
 */
package com.ipartek.formacion.dbms.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.ipartek.formacion.dbms.dao.interfaces.RestauranteDAO;
import com.ipartek.formacion.dbms.persistence.Restaurante;

/**
 * @author Alberto
 *
 */

@Repository("restauranteDaoImp")
public class RestauranteDAOImp implements RestauranteDAO {

	@Autowired
	@Qualifier("mysqlDataSource")
	private DataSource dataSource;
	
	

	@Autowired
	@Qualifier("mysqlDataSource")
	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public Restaurante create(Restaurante restau) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Restaurante> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Restaurante getById(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Restaurante update(Restaurante restau) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Restaurante getByNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

}
