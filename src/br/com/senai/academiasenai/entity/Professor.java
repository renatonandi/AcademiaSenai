package br.com.senai.academiasenai.entity;

import java.time.LocalDate;

public class Professor {
	
	private Integer id;
	
	private String nomeCompleto;

	private LocalDate dataDeAdmicao;
	
	private LocalDate dataDeCasamento;
	
	
	public LocalDate getDataDeCasamento() {
		return dataDeCasamento;
	}

	public void setDataDeCasamento(LocalDate dataDeCasamento) {
		this.dataDeCasamento = dataDeCasamento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	
	
	
}
