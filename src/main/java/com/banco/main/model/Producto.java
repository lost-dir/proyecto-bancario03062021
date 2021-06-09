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
@Column(name = "tipo_producto")
private String tipoproducto;
@Column(name = "tasa_interes")
private double tasainteres;
@Column(name = "monto_minimo")
private double montominimo;
@Column(name = "monto_maximo")
private double montomaximo;

public Producto() {
	
}

public Producto(int idproducto, String tipoproducto, double tasainteres, double montominimo, double montomaximo) {
	super();
	this.idproducto = idproducto;
	this.tipoproducto = tipoproducto;
	this.tasainteres = tasainteres;
	this.montominimo = montominimo;
	this.montomaximo = montomaximo;
}

public Producto(String tipoproducto, double tasainteres, double montominimo, double montomaximo) {
	this.tipoproducto = tipoproducto;
	this.tasainteres = tasainteres;
	this.montominimo = montominimo;
	this.montomaximo = montomaximo;
}

public double getIdproducto() {
	return idproducto;
}

public void setIdproducto(int idproducto) {
	this.idproducto = idproducto;
}

public String getTipoproducto() {
	return tipoproducto;
}

public void setTipoproducto(String tipoproducto) {
	this.tipoproducto = tipoproducto;
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
	return "Producto [idproducto=" + idproducto + ", tipoproducto=" + tipoproducto + ", tasainteres=" + tasainteres
			+ ", montominimo=" + montominimo + ", montomaximo=" + montomaximo + "]";
}

}
