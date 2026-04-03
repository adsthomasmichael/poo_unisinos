package aula005_testeGA.Ex01_Viagem;

public class Viagem {
	/* 	Crie uma classe chamada Viagem. Uma viagem possui uma cidade destino, um estado
		destino, um preço, uma quantidade de lugares vendidos e uma quantidade máxima de lugares. Crie os
		construtores que desejar (sempre inicializando a quantidade de lugares vendidos em zero), os métodos de
		acesso e um método que imprime as informações da viagem. */

	private String cidadeDestino;
	private String estadoDestino;
	private double preco;
	private int qtdLugaresVendidos;
	private int qtdMaxLugares;
	
	
	public Viagem( String cidadeDestino, String estadoDestino, double preco, int qtdMaxLugares) {
		this.cidadeDestino = cidadeDestino;
		this.estadoDestino = estadoDestino;
		this.preco = preco;
		this.qtdMaxLugares = qtdMaxLugares;
		this.qtdLugaresVendidos = 0;
	}
	
	public String getCidadeDestino() {
		return cidadeDestino;
	}
	public void setCidadeDestino(String cidadeDestino) {
		this.cidadeDestino = cidadeDestino;
	}
	
	public String getEstadoDestino() {
		return estadoDestino;
	}
	public void setEstadoDestino( String estadoDestino) {
		this.estadoDestino = estadoDestino;
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco( double preco) {
		this.preco = preco;
	}
	
	public int getLugaresVendidos() {
		return qtdLugaresVendidos;
	}
	public void setLugaresVendidos( int qtdLugaresVendidos) {
		this.qtdLugaresVendidos = qtdLugaresVendidos;
	}
	
	public int getQtdMaxLugares() {
		return qtdMaxLugares;
	}
	public void setQtdMaxLugares(int qtdMaxLugares) {
		this.qtdMaxLugares = qtdMaxLugares;
	}

	public void imprimeInfo() {
		System.out.println("Dados da viagem: ");
		System.out.println("Cidade destino: "+ getCidadeDestino());
		System.out.println("Estado destino: "+ getEstadoDestino());
		System.out.println("Preço: "+ getPreco());
		System.out.println("Qtd de lugares vendidos: "+ getLugaresVendidos());
		System.out.println("Qtd máxima de lugares: "+ getQtdMaxLugares());
	}

}
