package Aula25_03;

import java.util.Scanner;

public class ExercicioLacos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1, n2, n3, media;
		
		Scanner venha = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota: ");
		n1 = venha.nextFloat();
		System.out.println("Entre com a segunda nota: ");
		n2 = venha.nextFloat();
		System.out.println("Entre com a terceira nota: ");
		n3 = venha.nextFloat();
		
		media = (n1+n2+n3)/3;
		
		System.out.println("\nMédia aritmética: "+media);
		
		if(media>=7 && media<=10)
		{
			System.out.println("\nParabéns, você foi aprovade!");
		}
		else if(media>=4 && media<7)
		{
			System.out.println("\nAlune de exame.");
		}
		else if(media>=0 && media<4)
		{
			System.out.println("\nAlune reprovade.");
		}
		else
		{
			System.out.println("\nMédia fora do intervalo.");
		}
		System.out.printf("Com as notas: %2.1f, %2.1f e %2.1f eu vou obter a média: %2.1f", n1, n2, n3, media);
	}

}
