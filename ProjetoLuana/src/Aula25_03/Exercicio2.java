package Aula25_03;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num1, num2, res;
		char op;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Menu de opções \n+ --> Soma\n- --> Diferença\n* --> Multiplicação\n/ --> Divisão");
		op = ler.nextLine().charAt(0);
		
		System.out.println("\nEntre com o primeiro número: ");
		num1 = ler.nextFloat();
		System.out.println("\nEntre com o segundo número: ");
		num2 = ler.nextFloat();
		
		switch(op)
		{
		case '+':
			res = num1+num2;
			break;
		case '-':
			res = num1-num2;
			break;
		case '*':
			res = num1*num2;
			break;
		case '/':
			res = num1/num2;
			break;
			default:
				res=0;
				System.out.println("\nOpção inválida... Você digitou este caracter: "+op);
		}
		System.out.println("Resultado: "+res);
	}

}
