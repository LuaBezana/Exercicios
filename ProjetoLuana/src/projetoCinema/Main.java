package projetoCinema;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*CINEMA
		1- Filmes (gênero + tempo de duração + faixa etária + sinopse);
		2- Sala (total de assentos + assentos disponíveis + horário + nome do filme);
		3- Ingresso (meia + inteira)
		4- Snacks (pipoca[p,m,g] + chocolate + refrigerante[coca, soda, guaraná] + água)
		5- Pedido (quantidade de ingressos + snacks + valor total)
		6- Imprimir ingresso
		(filme separar classes de generos onde conterá 5 filmes cada, com tempo duração, faixa etária 
		e sinopse com boolean caso a pessoa queira ler*/
		
		Pipoca pipoca = new Pipoca();
		Chocolate chocolate = new Chocolate();
		Refrigerante refrigerante = new Refrigerante();
		Agua agua = new Agua();
		Genero genero = new Genero();
		Ingressos ingressos = new Ingressos();
	}

}
