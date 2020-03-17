package br.fai.collections;

public abstract class Animal {
	private String cor = "preto";
	private int valor = 5;
	private String nome;

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getValor() {
		return valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	void som() {

		System.out.println("Este é o som padrão de um animal: ");
	}

	void dizerMeuNome() {
		System.out.println("Nome do animal: ");

	}

	private void dizerMinhaIdade() {
		System.out.println("Minha idade é");

	}
}
