package com.banco.main.bean;

import java.io.Serializable;

public class ProductoBean implements Serializable {
	
	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;
	
	private int idProducto;
	private String tipodeProducto;
	private double tasaInteres;
	private double montoMiimo;
	private double montoMaximo;
	
	
	public ProductoBean() {
		
	}


	public ProductoBean(int idProducto, String tipodeProducto, double tasaInteres, double montoMiimo,
			double montoMaximo) {
		super();
		this.idProducto = idProducto;
		this.tipodeProducto = tipodeProducto;
		this.tasaInteres = tasaInteres;
		this.montoMiimo = montoMiimo;
		this.montoMaximo = montoMaximo;
	}


	public int getIdProducto() {
		return idProducto;
	}


	public void setIdProducto(double d) {
		this.idProducto = idProducto;
	}


	public String getTipodeProducto() {
		return tipodeProducto;
	}


	public void setTipodeProducto(String d) {
		this.tipodeProducto = tipodeProducto;
	}


	public double getTasaInteres() {
		return tasaInteres;
	}


	public void setTasaInteres(double tasaInteres) {
		this.tasaInteres = tasaInteres;
	}


	public double getMontoMiimo() {
		return montoMiimo;
	}


	public void setMontoMiimo(double montoMiimo) {
		this.montoMiimo = montoMiimo;
	}


	public double getMontoMaximo() {
		return montoMaximo;
	}


	public void setMontoMaximo(double montoMaximo) {
		this.montoMaximo = montoMaximo;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "ProductoBean [idProducto=" + idProducto + ", tipodeProducto=" + tipodeProducto + ", tasaInteres="
				+ tasaInteres + ", montoMiimo=" + montoMiimo + ", montoMaximo=" + montoMaximo + "]";
	}
	
	
	
	
}
