/**
 * 
 */
package com.mso.datos.model;

import java.io.Serializable;

/**
 * @author sol12
 *
 */
public class DtoResponseAlmacenar implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6439106853279796520L;

	private String descripcion;
	private int status;
	private int codigo;
	private boolean error;
	private String respuesta;

	public DtoResponseAlmacenar() {
		super();
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

}
