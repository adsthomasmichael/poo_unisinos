package aula011;

public class Competicao {
	
	/* 	Crie a classe Competicao, que possui um nome e uma data (objeto do tipo Data).
		No construtor, receba os parâmetros necessários para inicializar todos os atributos.
		Crie os métodos de acesso para os atributos. Crie o método imprimeData que
		imprime a data da competição. */
	
	protected String nome;
	protected Data data;
	
	public Competicao() {}
	
	public Competicao(String nome, Data data) {
		
		this.nome = nome;
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}
	
	public void imprimeData() {
		System.out.println("=== COMPETIÇÃO ===");
		System.out.println("Nome: "+ getNome());
		data.imprimeData();
	}
	
	

}
