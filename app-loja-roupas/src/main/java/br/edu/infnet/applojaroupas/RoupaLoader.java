package br.edu.infnet.applojaroupas;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.applojaroupas.model.domain.Roupa;
import br.edu.infnet.applojaroupas.model.domain.Usuario;
import br.edu.infnet.applojaroupas.model.service.RoupaService;

@Order(3)
@Component
public class RoupaLoader implements ApplicationRunner {

	@Autowired
	private RoupaService roupaService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		FileReader file = new FileReader("arquivos/roupa.txt");
		BufferedReader leitura = new BufferedReader(file);

		String linha = leitura.readLine();

		String[] campos = null;

		while (linha != null) {
			campos = linha.split(";");

			Roupa roupa = new Roupa(Integer.valueOf(campos[0]), Integer.valueOf(campos[1]), campos[2], campos[3],
					Float.valueOf(campos[4]), campos[5], campos[6], campos[7]);

			roupa.setUsuario(new Usuario(Integer.valueOf(campos[9])));

			roupaService.incluir(roupa);

			linha = leitura.readLine();
		}

		leitura.close();
	}

}
