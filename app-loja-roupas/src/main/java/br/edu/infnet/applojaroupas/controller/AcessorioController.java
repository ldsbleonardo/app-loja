package br.edu.infnet.applojaroupas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.applojaroupas.model.domain.Acessorio;
import br.edu.infnet.applojaroupas.model.domain.Usuario;
import br.edu.infnet.applojaroupas.model.service.AcessorioService;

public class AcessorioController {

	@Autowired
	private AcessorioService acessorioService;

	@GetMapping(value = "/acessorio/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("listaAcessorio", acessorioService.obterLista(usuario));

		return "acessorio/lista";
	}

	@GetMapping(value = "/acessorio/cadastro")
	public String telaCadastro() {

		return "acessorio/cadastro";
	}

	@PostMapping(value = "/acessorio/incluir")
	public String incluir(Acessorio acessorio, @SessionAttribute("user") Usuario usuario) {

		acessorio.setUsuario(usuario);

		acessorioService.incluir(acessorio);

		return "redirect:/acessorio/lista";
	}

	@GetMapping(value = "/acessorio/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		acessorioService.excluir(id);

		return "redirect:/acessorio/lista";
	}

}
