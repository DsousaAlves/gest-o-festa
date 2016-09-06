package com.dsousa.gestaoFesta.model;

public class Convidado {
	private String nome;
	private Integer qtdAcompanhantes;

	public Convidado() {
	}

	public Convidado(String nome, Integer qtdAcompanhantes) {
		super();
		this.nome = nome;
		this.qtdAcompanhantes = qtdAcompanhantes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQtdAcompanhantes() {
		return qtdAcompanhantes;
	}

	public void setQtdAcompanhantes(Integer qtdAcompanhantes) {
		this.qtdAcompanhantes = qtdAcompanhantes;
	}

}
