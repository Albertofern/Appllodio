/**
 * 
 */
package com.ipartek.formacion.dbms.persistence;

import java.io.Serializable;

/**
 * @author Alberto
 *
 */
public class Restaurante implements Comparable<Restaurante>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2491029102748985623L;
	public static final int CODIGO_NULO = -1;

	private int codigo;
	private String nombre;
	private String direccion;
	private String telefono;
	private String numero;
	private Barrio barrio;

	public Restaurante() {
		super();
		this.codigo = CODIGO_NULO;
		this.nombre = "";
		this.direccion = "";
		this.numero = "S/N";
		this.telefono = "";
		this.barrio = null;

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
		if (obj != null && obj instanceof Restaurante) {
			Restaurante Restau = (Restaurante) obj;
			if (this == Restau || (Restau.getCodigo() == this.codigo)) {
				iguales = true;
			}
		}
		return iguales;
	}

	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @param numero
	 *            the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
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
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion
	 *            the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono
	 *            the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the descripcion
	 */

	/*
	 * /**
	 * 
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
		return "Restaurante [codigo=" + codigo + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono="
				+ telefono + ", numero=" + numero + ", barrio=" + barrio + "]";
	}

	@Override
	public int compareTo(Restaurante o) {
		return this.nombre.compareToIgnoreCase(o.getNombre());
	}

}
