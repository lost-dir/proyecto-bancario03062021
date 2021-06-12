package com.banco.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.banco.main.bean.UsuarioBean;
import com.banco.main.model.Usuario;
import com.banco.main.service.impl.UsuarioServiceImpl;

@RestController
@RequestMapping("/usuario")
public class UsuarioContoller {
	
	@Autowired
	private UsuarioServiceImpl usuarioService;

	@PostMapping("/createUsuario")
	public ResponseEntity<Usuario> createUsuario(@RequestBody UsuarioBean usuarioBean){
		return new ResponseEntity<Usuario>(this.usuarioService.createUsuario(usuarioBean), HttpStatus.OK);
	}
	
	
	@GetMapping("/getUsuarios")
	public ResponseEntity<List<UsuarioBean>> getUsuario(){
		return new ResponseEntity<List<UsuarioBean>>(this.usuarioService.getUsuario(), HttpStatus.FOUND);
	}
		
	
	@GetMapping("/getUsuarioById/{id}")
	public ResponseEntity<UsuarioBean> getUsuarioById(@PathVariable int id){
		return new ResponseEntity<UsuarioBean>(this.usuarioService.getUsuarioById(id), HttpStatus.FOUND);
	}
	
	
	@PutMapping("/updateUsuario/{id}")
	public ResponseEntity<Boolean> updateUsuario(@RequestBody UsuarioBean usuarioBean, @PathVariable Integer id){
		return new ResponseEntity<Boolean>(this.usuarioService.updateUsuario(usuarioBean,id), HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/deleteById/{id}")
	public ResponseEntity <Boolean> deleteCreditoById (@PathVariable ("id") Integer id){
		return new ResponseEntity<Boolean>(this.usuarioService.deleteById(id),HttpStatus.OK);
	}
	
	
	
}
