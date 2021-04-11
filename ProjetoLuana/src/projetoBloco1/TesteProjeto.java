package projetoBloco1;

import java.util.Scanner;

public class TesteProjeto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Filmes filmes = new Filmes();
		Series series = new Series();
		Musicas musicas = new Musicas();
		Jogos jogos = new Jogos();
		AtividadesFisicas atividadesFisicas = new AtividadesFisicas();
		Listas lista = null;
		int continuar = 1;

		System.out.println("Bem vinde ao nosso menu! Vamos tirar o seu tédio nessa pandemia :D");

		while(continuar==1) {
			System.out.println("\n\nInforme o código da ação desejada:"
				+ "\n1- Assistir filmes"
				+ "\n2- Assistir séries"
				+ "\n3- Ouvir música"
				+ "\n4- Jogar jogos"
				+ "\n5- Praticar atividades físicas");
			int opcao = scanner.nextInt();
			switch(opcao) {
				case 1: lista = filmes;break;
				case 2: lista = series;break;
				case 3: lista = musicas;break;
				case 4: lista = jogos;break;
				case 5: lista = atividadesFisicas;break;
				default:System.out.println("Opção inválida");break;
			}
			
			if (lista != null) {
				lista.listaGeneros();
				int genero = scanner.nextInt();
				switch(genero) {
					case 1: System.out.println("\nSugestões:\n" + lista.lista1());break;
					case 2: System.out.println("\nSugestões:\n" + lista.lista2());break;
					case 3: System.out.println("\nSugestões:\n" + lista.lista3());break;
					case 4: System.out.println("\nSugestões:\n" + lista.lista4());break;
					case 5: System.out.println("\nSugestões:\n" + lista.lista5());break;
					case 6: System.out.println("\nSugestões:\n" + lista.lista6());break;
					default:System.out.println("\nOpção inválida");break;
				}
			}
		
			System.out.println("\nDeseja fazer outra atividade?"
					+ "\n0- Não."
					+ "\n1- Sim! Me mostre as opções!");
			continuar = scanner.nextInt();
		}
		System.out.println("Obrigade! Até mais");
		
	}
}