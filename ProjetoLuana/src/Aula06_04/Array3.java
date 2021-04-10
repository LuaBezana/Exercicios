package Aula06_04;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
		int[][] idade = new int[3][3];
		int contador=0;
		
		Scanner ler = new Scanner(System.in);
		
		for(int linha=0;linha<3;linha++)
		{
			for(int coluna=0;coluna<3;coluna++)
			{
				System.out.println("\nDigite a sua idade: ");
				idade[linha][coluna] = ler.nextInt();
				
				if(idade[linha][coluna]>10)
				{
					contador++;
				}
			}
		}
		System.out.println("\nVocê inseriu "+contador+" valores maiores que 10.");
	}

}
