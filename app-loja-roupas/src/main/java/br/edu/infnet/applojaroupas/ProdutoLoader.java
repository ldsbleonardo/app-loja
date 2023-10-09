package br.edu.infnet.applojaroupas;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.applojaroupas.model.domain.Acessorio;
import br.edu.infnet.applojaroupas.model.domain.Calcado;
import br.edu.infnet.applojaroupas.model.domain.Roupa;
import br.edu.infnet.applojaroupas.model.domain.Usuario;
import br.edu.infnet.applojaroupas.model.service.ProdutoService;

@Component
public class ProdutoLoader implements ApplicationRunner {

	@Autowired
	private ProdutoService produtoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		FileReader file = new FileReader("arquivos/produto.txt");
		BufferedReader leitura = new BufferedReader(file);

		String linha = leitura.readLine();

		String[] campos = null;

//		while (linha != null) {
//			campos = linha.split(";");
//			
//			System.out.println("* Tamanho do campo:" + campos.length);
//
//			switch (campos[9]) {
//		
//			case "R":
//				System.out.println("* teste de roupa:" + campos.toString());
//				Roupa roupa = new Roupa(Integer.valueOf(campos[0]), Integer.valueOf(campos[1]), campos[3], campos[4],
//						Float.valueOf(campos[5]), campos[6], campos[7], campos[8]);
//
//				roupa.setUsuario(new Usuario(Integer.valueOf(campos[9])));
//
//				produtoService.incluir(roupa);
//				break;
//
//			case "A":
//				Acessorio acessorio = new Acessorio(
//
//						Integer.valueOf(campos[0]), Integer.valueOf(campos[1]), campos[3], campos[4],
//						Float.valueOf(campos[5]), campos[6], campos[7], campos[8]);
//
//				acessorio.setUsuario(new Usuario(Integer.valueOf(campos[9])));
//
//				produtoService.incluir(acessorio);
//				break;
//
//			case "C":
//				Calcado calcado = new Calcado(Integer.valueOf(campos[0]), Integer.valueOf(campos[1]), campos[3],
//						campos[4], Float.valueOf(campos[5]), campos[6], campos[7], campos[8]);
//
//				calcado.setUsuario(new Usuario(Integer.valueOf(campos[9])));
//
//				produtoService.incluir(calcado);
//				break;
//
//			default:
//				break;
//			}
//
//			linha = leitura.readLine();
//		}

		leitura.close();
	}

}
