package com.banco.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banco.main.bean.AplicacionBean;
import com.banco.main.service.impl.AplicacionServiceImpl;

@RestController
@RequestMapping("/aplicacion")
public class AplicacionController {
	@Autowired
	private AplicacionServiceImpl aplicacionService;
	
	@PostMapping("/createAplicacion")
	public ResponseEntity<Boolean> createAplicacion(@RequestBody AplicacionBean aplicacionBean){
		return new ResponseEntity<Boolean>(this.aplicacionService.createAplicacion(aplicacionBean), HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/updateAplicacion")
	public ResponseEntity<Boolean> updateAplicacion(@RequestBody AplicacionBean aplicacionBean){
		return new ResponseEntity<Boolean>(this.aplicacionService.updateAplicacion(aplicacionBean), HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/getAplicacion/{folio}")
	public ResponseEntity<AplicacionBean> getAplicacion(@PathVariable int folio){
		return new ResponseEntity<AplicacionBean>(this.aplicacionService.getAplicacion(folio), HttpStatus.FOUND);
	}
}