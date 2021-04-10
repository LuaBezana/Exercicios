package Aula25_03;

import java.util.Scanner;

//Faça um programa que entre com três números e coloque em ordem crescente.

public class Exercicio5decisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o valor A: ");
		a = ler.nextInt();
		System.out.print("Digite o valor B: ");
		b = ler.nextInt();
		System.out.print("Digite o valor C: ");
		c = ler.nextInt();
		System.out.println();
		
		if (a<b && a<c) 
		{
			if (b<c) {
				System.out.println("Ordem crescente: A B C");
				System.out.println("                 " + a + " " + b + " " + c);
			}
			else { 
				System.out.println("Ordem crescente: A C B");
				System.out.println("                 " + a + " " + c + " " + b);
			}
		}
		else
		{
			if (b<a && b<c) 
			{
				if (a<c) {
					System.out.println("Ordem crescente: B A C");
					System.out.println("                 " + b + " " + a + " " + c);
				}
				else { 
					System.out.println("Ordem crescente: B C A");
					System.out.println("                 " + b + " " + c + " " + a);
				}
			}
			else
				if (c<a && c<b) 
				{
					if (a<b) {
						System.out.println("Ordem crescente: C A B");
						System.out.println("                 " + c + " " + a + " " + b);
					}
					else {
						System.out.println("Ordem crescente: C B A");
						System.out.println("                 " + c + " " + b + " " + a);
					}
				}
				
		}
	}

}
