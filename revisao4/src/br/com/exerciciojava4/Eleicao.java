package br.com.exerciciojava4;

import java.util.Scanner;

import br.com.exerciciojava4.Candidato;

public class Eleicao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero = 1;
		int votosJ = 0;
		int votosF = 0;
		int votosM = 0;
		int votosV = 0;
		int votosJo = 0;
		int votosFe = 0;
		int votosR = 0;
		int votosL = 0;


		Candidato candidato = new Candidato(1, "Januário");
		Candidato candidato2 = new Candidato(2, "Frederico Evandro");
		Candidato candidato3 = new Candidato(3, "Mimio Marçal");
		Candidato candidato4 = new Candidato(4, "Vinicius xablau");
		Candidato candidato5 = new Candidato(5, "João Escalator");
		Candidato candidato6 = new Candidato(6, "Felipe Jasper");
		Candidato candidato7 = new Candidato(7, "Ronaldo Fenomeno");
		Candidato candidato8 = new Candidato(8, "Laniscleide klaus");

		while (votosF < 10 && votosJ < 10 && votosM < 10 && votosV < 10 && votosJo 
				< 10 && votosFe < 10 && votosR < 10 && votosL < 10) {

			System.out.println("Digite o número do seu candidato de 1 a 8: ");
			numero = entrada.nextInt();

			if (numero == 1) {
				votosJ++;
			} else if (numero == 2) {
				votosF++;
			} else if (numero == 3) {
				votosM++;
			} else if (numero == 4) {
				votosV++;
			} else if (numero == 5) {
				votosJo++;
			} else if (numero == 6) {
				votosFe++;
			} else if (numero == 7) {
				votosR++;
			} else if (numero == 8) {
				votosL++;
			} 
		}
		
		System.out.println(candidato + "Candidato tem: " + votosJ + " votos" + "\n");
		System.out.println(candidato2 + "Candidato tem: " + votosF + " votos" + "\n");
		System.out.println(candidato3 + "Candidato tem: " + votosM + " votos"+ "\n");
		System.out.println(candidato4 + "Candidato tem: " + votosV + " votos"+ "\n");
		System.out.println(candidato5 + "Candidato tem: " + votosJo + " votos" + "\n");
		System.out.println(candidato6 + "Candidato tem: " + votosFe + " votos" + "\n");
		System.out.println(candidato7 + "Candidato tem: " + votosR + " votos" + "\n");
		System.out.println(candidato8 + "Candidato tem: " + votosL + " votos");

	}
}
