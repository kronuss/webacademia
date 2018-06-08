package Avaliação;

public interface INE_Avaliação {

	int registrarAvaliação(int id, float peso, float altura, int idade, float imc);
	
	void removerAvaliação(int id);
}
