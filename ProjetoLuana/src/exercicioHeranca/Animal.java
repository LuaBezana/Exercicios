package exercicioHeranca;

public class Animal {

	private String nome;
	private int idade;
	private String cor;
	
	public void emitirSom() {}
	
	public void movimentacao() {}
	
	public void mostrar() {}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
}
