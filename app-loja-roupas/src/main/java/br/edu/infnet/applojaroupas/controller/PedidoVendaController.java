package br.edu.infnet.applojaroupas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.applojaroupas.model.domain.PedidoVenda;
import br.edu.infnet.applojaroupas.model.domain.Usuario;
import br.edu.infnet.applojaroupas.model.service.PedidoVendaService;
import br.edu.infnet.applojaroupas.model.service.ProdutoService;
import br.edu.infnet.applojaroupas.model.service.SolicitanteService;

public class PedidoVendaController {

	@Autowired
	private PedidoVendaService pedidoVendaService;
	@Autowired
	private SolicitanteService solicitanteService;
	@Autowired
	private ProdutoService produtoService;

	@GetMapping(value = "/pedido")
	public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("solicitantes", solicitanteService.obterLista(usuario));

		model.addAttribute("produtos", produtoService.obterLista(usuario));

		return "pedido/cadastro";
	}

	@GetMapping(value = "/pedido/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		model.addAttribute("listagem", pedidoVendaService.obterLista(usuario));

		return "pedido/lista";
	}

	@PostMapping(value = "/pedido/incluir")
	public String incluir(PedidoVenda pedido, @SessionAttribute("user") Usuario usuario) {

		pedido.setUsuario(usuario);

		pedidoVendaService.incluir(pedido);

		return "redirect:/pedido/lista";
	}

	@GetMapping(value = "/pedido/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		pedidoVendaService.excluir(id);

		return "redirect:/pedido/lista";
	}

}
