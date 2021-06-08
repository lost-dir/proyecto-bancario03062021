package com.banco.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banco.main.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
