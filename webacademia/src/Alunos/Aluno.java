package Alunos;

public class Aluno{
	
	private int id;
	private String nome;
	private String sobreNome;
	private String login;
	private String senha;
	private String endere�o;
	
	public Aluno(int id, String nome, String sobreNome, String login, String senha, String endere�o) {
		
		this.id = id;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.sobreNome = sobreNome;
		this.endere�o = endere�o;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
