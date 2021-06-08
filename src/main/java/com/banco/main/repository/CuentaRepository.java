package com.banco.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banco.main.model.Cuenta;

public interface CuentaRepository extends JpaRepository<Cuenta, Integer> {

}
