package exercicioHerancaPolimorfismo;

public class Cavalo extends Animal{
	
	public Cavalo() {
		super("Cavalo.");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("***Hinn inn inn(relinchando)***");
	}
	
	@Override
	public void movimentacao() {
		System.out.println("O " + this.getNome() + " saiu galopando!");
	}

	@Override
	public void mostrar() {
		System.out.println("\n\nEste é o "
				+ this.getNome()
				+ "! Ele tem "
				+ this.getIdade()
				+ " anos.\n"
				+ "    ||\\\r\n"
				+ "   ('  `.\r\n"
				+ "   / @ ` `.\r\n"
				+ "  //    `| `.\r\n"
				+ " (o .-'.  `| `--.______.-----._\r\n"
				+ "  `'    \\   `|`|               `.<-\\\r\n"
				+ "         \\     `                 ||\\\\\r\n"
				+ "         |                |      ||||\r\n"
				+ "         /\\    |          |     /||||\r\n"
				+ "        /  |   ;-.______.-'\\   / |||`\r\n"
				+ "       / /.|  /             \\  \\\\ \\\\\\`\r\n"
				+ "      (  ' ( ;               `. \\) \\\\`\r\n"
				+ "       \\\\\\ | |              .'.;.)  ``\r\n"
				+ "        \\ \\| |            .'.'/ /\r\n"
				+ "         | |_|           /_| / /\r\n"
				+ "         ' /_|              /_|       \n");
	}
}
