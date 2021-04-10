package exercicioHeranca;

public class Cachorro extends Animal{
	
	public void emitirSom() {
		System.out.println("***Au au au!(latindo)***\n");
	}
	
	public void movimentacao() {
		System.out.println("O/A " + this.getNome() + " corre!");
	}
	
	public void mostrar() {
		System.out.println("Oi, sou a/o "
				+ this.getNome()
				+ " e tenho "
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
