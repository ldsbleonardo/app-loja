package br.edu.infnet.applojaroupas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes("user")
@Controller
public class AppController {
	
//	@Autowired
//	private UsuarioService usuarioService;

	@GetMapping(value = "/")
	public String telaHome() {
		return "home";
	}
	
	@GetMapping(value = "/login")
	public String telaLogin() {
		return "login";
	}
	
//	@PostMapping(value = "/login")
//	public String login(Model model, @RequestParam String email, @RequestParam String senha) {
//		
//		Usuario usuario = usuarioService.validar(email, senha);
//		
//		if(usuario != null) {
//			
//			model.addAttribute("user", usuario);
//			
//			return "home";
//		}
//		return "login";
//	}
//	
//	@GetMapping(value = "/logout")
//	public String logout(HttpSession session, SessionStatus status) {
//		
//		status.setComplete();
//		
//		session.removeAttribute("user");
//		
//		return "redirect:/";
//	}

}
