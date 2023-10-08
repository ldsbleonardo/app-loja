package br.edu.infnet.applojaroupas;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.applojaroupas.model.negocio.Pedido;

@Component
public class PedidoLoader implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Pedido p1 = new Pedido();
		System.out.println("Inclusao do pedido realizada com sucesso: " + p1);
		
	}

}
