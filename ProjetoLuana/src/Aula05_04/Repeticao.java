package Aula05_04;

import java.util.Scanner;

public class Repeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1, n2, n3, media, mediaGeral, somaMedia=0;
		int n=1, num, somaN=0, somaPar=0;
		
		Scanner ler = new Scanner(System.in);
		
		for(int x=1;x<=3;x++)
		{
			System.out.println("\nOl�! Digite a primeira nota: ");
			n1 = ler.nextFloat();
			System.out.println("Ol�! Digite a segunda nota: ");
			n2 = ler.nextFloat();
			System.out.println("Ol�! Digite a terceira nota: ");
			n3 = ler.nextFloat();
			
			media = (n1+n2+n3)/3;
			System.out.printf("\nM�dia do alune: %2.1f",media);
			somaMedia = somaMedia + media;
		}
		
		mediaGeral = somaMedia / 3;
		System.out.printf("\nM�dia geral da turma: %2.1f", mediaGeral);
		
		System.out.println("\nDigite a quantidade de repeti��es: ");
		num = ler.nextInt();
		
		while(n<=num)
		{
			somaN = somaN + n;
			n++;
		}
		System.out.println("\nSomat�rio de n�meros: "+ somaN);
		
		do
		{
			System.out.println("\nDigite um n�mero: ");
			num = ler.nextInt();
			if(num%2==0)
			{
				somaPar = somaPar + num;
			}
			
		}
		while(num>=0);
	}

}
