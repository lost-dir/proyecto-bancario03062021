package com.banco.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cuenta")
public class Cuenta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "numero_cuenta")
	private int numeroCuenta;
	
	
	@Column(name = "saldo")
	private Double saldo;
	 
	 @OneToOne(mappedBy = "cuenta" )
	 private Usuario id_usuario;

	 public Cuenta() {
		// TODO Auto-generated constructor stub
	}

	public Cuenta(int numeroCuenta, Double saldo, Usuario id_usuario) {
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

	public Usuario getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Usuario id_usuario) {
		this.id_usuario = id_usuario;
	}

	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", id_usuario=" + id_usuario + "]";
	}
	
	
	 
	 

}
