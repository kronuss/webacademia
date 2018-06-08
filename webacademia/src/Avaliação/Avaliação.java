package Avaliação;

public class Avaliação {
	
	private int id;
	private float peso;
	private float altura;
	private int idade;
	private float imc;
	
	public Avaliação(int id, float peso, float altura, int idade, float imc) {
		
		this.id = id;
		this.peso = peso;
		this.altura = altura;
		this.idade = idade;
		this.imc = imc;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}