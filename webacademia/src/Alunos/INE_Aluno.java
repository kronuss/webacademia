package Alunos;

public interface INE_Aluno {

	int registrarAluno(String nome, String sobreNome, String login, String senha, String endere�o);
	
	void removerAluno(int id, String senha);
	
	Aluno login(int id, String senha);
}
