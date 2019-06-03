package br.com.exerciciojava3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SequenciaDeNumeros {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numeroInicial;
		int numeroFinal;
		List <Integer> sequencia = new ArrayList <Integer>();
		
		System.out.println("Digite o numero inicial: ");
		numeroInicial = entrada.nextInt();
		System.out.println("Digite o numero final: ");
		numeroFinal = entrada.nextInt();
		
//		String saida = "";
	 
		for (int i = numeroInicial; i <= numeroFinal; i++) {
			sequencia.add(i);
			
//			saida += i;
//			if (i != numeroFinal) {
//				saida += ", ";
//			}
		}
//		System.out.println(saida);
		System.out.println(sequencia);
	}

}
