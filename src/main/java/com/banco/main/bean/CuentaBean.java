package com.banco.main.bean;

import java.io.Serializable;

public class CuentaBean implements Serializable {


	
	private int numeroCuenta;
	private Double saldo;
	private UsuarioBean id_usuario;

	 public CuentaBean() {
		// TODO Auto-generated constructor stub
	}

	public CuentaBean(int numeroCuenta, Double saldo, UsuarioBean id_usuario) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.id_usuario = id_usuario;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public UsuarioBean getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(UsuarioBean id_usuario) {
		this.id_usuario = id_usuario;
	}

	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", id_usuario=" + id_usuario + "]";
	}

	private static final long serialVersionUID = 1L;
}
