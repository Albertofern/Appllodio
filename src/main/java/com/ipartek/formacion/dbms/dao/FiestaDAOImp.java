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

import com.ipartek.formacion.dbms.dao.interfaces.FiestaDAO;
import com.ipartek.formacion.dbms.persistence.Fiesta;

/**
 * @author Alberto Fernandez
 *
 */
@Repository("fiestaDaoImp")
public class FiestaDAOImp implements FiestaDAO {

	@Autowired
	@Qualifier("mysqlDataSource")
	private DataSource dataSource;

	private Logger logger = LoggerFactory.getLogger(FiestaDAOImp.class);

	@Autowired
	@Qualifier("mysqlDataSource")
	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public Fiesta create(Fiesta fiesta) {
		logger.info("METHOD DAO: getAll() -- PARAMS: " + fiesta.toString());
		return null;
	}

	@Override
	public List<Fiesta> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Fiesta getById(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Fiesta update(Fiesta fiesta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int codigo) {
		// TODO Auto-generated method stub
		
	}

}
