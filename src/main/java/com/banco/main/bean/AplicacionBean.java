package com.banco.main.bean;

import java.io.Serializable;
import java.util.Date;

import com.banco.main.model.Producto;
import com.banco.main.model.Usuario;

public class AplicacionBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int folio;
	private Usuario usuario;
	private Producto producto;
	private Date fechaAplicacion;
	private char aprobacion;
	private Date fechaAprovacion;
	private double montoAutorizado;
	
	public AplicacionBean() {
	}
	
	public AplicacionBean(int folio, Usuario usuario, Producto producto, Date fechaAplicacion, char aprobacion,
			Date fechaAprovacion, double montoAutorizado) {
		this.folio = folio;
		this.usuario = usuario;
		this.producto = producto;
		this.fechaAplicacion = fechaAplicacion;
		this.aprobacion = aprobacion;
		this.fechaAprovacion = fechaAprovacion;
		this.montoAutorizado = montoAutorizado;
	}
	
	public AplicacionBean(Usuario usuario, Producto producto, Date fechaAplicacion, char aprobacion,
			Date fechaAprovacion, double montoAutorizado) {
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

	@Override
	public String toString() {
		return "AplicacionBean [folio=" + folio + ", usuario=" + usuario + ", producto=" + producto
				+ ", fechaAplicacion=" + fechaAplicacion + ", aprobacion=" + aprobacion + ", fechaAprovacion="
				+ fechaAprovacion + ", montoAutorizado=" + montoAutorizado + "]";
	}
	
}
