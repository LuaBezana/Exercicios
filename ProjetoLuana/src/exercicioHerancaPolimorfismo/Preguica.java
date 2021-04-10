package exercicioHerancaPolimorfismo;

public class Preguica extends Animal{
	
	public Preguica() {
		super("Preguiça.");
	}

	@Override
	public void emitirSom() {
		System.out.println("***Aaaaaah que preguicinha...***");
	}
	
	@Override
	public void movimentacao() {
		System.out.println("O " + this.getNome() + " subiu na árvore!");
	}
	
	@Override
	public void mostrar() {
		System.out.println("\n\nEste é o "
				+ this.getNome()
				+ "! Ele tem "
				+ this.getIdade()
				+ " anos.\n"
				+ "=====(((=))=====(=)))===========\r\n"
				+ "      \" `,      |' /\r\n"
				+ "      /\"/        |\"\"\r\n"
				+ "     \"\"\"|        \\\"|\r\n"
				+ "     |\"||        \" \"\r\n"
				+ "     \"\" \"        |\"|\\\r\n"
				+ "    /\"\"~\\\\.      /\" \"\"~,\r\n"
				+ "   \"\"~\"\"\"\"`\"\",~`~\"!!\"!\" \\\r\n"
				+ "   /\"\"\"\"\"/\"\"! \"~\"\"\" \"\" \"~\",\r\n"
				+ "  //\\\"\"!!\"\"~\"!\"!\"\\\"\"\"/~!~, C~\"~P\r\n"
				+ " // !!\"\"\"\"\"! \"~ \" !!\"!! \",\" O o\"~\r\n"
				+ " ||   !!\"!!~!!~||\"  !     \"\" Y \"\"\r\n"
				+ " \\\\     !  !  !            `\"U\"'\r\n"
				+ "  \\\\\r\n"
				+ "   \\\\  0))\r\n"
				+ "    \\`-~/~\r\n"
				+ "     `~'\n");
	}
}
