
package br.edu.infnet.applojaroupas.model.negocio;

public class Venda extends Produto {

	private Integer codigoCliente;
	private Integer codigoVenda;

	public Venda(Integer codigoProduto, Integer codigoFornecedor, String descricao, String marca, String tamanho,
			Double valorAquisicao, Integer codigoCliente, Integer codigoVenda) {
		super(codigoProduto, codigoFornecedor, descricao, marca, tamanho, valorAquisicao);
		this.codigoCliente = codigoCliente;
		this.codigoVenda = codigoVenda;

	}

	@Override
	public String toString() {
		return String.format("%s;%s", codigoCliente, codigoVenda);
	}
}
