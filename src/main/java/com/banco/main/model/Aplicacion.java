package com.banco.main.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "aplicacion")
public class Aplicacion {
	
	@Id
	@Column(name = "folio")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int folio;
	
	//reserved for one to one relationship
	@OneToOne
	@JoinColumn(name = "id_usuario", nullable = false)
	private Usuario usuario;
	
	@OneToOne
	@JoinColumn(name = "id_producto", nullable = false)
	private Producto producto;
	
	@Column(name = "fecha_aplicacion", nullable = false)
	private Date fechaAplicacion;
	
	@Column(name = "aprobacion", nullable = true)
	private char aprobacion;
	
	@Column(name = "fecha_aprobacion", nullable = true)
	private Date fechaAprovacion;
	
	@Column(name = "monto_autorizado", nullable = true)
	private double montoAutorizado;
	
	public Aplicacion() {
	}
	
	//constructor to update
	
	public Aplicacion(int folio, Usuario usuario, Producto producto, Date fechaAplicacion, char aprobacion, Date fechaAprovacion, double montoAutorizado) {
		this.folio = folio;
		this.usuario = usuario;
		this.producto = producto;
		this.fechaAplicacion = fechaAplicacion;
		this.aprobacion = aprobacion;
		this.fechaAprovacion = fechaAprovacion;
		this.montoAutorizado = montoAutorizado;
	}
	
	//constructor to create, since PK is now auto-generated, there is  no use to make a declaration of it
	
	public Aplicacion(Usuario usuario, Producto producto, Date fechaAplicacion, char aprobacion, Date fechaAprovacion,
			double montoAutorizado) {
		this.usuario = usuario;
		this.producto = producto;
		this.fechaAplicacion = fechaAplicacion;
		this.aprobacion = aprobacion;
		this.fechaAprovacion = fechaAprovacion;
		this.montoAutorizado = montoAutorizado;
	}

	public int getFolio() {
		return folio;
	}
	
	public void setFolio(int folio) {
		this.folio = folio;
	}
	
	public Date getFechaAplicacion() {
		return fechaAplicacion;
	}
	
	public void setFechaAplicacion(Date fechaAplicacion) {
		this.fechaAplicacion = fechaAplicacion;
	}
	
	public char getAprobacion() {
		return aprobacion;
	}
	
	public void setAprobacion(char aprobacion) {
		this.aprobacion = aprobacion;
	}
	
	public Date getFechaAprovacion() {
		return fechaAprovacion;
	}
	
	public void setFechaAprovacion(Date fechaAprovacion) {
		this.fechaAprovacion = fechaAprovacion;
	}
	
	public double getMontoAutorizado() {
		return montoAutorizado;
	}
	
	public void setMontoAutorizado(double montoAutorizado) {
		this.montoAutorizado = montoAutorizado;
	}
	
	//getter & setters for each relationship
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	//I've changed the method in order to print also a object of user and an object of product
	@Override
	public String toString() {
		return "Aplicacion [folio=" + folio + ", Usuario="+ usuario +", Producto=" + producto + ", fechaAplicacion=" + fechaAplicacion + ", aprobacion=" + aprobacion
				+ ", fechaAprovacion=" + fechaAprovacion + ", montoAutorizado=" + montoAutorizado + "]";
	}
}
