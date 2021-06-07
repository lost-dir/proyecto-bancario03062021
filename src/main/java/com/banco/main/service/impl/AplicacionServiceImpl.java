package com.banco.main.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.main.bean.AplicacionBean;
import com.banco.main.model.Aplicacion;
import com.banco.main.repository.AplicacionRepository;
import com.banco.main.service.AplicacionService;

@Service
@Transactional
public class AplicacionServiceImpl implements AplicacionService{
	@Autowired
	private AplicacionRepository aplicacionRepo;

	@Override
	public boolean createAplicacion(AplicacionBean aplicacionBean) {
		
		Aplicacion aplicacion = new Aplicacion();
		
		aplicacion.setUsuario(aplicacionBean.getUsuario());
		aplicacion.setProducto(aplicacionBean.getProducto());
		aplicacion.setFechaAplicacion(aplicacionBean.getFechaAplicacion());
		aplicacion.setAprobacion(aplicacionBean.getAprobacion());
		aplicacion.setFechaAprovacion(aplicacionBean.getFechaAprovacion());
		aplicacion.setMontoAutorizado(aplicacionBean.getMontoAutorizado());
		
		this.aplicacionRepo.save(aplicacion);
		
		return true;
	}

	@Override
	public boolean updateAplicacion(AplicacionBean aplicacionBean) {
		
		Aplicacion aplicacion = this.aplicacionRepo.findById(aplicacionBean.getFolio()).orElseThrow();
		
		aplicacion.setUsuario(aplicacionBean.getUsuario());
		aplicacion.setProducto(aplicacionBean.getProducto());
		aplicacion.setFechaAplicacion(aplicacionBean.getFechaAplicacion());
		aplicacion.setAprobacion(aplicacionBean.getAprobacion());
		aplicacion.setFechaAprovacion(aplicacionBean.getFechaAprovacion());
		aplicacion.setMontoAutorizado(aplicacionBean.getMontoAutorizado());
		
		this.aplicacionRepo.save(aplicacion);
		
		return true;
	}

	@Override
	public AplicacionBean getAplicacion(int folio) {
		Aplicacion aplicacion = this.aplicacionRepo.findById(folio).orElseThrow();		
		AplicacionBean aplicacionBean = new AplicacionBean();
		
		aplicacionBean.setUsuario(aplicacion.getUsuario());
		aplicacionBean.setProducto(aplicacion.getProducto());
		aplicacionBean.setFechaAplicacion(aplicacion.getFechaAplicacion());
		aplicacionBean.setAprobacion(aplicacion.getAprobacion());
		aplicacionBean.setFechaAprovacion(aplicacion.getFechaAprovacion());
		aplicacionBean.setMontoAutorizado(aplicacion.getMontoAutorizado());
		
		return aplicacionBean;
	}
}
