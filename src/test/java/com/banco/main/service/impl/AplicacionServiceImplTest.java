package com.banco.main.service.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.banco.main.ProyectoBancario01Application;
import com.banco.main.bean.AplicacionBean;
import com.banco.main.bean.ProductoBean;
import com.banco.main.bean.UsuarioBean;
import com.banco.main.model.Producto;
import com.banco.main.model.Usuario;

@SpringBootTest(classes = ProyectoBancario01Application.class)
class AplicacionServiceImplTest {

	@Autowired
	private AplicacionServiceImpl aplicacionService;
	@Autowired
	private UsuarioServiceImpl usuarioService;
	@Autowired
	private ProductoServiceImpl productoService;
	
	private UsuarioBean usuarioBean;
	private ProductoBean productoBean;
	private AplicacionBean aplicacionBean;
	
	@BeforeEach
	public void addEntities() {
		//creo los beans
		this.usuarioBean = new UsuarioBean("usuario", "usuario", "usuario@correo", "REGULAR");
		this.productoBean = new ProductoBean("CREDIT CARD", 15.0, 6000.0, 35000.0);
		//inserto los beans
		this.usuarioService.createUsuario(usuarioBean);
		this.productoService.save(productoBean);
		
	}
	
	@Test
	void testCreate() {
		//reutilizo las variables bean
		this.usuarioBean = this.usuarioService.getUsuario(1);
		this.productoBean = this.productoService.findId(1);
		//aplico mi logica de negocio
		this.aplicacionBean = new AplicacionBean(this.usuarioBean, this.productoBean, new Date(), 'Y', new Date(), 10000.00);
		assertEquals(true, aplicacionService.createAplicacion(aplicacionBean));
	}

}
