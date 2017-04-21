/**
 * 
 */
package com.ipartek.formacion.dbms.persistence;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Alberto
 *
 */
public class Fiesta implements Comparable<Fiesta>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int CODIGO_NULO = -1;

	private int codigo;
	private String nombre;
	private String descripcion;
	private Date fecha;
	private Barrio barrio;

	/**
	 * 
	 */
	public Fiesta() {
		super();
		this.codigo = CODIGO_NULO;
		this.nombre = "";
		this.descripcion = "";
		this.fecha = null;
		this.barrio = null;
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

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion
	 *            the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @param fecha
	 *            the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
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
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Fiesta)) {
			return false;
		}
		Fiesta other = (Fiesta) obj;
		if (codigo != other.codigo) {
			return false;
		}
		return true;
	}

	@Override
	public int compareTo(Fiesta o) {
		return this.nombre.compareToIgnoreCase(o.getNombre());
	}

	/**
	 * @return the barrio
	 */
	public Barrio getBarrio() {
		return barrio;
	}

	/**
	 * @param barrio
	 *            the barrio to set
	 */
	public void setBarrio(Barrio barrio) {
		this.barrio = barrio;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Fiesta [codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fecha=" + fecha
				+ ", barrio=" + barrio + "]";
	}

}
