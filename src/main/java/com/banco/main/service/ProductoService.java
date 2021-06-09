package com.banco.main.service;

import java.util.List;

import com.banco.main.bean.ProductoBean;

public interface ProductoService {
	
public boolean save (ProductoBean productoBean);
public List <ProductoBean> find();
public ProductoBean findId (Integer idProducto);
public boolean updateProducto (ProductoBean productoBean);
public boolean deletebyId (Integer idProducto);



}
