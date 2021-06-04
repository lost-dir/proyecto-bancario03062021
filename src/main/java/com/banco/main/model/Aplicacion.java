package com.banco.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "aplicacion")
public class Aplicacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "numero_cuenta")
	private int numeroCuenta;
	@Column(name = "saldo")
	private boolean saldo;
	public Aplicacion() {
	}
	public Aplicacion(int numeroCuenta, boolean saldo) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public boolean isSaldo() {
		return saldo;
	}
	public void setSaldo(boolean saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Aplicacion [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + "]";
	}
}
