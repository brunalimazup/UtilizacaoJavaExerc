package br.com.exerciciojava4;

public class Candidato {

	private int numero;
//	private int voto;
	private String nome = "";

	public Candidato(int numero, String nome) {
		super();
		this.numero = numero;
//		this.voto = voto;
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

//	public int getVoto() {
//		return voto;
//	}

//	public void setVoto(int voto) {
//		this.voto = voto;
//	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString() {

		String candidato = "";
		candidato += "Nome: " + this.getNome() + "\n";
		candidato += "Numero: " + this.getNumero() + "\n";
//		candidato += "Votos: " + this.getVoto();

		return candidato;
	}

}
