/**
 * 
 */
package com.ipartek.formacion.dbms.dao;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.ipartek.formacion.dbms.dao.interfaces.BarrioDAO;
import com.ipartek.formacion.dbms.mappers.BarrioMapper;
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
	private JdbcTemplate jdbctemplate;
	private SimpleJdbcCall jdbcCall;
	
	private Logger logger = LoggerFactory.getLogger(BarrioDAOImp.class);

	@Autowired
	@Qualifier("mysqlDataSource")
	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbctemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Barrio create(Barrio barrio) {
		final String SQL = "barrioCreate";
		this.jdbcCall = new SimpleJdbcCall(dataSource);
		jdbcCall.withProcedureName(SQL);
		SqlParameterSource in = new MapSqlParameterSource()
				.addValue("pnombre", barrio.getNombre());

		logger.info("METHOD DAO: getAll() -- PARAMS: " + barrio.toString());
		Map<String, Object> out = jdbcCall.execute(in);
		barrio.setCodigo((Integer) out.get("pcodigo"));
		return barrio;
	}

	@Override
	public List<Barrio> getAll() {
		final String SQL = "CALL barriogetAll";
		List<Barrio> barrios = null;
		try {
			barrios = jdbctemplate.query(SQL, new BarrioMapper());
			logger.info("METHOD DAO: getAll() -- LIST SIZE: " + String.valueOf(barrios.size()));
		} catch (EmptyResultDataAccessException e) {
			logger.trace("NO DATA:  " + e.getMessage() + " " + SQL);
			// barrios= new ArrayList<Barrio>();
		}
		return barrios;
	}

	@Override
	public Barrio getById(int codigo) {
		Barrio barrio = null;
		final String SQL = "CALL barriogetById(?)";
		try {
			barrio = jdbctemplate.queryForObject(SQL, new BarrioMapper(), new Object[] { codigo });
			logger.info("METHOD DAO: getById() -- PARAMS:  " + barrio.toString());
		} catch (EmptyResultDataAccessException e) {
			barrio = null;
			logger.info("NO DATA:  " + codigo + " " + e.getMessage());
		}
		return barrio;
	}

	@Override
	public Barrio update(Barrio barrio) {
		final String SQL = "barrioUpdate";

		this.jdbcCall = new SimpleJdbcCall(dataSource);
		jdbcCall.withProcedureName(SQL);
		SqlParameterSource in = new MapSqlParameterSource().addValue("pcodigo", barrio.getCodigo()).addValue("pnombre",
				barrio.getNombre());

		logger.info("METHOD DAO: update() -- PARAMS:  " + barrio.toString());
		jdbcCall.execute(in);

		return barrio;
	}

	@Override
	public void delete(int codigo) {
		String SQL = "barrioDelete";
		this.jdbcCall = new SimpleJdbcCall(dataSource);
		jdbcCall.withProcedureName(SQL);
		SqlParameterSource in = new MapSqlParameterSource().addValue("pcodigo", codigo);
		logger.info("METHOD DAO: delete()");
		jdbcCall.execute(in);
	}

	@Override
	public Barrio getByNombre(String nombre) {
		Barrio barrio = null;
		final String SQL = "CALL barriogetByNombre(?)";
		try {
			barrio = jdbctemplate.queryForObject(SQL, new BarrioMapper(), new Object[] { nombre });
			logger.info("METHOD DAO: getByNombre() -- PARAMS:  " + barrio.toString());
		} catch (EmptyResultDataAccessException e) {
			barrio = null;
			logger.info("NO DATA:  " + nombre + " " + e.getMessage());
		}
		return barrio;
	}

	@Override
	public Barrio getInforme(int codigo) {
		
		return null;
	}

	

	

}
