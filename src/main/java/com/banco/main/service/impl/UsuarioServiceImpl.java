package com.banco.main.service.impl;

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
	public boolean createUsuario(UsuarioBean usuarioBean) {
		
		Usuario usuario = new Usuario();
		usuario.setNombre(usuarioBean.getNombre());
		usuario.setApellido(usuarioBean.getApellido());
		usuario.setCalificacionBuro(usuarioBean.getCalificacionBuro());
		usuario.setEmail(usuarioBean.getEmail());
				
		this.usuarioRepo.save(usuario);
		
		return true;
	}

	
	
	@Override
	public UsuarioBean getUsuario(int idUsuario) {
		Usuario usuario = this.usuarioRepo.findById(idUsuario).orElseThrow();		
		UsuarioBean usuarioBean = new UsuarioBean();
		
		usuarioBean.setNombre(usuario.getNombre());
		usuarioBean.setApellido(usuario.getApellido());
		usuarioBean.setCalificacionBuro(usuario.getCalificacionBuro());
		usuarioBean.setEmail(usuario.getEmail());
		
		return usuarioBean;
				
		
	}
	

	@Override
	public Boolean updateUsuario(UsuarioBean usuarioBean) {
		
		Usuario usuario = this.usuarioRepo.findById(usuarioBean.getIdUsuario()).orElseThrow();
		
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
