package exercicioHeranca;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		cachorro.setNome("Tina");
		cachorro.setIdade(3);
		
		cavalo.setNome("James");
		cavalo.setIdade(15);
		
		preguica.setNome("Preguinho");
		preguica.setIdade(7);
		
		cachorro.movimentacao();
		cachorro.emitirSom();
		cachorro.mostrar();
		
		cavalo.movimentacao();
		cavalo.emitirSom();
		cavalo.mostrar();
		
		preguica.movimentacao();
		preguica.emitirSom();
		preguica.mostrar();
	}

}
