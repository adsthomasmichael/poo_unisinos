package aula005_testeGA.Ex01_Viagem;

public class Passagem {
	
	/* Crie uma classe Passagem. Esta classe representa uma passagem para uma determinada
		viagem. Uma passagem possui um objeto do tipo Viagem, um objeto do tipo Passageiro e um valor
		efetivo pago pela viagem (valor da passagem). Crie os métodos de acesso, construtores desejados e um
		método que imprime as informações da passagem.*/
	
	private Viagem viagem;
	private Passageiro passageiro;
	private double valorPassagem;
	
	public Passagem(Viagem viagem, Passageiro passageiro, double valorPassagem) {
		this.viagem = viagem;
		this.passageiro = passageiro;
		this.valorPassagem = valorPassagem;
	}
	
	public Viagem getViagem() {
		return viagem;
	}
	public void setViagem(Viagem viagem) {
		this.viagem = viagem;
	}
	
	public Passageiro getPassageiro() {
		return passageiro;
	}
	public void setPassageiro( Passageiro passageiro) {
		this.passageiro = passageiro;
	}
	
	public double getValorPassagem() {
		return valorPassagem;
	}
	public void setValorPassagem( double valorPassagem) {
		this.valorPassagem = valorPassagem;
	}

	public void imprimeInfo() {
		System.out.println("Dados da passagem: ");
		getPassageiro().imprimeInfo();;
		getViagem().imprimeInfo();;
		System.out.printf("Valor passagem: %.2f \n",getValorPassagem());
	}
}
