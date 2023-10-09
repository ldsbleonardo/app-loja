package br.edu.infnet.applojaroupas.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.applojaroupas.model.domain.Usuario;
import br.edu.infnet.applojaroupas.model.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public Collection<Usuario> obterLista() {

		return (Collection<Usuario>) usuarioRepository.findAll();
	}

	public void incluir(Usuario usuario) {

		usuarioRepository.save(usuario);
	}

	public void excluir(Integer id) {

		usuarioRepository.deleteById(id);
	}

	public Usuario validar(String email, String senha) {

		return usuarioRepository.findByEmail(email);
	}

}
