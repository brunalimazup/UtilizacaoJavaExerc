package br.com.exerciciojava6;

import java.util.ArrayList;
import java.util.List;

public class Continente {
 
	private String nome ;
	private List<String> paises = new ArrayList<String>();

	public Continente(String nome, List<String>paises) {
		super();
		this.nome = nome;
		this.paises = paises;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<String> getPaises() {
		return paises;
	}
	public void setPaises(List<String> nomeDosPaises) {
		this.paises = paises;
	}
	
	public String toString() {
		String continente = "";
		continente += "Nome do continente: " +this.getNome() + "\n";
		continente += "Nome dos paises: "    +this.getPaises();
		return continente;
		
	}
	
}
