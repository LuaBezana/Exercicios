package Aula25_03;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a idade e descubra em qual categoria se encontra: ");
		idade = ler.nextInt();
		
		if(idade>=10 && idade<=14)
		{
			System.out.println("Essa idade se encaixa na categoria infantil.");
		}
		else 
		{ 
			if(idade>=15 && idade<=17)
				System.out.println("Essa idade se encaixa na categoria juvenil.");
			else 
				if(idade>=18 && idade<=25)
					System.out.println("Essa idade se encaixa na categoria adulto.");
				else
					System.out.println("Essa idade não se encaixa em nenhuma categoria.");
		}
	}
}
