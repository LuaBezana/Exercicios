package Aula25_03;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2, n3;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		n1 = ler.nextInt();
		System.out.println("Digite o segundo número: ");
		n2 = ler.nextInt();
		System.out.println("Digite o terceiro número: ");
		n3 = ler.nextInt();
		
		if (n1>n2) 
		{
			if (n1>n3)
				System.out.println(n1 + " é o maior número.");
			else 
				System.out.println(n3 + " é o maior número");
		}
		else
		{
			if (n2>n3)
				System.out.println(n2 + " é o maior número.");
			else 
				System.out.println(n3 + " é o maior número");
		}
	}

}
