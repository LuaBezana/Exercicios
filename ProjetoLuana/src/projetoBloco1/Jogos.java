package projetoBloco1;

import java.util.ArrayList;
import java.util.List;

public class Jogos extends Listas{
	
	public Jogos() {}
	
	@Override
	public void listaGeneros() {
		System.out.println("");
		}

	@Override
	public List<String> lista1()
	{
		List<String> listaAcao = new ArrayList<String>();
		listaAcao.add("Cobra kai");
		listaAcao.add("Vikings");
		listaAcao.add("The Umbrella Academy � HQ");
		listaAcao.add("The Boys");
		return listaAcao;
	}
	
	@Override
	public List<String> lista2()
	{
		List<String> listaTerror = new ArrayList<String>();
		listaTerror.add("The Purge");
		listaTerror.add("Hist�ria de Horror Americana (American Horror Story) ");
		listaTerror.add("A Maldi��o da Resid�ncia Hill");
		listaTerror.add("Mindhunter");
		return listaTerror;
	}
	
	@Override
	public List<String> lista3()
	{
		List<String> listaRomance = new ArrayList<String>();
		listaRomance.add("Modern Family � Familiar");
		listaRomance.add("Modern Love");
		listaRomance.add("Doces Magn�lias");
		return listaRomance;
	}
	
	@Override
	public List<String> lista4()
	{
		List<String> listaFiccaoFantasia = new ArrayList<String>();
		listaFiccaoFantasia.add("Black Mirror");
		listaFiccaoFantasia.add("Dark");	
		listaFiccaoFantasia.add("Carnival Row");
		listaFiccaoFantasia.add("Stranger Things");
		listaFiccaoFantasia.add("Carnival Row");
		listaFiccaoFantasia.add("Orphan Black");
		return listaFiccaoFantasia;
	}
	
	@Override
	public List<String> lista5()
	{
		List<String> listaDrama = new ArrayList<String>();
		listaDrama.add("Anne With an \"E\"");
		listaDrama.add("The Crown");
		listaDrama.add("Olhos que Condenam");
		listaDrama.add("This is Us");
		return listaDrama;
	}
	
	@Override
	public List<String> lista6()
	{
		List<String> listaAnimacao = new ArrayList<String>();
		listaAnimacao.add("BoJack Horseman");
		listaAnimacao.add("Rick e Morty");
		listaAnimacao.add("Sem Maturidade para Isso");
		listaAnimacao.add("The Midnight Gospel");
		return listaAnimacao;
	}

}
