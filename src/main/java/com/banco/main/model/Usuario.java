package com.banco.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idUsuario")
	private Integer idUsuario;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellido")
	private String apellido;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "calificacion_Buro")
	private String calificacionBuro;
	
	
	public Usuario() {
	
	}
	
	
	public Usuario(Integer idUsuario, String nombre, String apellido, String email,
			String calificacionBuro) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.calificacionBuro = calificacionBuro;
	}
	
	public Usuario(String nombre, String apellido, String email,
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
	
	 
	

}
