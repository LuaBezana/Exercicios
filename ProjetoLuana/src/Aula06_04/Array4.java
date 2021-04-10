package Aula06_04;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Faça um programa que leia duas matrizes 2 x 2 com valores reais. 
	 	Ofereça ao usuário um menu de opções:
		(1) somar as duas matrizes
		(2) subtrair a primeira matriz da segunda
		(3) adicionar uma constante as duas matrizes
		(4) imprimir as matrizes
		Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor
		da constante deve ser lido e o resultado da adição da constante deve ser armazenado na
		própria matriz.*/
		float[][] numero1 = new float[2][2];
		float[][] numero2 = new float[2][2];
		float[][] numero3 = new float[2][2];
		int opcao, somar, subtrair;
		double constante;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Primeira matriz:");
		for(int linha=0;linha<2;linha++)
		{
			for(int coluna=0;coluna<2;coluna++)
			{
				System.out.print("\nDigite um número: ");
				numero1[linha][coluna] = ler.nextInt();
			}
		}
		
		System.out.println("Segunda matriz:");
		for(int linha=0;linha<2;linha++)
		{
			for(int coluna=0;coluna<2;coluna++)
			{
				System.out.print("\nDigite um número: ");
				numero2[linha][coluna] = ler.nextInt();
			}
		}
		System.out.println("\nDigite o número da opção desejada:"
				+ "\n1) somar as duas matrizes"
				+ "\n2) subtrair a primeira matriz da segunda"
				+ "\n3) adicionar uma constante as duas matrizes"
				+ "\n4) imprimir as matrizes");
		opcao = ler.nextInt();
		
		switch (opcao)
		{
		case 1:
			for(int linha=0;linha<2;linha++)
			{
				for(int coluna=0;coluna<2;coluna++)
				{
					numero3[linha][coluna] = numero1[linha][coluna] + numero2[linha][coluna];
					System.out.print("\nSoma das duas matrizes: "+numero3[linha][coluna]);
				}			
			}
			break;
		case 2:
			for(int linha=0;linha<2;linha++)
			{
				for(int coluna=0;coluna<2;coluna++)
				{
					numero3[linha][coluna] = numero1[linha][coluna] - numero2[linha][coluna];
					System.out.print("\nSubtração da primeira sobre a segunda matriz: "+numero3[linha][coluna]);
				}
			}
			break;
		case 3:
			for(int linha=0;linha<2;linha++)
			{
				for(int coluna=0;coluna<2;coluna++)
				{
					numero3[linha][coluna] = numero1[linha][coluna] - numero2[linha][coluna];
					System.out.print("\nDigite o valor da constante: ");
					constante = ler.nextInt();
					
				}
			}
			break;
		case 4:
			System.out.println("\nPrimeira Matriz");
			for(int linha=0;linha<2;linha++)
			{
				System.out.println();
				System.out.print("| ");
				for(int coluna=0;coluna<2;coluna++)
				{
					System.out.print(numero1[linha][coluna]);
					System.out.print(" ");
				}
				System.out.print("|");
			}
			System.out.println("\nSegunda Matriz");
			for(int linha=0;linha<2;linha++)
			{
				System.out.println();
				System.out.print("| ");
				for(int coluna=0;coluna<2;coluna++)
				{
					System.out.print(numero2[linha][coluna]);
					System.out.print(" ");
				}
				System.out.print("|");
			}
			break;
			
		
		}
	}

}
