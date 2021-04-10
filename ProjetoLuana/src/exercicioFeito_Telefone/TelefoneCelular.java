package exercicioFeito_Telefone;

public class TelefoneCelular extends Telefone {
	
	public TelefoneCelular()
	{
		super("Celular");
	}
	
	@Override
	public void toca(int paraNumToques)
	{
		switch(paraNumToques)
		{
		case 1:
			System.out.println("Trimtrimtrim...trimtrimtrim");
			break;
		case 2:
			System.out.println("Tutututu...tutututu");
			break;
			default:
				System.out.println("Nem sei...Nem sei...");
				break;
		}
	}
	
	@Override
	public void disca(String paraNumero)
	{
		System.out.println("\nO número: "+paraNumero+" é um celualr...");
	}
}
