package br.edu.infnet.applojaroupas.model.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tproduto")
@Inheritance(strategy = InheritanceType.JOINED)
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer codigo;
	private String descricao;
	private String marca;
	private float valorAquisicao;
	@ManyToMany(mappedBy = "produtos")
	private List<PedidoVenda> pedidos;
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;

	public Produto(Integer idcodigoProduto, Integer codigo, String descricao, String marca, float valorAquisicao) {
		this.id = idcodigoProduto;
		this.codigo = codigo;
		this.descricao = descricao;
		this.marca = marca;
		this.valorAquisicao = valorAquisicao;
	}

	public Produto() {
		// TODO Auto-generated constructor stub
	}

	public Produto(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return String.format("%d;%d;%s;%s;%.2f", id, codigo, descricao, marca, valorAquisicao);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getValorAquisicao() {
		return valorAquisicao;
	}

	public void setValorAquisicao(float valorAquisicao) {
		this.valorAquisicao = valorAquisicao;
	}

	public List<PedidoVenda> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<PedidoVenda> pedidos) {
		this.pedidos = pedidos;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
