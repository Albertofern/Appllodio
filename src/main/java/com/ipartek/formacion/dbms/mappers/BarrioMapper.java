/**
 * 
 */
package com.ipartek.formacion.dbms.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ipartek.formacion.dbms.persistence.Barrio;

/**
 * @author Alberto Fernandez
 *
 */
public class BarrioMapper implements RowMapper<Barrio> {

	@Override
	public Barrio mapRow(ResultSet rs, int rowNum) throws SQLException {
		Barrio barrio = new Barrio();
		barrio.setCodigo(rs.getInt("codigo"));
		barrio.setNombre(rs.getString("nombre"));
		return barrio;
	}

}
