package com.banco.main.service;

import com.banco.main.bean.CuentaBean;


public interface CuentaService {

	
	public boolean createCuenta(CuentaBean cuentaBean);
	public CuentaBean getCuenta(int idCuenta);
	public Boolean updateCuenta (CuentaBean cuentaBean);
	public Boolean deleteById (int idCuenta);
	
}
