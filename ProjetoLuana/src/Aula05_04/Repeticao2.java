package Aula05_04;

import java.util.Scanner;

public class Repeticao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		int numero, numeroPar=0, numeroImpar=0;
		
		Scanner ler = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) { 
			System.out.println("\nDigite um n�mero: ");
			numero = ler.nextInt();
			if(numero%2==0)
			{
				numeroPar++;
			}
			else
			{
				numeroImpar++;
			}
		}
		System.out.println("\nOs n�meros pares digitados foram: "+numeroPar);
		System.out.println("\nOs n�meros �mpares digitados foram: "+numeroImpar);
	}

}
