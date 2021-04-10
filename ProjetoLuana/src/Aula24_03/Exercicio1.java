package Aula24_03;

import java.util.Scanner;
//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
//dias e mostre-a expressa apenas em dias.
public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int anos, meses, dias, idadeEmDias;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Quantos anos você tem?");
		anos = ler.nextInt();
		System.out.println("Quantos meses?");
		meses =  ler.nextInt();
		System.out.println("Quantos dias?");
		dias =  ler.nextInt();

		idadeEmDias = (anos*365) + (meses*30) + dias;
		
		System.out.println("\nVocê tem "+ idadeEmDias + " dias de vida.");
		idadeEmDias =  ler.nextInt();
	}

}
