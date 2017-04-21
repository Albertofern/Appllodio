/**
 * 
 */
package com.ipartek.formacion.dbms.persistence;

import java.io.Serializable;

/**
 * @author Alberto
 *
 */
public class Enlace implements Comparable<Enlace>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5262817829311520205L;

	public static final int CODIGO_NULO = -1;

	private int codigo;
	private String nombre;
	private String ambito;
	private String enlace;

	/**
	 * 
	 */
	public Enlace() {
		super();
		this.codigo = CODIGO_NULO;
		this.nombre = "";
		this.ambito = "";
		this.enlace = "";
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
	 * @return the ambito
	 */
	public String getAmbito() {
		return ambito;
	}

	/**
	 * @param ambito
	 *            the ambito to set
	 */
	public void setAmbito(String ambito) {
		this.ambito = ambito;
	}

	/**
	 * @return the enlace
	 */
	public String getEnlace() {
		return enlace;
	}

	/**
	 * @param enlace
	 *            the enlace to set
	 */
	public void setEnlace(String enlace) {
		this.enlace = enlace;
	}

	@Override
	public int compareTo(Enlace o) {
		return this.nombre.compareToIgnoreCase(o.getNombre());
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
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Enlace other = (Enlace) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Enlace [codigo=" + codigo + ", nombre=" + nombre + ", ambito=" + ambito + ", enlace=" + enlace + "]";
	}

}
