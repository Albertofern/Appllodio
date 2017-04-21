/**
 * 
 */
package com.ipartek.formacion.dbms.dao;

import java.util.List;

import javax.sql.DataSource;

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



	@Autowired
	@Qualifier("mysqlDataSource")
	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public Fiesta create(Fiesta fiesta) {
		// TODO Auto-generated method stub
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
