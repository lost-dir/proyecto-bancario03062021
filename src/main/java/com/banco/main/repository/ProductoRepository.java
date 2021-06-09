package com.banco.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banco.main.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
