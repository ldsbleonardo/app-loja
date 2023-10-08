package br.edu.infnet.applojaroupas.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.applojaroupas.model.domain.Acessorio;

@Repository
public interface AcessorioRepository extends CrudRepository<Acessorio, Integer> {

	@Query("from Acessorio a where a.usuario.id = :userid")
	public List<Acessorio> obterLista(Integer userid);
}