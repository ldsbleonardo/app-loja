package br.edu.infnet.applojaroupas;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.applojaroupas.model.negocio.Pedido;
import br.edu.infnet.applojaroupas.model.negocio.Venda;

@Component
public class VendasLoader implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Venda v1 = new Venda(1, 1, "Roupas Plus Size", "LoluModas", "G", 2.5, 10, 5);
		System.out.println("Inclusao de venda: " + v1);
		
	}

}
