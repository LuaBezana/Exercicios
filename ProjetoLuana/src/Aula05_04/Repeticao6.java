package Aula05_04;

import java.util.Scanner;

public class Repeticao6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
		final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
		0(zero).(DO...WHILE)*/
		
		int numero, somamult3=0, contmult3=0;
		float mediamult3;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("\nDigite um n�mero: ");
		numero = ler.nextInt();
		
		do
		{
			if(numero%3==0)
			{
				somamult3 = somamult3 + numero;
				contmult3++;
			}
			System.out.println("\nDigite um n�mero: ");
			numero = ler.nextInt();
			
		} while(numero!=0);
		
		mediamult3 = somamult3 / contmult3;
		System.out.println("\nA m�dia dos n�meros m�ltiplos de 3 � de: "+mediamult3);
		
	}

}
