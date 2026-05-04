package aula010;

public class Banana extends Fruta {
	
	// crie uma classe chamada Banana, que herda Fruta e possui um tipo. Implemente os métodos de acesso para este atributo (GET e SET).
	protected String tipo;

	public Banana(String nome, String cor, double peso, double preco, String tipo) {
		super(nome, cor, peso, preco);
		this.tipo = tipo;
		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	

}
