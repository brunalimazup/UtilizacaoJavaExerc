package br.com.testepaises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.exerciciojava5.País;

public class TestePaises {

	public static void main(String[] args) {

		double densidadeBra;
		double densidadeJp;
		double densidadeFr;
		List<String> fronteiraBrasil = new ArrayList<>(
				Arrays.asList("Colômbia, Peru, Bolívia, Paraguai, " + "Argentina"));
		List<String> fronteiraJapao = new ArrayList<>(
				Arrays.asList("China, Coreia do Sul, Filipinas, " + "Coreia do Norte, Taiwan"));
		List<String> fronteiraFranca = new ArrayList<String>(
				Arrays.asList("Bélgica, Luxemburgo, " + "Alemanha, Suíça"));

		País brasil = new País("BRA", "Brasil", 8.516);
		brasil.setPopulacao(209.3);

		densidadeBra = brasil.getPopulacao() / brasil.getDimensao();
		
		System.out.println(brasil);
		System.out.println("Essa é a densidade do Brasil: " + densidadeBra);
		System.out.println("Esses são os paises que o Brasil faz fronteira:" + fronteiraBrasil + "\n");

		País japao = new País("JP", "Japão", 126.8);
		japao.setPopulacao(2000);

		densidadeJp = japao.getPopulacao() / japao.getDimensao();
		
		System.out.println(japao);
		System.out.println("Essa é a densidade do Japão: " + densidadeJp);
		System.out.println("Paises que o Japão faz fronteira: " + fronteiraJapao + "\n");

		País franca = new País("FR", "França", 643.801);
		franca.setPopulacao(66.99);

		densidadeFr = franca.getPopulacao() / franca.getDimensao();
		
		System.out.println(franca);
		System.out.println("Essa é a densidade da França: " + densidadeFr);
		System.out.println("Paises que a França faz froteira: " + fronteiraFranca + "\n");

		if (brasil.getCodigoIso() != japao.getCodigoIso() && brasil.getCodigoIso() != franca.getCodigoIso()) {
			System.out.println("São paises diferentes");
		} else if (franca.getCodigoIso() != japao.getCodigoIso() && franca.getCodigoIso() != brasil.getCodigoIso()) {
			System.out.println("São paises diferentes");
		}
	}

}
