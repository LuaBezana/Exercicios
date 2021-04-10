package exercicioHerancaPolimorfismo;

public class Cachorro extends Animal{
	
	public Cachorro() {
		super("Cachorro");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("***Au au au!(latindo)***");
	}
	
	@Override
	public void movimentacao() {
		System.out.println("A " + this.getNome() + " saiu correndo!");
	}
	
	@Override
	public void mostrar() {
		System.out.println("\n\nEsta é a "
				+ this.getNome()
				+ "! Ela tem "
				+ this.getIdade()
				+ " anos.\n"
				+ "              _=,_\r\n"
				+ "           o_/6 /#\\\r\n"
				+ "           \\__ |##/\r\n"
				+ "            ='|--\\\r\n"
				+ "              /   #'-.\r\n"
				+ "              \\#|_   _'-. /\r\n"
				+ "               |/ \\_( # |\" \r\n"
				+ "              C/ ,--___/\n");
	}

}
