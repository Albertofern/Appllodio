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

import com.ipartek.formacion.dbms.dao.interfaces.FiestaDAO;
import com.ipartek.formacion.dbms.mappers.FiestaMapper;
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
	private JdbcTemplate jdbctemplate;
	private SimpleJdbcCall jdbcCall;

	private Logger logger = LoggerFactory.getLogger(FiestaDAOImp.class);

	@Autowired
	@Qualifier("mysqlDataSource")
	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbctemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Fiesta create(Fiesta fiesta) {
		final String SQL = "fiestaCreate";
		this.jdbcCall = new SimpleJdbcCall(dataSource);
		jdbcCall.withProcedureName(SQL);
		SqlParameterSource in = new MapSqlParameterSource()
				.addValue("pnombre", fiesta.getNombre())
				.addValue("pdescripcion", fiesta.getDescripcion())
				.addValue("pfecha", fiesta.getFecha());	
		logger.info("METHOD DAO: getAll() -- PARAMS: " + fiesta.toString());
		Map<String, Object> out = jdbcCall.execute(in);
		fiesta.setCodigo((Integer) out.get("pcodigo"));
		return fiesta;
	}

	@Override
	public List<Fiesta> getAll() {
		final String SQL = "CALL fiestagetAll";
		List<Fiesta> fiestas = null;
		try {
			fiestas = jdbctemplate.query(SQL, new FiestaMapper());
			logger.info("METHOD DAO: getAll() -- LIST SIZE: " + String.valueOf(fiestas.size()));
		} catch (EmptyResultDataAccessException e) {
			logger.trace("NO DATA:  " + e.getMessage() + " " + SQL);
			// fiestas= new ArrayList<Fiesta>();
		}
		return fiestas;
	}

	@Override
	public Fiesta getById(int codigo) {
		Fiesta fiesta = null;
		final String SQL = "CALL fiestagetById(?)";
		try {
			fiesta = jdbctemplate.queryForObject(SQL, new FiestaMapper(), new Object[] { codigo });
			logger.info("METHOD DAO: getById() -- PARAMS:  " + fiesta.toString());
		} catch (EmptyResultDataAccessException e) {
			fiesta = null;
			logger.info("NO DATA:  " + codigo + " " + e.getMessage());
		}
		return fiesta;
	}

	@Override
	public Fiesta update(Fiesta fiesta) {
		final String SQL = "fiestaUpdate";

		this.jdbcCall = new SimpleJdbcCall(dataSource);
		jdbcCall.withProcedureName(SQL);
		SqlParameterSource in = new MapSqlParameterSource().addValue("pcodigo", fiesta.getCodigo())
				.addValue("pnombre",fiesta.getNombre())
				.addValue("pdescripcion",fiesta.getDescripcion())
				.addValue("pfecha",fiesta.getFecha());

		logger.info("METHOD DAO: update() -- PARAMS:  " + fiesta.toString());
		jdbcCall.execute(in);

		return fiesta;
	}

	@Override
	public void delete(int codigo) {
		String SQL = "fiestaDelete";
		this.jdbcCall = new SimpleJdbcCall(dataSource);
		jdbcCall.withProcedureName(SQL);
		SqlParameterSource in = new MapSqlParameterSource().addValue("pcodigo", codigo);
		logger.info("METHOD DAO: delete()");
		jdbcCall.execute(in);
	}

}
