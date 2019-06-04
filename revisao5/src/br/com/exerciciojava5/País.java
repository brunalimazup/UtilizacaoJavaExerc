package br.com.exerciciojava5;

public class País {

	private String codigoIso = "";
	private String nome = "";
	private double dimensao;

	public País(String codigoIso, String nome, double dimensao) {
		super();
		this.codigoIso = codigoIso;
		this.nome = nome;
		this.dimensao = dimensao;
	}

	public String getCodigoIso() {
		return codigoIso;
	}

	public void setCodigoIso(String codigoIso) {
		this.codigoIso = codigoIso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getDimensao() {
		return dimensao;
	}

	public void setDimensao(double dimensao) {
		this.dimensao = dimensao;
	}
	
	private double populacao;

	public double getPopulacao() {
		return populacao;
	}

	public void setPopulacao(double populacao) {
		this.populacao = populacao;
	}

}
