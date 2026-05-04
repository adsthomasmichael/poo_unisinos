package aula010;

public class Melancia extends Fruta{
	
	/* 	crie uma classe Melancia, que herda Fruta e possui um preço adicional e um
		atributo booleano que indica se é ou não época deste tipo de fruta. Crie os
		métodos de acesso para os atributos. Crie também um método chamado
		calculaPrecoFinal, que retorna o valor final da melancia: se for época da
		fruta, retorna o preço normal, caso contrário, retorna o valor com o imposto
		acrescentado. */

	protected double precoAdicional;
	protected boolean ehEpoca;

	public Melancia(String nome, String cor, double peso, double preco, double precoAdicional, boolean ehEpoca) {
		super(nome, cor, peso, preco);
		this.precoAdicional = precoAdicional;
		this.ehEpoca = ehEpoca;
		
	}

	public double getPrecoAdicional() {
		return precoAdicional;
	}

	public void setPrecoAdicional(double precoAdicional) {
		this.precoAdicional = precoAdicional;
	}

	public boolean isEhEpoca() {
		return ehEpoca;
	}

	public void setEhEpoca(boolean ehEpoca) {
		this.ehEpoca = ehEpoca;
	}
	
	public double calculaPrecoFinal() {
		double valorFinal = 0;
		if( isEhEpoca() == true) {
			valorFinal = getPreco();
			return valorFinal;
		}
		else {
			return getPreco() + precoAdicional;
		}
	}
	
	
	
	
}
