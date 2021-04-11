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

		System.out.println("Bem vinde ao nosso menu! Vamos tirar o seu t�dio nessa pandemia :D");

		while(continuar==1) {
			System.out.println("\n\nInforme o c�digo da a��o desejada:"
				+ "\n1- Assistir filmes"
				+ "\n2- Assistir s�ries"
				+ "\n3- Ouvir m�sica"
				+ "\n4- Jogar jogos"
				+ "\n5- Praticar atividades f�sicas");
			int opcao = scanner.nextInt();
			switch(opcao) {
				case 1: lista = filmes;break;
				case 2: lista = series;break;
				case 3: lista = musicas;break;
				case 4: lista = jogos;break;
				case 5: lista = atividadesFisicas;break;
				default:System.out.println("Op��o inv�lida");break;
			}
			
			if (lista != null) {
				lista.listaGeneros();
				int genero = scanner.nextInt();
				switch(genero) {
					case 1: System.out.println("\nSugest�es:\n" + lista.lista1());break;
					case 2: System.out.println("\nSugest�es:\n" + lista.lista2());break;
					case 3: System.out.println("\nSugest�es:\n" + lista.lista3());break;
					case 4: System.out.println("\nSugest�es:\n" + lista.lista4());break;
					case 5: System.out.println("\nSugest�es:\n" + lista.lista5());break;
					case 6: System.out.println("\nSugest�es:\n" + lista.lista6());break;
					default:System.out.println("\nOp��o inv�lida");break;
				}
			}
		
			System.out.println("\nDeseja fazer outra atividade?"
					+ "\n0- N�o."
					+ "\n1- Sim! Me mostre as op��es!");
			continuar = scanner.nextInt();
		}
		System.out.println("Obrigade! At� mais");
		
	}
}