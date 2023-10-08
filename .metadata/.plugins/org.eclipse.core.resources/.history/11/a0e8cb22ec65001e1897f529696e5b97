package br.edu.infnet.applojaroupas;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.applojaroupas.model.negocio.Calcado;

@Component
public class CalcadoLoader implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Calcado calcado = new Calcado(4, 4, "Sapato", "Brazil", 10.0, "Couro", "Marrom", "40");
		System.out.println("Inclusao de calcado: " + calcado);

	}

}
