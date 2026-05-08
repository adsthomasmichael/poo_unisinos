package aula011;

public class Corredor extends Atleta{

	/* 	Crie a classe Corredor, que é um tipo de Atleta. Um Corredor tem um peso e
		uma competição que ele participa (objeto do tipo Competicao). Crie o construtor
		com os parâmetros necessários para inicializar todos os atributos, e crie os métodos
		de acesso necessários. Crie o método imprimeCompeticao, que imprime as
		informações da competição que o Corredor está participando. Além disto,
		sobrescreva o método imprimeInfo, para imprimir o peso do Corredor juntamente
		com os demais atributos. O método imprimeInfo também imprime as informações
		da competição deste corredor. */

	protected double peso;
	protected Competicao competicao;
	
	public Corredor() {
		super();
	}
	
	public Corredor(String nome, int idade, double peso, Competicao competicao) {
		super(nome, idade);
		this.peso = peso;
		this.competicao = competicao;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Competicao getCompeticao() {
		return competicao;
	}

	public void setCompeticao(Competicao competicao) {
		this.competicao = competicao;
	}
	
	public void imprimeCompeticao() {
		competicao.imprimeData();
	}
	
	@Override
	public void imprimeInfo() {
		System.out.println("=== CORREDOR ===");
		System.out.println("Peso: "+ getPeso());
		super.imprimeInfo();
		imprimeCompeticao();
	}
	
}
