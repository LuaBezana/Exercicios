package aula07_04OrientacaoObj;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ANOTAÇÃO PESSOAL:		Automovel carroNovo = new Automovel();
		
		Automovel auto1 = new Automovel("Thiago Silva","Escort Hobby Azul","ABC1234",1995);
		//troca de mensagens (chamada ao método imprimirInfo()
		
		auto1.imprimirInfo();
		
		System.out.println("\n***Transferência de Proprietário***");
		auto1.setNomeProprietario("Rodrigo Teixeira");
		
		auto1.imprimirInfo();
		
		Automovel auto2 = new Automovel("Fiuza","Fusca","AMOR",2021);
		
		auto2.imprimirInfo();
		
		auto2.setPlaca("DESGRAÇA");
		
		auto2.imprimirInfo(); 
		
		System.out.println();
		//ANOTAÇÃO PESSOAL:	System.out.println(auto2.getAno());
	}

}
