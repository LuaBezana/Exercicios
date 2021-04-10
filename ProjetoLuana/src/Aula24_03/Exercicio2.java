package Aula24_03;

import java.util.Scanner;

public class Exercicio2 {
	//2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
	//expressa em anos, meses e dias.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dias, meses, anos, idadeEmDias, mesesEmDias;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite sua idade em dias:");
		idadeEmDias = ler.nextInt();
		
		anos = idadeEmDias/365;
		mesesEmDias = idadeEmDias%365;
		meses = mesesEmDias/30;
		dias = mesesEmDias%30;
		
		System.out.println("Você tem " + anos + " anos, " + meses + " meses e " + dias + " dias de vida.");
		anos = ler.nextInt();
		meses = ler.nextInt();
		dias = ler.nextInt();
		
	}

}
