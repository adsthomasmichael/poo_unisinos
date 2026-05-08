package aula011;

public class Nadador extends Atleta{
	/* 	Crie a classe Nadador, que é um tipo de Atleta. Um Nadador tem uma categoria.
		Crie o construtor com os parâmetros necessários para inicializar todos os atributos,
		e crie os métodos de acesso necessários. Além disto, sobrescreva o método
		imprimeInfo, para imprimr a categoria do Nadador juntamente com seus demais
		atributos.*/
	
	protected String categoria;

	public Nadador() {
		super();
		
	}

	public Nadador(String nome, int idade, String categoria) {
		super(nome, idade);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	@Override
	public void imprimeInfo() {
		System.out.println("=== NADADOR ===");
		System.out.println("Categoria: "+ getCategoria());
		super.imprimeInfo();
	}
	
	

}
