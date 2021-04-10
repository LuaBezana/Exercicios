package funcionario;

public class funcionarioMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario funcionaria1 = new Funcionario("Luana Bezana", "39568227814","502645337","Feminino","luana.bezana@hotmail.com","22/02/1996","v534gs4","Dev. Junior",4400.00);
			
		funcionaria1.imprimir();
		
		System.out.println("\nParabéns! Você foi promovida! :D");
		
		funcionaria1.setCargo("Dev. Pleno");
		funcionaria1.setSalario(6800.00);
		
		System.out.println();
		System.out.println("\n**Suas alterações como colaboradora do Mercado Livre**"+"\nNovo cargo: "+funcionaria1.getCargo()+"\nNovo salário: "+funcionaria1.getSalario()+"\nVocê é parte da nossa família. Estamos felizes em acompanhar seu crescimento profissional dentro da nossa empresa!");
	}

}
