/**
 * 
 */
package com.ipartek.formacion.dbms.persistence;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
 * @author Alberto
 *
 */
public class Barrio implements Comparable<Barrio>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7139900169013051827L;
	public static final int CODIGO_NULO = -1;

	private int codigo;
	private String nombre;
	private String documento;
	private Map<Long, Restaurante> restaurantes;
	private Map<Long, Fiesta> fiestas;

	/**
	 * 
	 */

	public Barrio() {
		super();
		this.codigo = CODIGO_NULO;
		this.nombre = "";
		restaurantes = new HashMap<Long, Restaurante>();
		fiestas = new HashMap<Long, Fiesta>();
		this.documento = "";
	}

	/**
	 * @return the fiestas
	 */
	public Map<Long, Fiesta> getFiestas() {
		return fiestas;
	}

	/**
	 * @param fiestas
	 *            the fiestas to set
	 */
	public void setFiestas(Map<Long, Fiesta> fiestas) {
		this.fiestas = fiestas;
	}

	/**
	 * @return the restaurantes
	 */
	public Map<Long, Restaurante> getRestaurantes() {
		return restaurantes;
	}

	/**
	 * @param restaurantes
	 *            the restaurantes to set
	 */
	public void setRestaurantes(Map<Long, Restaurante> restaurantes) {
		this.restaurantes = restaurantes;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo
	 *            the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;
		if (obj != null && obj instanceof Barrio) {
			Barrio barri = (Barrio) obj;
			if (this == barri || (barri.getCodigo() == this.codigo)) {
				iguales = true;
			}
		}
		return iguales;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Barrio o) {
		return this.nombre.compareToIgnoreCase(o.getNombre());
	}

	

	/**
	 * @return the documento
	 */
	public String getDocumento() {
		return documento;
	}

	/**
	 * @param documento the documento to set
	 */
	public void setDocumento(String documento) {
		this.documento = documento;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Barrio [codigo=" + codigo + ", nombre=" + nombre + ", documento=" + documento + ", restaurantes="
				+ restaurantes + ", fiestas=" + fiestas + "]";
	}



}
