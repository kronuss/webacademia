package Funcion�rios;

public interface INE_Funcion�rios {

int registrarFuncion�rios(String nome, String sobreNome, String login, String senha, String endere�o);
	
	void removerFuncion�rios(int id, String senha);
	
	Funcion�rios login(int id, String senha);
}


