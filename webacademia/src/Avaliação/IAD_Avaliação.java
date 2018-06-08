package Avaliação;

public interface IAD_Avaliação {

	int registrarAvaliação(Avaliação n);
	
	void removerAvaliação(int id);
	
	void aatualizarAvaliação(Avaliação n);
	
	Avaliação selecionarAvaliação(int id);
}
