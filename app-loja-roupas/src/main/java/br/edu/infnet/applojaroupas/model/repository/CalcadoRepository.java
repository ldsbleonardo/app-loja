package br.edu.infnet.applojaroupas.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.applojaroupas.model.domain.Calcado;

@Repository
public interface CalcadoRepository extends CrudRepository<Calcado, Integer> {

	@Query("from Calcado a where a.usuario.id = :userid")
	public List<Calcado> obterLista(Integer userid);
}