package br.edu.infnet.applojaroupas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	
	@GetMapping(value="/")
	public String telaHome() {
		return "home";
	}
	
//	@GetMapping(value="/")
//	public String telaLogin() {
//		return "login";
//	}

}
