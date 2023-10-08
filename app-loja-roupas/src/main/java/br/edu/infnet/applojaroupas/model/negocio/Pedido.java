package br.edu.infnet.applojaroupas.model.negocio;

import java.time.LocalDateTime;

public class Pedido {

	private String descricao;
	private LocalDateTime data;
	private boolean web;

	public Pedido() {
		descricao = "Pedido inicial";
		data = LocalDateTime.now();
		web = true;
	}

	@Override
	public String toString() {
		return descricao + ";" + data + ";" + web;
	}

}
