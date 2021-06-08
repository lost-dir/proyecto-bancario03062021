package com.banco.main.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.main.bean.CuentaBean;

import com.banco.main.model.Cuenta;
import com.banco.main.model.Usuario;
import com.banco.main.repository.CuentaRepository;
import com.banco.main.service.CuentaService;


@Service
@Transactional
public class CuentaServiceImpl implements CuentaService {
	
	@Autowired
	private CuentaRepository cuentaRepository;

	@Override
	public boolean createCuenta(CuentaBean cuentaBean) {
		Cuenta cuenta = new Cuenta();
		cuenta.setNumeroCuenta(cuentaBean.getNumeroCuenta());
		cuenta.setSaldo(cuentaBean.getSaldo());
						
		this.cuentaRepository.save(cuenta);
		
		return true;
	}

	@Override
	public CuentaBean getCuenta(int idCuenta) {
		Cuenta cuenta = this.cuentaRepository.findById(idCuenta).orElseThrow();		
		CuentaBean cuentaBean = new CuentaBean();
		
		cuentaBean.setNumeroCuenta(cuenta.getNumeroCuenta());
		cuentaBean.setSaldo(cuenta.getSaldo());
				
		return cuentaBean;
	}
	

	@Override
	public Boolean updateCuenta(CuentaBean cuentaBean) {
		Cuenta cuenta = this.cuentaRepository.findById(cuentaBean.getNumeroCuenta()).orElseThrow();
		
		cuenta.setNumeroCuenta(cuentaBean.getNumeroCuenta());
		cuenta.setSaldo(cuentaBean.getSaldo());
						
		this.cuentaRepository.save(cuenta);
		
		return true;
	}

	@Override
	public Boolean deleteById(int idCuenta) {
		Cuenta cuenta = this.cuentaRepository.findById(idCuenta).orElseThrow();
		cuentaRepository.delete(cuenta);
		return true;
	}

}
