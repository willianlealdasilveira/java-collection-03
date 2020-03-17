package br.fai.collections;

public class Gato extends Animal {
	

	public Gato(String cor) {
		setCor("Branco");
	}

	@Override
	public void som() {
		super.som();
		System.out.println("eu gosto de miar");
	}

	public void oQueFacoDuranteANoite() {
		System.out.println("Gosto de pular a cerca toda noite");
	}
}
