package br.edu.infnet.applojaroupas;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.applojaroupas.model.negocio.Roupa;

@Component
public class RoupaLoader implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Roupa roupa = new Roupa(3, 3, "Camiseta", "Nike", 100.0, "Estampada", "Branca", "Pequena");
		System.out.println("Inclusao de roupa: " + roupa);
		
	}

}
