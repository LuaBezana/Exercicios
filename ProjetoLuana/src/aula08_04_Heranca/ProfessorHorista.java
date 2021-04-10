package aula08_04_Heranca;

public class ProfessorHorista extends Professor {

	private float valorHora;
	private float numeroHoras;
	
	public ProfessorHorista() {}
	
	public ProfessorHorista(int matricula,String nome)
	{
		super(matricula,nome);
	}
	
	public ProfessorHorista(int matricula,String nome,float valorHora,float numeroHoras)
	{
		super(matricula,nome);
		this.valorHora = valorHora;
		this.numeroHoras = numeroHoras;
	}

	public float getValorHora() {
		return valorHora;
	}

	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}

	public float getNumeroHoras() {
		return numeroHoras;
	}

	public void setNumeroHoras(float numeroHoras) {
		this.numeroHoras = numeroHoras;
	}
	
	public float getSalario()
	{
		return this.valorHora * this.numeroHoras;
	}

}
