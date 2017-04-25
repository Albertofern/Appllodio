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

import com.ipartek.formacion.dbms.dao.interfaces.RestauranteDAO;
import com.ipartek.formacion.dbms.mappers.RestauranteMapper;
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
	private JdbcTemplate jdbctemplate;
	private SimpleJdbcCall jdbcCall;
	
	private Logger logger = LoggerFactory.getLogger(RestauranteDAOImp.class);
	

	@Autowired
	@Qualifier("mysqlDataSource")
	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbctemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Restaurante create(Restaurante restau) {
		final String SQL = "restauranteCreate";
		this.jdbcCall = new SimpleJdbcCall(dataSource);
		jdbcCall.withProcedureName(SQL);
		SqlParameterSource in = new MapSqlParameterSource().addValue("pnombre", restau.getNombre())
				.addValue("pdireccion", restau.getDireccion()).addValue("pnumero", restau.getNumero())
				.addValue("ptelefono", restau.getTelefono()).addValue("pdocumento", restau.getDocumento());
		logger.info("METHOD DAO: getAll() -- PARAMS: " + restau.toString());
		Map<String, Object> out = jdbcCall.execute(in);
		restau.setCodigo((Integer) out.get("pcodigo"));
		return restau;
	}

	@Override
	public List<Restaurante> getAll() {
		final String SQL = "CALL restaurantegetAll";
		List<Restaurante> restaurantes = null;
		try {
			restaurantes = jdbctemplate.query(SQL, new RestauranteMapper());
			logger.info("METHOD DAO: getAll() -- LIST SIZE: " + String.valueOf(restaurantes.size()));
		} catch (EmptyResultDataAccessException e) {
			logger.trace("NO DATA:" + e.getMessage() + " " + SQL);
			// restaurantes= new ArrayList<Restaurante>();
		}
		return restaurantes;
	}

	@Override
	public Restaurante getById(int codigo) {
		Restaurante restau = null;
		final String SQL = "CALL restaurantegetById(?)";
		try {
			restau = jdbctemplate.queryForObject(SQL, new RestauranteMapper(), new Object[] { codigo });
			logger.info("METHOD DAO: getById() -- PARAMS:  " +restau.toString());
		} catch (EmptyResultDataAccessException e) {
			restau = null;
			logger.info("NO DATA: " + codigo + " " + e.getMessage());
		}
		return restau;
	}
	

	@Override
	public Restaurante update(Restaurante restau) {
		final String SQL = "restauranteUpdate";

		this.jdbcCall = new SimpleJdbcCall(dataSource);
		jdbcCall.withProcedureName(SQL);
		SqlParameterSource in = new MapSqlParameterSource().addValue("pcodigo", restau.getCodigo())
				.addValue("pnombre", restau.getNombre()).addValue("pdireccion", restau.getDireccion())
				.addValue("pnumero", restau.getNumero()).addValue("ptelefono", restau.getTelefono())
				.addValue("pdocumento", restau.getDocumento());
		logger.info("METHOD DAO: update() -- PARAMS:  " +restau.toString());
		jdbcCall.execute(in);

		return restau;
	}

	@Override
	public void delete(int codigo) {
		String SQL = "restauranteDelete";
		this.jdbcCall = new SimpleJdbcCall(dataSource);
		jdbcCall.withProcedureName(SQL);
		SqlParameterSource in = new MapSqlParameterSource().addValue("pcodigo", codigo);
		logger.info("METHOD DAO: delete()");

		jdbcCall.execute(in);
	}

	@Override
	public Restaurante getByNombre(String nombre) {
		Restaurante restau = null;
		final String SQL = "CALL restaurantegetByNombre(?)";
		try {
			restau = jdbctemplate.queryForObject(SQL, new RestauranteMapper(), new Object[] { nombre } );
			logger.info("METHOD DAO: getByNombre() -- PARAMS:  " + restau.toString());
		}catch (EmptyResultDataAccessException e) {
			restau=null;
			logger.info("NO DATA:  " + nombre + " " + e.getMessage());
		}
		return restau;
	}

}
