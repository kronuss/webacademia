package Avalia��o;

public interface IAD_Avalia��o {

	int registrarAvalia��o(Avalia��o n);
	
	void removerAvalia��o(int id);
	
	void aatualizarAvalia��o(Avalia��o n);
	
	Avalia��o selecionarAvalia��o(int id);
}
