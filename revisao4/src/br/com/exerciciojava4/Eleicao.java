package br.com.exerciciojava4;

import java.util.Scanner;

import br.com.exerciciojava4.Candidato;

public class Eleicao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int votos = 0;
		int numero = 1;

		Candidato candidato = new Candidato(2, "Januário");

		while (numero != 0) {

			System.out.println("Digite o número do seu candidato: ");
			numero = entrada.nextInt();

			if (numero == 2) {
				votos++;
			}
		}
		
		System.out.println(candidato + "Candidato tem: " + votos + " votos");

	}
}
