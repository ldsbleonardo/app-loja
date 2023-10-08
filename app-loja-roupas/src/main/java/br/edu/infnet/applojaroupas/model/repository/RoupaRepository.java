package br.edu.infnet.applojaroupas.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.applojaroupas.model.domain.Roupa;

@Repository
public interface RoupaRepository extends CrudRepository<Roupa, Integer> {

	@Query("from Roupa a where a.usuario.id = :userid")
	public List<Roupa> obterLista(Integer userid);
}
