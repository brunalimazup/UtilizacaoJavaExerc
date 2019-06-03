package br.com.exerciciojava1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculoPar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int numero = 1;
		int pares = 0;
		int impar = 0;
		int media;

		List<Integer> numerosPares = new ArrayList<Integer>();
		List<Integer> numeroImpar = new ArrayList<Integer>();

		while (numero != 0) {

			System.out.println("Informe o numero desejado: ");
			numero = entrada.nextInt();

			if (numero % 2 == 0) {
				pares = numero;
				numerosPares.add(pares);
			} else {
				impar = numero;
				numeroImpar.add(impar);
			}
		}

		int valor = 0;
		
		for (int i = 0; i < numerosPares.size(); i++) {
			valor = valor + numerosPares.get(i);
		}
		
	    media = valor / numerosPares.size();
	    
		System.out.println("A media dos valores pares é:" + media);
		System.out.println("Numeros pares digitados:" + numerosPares);
		System.out.println("Numeros Impares digitados:" + numeroImpar);
	}

}
