package Aula06_04;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = new int[6];
		int somaPar=0, contImpar=0;
		
		Scanner ler = new Scanner(System.in);
		
		for (int i=0;i<6;i++)
		{
			System.out.println("\nDigite um n�mero: ");
			numeros[i] = ler.nextInt();
			
			if(numeros[i]%2==0)
			{
				somaPar = somaPar + numeros[i];
			}
			else
			{
				contImpar++;
			}
		}
		for (int i=0;i<6;i++)
		{
			if(numeros[i]%2==0)
			{
				System.out.println("\nO n�mero "+numeros[i]+" � par");
			}
			else
			{
				System.out.println("\nO n�mero "+numeros[i]+" � �mpar");
			}
		}
		System.out.println("\nSoma dos n�meros pares: "+somaPar);
		System.out.println("\nQuantidade de n�meros �mpares: "+contImpar);
	}
}
