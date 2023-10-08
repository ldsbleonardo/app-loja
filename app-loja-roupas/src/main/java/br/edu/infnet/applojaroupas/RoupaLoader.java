package br.edu.infnet.applojaroupas;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.applojaroupas.model.domain.Roupa;
@Order(1)
@Component
public class RoupaLoader implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Roupa roupa = new Roupa(3, 3, "Camiseta", "Nike", 100.0f, "Estampada", "Branca", "Pequena");
		System.out.println("Inclusao de roupa: " + roupa);
		
	}

}
