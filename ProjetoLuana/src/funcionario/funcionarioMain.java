package funcionario;

public class funcionarioMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario funcionaria1 = new Funcionario("Luana Bezana", "39568227814","502645337","Feminino","luana.bezana@hotmail.com","22/02/1996","v534gs4","Dev. Junior",4400.00);
			
		funcionaria1.imprimir();
		
		System.out.println("\nParab�ns! Voc� foi promovida! :D");
		
		funcionaria1.setCargo("Dev. Pleno");
		funcionaria1.setSalario(6800.00);
		
		System.out.println();
		System.out.println("\n**Suas altera��es como colaboradora do Mercado Livre**"+"\nNovo cargo: "+funcionaria1.getCargo()+"\nNovo sal�rio: "+funcionaria1.getSalario()+"\nVoc� � parte da nossa fam�lia. Estamos felizes em acompanhar seu crescimento profissional dentro da nossa empresa!");
	}

}
