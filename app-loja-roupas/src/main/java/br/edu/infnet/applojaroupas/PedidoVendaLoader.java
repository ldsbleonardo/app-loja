package br.edu.infnet.applojaroupas;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.applojaroupas.model.domain.PedidoVenda;

@Component
public class PedidoVendaLoader implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		PedidoVenda p1 = new PedidoVenda();
		System.out.println("Inclusao do pedido: " + p1);
		
	}

}
