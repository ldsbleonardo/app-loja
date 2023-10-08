package br.edu.infnet.applojaroupas.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.infnet.applojaroupas.clientes.IClienteUsuario;
import br.edu.infnet.applojaroupas.model.domain.Usuario;

public class UsuarioService {

	@Autowired
	private IClienteUsuario clienteUsuario;

	public Collection<Usuario> obterLista() {

		return clienteUsuario.obterLista();
	}

	public void incluir(Usuario usuario) {

		clienteUsuario.incluir(usuario);
	}

	public void excluir(Integer id) {

		clienteUsuario.excluir(id);
	}

	public Usuario validar(String email, String senha) {

		return clienteUsuario.validar(email, senha);
	}

}
