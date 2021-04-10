package cliente;

public class clienteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente pessoa1 = new Cliente("Luana Bezana", "22/02/1996", "Feminino", "Rock", null);
		
		pessoa1.printInfo();
		
		pessoa1.setFilme_preferido("Código da Vinci");
		pessoa1.filmeEscolhido();
		
		System.out.println("\nO filme escolhido foi: "+pessoa1.getFilme_preferido());
		
		System.out.println();
		System.out.println("\n**Imprimindo as informações atualizadas**");
		pessoa1.printInfo();
		
	}

}
