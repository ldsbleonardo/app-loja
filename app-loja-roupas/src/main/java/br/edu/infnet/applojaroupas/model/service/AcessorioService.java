package br.edu.infnet.applojaroupas.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.applojaroupas.model.domain.Acessorio;
import br.edu.infnet.applojaroupas.model.domain.Usuario;
import br.edu.infnet.applojaroupas.model.repository.AcessorioRepository;

@Service
public class AcessorioService {
	
	@Autowired
	private AcessorioRepository acessorioRepository;
	

	public Collection<Acessorio> obterLista(){
		
		return (Collection<Acessorio>) acessorioRepository.findAll();
	}
	
	public Collection<Acessorio> obterLista(Usuario usuario){
		
		return (Collection<Acessorio>) acessorioRepository.obterLista(usuario.getId());
	}

	public void incluir(Acessorio acessorio) {

		acessorioRepository.save(acessorio);
	}
	
	public void excluir(Integer id) {

		acessorioRepository.deleteById(id);
	}	

}
