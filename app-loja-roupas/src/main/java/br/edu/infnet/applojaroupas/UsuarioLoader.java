package br.edu.infnet.applojaroupas;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.applojaroupas.model.domain.Usuario;
import br.edu.infnet.applojaroupas.model.service.UsuarioService;

@Order(4)
@Component
public class UsuarioLoader implements ApplicationRunner {

	@Autowired
	private UsuarioService usuarioService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		FileReader file = new FileReader("arquivos/usuario.txt");
		BufferedReader leitura = new BufferedReader(file);

		String linha = leitura.readLine();

		String[] campos = null;

		while (linha != null) {
			campos = linha.split(";");
			System.out.println("Usuario Loader: " + campos);
			Usuario usuario = new Usuario();
			usuario.setEmail(campos[0]);
			usuario.setNome(campos[1]);
			usuario.setSenha(campos[2]);

			usuarioService.incluir(usuario);

			linha = leitura.readLine();
		}

		leitura.close();
	}

}
