package Funcionários;

public interface INE_Funcionários {

int registrarFuncionários(String nome, String sobreNome, String login, String senha, String endereço);
	
	void removerFuncionários(int id, String senha);
	
	Funcionários login(int id, String senha);
}


