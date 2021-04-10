package Aula05_04;

import java.util.Scanner;

public class Repeticao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Informar todos os números de 1000 a 1999 que quando divididos por 11
		obtemos resto = 5. (FOR)*/
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("\nOs números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5 são: ");
		
		for(int x=1000;x<=1999;x++)
		{
			if(x%11==5)
			{
				System.out.println(x);
			}		
		}
	}

}
