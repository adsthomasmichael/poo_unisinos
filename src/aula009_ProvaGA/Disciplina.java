package aula009_ProvaGA;

public class Disciplina {
	
	/* 	Crie uma classe chamada Disciplina. Uma disciplina possui um código, um quantidade
		máxima de vagas e uma quantidade de vagas preenchidas (sempre inicializada com zero no construtor).
		Crie os construtores que desejar, os métodos de acesso e um método que imprime as informações da
		disciplina. */

	private String codigo;
	private int qtdMaximaVagas;
	private int qtdVagasPreenchidas;
	
	public Disciplina(String codigo, int qtdMaximaVagas) {
		
		setCodigo(codigo);
		this.qtdMaximaVagas = qtdMaximaVagas;
		this.qtdVagasPreenchidas = 0;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		if( codigo != null && codigo.trim().isEmpty()) {
			this.codigo = codigo;
		}
	}

	public int getQtdMaximaVagas() {
		return qtdMaximaVagas;
	}

	public void setQtdMaximaVagas(int qtdMaximaVagas) {
		this.qtdMaximaVagas = qtdMaximaVagas;
	}

	public int getQtdVagasPreenchidas() {
		return qtdVagasPreenchidas;
	}

	public void setQtdVagasPreenchidas(int qtdVagasPreenchidas) {
		this.qtdVagasPreenchidas = qtdVagasPreenchidas;
	}
	
	public void exibirInformacoes() {
		System.out.println("=== DISCIPLINA ===\n");
		System.out.println("Codigo             : "+ getCodigo());
		System.out.println("Qtd maxima de vagas: "+ getQtdMaximaVagas());
		System.out.println("Vagas preenchidas  :"+ getQtdVagasPreenchidas());
	}
	
	
	
}
