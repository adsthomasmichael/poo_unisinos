package aula005_testeGA.Ex01_Viagem;

public class Aeroporto {
	/* 	Crie uma classe Aeroporto. Um aeroporto possui um nome e um atributo que armazena o
		valor total arrecadado na compra de viagens (inicialize, no(s) construtor(es) este valor em zero). Crie os
		métodos de acesso e os construtores que desejar.*/

	private String nome;
	private double vlrTotalArrecadado;
	
	public Aeroporto( String nome) {
		this.nome = nome;
		this.vlrTotalArrecadado = 0;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome( String nome) {
		this.nome = nome;
	}
	
	public double getVlrTotalArrecadado() {
		return vlrTotalArrecadado;
	}
	public void setVlrTotalArrecadado( double vlrTotalArrecadado) {
		this.vlrTotalArrecadado = vlrTotalArrecadado;
	}
	
	/* 	Na classe Aeroporto, crie um método chamado compraPassagem, que recebe um objeto do
		tipo Passageiro e um objeto do tipo Viagem por parâmetro, simulando que o passageiro vai comprar
		uma passagem para aquela viagem. O método retorna um objeto do tipo Passagem, de acordo com o que
		segue: */
	
	public Passagem compraPassagem( Passageiro passageiro, Viagem viagem) {
		double acumulaValor = 0;
		
		// passageiros de até 5 anos não pagam a viagem, logo, a passagem é de graça;
		if( passageiro.getIdade() <= 5 ) {
			viagem.setPreco(0) ;
		}
		// passageiros entre 6 (inclusive) e 12 anos (inclusive) pagam metade do valor da viagem;
		else if( passageiro.getIdade() > 5 && passageiro.getIdade() < 13) {
			acumulaValor = viagem.getPreco() / 2;
		}
		//passageiros acima de 59 anos (inclusive) pagam apenas um terço do valor da viagem;
		else if( passageiro.getIdade() > 59) {
			acumulaValor = viagem.getPreco() * 0.33;
		}
		/*demais passageiros pagam o valor integral da viagem, exceto quando a viagem for para o sul do país (Rio Grande do Sul, Santa Catarina e Paraná), pois o valor da passagem é 85% do valor da viagem. */
		else if( viagem.getEstadoDestino().equals("Rio Grande do Sul") || 
				viagem.getEstadoDestino().equals("Santa Catarina") ||
				viagem.getEstadoDestino().equals("Paraná")) {
			acumulaValor = viagem.getPreco() * 0.85;
		}
		else {
			acumulaValor = viagem.getPreco();
		}
	

		
		return passagem;
	}
	
}
