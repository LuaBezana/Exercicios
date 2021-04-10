package aula08_04_Heranca;

public class ProfessorDE extends Professor {

	private float salario;
	
	public ProfessorDE() {}
	
	public ProfessorDE(int matricula,String nome)
	{
		super(matricula,nome);
	}
	
	public ProfessorDE(int matricula,String nome,float salario)
	{
		super(matricula,nome);
		this.salario = salario;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
}
