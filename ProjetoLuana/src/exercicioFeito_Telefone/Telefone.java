package exercicioFeito_Telefone;

public abstract class Telefone {
	private String atrTipo;
	
	public Telefone(String parTipo)
	{
		this.atrTipo = parTipo;
	}
	
	abstract public void disca(String paraNumero);
	
	abstract public void toca(int parNumToques);

	public String getAtrTipo() {
		return atrTipo;
	}

	public void setAtrTipo(String atrTipo) {
		this.atrTipo = atrTipo;
	}
	
	
}
