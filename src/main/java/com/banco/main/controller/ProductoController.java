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

import com.banco.main.bean.ProductoBean;
import com.banco.main.service.impl.ProductoServiceImpl;


@RestController
@RequestMapping("/producto")
public class ProductoController {
	@Autowired
	private ProductoServiceImpl productoService;
	
	@PostMapping("/save")
	public ResponseEntity<Boolean> saveProducto(@RequestBody ProductoBean productoBean){
		return new ResponseEntity<Boolean>(this.productoService.save(productoBean), HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/find")
	public ResponseEntity<List<ProductoBean>> find(){
	return new ResponseEntity<> (this.productoService.find(), HttpStatus.OK);
	
	}
	
	@GetMapping("/findId/{idProducto}")
	public ResponseEntity<ProductoBean> findId(@PathVariable("idProducto") Integer idProducto){
		return new ResponseEntity<>(this.productoService.findId(idProducto), HttpStatus.FOUND);
	}
		
	@PutMapping("/update")
	public ResponseEntity<Boolean> updateProducto(@RequestBody ProductoBean productoBean){
		return new ResponseEntity<Boolean>(this.productoService.updateProducto(productoBean), HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/deleteById/{idProducto}")
	public ResponseEntity <Boolean> deleteById (@PathVariable ("idProducto") Integer idProducto){
		return new ResponseEntity<Boolean>(this.productoService.deletebyId(idProducto),HttpStatus.OK);
	}
}