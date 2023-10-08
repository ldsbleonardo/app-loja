package br.edu.infnet.applojaroupas.model.service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.applojaroupas.model.domain.PedidoVenda;
import br.edu.infnet.applojaroupas.model.domain.Usuario;
import br.edu.infnet.applojaroupas.model.repository.PedidoVendaRepository;

@Service
public class PedidoVendaService {

	@Autowired
	private PedidoVendaRepository pedidoVendaRepository;

	public Collection<PedidoVenda> obterLista() {

		return (Collection<PedidoVenda>) pedidoVendaRepository.findAll();
	}

	public Collection<PedidoVenda> obterLista(Usuario usuario) {

		List<PedidoVenda> lista = pedidoVendaRepository.obterLista(usuario.getId());

		if (lista.isEmpty()) {
			return Collections.emptyList();
		}

		return lista;
	}

	public void incluir(PedidoVenda pedido) {

		pedidoVendaRepository.save(pedido);
	}

	public void excluir(Integer id) {

		pedidoVendaRepository.deleteById(id);
	}

}
