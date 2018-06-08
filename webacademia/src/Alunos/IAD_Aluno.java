package Alunos;

public interface IAD_Aluno {

	int registrarAluno(Aluno n);
	
	void removerAluno(int id);
	
	void atualizarAluno(Aluno n);
	
	Aluno selecionarAluno(int id);
}
