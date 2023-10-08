package br.edu.infnet.applojaroupas.model.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TPedidoVenda")
public class PedidoVenda {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	private LocalDateTime data;
	private boolean web;
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "idSolicitante")
	private Solicitante solicitante;
	@ManyToMany(cascade = CascadeType.DETACH)
	private List<Produto> produtos;
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;

	public PedidoVenda() {
		descricao = "Pedido inicial";
		data = LocalDateTime.now();
		web = true;
	}

	public PedidoVenda(Solicitante solicitante) {
		this();
		this.solicitante = solicitante;
	}

	public PedidoVenda(String descricao, Solicitante solicitante, List<Produto> produtos, Usuario usuario) {
		this();
		this.descricao = descricao;
		this.solicitante = solicitante;
		this.produtos = produtos;
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return descricao + ";" + data + ";" + web + ";" + solicitante + ";" + usuario + ";" + (produtos==null?0:produtos.size());
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public boolean isWeb() {
		return web;
	}

	public void setWeb(boolean web) {
		this.web = web;
	}

	public Solicitante getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(Solicitante solicitante) {
		this.solicitante = solicitante;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
