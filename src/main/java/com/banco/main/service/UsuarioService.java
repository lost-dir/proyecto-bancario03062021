package com.banco.main.service;


import com.banco.main.bean.UsuarioBean;

public interface UsuarioService {
	
	public boolean createUsuario(UsuarioBean usuariBean);
	public UsuarioBean getUsuario(int idUsuario);
	public Boolean updateUsuario (UsuarioBean usuarioBean);
	public Boolean deleteById (int idUsuario);
}
