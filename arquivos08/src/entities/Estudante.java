package entities;

public class Estudante {
	
	private String nome;
	private int idade;
	private int numIdentidade;
	
	public Estudante(String nome, int idade, int numIdentidade) {
		this.nome = nome;
		this.idade = idade;
		this.numIdentidade = numIdentidade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getNumIdentidade() {
		return numIdentidade;
	}
	
	public void setNumIdentidade(int numIdentidade) {
		this.numIdentidade = numIdentidade;
	}
}
