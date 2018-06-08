package Funcionários;

public interface IAD_Funcionários {

int registrarFuncionários(Funcionários n);
	
	void removerFuncionnários(int id);
	
	void atualizarFuncionários(Funcionários n);
	
	Funcionários selecionarFuncionários(int id);
}

