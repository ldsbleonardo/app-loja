package br.edu.infnet.applojaroupas.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.applojaroupas.model.domain.Produto;
import br.edu.infnet.applojaroupas.model.domain.Usuario;
import br.edu.infnet.applojaroupas.model.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	public Collection<Produto> obterLista() {

		return (Collection<Produto>) produtoRepository.findAll();
	}

	public Collection<Produto> obterLista(Usuario usuario) {

		return (Collection<Produto>) produtoRepository.obterLista(usuario.getId());
	}

	public void incluir(Produto produto) {

		produtoRepository.save(produto);
	}

	public void excluir(Integer id) {

		produtoRepository.deleteById(id);
	}
}