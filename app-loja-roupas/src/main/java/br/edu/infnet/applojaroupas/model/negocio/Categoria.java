package br.edu.infnet.applojaroupas.model.negocio;

public class Categoria extends Produto {

	private String tipo;
	private boolean modaIntima;
	private String estacaoModa;

	public Categoria(Integer codigoProduto, Integer codigoFornecedor, String descricao, String marca, String tamanho,
			Double valorAquisicao, String tipo, boolean modaIntima, String estacaoModa) {
		super(codigoProduto, codigoFornecedor, descricao, marca, tamanho, valorAquisicao);
		this.tipo = tipo;
		this.modaIntima = modaIntima;
		this.estacaoModa = estacaoModa;

	}

	@Override
	public String toString() {
		return String.format("%s;%s;%s", tipo,modaIntima, estacaoModa);
	}

}
