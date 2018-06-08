package Alunos;

public class Aluno{
	
	private int id;
	private String nome;
	private String sobreNome;
	private String login;
	private String senha;
	private String endereço;
	
	public Aluno(int id, String nome, String sobreNome, String login, String senha, String endereço) {
		
		this.id = id;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.sobreNome = sobreNome;
		this.endereço = endereço;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
