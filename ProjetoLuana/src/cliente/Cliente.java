package cliente;

public class Cliente {
	private String nome;
	private String nascimento;
	private String genero;
	private String preferencia_musical;
	private String filme_preferido;
	private int escolher_filme=0;
	
	public Cliente(String nome,String nascimento, String genero, String preferencia_musical, String filme_preferido)
	{
		this.nome = nome;
		this.nascimento = nascimento;
		this.genero = genero;
		this.preferencia_musical = preferencia_musical;
		this.filme_preferido = filme_preferido;
	}
	
	public void filmeEscolhido()
	{
		this.escolher_filme++;
	}
	
	public void removerFilme()
	{
		if(escolher_filme>0)
		{
			this.escolher_filme--;
		}
	}
	
	public void printInfo()
	{
		System.out.println("**Informações do Cliente**\nNome: "+nome+"\nData de nascimento: "+nascimento+
				"\nGênero: "+genero+"\nPreferência musical: "+preferencia_musical+
				"\nFilme preferido: "+filme_preferido+"\nTotal de filmes adicionados "+escolher_filme);
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return nascimento;
	}

	public void setCpf(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPreferencia_musical() {
		return preferencia_musical;
	}

	public void setEmail(String preferencia_musical) {
		this.preferencia_musical = preferencia_musical;
	}

	public String getFilme_preferido() {
		return filme_preferido;
	}

	public void setFilme_preferido(String filme_preferido) {
		this.filme_preferido = filme_preferido;
	}

	public int getEscolher_filme() {
		return escolher_filme;
	}

	public void setFilmes_escolhidos(int filmes_escolhidos) {
		this.escolher_filme = escolher_filme;
	}
}
