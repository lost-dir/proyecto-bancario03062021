package com.banco.main.service;


import java.util.List;

import com.banco.main.bean.UsuarioBean;
import com.banco.main.model.Usuario;

public interface UsuarioService {
	
	public Usuario createUsuario(UsuarioBean usuariBean);
	public List<UsuarioBean> getUsuario();
	public UsuarioBean getUsuarioById(int idUsuario);
	public Boolean updateUsuario (UsuarioBean usuarioBean, Integer id);
	public Boolean deleteById (int idUsuario);
}
