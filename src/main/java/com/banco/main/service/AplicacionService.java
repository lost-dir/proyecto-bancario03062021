package com.banco.main.service;

import com.banco.main.bean.AplicacionBean;

public interface AplicacionService {
	public boolean createAplicacion(AplicacionBean aplicacionBean);
	public boolean updateAplicacion(AplicacionBean aplicacionBean);
	public AplicacionBean getAplicacion(int folio);
}
