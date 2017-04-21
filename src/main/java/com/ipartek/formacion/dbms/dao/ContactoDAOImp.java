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

import com.ipartek.formacion.dbms.dao.interfaces.ContactoDAO;
import com.ipartek.formacion.dbms.persistence.Contacto;


/**
 * @author Alberto Fernandez
 *
 */


@Repository("contactoDaoImp")
public class ContactoDAOImp implements ContactoDAO {

	
	
	@Autowired
	@Qualifier("mysqlDataSource")
	private DataSource dataSource;

	private Logger logger = LoggerFactory.getLogger(ContactoDAOImp.class);
	
	@Autowired
	@Qualifier("mysqlDataSource")
	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public Contacto create(Contacto contacto) {
		logger.info("METHOD DAO: getAll() -- PARAMS: " + contacto.toString());
		return null;
	}

	@Override
	public List<Contacto> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contacto getById(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contacto update(Contacto contacto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int codigo) {
		// TODO Auto-generated method stub
		
	}

}
