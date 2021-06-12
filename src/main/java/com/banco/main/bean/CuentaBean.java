package com.banco.main.bean;

import java.io.Serializable;

import com.banco.main.model.Usuario;

public class CuentaBean implements Serializable {


	
	private int numeroCuenta;
	private Double saldo;
	private UsuarioBean usuario;
	private Usuario user;



	public CuentaBean() {
		
	}
	
	

	public CuentaBean(Double saldo, UsuarioBean usuario) {
		super();
		this.saldo = saldo;
		this.usuario = usuario;
	}

	public CuentaBean(int numeroCuenta, Double saldo, UsuarioBean usuario) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.usuario = usuario;
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

	public UsuarioBean getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioBean usuario) {
		this.usuario = usuario;
	}
	
	 public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", id_usuario=" + usuario + "]";
	}

	private static final long serialVersionUID = 1L;
}
