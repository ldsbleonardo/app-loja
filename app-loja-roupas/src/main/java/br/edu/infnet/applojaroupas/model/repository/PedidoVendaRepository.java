package br.edu.infnet.applojaroupas.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.applojaroupas.model.domain.PedidoVenda;

@Repository
public interface PedidoVendaRepository extends CrudRepository<PedidoVenda, Integer> {

	@Query("from PedidoVenda p where p.usuario.id = :userid")
	public List<PedidoVenda> obterLista(Integer userid);
}
