package com.banco.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "producto")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_producto")
	private int idproducto;
	
	@Column(name = "tipo_producto", nullable = false)
	private String tipodeProducto;
	
	@Column(name = "tasa_interes", nullable = false)
	private double tasainteres;
	
	@Column(name = "monto_minimo", nullable = false)
	private double montominimo;
	
	@Column(name = "monto_maximo", nullable = false)
	private double montomaximo;
	
	public Producto() {}
	
	public Producto(int idproducto, String tipoproducto, double tasainteres, double montominimo, double montomaximo) {
		this.idproducto = idproducto;
		this.tipodeProducto = tipoproducto;
		this.tasainteres = tasainteres;
		this.montominimo = montominimo;
		this.montomaximo = montomaximo;
	}
	
	public Producto(String tipoproducto, double tasainteres, double montominimo, double montomaximo) {
		this.tipodeProducto = tipoproducto;
		this.tasainteres = tasainteres;
		this.montominimo = montominimo;
		this.montomaximo = montomaximo;
	}
	
	public int getIdproducto() {
		return idproducto;
	}
	//Tambien compuse esta linea :D
	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}
	//Tambien cambie aqui
	public String getTipoDeProducto() {
		return tipodeProducto;
	}
	//Tambien cambie aqui
	public void setTipoDeProducto(String tipoproducto) {
		this.tipodeProducto = tipoproducto;
	}
	
	public double getTasainteres() {
		return tasainteres;
	}
	
	public void setTasainteres(double tasainteres) {
		this.tasainteres = tasainteres;
	}
	
	public double getMontominimo() {
		return montominimo;
	}
	
	public void setMontominimo(double montominimo) {
		this.montominimo = montominimo;
	}
	
	public double getMontomaximo() {
		return montomaximo;
	}
	
	public void setMontomaximo(double montomaximo) {
		this.montomaximo = montomaximo;
	}
	
	@Override
	public String toString() {
		return "Producto [idproducto=" + idproducto + ", tipodeProducto=" + tipodeProducto + ", tasainteres=" + tasainteres
				+ ", montominimo=" + montominimo + ", montomaximo=" + montomaximo + "]";
	}

}
