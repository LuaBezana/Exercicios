package exercicioFeito_Telefone;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Exercício exemplo
		TelefoneCelular celular = new TelefoneCelular();
		TelefoneFixo fixo = new TelefoneFixo();
		TelefonePublico publico = new TelefonePublico();
		
		Telefone telefone = null;
		
		int n = (int) (Math.random()*3.0);
		
		System.out.println("\nNúmero escolhido foi: "+n);
		
		switch(n)
		{
		case 0: telefone = celular;break;
		case 1: telefone = fixo;break;
		case 2: telefone = publico;break;
		default:System.out.println("\nErro inesperado...");
		}
		
		if(telefone!=null)
		{
			telefone.disca("82324544");
			telefone.toca(3);
		}
	}


}
