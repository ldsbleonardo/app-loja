package br.edu.infnet.applojaroupas;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.applojaroupas.model.domain.PedidoVenda;
import br.edu.infnet.applojaroupas.model.domain.Produto;
import br.edu.infnet.applojaroupas.model.domain.Solicitante;
import br.edu.infnet.applojaroupas.model.domain.Usuario;

@Order(6)
@Component
public class PedidoVendaLoader implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		PedidoVenda p1 = new PedidoVenda("VENDA NO ATACADO", prencherSolicitante(), prencherListaProdutos(),
				prencherUsuario());
	}

	private Solicitante prencherSolicitante() {
		Solicitante s = new Solicitante("GM ROUPAS", "123.456.789-11", "gm@atacado.com");
		return s;
	}

	private Usuario prencherUsuario() {
		Usuario usuario = new Usuario(1);
		return usuario;
	}

	private List<Produto> prencherListaProdutos() {

		List<Produto> list = new ArrayList<>();
		list.add(new Produto(1, 1, "MOCHILA", "MIZUNO", 10));
		return list;
	}

}
