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
import com.banco.main.bean.CuentaBean;
import com.banco.main.bean.UsuarioBean;
import com.banco.main.model.Cuenta;
import com.banco.main.service.impl.CuentaServiceImpl;


@RestController
@RequestMapping("/cuenta")
public class CuentaController {
	
	@Autowired
	public CuentaServiceImpl cuentaService;
	
	
	@PostMapping("/createCuenta")
	public ResponseEntity<Cuenta> createCuenta(@RequestBody CuentaBean cuentaBean){
		return new ResponseEntity<Cuenta>(this.cuentaService.createCuenta(cuentaBean), HttpStatus.OK);
	}
	
	
	@GetMapping("/getCuentas")
	public ResponseEntity<List<CuentaBean>> getUsuario(){
		return new ResponseEntity<List<CuentaBean>>(this.cuentaService.getCuentas(), HttpStatus.FOUND);
	}
	
	
	
	@GetMapping("/getCuenta/{id}")
	public ResponseEntity<CuentaBean> getCuenta(@PathVariable int id){
		return new ResponseEntity<CuentaBean>(this.cuentaService.getCuentaByNumCuenta(id), HttpStatus.FOUND);
	}
	
	
	
	@PutMapping("/updateCuenta/{id}")
	public ResponseEntity<Boolean> updateCuenta(@RequestBody CuentaBean cuentaBean, @PathVariable int id){
		return new ResponseEntity<Boolean>(this.cuentaService.updateCuenta(cuentaBean,id), HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/deleteById/{id}")
	public ResponseEntity <Boolean> deleteById (@PathVariable ("id") Integer id){
		return new ResponseEntity<Boolean>(this.cuentaService.deleteCuentaById(id),HttpStatus.OK);
	}

}
