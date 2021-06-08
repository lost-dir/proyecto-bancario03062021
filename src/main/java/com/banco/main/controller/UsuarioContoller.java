package com.banco.main.controller;

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
import com.banco.main.service.impl.UsuarioServiceImpl;

@RestController
@RequestMapping("/usuario")
public class UsuarioContoller {
	
	@Autowired
	private UsuarioServiceImpl usuarioService;

	@PostMapping("/createUsuario")
	public ResponseEntity<Boolean> createUsuario(@RequestBody UsuarioBean usuarioBean){
		return new ResponseEntity<Boolean>(this.usuarioService.createUsuario(usuarioBean), HttpStatus.OK);
	}
	
	@GetMapping("/getUsuario/{id}")
	public ResponseEntity<UsuarioBean> getUsuario(@PathVariable int id){
		return new ResponseEntity<UsuarioBean>(this.usuarioService.getUsuario(id), HttpStatus.FOUND);
	}
	
	
	@PutMapping("/updateUsuario")
	public ResponseEntity<Boolean> updateUsuario(@RequestBody UsuarioBean usuarioBean){
		return new ResponseEntity<Boolean>(this.usuarioService.updateUsuario(usuarioBean), HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/deleteById/{id}")
	public ResponseEntity <Boolean> deleteCreditoById (@PathVariable ("id") Integer id){
		return new ResponseEntity<Boolean>(this.usuarioService.deleteById(id),HttpStatus.OK);
	}
	
	
	
}
