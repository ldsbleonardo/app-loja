package br.edu.infnet.applojaroupas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.applojaroupas.model.domain.Roupa;
import br.edu.infnet.applojaroupas.model.domain.Usuario;
import br.edu.infnet.applojaroupas.model.service.RoupaService;

public class RoupaController {
	
	@Autowired
	private RoupaService roupaService;

	@GetMapping(value = "/roupa/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("listaSobremesa", roupaService.obterLista(usuario));
		
		return "roupa/lista";
	}

	@GetMapping(value = "/sobremesa/cadastro")
	public String telaCadastro() {

		return "sobremesa/cadastro";
	}

	@PostMapping(value = "/roupa/incluir")
	public String incluir(Roupa roupa, @SessionAttribute("user") Usuario usuario) {
		
		roupa.setUsuario(usuario);
		
		roupaService.incluir(roupa);
		
		return "redirect:/sobremesa/lista";
	}

	@GetMapping(value = "/roupa/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		roupaService.excluir(id);

		return "redirect:/roupa/lista";
	}

}
