package exercicioHerancaPolimorfismo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		Animal animal = null;
		Scanner input = new Scanner(System.in);
		int passeio = 1;
		
		cachorro.setNome("Tina");
		cachorro.setIdade(3);
		cavalo.setNome("James");
		cavalo.setIdade(15);
		preguica.setNome("Preguinho");
		preguica.setIdade(7);
		
		System.out.println("Bem vindo ao ZOO!\nConheça nossos bichinhos:");
		while(passeio == 1) {
			
			int selva = (int) (Math.random()*3.0);
			switch(selva){
				case 0: animal = cachorro;break;
				case 1: animal = cavalo;break;
				case 2: animal = preguica;break;
				default:System.out.println("\nNenhum animal encontrado ainda...");
			}
			if(animal!=null){
				animal.mostrar();
				animal.emitirSom();
				animal.movimentacao();				
			}
		
			System.out.println("\nGostaria de continuar passeando para encontrar mais bichinhos?"
					+ "\n(0) Não."
					+ "\n(1) Sim! Vamos lá!");
			passeio = input.nextInt();
		}
		System.out.println("\nObrigado pela visita!");
	}
}


