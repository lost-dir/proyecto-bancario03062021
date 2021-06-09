package com.banco.main.bean;

import java.io.Serializable;

public class UsuarioBean implements Serializable{
	
		
	private int idUsuario;
	private String nombre;
	private String apellido;
	private String email;
	private String calificacionBuro;
	
	
	public UsuarioBean() {
	
	}
		
	public UsuarioBean(int idUsuario, String nombre, String apellido, String email,
			String calificacionBuro) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.calificacionBuro = calificacionBuro;
	}
	
	public UsuarioBean(String nombre, String apellido, String email,
			String calificacionBuro) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.calificacionBuro = calificacionBuro;
	}


	public Integer getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCalificacionBuro() {
		return calificacionBuro;
	}


	public void setCalificacionBuro(String calificacionBuro) {
		this.calificacionBuro = calificacionBuro;
	}


	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", correoElectronico=" + email + ", calificacionBuro=" + calificacionBuro + "]";
	}
	
	 
	
	
	private static final long serialVersionUID = 1L;
	



}
