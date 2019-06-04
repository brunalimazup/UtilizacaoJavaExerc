package br.com.testeContinente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.exerciciojava6.Continente;

public class TesteContinentes {

	public static void main(String[] args) {

		int quantidade = digiteInt("Quantos continentes você quer adicionar?");

		for (int i = 0; i < quantidade; i++) {

			String nome = digiteString("Qual o nome do continente");
			List<String> nomeDosPaises = new ArrayList<String>();
			String pais = digiteString("Qual o nome do pais ?");
			nomeDosPaises.add(pais);
			Continente continente = new Continente(nome, nomeDosPaises);

			continente.setPaises(nomeDosPaises);
			
			System.out.println(continente);
		}
		
	}

	public static String digiteString(String frase) {
		System.out.println(frase);
		Scanner scanner = new Scanner(System.in);
		return scanner.next();
	}

	public static int digiteInt(String string) {
		System.out.println(string);
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
}
