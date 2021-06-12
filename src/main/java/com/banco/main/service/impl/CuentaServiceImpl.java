package com.banco.main.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.main.bean.CuentaBean;
import com.banco.main.bean.UsuarioBean;
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
	public Cuenta createCuenta(CuentaBean cuentaBean) {
		Cuenta cuenta = new Cuenta();
		
		
		cuenta.setSaldo(cuentaBean.getSaldo());
		cuenta.setUsuario(cuentaBean.getUser());
		this.cuentaRepository.save(cuenta);
		
		return cuenta;
	}
	
	
	@Override
	public List<CuentaBean> getCuentas() {
		List<Cuenta> cuentaList = cuentaRepository.findAll();
		List<CuentaBean> cuentaBeanList = new ArrayList<CuentaBean>();
		
		for (Cuenta cuenta: cuentaList) {
			CuentaBean cuentaBean = new CuentaBean();
			cuentaBean.setNumeroCuenta(cuenta.getNumeroCuenta());
			cuentaBean.setSaldo(cuenta.getSaldo());
					
			cuentaBean.setUser(cuenta.getUsuario());
			
			cuentaBeanList.add(cuentaBean);
		}
		return cuentaBeanList;
		
	}

	

	@Override
	public CuentaBean getCuentaByNumCuenta(int numCuenta) {
		Cuenta cuenta = this.cuentaRepository.findById(numCuenta).orElseThrow();		
		
		CuentaBean cuentaBean = new CuentaBean();
		
		cuentaBean.setNumeroCuenta(cuenta.getNumeroCuenta());
		cuentaBean.setSaldo(cuenta.getSaldo());
		cuentaBean.setUser(cuenta.getUsuario());
				
		return cuentaBean;
	}
	

	@Override
	public Boolean updateCuenta(CuentaBean cuentaBean, Integer numCuenta) {
		Cuenta cuenta = this.cuentaRepository.findById(numCuenta).orElseThrow();
		
		
		cuenta.setSaldo(cuentaBean.getSaldo());
		this.cuentaRepository.save(cuenta);
		
		return true;
	}

	@Override
	public Boolean deleteCuentaById(int idCuenta) {
		Cuenta cuenta = this.cuentaRepository.findById(idCuenta).orElseThrow();
		cuentaRepository.delete(cuenta);
		return true;
	}

	
}
