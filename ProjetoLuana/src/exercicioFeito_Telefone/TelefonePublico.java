package exercicioFeito_Telefone;

public class TelefonePublico extends Telefone{
	
	public TelefonePublico()
	{
		super("Público");
	}
	
	@Override
	public void toca(int paraNumToques)
	{
		for(int i=0;i<paraNumToques;i++)
		{
			System.out.println("\nAcoooooorda meninaaaaaaaa...");
		}
	}
	
	@Override
	public void disca(String paraNumero)
	{
		if(paraNumero.charAt(0)=='9' || paraNumero.charAt(0)=='8')
		{
			System.out.println("\nEste telefone não liga para celular...");
		}
		else
		{
			System.out.println("\nDiscando: "+paraNumero);
		}
	}
}
