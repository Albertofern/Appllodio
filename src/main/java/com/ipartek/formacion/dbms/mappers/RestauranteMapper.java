/**
 * 
 */
package com.ipartek.formacion.dbms.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ipartek.formacion.dbms.persistence.Restaurante;

/**
 * @author Alberto
 *
 */
public class RestauranteMapper implements RowMapper<Restaurante>{

	@Override
	public Restaurante mapRow(ResultSet rs, int rowNum) throws SQLException {
		Restaurante restaurante = new Restaurante();
		restaurante.setCodigo(rs.getInt("codigo"));
		restaurante.setNombre(rs.getString("nombre"));
		restaurante.setTelefono(rs.getString("telefono"));
		restaurante.setDireccion(rs.getString("direccion"));
		restaurante.setNumero(rs.getString("numero"));	
		restaurante.setDocumento(rs.getNString("documento"));
		
		return restaurante;
		
		
	}

}
