package br.edu.infnet.applojaroupas.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Tacessorio")
public class Acessorio extends Produto {

	String tipo;
	String cor;
	String tamanho;

	public Acessorio() {
		// TODO Auto-generated constructor stub
	}

	public Acessorio(Integer id) {
		super(id);
	}

	public Acessorio(Integer id, Integer codigo, String descricao, String marca, float valorAquisicao, String tipo,
			String cor, String tamanho) {
		super(id, codigo, descricao, marca, valorAquisicao);
		this.tipo = tipo;
		this.cor = cor;
		this.tamanho = tamanho;
	}

	@Override
	public String toString() {
		return String.format("%s;%s;%s;%s", 
				super.toString(), 
				tipo, cor, tamanho);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

}
