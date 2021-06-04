package com.banco.main.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "aplicacion")
public class Aplicacion {
	
	@Id
	@Column(name = "folio")
	private int folio;
	
	//reserved for one to one relationship
	
	@Column(name = "fecha_aplicacion")
	private Date fechaAplicacion;
	
	@Column(name = "aprobacion", nullable = true)
	private char aprobacion;
	
	@Column(name = "fecha_aprobacion", nullable = true)
	private Date fechaAprovacion;
	
	@Column(name = "monto_autorizado", nullable = true)
	private int montoAutorizado;
	
	public Aplicacion() {
	}
	
	public Aplicacion(int folio, Date fechaAplicacion, char aprobacion, Date fechaAprovacion, int montoAutorizado) {
		this.folio = folio;
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
	
	public int getMontoAutorizado() {
		return montoAutorizado;
	}
	
	public void setMontoAutorizado(int montoAutorizado) {
		this.montoAutorizado = montoAutorizado;
	}
	
	@Override
	public String toString() {
		return "Aplicacion [folio=" + folio + ", fechaAplicacion=" + fechaAplicacion + ", aprobacion=" + aprobacion
				+ ", fechaAprovacion=" + fechaAprovacion + ", montoAutorizado=" + montoAutorizado + "]";
	}
}
