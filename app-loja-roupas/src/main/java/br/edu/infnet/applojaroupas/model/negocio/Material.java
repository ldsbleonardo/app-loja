package br.edu.infnet.applojaroupas.model.negocio;

public class Material extends Produto {

	private String tipoMaterial;
	private float quantidade;
	private String informacao;

	public Material(Integer codigoProduto, Integer codigoFornecedor, String descricao, String marca, String tamanho,
			Double valorAquisicao, String tipoMaterial, float quantidade, String informacao) {
		super(codigoProduto, codigoFornecedor, descricao, marca, tamanho, valorAquisicao);
		this.tipoMaterial = tipoMaterial;
		this.quantidade = quantidade;
		this.informacao = informacao;

	}

	@Override
	public String toString() {
		return String.format("%s;%f;%s", tipoMaterial, quantidade, informacao);
	}

}
