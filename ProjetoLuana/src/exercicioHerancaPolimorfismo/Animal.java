package exercicioHerancaPolimorfismo;

public abstract class Animal {

	private String nome;
	private int idade;
	private String cor;
	private String especie;
	
	public Animal(String especie) {
		this.especie=especie;
	}
	
	abstract public void emitirSom();
	
	abstract public void movimentacao();
	
	abstract public void mostrar();
	
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

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	
	
	
}
