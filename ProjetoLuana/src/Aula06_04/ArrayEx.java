package Aula06_04;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quantidade;
		double media=0;
		int i;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nDigite o tamanho do vetor1: ");
		quantidade = ler.nextInt();
		
		double[] vetor1 = new double[quantidade];
		
		for(i=0;i<quantidade;i++)
		{
			System.out.println("\nInforme a "+(i+1)+"� nota");
			vetor1[i] = ler.nextDouble();	
		}
		
		for(i=0;i<quantidade;i++)
		{
			media = media + vetor1[1];
		}
		
		media = media / quantidade;
		System.out.println("\nA m�dia foi de: "+media);
		
		String maior = "Nota(s) acima da m�dia:", menor = " Nota(s) abaixo da m�dia";
		
		for(i=0;i<quantidade;i++);
		{
			if(vetor1[i]>media)
			{
				maior = maior + vetor1[i] + "  ";
			}
			else //if(vetor1[i]==media)
			{
				menor = menor + vetor1[i] + "  ";
			}
		}
		System.out.println(maior);
		System.out.println(menor);
	}

}
