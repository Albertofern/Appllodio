/**
 * 
 */
package com.ipartek.formacion.dbms.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ipartek.formacion.dbms.persistence.Fiesta;

/**
 * @author Alberto Fernandez
 *
 */
public class FiestaMapper implements RowMapper<Fiesta>{

	@Override
	public Fiesta mapRow(ResultSet rs, int rowNum) throws SQLException {
		Fiesta fiesta = new Fiesta();
		fiesta.setCodigo(rs.getInt("codigo"));
		fiesta.setNombre(rs.getString("nombre"));
		fiesta.setDescripcion(rs.getString("descripcion"));
		fiesta.setFecha(rs.getDate("fecha"));
		
		return fiesta;
	}

}
