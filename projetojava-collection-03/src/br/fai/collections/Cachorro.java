package br.fai.collections;

public class Cachorro  extends Animal{
	public Cachorro (String nome) { // o construtor da instância deve receber a váriavel "nome"
		setNome(nome);
	
	}
	@Override
     public void som() {
	  System.out.println("eu gosto de latir");
      }
        public void oQueGostoDeFazer() {
		
		System.out.println("Gosto de morder os carteiros");
	}	
}
