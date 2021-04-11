package projetoCinema;

public abstract class Snacks {

	private String tamanho;
	private String valor;
	private String tipo; //amarga-doce, gás-sem gás, coca-soda-guaraná, amargo-ao leite
	
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
