package funcionario;

public class Funcionario {
	private String nome;
	private String cpf;
	private String rg;
	private String genero;
	private String email;
	private String data_nasc;
	private String matricula;
	private String cargo;
	private double salario;
	
	public Funcionario(String nome, String cpf, String rg, String genero, String email, String data_nasc, String matricula, String cargo, double salario)
	{
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.genero = genero;
		this.email = email;
		this.data_nasc = data_nasc;
		this.matricula = matricula;
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public void imprimir()
	{
		System.out.println("Nome: "+nome+"\nCPF: "+cpf+"\nRG: "+rg+"\nGênero: "+genero+"\nE-mail: "+email
				+"\nData de Nascimento: "+data_nasc+"\nMatrícula: "+matricula+"\nCargo: "+cargo+"");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getData_nasc() {
		return data_nasc;
	}

	public void setData_nasc(String data_nasc) {
		this.data_nasc = data_nasc;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
