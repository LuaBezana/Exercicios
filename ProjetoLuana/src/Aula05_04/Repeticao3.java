package Aula05_04;

import java.util.Scanner;

public class Repeticao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		idade for =-99. (WHILE)*/
		
		int idade, contador21=0, contador50=0;
				
		Scanner ler = new Scanner (System.in);
		
		System.out.println("\nDigite a idade: ");
		idade = ler.nextInt();
		
		while(idade!=-99)
		{
			if(idade<21)
			{
				contador21++;
			}
			if(idade>50)
			{
				contador50++;
			}
			
			System.out.println("\nDigite a idade: ");
			idade = ler.nextInt();
		}
		
		System.out.println("\nTotal de pessoas com menos de 21 anos: "+contador21);
		System.out.println("\nTotal de pessoas com mais de 50 anos: "+contador50);
	}

}
