package com.banco.main.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.banco.main.bean.ProductoBean;
import com.banco.main.model.Producto;
import com.banco.main.repository.ProductoRepository;
import com.banco.main.service.ProductoService;


@Service
@Transactional

public class ProductoServiceImpl implements ProductoService {
	@Autowired
	private ProductoRepository productoRepo;

	@Override
	public boolean save(ProductoBean productoBean) {
		
		Producto producto = new Producto();
		
		producto.setIdproducto(productoBean.getIdProducto());
		producto.setMontomaximo(productoBean.getMontoMaximo());
		producto.setMontominimo(productoBean.getMontoMiimo());
		producto.setTasainteres(productoBean.getTasaInteres());
		producto.setTipoDeProducto(productoBean.getTipodeProducto());
		
		this.productoRepo.save(producto);
		
		return true;
		
	}

	@Override
	public List<ProductoBean> find() {
		
		List <Producto>productoList = productoRepo.findAll();
		List <ProductoBean>productoBeanList = new ArrayList<ProductoBean>();
		
		for(Producto producto : productoList) {
			ProductoBean productoBean = new ProductoBean();
		
			productoBean.setIdProducto(producto.getIdproducto());
			productoBean.setMontoMaximo(producto.getMontomaximo());
			productoBean.setMontoMiimo(producto.getMontominimo());
			productoBean.setTasaInteres(producto.getTasainteres());
			productoBean.setTipodeProducto(producto.getTipoDeProducto());
			
			
			
			productoBeanList.add(productoBean);
		
		
	}
		return productoBeanList;
	}
	
	
	@Override
	public ProductoBean findId(Integer idProducto) {
		Producto producto = productoRepo.findById(idProducto).orElseThrow();
		ProductoBean productoBean = new ProductoBean();
		
		productoBean.setIdProducto(producto.getIdproducto());
		productoBean.setMontoMaximo(producto.getMontomaximo());
		productoBean.setMontoMiimo(producto.getMontominimo());
		productoBean.setTasaInteres(producto.getTasainteres());
		//aqui los nombres no concuerdan :C
		productoBean.setTipodeProducto(producto.getTipoDeProducto());
		
		return productoBean;
		
	}
	
	@Override
	public boolean updateProducto(ProductoBean productoBean) {
		Producto producto = productoRepo.findById(productoBean.getIdProducto()).orElseThrow();
		producto.setMontomaximo(productoBean.getMontoMaximo());
		producto.setMontomaximo(productoBean.getMontoMaximo());
		producto.setMontominimo(productoBean.getMontoMaximo());
		producto.setMontominimo(productoBean.getMontoMiimo());
		producto.setTasainteres(productoBean.getTasaInteres());
		producto.setTipoDeProducto(productoBean.getTipodeProducto());
		
		productoRepo.save(producto);	
		
		
		return true;
	}


	@Override
	public boolean deletebyId(Integer idProducto) {
		Producto producto = productoRepo.findById(idProducto).orElseThrow(null);
		productoRepo.delete(producto);
		
		return false;
	}

	

}
