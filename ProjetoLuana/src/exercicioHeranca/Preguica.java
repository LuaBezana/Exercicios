package exercicioHeranca;

public class Preguica extends Animal{

	public void emitirSom() {
		System.out.println("***Aaaaaah que preguicinha...***\n");
	}
	
	public void movimentacao() {
		System.out.println("O/A " + this.getNome() + " sobe em árvores!");
	}
	
	public void mostrar() {
		System.out.println("Oi, sou a/o "
				+ this.getNome()
				+ " e tenho "
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
