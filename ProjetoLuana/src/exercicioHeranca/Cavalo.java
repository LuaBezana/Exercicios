package exercicioHeranca;

public class Cavalo extends Animal{
	
	public void emitirSom() {
		System.out.println("***Hinn inn inn(relinchando)***\n");
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
