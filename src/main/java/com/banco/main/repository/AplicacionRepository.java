package com.banco.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banco.main.model.Aplicacion;

@Repository
public interface AplicacionRepository extends JpaRepository<Aplicacion, Integer>{

}
