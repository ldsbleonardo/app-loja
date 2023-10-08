package br.edu.infnet.applojaroupas.model.negocio;

public class Produto {

	private Integer codigoProduto;
	private Integer codigoFornecedor;
	private String descricao;
	private String marca;
	private Double valorAquisicao;

	public Produto(Integer codigoProduto, Integer codigoFornecedor, String descricao, String marca, String tamanho,
			Double valorAquisicao) {
		this.codigoProduto = codigoProduto;
		this.codigoProduto = codigoFornecedor;
		this.descricao = descricao;
		this.marca = marca;
		this.valorAquisicao = valorAquisicao;
	}

	@Override
	public String toString() {
		return String.format("%d;%d;%s;%s;%f", codigoProduto, codigoFornecedor, descricao, marca, valorAquisicao);
	}
}
