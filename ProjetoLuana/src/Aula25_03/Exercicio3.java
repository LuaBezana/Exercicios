package Aula25_03;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2, n3;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero: ");
		n1 = ler.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		n2 = ler.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		n3 = ler.nextInt();
		
		if (n1>n2) 
		{
			if (n1>n3)
				System.out.println(n1 + " � o maior n�mero.");
			else 
				System.out.println(n3 + " � o maior n�mero");
		}
		else
		{
			if (n2>n3)
				System.out.println(n2 + " � o maior n�mero.");
			else 
				System.out.println(n3 + " � o maior n�mero");
		}
	}

}
