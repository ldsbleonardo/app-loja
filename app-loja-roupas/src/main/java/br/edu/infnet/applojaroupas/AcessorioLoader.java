package br.edu.infnet.applojaroupas;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.applojaroupas.model.domain.Acessorio;

@Order(3)
@Component
public class AcessorioLoader implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Acessorio acessorio = new Acessorio(2, 2, "Cinturão", "Hugo Boss", 10.2f, "Couro", "preto", "Medio");
		System.out.println("Inclusao de acessorio: " + acessorio);

	}

}
