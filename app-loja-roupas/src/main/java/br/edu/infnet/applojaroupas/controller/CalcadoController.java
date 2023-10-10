package br.edu.infnet.applojaroupas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.applojaroupas.model.domain.Calcado;
import br.edu.infnet.applojaroupas.model.domain.Usuario;
import br.edu.infnet.applojaroupas.model.service.CalcadoService;

@Controller
public class CalcadoController {
	
	@Autowired
	private CalcadoService calcadoService;

	@GetMapping(value = "/calcado/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("listaCalcado", calcadoService.obterLista(usuario));
		
		return "calcado/lista";
	}

	@GetMapping(value = "/calcado/cadastro")
	public String telaCadastro() {

		return "calcado/cadastro";
	}

	@PostMapping(value = "/calcado/incluir")
	public String incluir(Calcado calcado, @SessionAttribute("user") Usuario usuario) {
		
		calcado.setUsuario(usuario);
		
		calcadoService.incluir(calcado);
		
		return "redirect:/calcado/lista";
	}

	@GetMapping(value = "/calcado/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		calcadoService.excluir(id);

		return "redirect:/calcado/lista";
	}

}
