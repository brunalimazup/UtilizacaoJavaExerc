package br.com.exerciciojava2;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numero;
		int numero2;

		System.out.println("Informe o número que deseja a tabuada: ");
		numero = entrada.nextInt();
		
		System.out.println("Informe o número que deseja começar a sua tabuada: ");
		numero2 = entrada.nextInt();

		for (int i = numero2; i < 11; i++) {
			int teste = numero * i;
			System.out.println(teste);

		}
	}

}
