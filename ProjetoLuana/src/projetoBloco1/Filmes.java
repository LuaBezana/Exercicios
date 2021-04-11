package projetoBloco1;

import java.util.ArrayList;
import java.util.List;

public class Filmes extends Listas {

	public Filmes() {}
	
	@Override
	public void listaGeneros() {
		System.out.println("\nDigite o c�digo do g�nero desejado:"
				+ "\n1- A��o"
				+ "\n2- Terror"
				+ "\n3- Romance"
				+ "\n4- Fic��o e Fantasia"
				+ "\n5- Drama"
				+ "\n6- Anima��o");
	}

	@Override
	public List<String> lista1() {
		List<String> listaAcao = new ArrayList<String>();
		listaAcao.add("C�digo de Conduta");
		listaAcao.add("Polar");
		listaAcao.add("O Alvo");
		return listaAcao;
	}

	@Override
	public List<String> lista2() {
		List<String> listaTerror = new ArrayList<String>();
		listaTerror.add("Evil Dead");
		listaTerror.add("O Iluminado");
		listaTerror.add("Annabelle");
		return listaTerror;
	}

	@Override
	public List<String> lista3() {
		List<String> listaRomance = new ArrayList<String>();
		listaRomance.add("Orgulho e Preconceito");
		listaRomance.add("Titanic");
		listaRomance.add("Um dia");
		return listaRomance;
	}

	@Override
	public List<String> lista4() {
		List<String> listaFiccaoFantasia = new ArrayList<String>();
		listaFiccaoFantasia.add("Senhor dos An�is");
		listaFiccaoFantasia.add("Harry Potter");
		listaFiccaoFantasia.add("Star Wars");
		return listaFiccaoFantasia;
	}

	@Override
	public List<String> lista5() {
		List<String> listaDrama = new ArrayList<String>();
		listaDrama.add("A Espera de um Milagre");
		listaDrama.add("Patch Adams");
		listaDrama.add("O Homem Bicenten�rio");
		return listaDrama;
	}

	@Override
	public List<String> lista6() {
		List<String> listaAnimacao = new ArrayList<String>();
		listaAnimacao.add("Aladdin");
		listaAnimacao.add("Moana");
		listaAnimacao.add("Divertidamente");
		return listaAnimacao;
	}

}
