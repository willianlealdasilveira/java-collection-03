package br.fai.collections;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Cachorro primeiro = new Cachorro("topi");
		primeiro.setNome("cao");
		primeiro.setCor("azul");

		Cachorro segundo = new Cachorro("Manaus");
		segundo.setNome("yuri");

		List<Cachorro> listaDECachorro = new ArrayList<Cachorro>();
		listaDECachorro.add(primeiro);
		listaDECachorro.add(segundo);

		for (Cachorro cachorro : listaDECachorro) {
			cachorro.som();
			cachorro.dizerMeuNome();
			cachorro.oQueGostoDeFazer();

			System.out.println("Cor do cachorro: " + cachorro.getCor());
			System.out.println("------");
			
		}
		Gato primeirogato = new Gato("ty");
		Gato segundogato = new Gato("re");

		segundogato.setNome("chupetinha");

		List<Gato> listaDEGato = new ArrayList<Gato>();
		listaDEGato.add(primeirogato);
		listaDEGato.add(segundogato);

		for (Gato gato : listaDEGato) {
			gato.som();
			gato.dizerMeuNome();
			gato.oQueFacoDuranteANoite();

			System.out.println("Cor do Gato é : " + gato.getCor());
			System.out.println("------");

		}

	}
}
