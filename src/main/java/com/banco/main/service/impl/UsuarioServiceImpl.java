package com.banco.main.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.banco.main.bean.UsuarioBean;
import com.banco.main.model.Usuario;
import com.banco.main.repository.UsuarioRepository;


import com.banco.main.service.UsuarioService;



@Service
@Transactional
public class UsuarioServiceImpl implements UsuarioService {
	
	
	@Autowired
	private UsuarioRepository usuarioRepo;

	@Override
	public Usuario createUsuario(UsuarioBean usuarioBean) {
		
		Usuario usuario = new Usuario();
		usuario.setNombre(usuarioBean.getNombre());
		usuario.setApellido(usuarioBean.getApellido());
		usuario.setCalificacionBuro(usuarioBean.getCalificacionBuro());
		usuario.setEmail(usuarioBean.getEmail());
				
		this.usuarioRepo.save(usuario);
		
		return usuario;
	}

	
	@Override
	public List<UsuarioBean> getUsuario() {
		
		List<Usuario> usuarioList = usuarioRepo.findAll();
		List<UsuarioBean> usuarioBeanList = new ArrayList<UsuarioBean>();
		
		for (Usuario usuario: usuarioList) {
			UsuarioBean usuarioBean = new UsuarioBean();
			usuarioBean.setIdUsuario(usuario.getId_usuario());
			usuarioBean.setNombre(usuario.getNombre());
			usuarioBean.setApellido(usuario.getApellido());
			usuarioBean.setCalificacionBuro(usuario.getCalificacionBuro());
			usuarioBean.setEmail(usuario.getEmail());
			
			usuarioBeanList.add(usuarioBean);
		}
		return usuarioBeanList;
	}
	
	
	
	@Override
	public UsuarioBean getUsuarioById(int id_usuario) {
		Usuario usuario = this.usuarioRepo.findById(id_usuario).orElseThrow();		
		UsuarioBean usuarioBean = new UsuarioBean();
		
		usuarioBean.setIdUsuario(usuario.getId_usuario());
		usuarioBean.setNombre(usuario.getNombre());
		usuarioBean.setApellido(usuario.getApellido());
		usuarioBean.setCalificacionBuro(usuario.getCalificacionBuro());
		usuarioBean.setEmail(usuario.getEmail());
		
		return usuarioBean;
				
		
	}
	
	@Override
	public Boolean updateUsuario(UsuarioBean usuarioBean,Integer id) {
		
		Usuario usuario = this.usuarioRepo.findById(id).orElseThrow();
		
		usuario.setNombre(usuarioBean.getNombre());
		usuario.setApellido(usuarioBean.getApellido());
		usuario.setCalificacionBuro(usuarioBean.getCalificacionBuro());
		usuario.setEmail(usuarioBean.getEmail());
				
		this.usuarioRepo.save(usuario);
		
		return true;
		
		
	}

	@Override
	public Boolean deleteById(int idUsuario) {
		Usuario usuario = this.usuarioRepo.findById(idUsuario).orElseThrow();	
		usuarioRepo.delete(usuario);
		return true;
	}

}
