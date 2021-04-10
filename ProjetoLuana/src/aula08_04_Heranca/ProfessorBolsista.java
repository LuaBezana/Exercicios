package aula08_04_Heranca;

public class ProfessorBolsista extends Professor {
	private float valorBolsa;
	
	public ProfessorBolsista() {}
	
	public ProfessorBolsista(int matricula,String nome)
	{
		super(matricula,nome);
	}
	
	public ProfessorBolsista(int matricula,String nome,float valorBolsa)
	{
		super(matricula,nome);
		this.valorBolsa = valorBolsa;
	}
	
	public float getvalorBolsa()
	{
		return this.valorBolsa;
	}
	
	public void setvalorHora(float valorBolsa)
	{
		this.valorBolsa = valorBolsa;
	}
	
	public float getSalario()
	{
		return this.getvalorBolsa();
	}
}
