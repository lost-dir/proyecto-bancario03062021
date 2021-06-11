package com.banco.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
	 
	@OneToOne
	@JoinColumn(name = "id_usuario")
    private Usuario usuario;

	public Cuenta() {}

	public Cuenta(int numeroCuenta, Double saldo, Usuario usuario) {
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", Usuario=" + usuario + "]";
	}

}
