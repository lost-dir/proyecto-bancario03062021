package com.banco.main.service;

import java.util.List;

import com.banco.main.bean.CuentaBean;
import com.banco.main.model.Cuenta;


public interface CuentaService {

	
	public Cuenta createCuenta(CuentaBean cuentaBean);
	public List<CuentaBean> getCuentas();
	public CuentaBean getCuentaByNumCuenta(int numCuenta);
	public Boolean updateCuenta (CuentaBean cuentaBean, Integer numCuenta);
	public Boolean deleteCuentaById (int numCuenta);
	
}
