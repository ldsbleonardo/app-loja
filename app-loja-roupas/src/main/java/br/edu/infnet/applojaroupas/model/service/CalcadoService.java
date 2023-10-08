package br.edu.infnet.applojaroupas.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.applojaroupas.model.domain.Calcado;
import br.edu.infnet.applojaroupas.model.domain.Usuario;
import br.edu.infnet.applojaroupas.model.repository.CalcadoRepository;

@Service
public class CalcadoService {

	@Autowired
	private CalcadoRepository calcadoRepository;

	public Collection<Calcado> obterLista() {

		return (Collection<Calcado>) calcadoRepository.findAll();
	}

	public Collection<Calcado> obterLista(Usuario usuario) {

		return (Collection<Calcado>) calcadoRepository.obterLista(usuario.getId());
	}

	public void incluir(Calcado calcado) {

		calcadoRepository.save(calcado);
	}

	public void excluir(Integer id) {

		calcadoRepository.deleteById(id);
	}

}
