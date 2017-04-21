/**
 * 
 */
package com.ipartek.formacion.dbms.dao;

import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.ipartek.formacion.dbms.dao.interfaces.BarrioDAO;
import com.ipartek.formacion.dbms.persistence.Barrio;

/**
 * @author Alberto Fernandez
 *
 */

@Repository("barrioDaoImp")
public class BarrioDAOImp implements BarrioDAO {

	@Autowired
	@Qualifier("mysqlDataSource")
	private DataSource dataSource;
	
	private Logger logger = LoggerFactory.getLogger(BarrioDAOImp.class);

	@Autowired
	@Qualifier("mysqlDataSource")
	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public Barrio create(Barrio barrio) {
		logger.info("METHOD DAO: getAll() -- PARAMS: " + barrio.toString());
		return null;
	}

	@Override
	public List<Barrio> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Barrio getById(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Barrio update(Barrio barrio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Barrio getByNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Barrio getInforme(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	

	

}
