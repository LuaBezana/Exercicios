package Aula05_04;

import java.util.Scanner;

public class Repeticao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		int numero, numeroPar=0, numeroImpar=0;
		
		Scanner ler = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) { 
			System.out.println("\nDigite um número: ");
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
		System.out.println("\nOs números pares digitados foram: "+numeroPar);
		System.out.println("\nOs números ímpares digitados foram: "+numeroImpar);
	}

}
