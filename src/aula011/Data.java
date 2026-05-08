package aula011;

public class Data {
	/* 	Crie a classe Data, que possui um dia, um mês e um ano. Crie um construtor que
		recebe todos os parâmetros para inicializar os atributos e o método imprimeData,
		que imprime a data no formato “DD/MM/AAAA”. Crie os métodos de acesso para os
		atributos. */

	protected int dia;
	protected int mes;
	protected int ano;
	
	
	public Data(int dia, int mes, int ano) {
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}


	public int getDia() {
		return dia;
	}


	public void setDia(int dia) {
		this.dia = dia;
	}


	public int getMes() {
		return mes;
	}


	public void setMes(int mes) {
		this.mes = mes;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void imprimeData() {
		System.out.println("=== DATA ===");
		System.out.printf("%d/%d/%d", getDia(), getMes(), getAno());
	}
	



}
