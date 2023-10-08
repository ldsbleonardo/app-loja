package br.edu.infnet.applojaroupas.model.negocio;

public class Calcado extends Produto {

	String tipo;
	String cor;
	String tamanho;

	public Calcado(Integer codigoProduto, Integer codigoFornecedor, String descricao, String marca,
			Double valorAquisicao, String tipo, String cor, String tamanho) {
		super(codigoProduto, codigoFornecedor, descricao, marca, tamanho, valorAquisicao);
		this.tipo = tipo;
		this.cor = cor;
		this.tamanho = tamanho;

	}

	@Override
	public String toString() {
		return String.format("%s;%s;%s", tipo, cor, tamanho);
	}

}
