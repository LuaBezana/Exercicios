package aula08_04_Heranca;

public class Professor {
	
	private int matricula;
	private String nome;
	
	public Professor() {}
	
	public Professor(int matricula,String nome)
	{
		this.matricula = matricula;
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public float getSalario()
	{
		return 0;
	}
}
