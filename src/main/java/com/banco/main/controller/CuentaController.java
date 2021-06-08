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
import com.banco.main.bean.CuentaBean;
import com.banco.main.service.impl.CuentaServiceImpl;


@RestController
@RequestMapping("/cuenta")
public class CuentaController {
	
	@Autowired
	public CuentaServiceImpl cuentaService;
	
	
	@PostMapping("/createCuenta")
	public ResponseEntity<Boolean> createCuenta(@RequestBody CuentaBean cuentaBean){
		return new ResponseEntity<Boolean>(this.cuentaService.createCuenta(cuentaBean), HttpStatus.OK);
	}
	
	@GetMapping("/getCuenta/{id}")
	public ResponseEntity<CuentaBean> getCuenta(@PathVariable int id){
		return new ResponseEntity<CuentaBean>(this.cuentaService.getCuenta(id), HttpStatus.FOUND);
	}
	
	
	@PutMapping("/updateCuenta")
	public ResponseEntity<Boolean> updateCuenta(@RequestBody CuentaBean cuentaBean){
		return new ResponseEntity<Boolean>(this.cuentaService.updateCuenta(cuentaBean), HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/deleteById/{id}")
	public ResponseEntity <Boolean> deleteById (@PathVariable ("id") Integer id){
		return new ResponseEntity<Boolean>(this.cuentaService.deleteById(id),HttpStatus.OK);
	}

}
