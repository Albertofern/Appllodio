/**
 * 
 */
package com.ipartek.formacion.dbms.persistence;

import java.io.Serializable;

/**
 * @author Alberto Fernandez
 *
 */
public class Contacto implements Comparable<Contacto>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3617036158019292854L;

	public static final int CODIGO_NULO = -1;

	private int codigo;
	private String nombre;
	private String ambito;
	private String telefono;
	private boolean activo;

	/**
	 * 
	 */
	public Contacto() {
		super();
		this.codigo = CODIGO_NULO;
		this.nombre = "";
		this.ambito = "";
		this.telefono = "";
		this.activo = true;
	}

	@Override
	public int compareTo(Contacto o) {
		return this.nombre.compareToIgnoreCase(o.getNombre());
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
	 * @return the activo
	 */
	public boolean isActivo() {
		return activo;
	}

	/**
	 * @param activo
	 *            the activo to set
	 */
	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}

	/* (non-Javadoc)
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
		if (!(obj instanceof Contacto)) {
			return false;
		}
		Contacto other = (Contacto) obj;
		if (codigo != other.codigo) {
			return false;
		}
		return true;
	}

	
	
	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Contacto [codigo=" + codigo + ", nombre=" + nombre + ", ambito=" + ambito + ", telefono=" + telefono
				+ ", activo=" + activo + "]";
	}



	
	
	
	
}
