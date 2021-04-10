package Aula06_04;

import java.util.Scanner;

public class ArrayExMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] idade = new int[2][2];
		float media;
		int somaIdade=0, contIdade=0;
		
		Scanner ler = new Scanner(System.in);
		
		for(int linha=0;linha<2;linha++)
		{
			for(int coluna=0;coluna<2;coluna++)
			{
				System.out.println("\nDigite a sua idade: ");
				idade[linha][coluna] = ler.nextInt();
				somaIdade = somaIdade + idade[linha][coluna];
				contIdade++;
			}
		}
		media = somaIdade / contIdade; //4
		
		System.out.printf("\nA média de idades foi de: %3.2f",media);
	}

}
