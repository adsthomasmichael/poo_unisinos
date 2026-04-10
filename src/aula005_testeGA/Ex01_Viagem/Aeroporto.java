package aula005_testeGA.Ex01_Viagem;

public class Aeroporto {
	/* 	Crie uma classe Aeroporto. Um aeroporto possui um nome e um atributo que armazena o
		valor total arrecadado na compra de viagens (inicialize, no(s) construtor(es) este valor em zero). Crie os
		métodos de acesso e os construtores que desejar.*/

	private String nome;
	private double valorTotalArrecadado;
	
	public Aeroporto( String nome) {
		this.nome = nome;
		this.valorTotalArrecadado = 0;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome( String nome) {
		this.nome = nome;
	}
	
	public double getValorTotalArrecadado() {
		return valorTotalArrecadado;
	}
	public void setValorTotalArrecadado( double valorTotalArrecadado) {
		this.valorTotalArrecadado = valorTotalArrecadado;
	}
	
	/* 	Na classe Aeroporto, crie um método chamado compraPassagem, que recebe um objeto do
		tipo Passageiro e um objeto do tipo Viagem por parâmetro, simulando que o passageiro vai comprar
		uma passagem para aquela viagem. O método retorna um objeto do tipo Passagem, de acordo com o que
		segue: */
	
	public Passagem compraPassagem(Passageiro passageiro, Viagem viagem) {

	    // 1. Verifica se há vagas
	    if (viagem.getLugaresVendidos() >= viagem.getQtdMaxLugares()) {
	        return null;
	    }

	    double valorFinal;
	    int idade = passageiro.getIdade();

	    // 2. Regras por idade
	    if (idade <= 5) {
	        valorFinal = 0;

	    } else if (idade <= 12) {
	        valorFinal = viagem.getPreco() / 2;

	    } else if (idade >= 60) {
	        valorFinal = viagem.getPreco() / 3;

	    } else {
	        // valor integral
	        valorFinal = viagem.getPreco();

	        // 3. Regra do sul (aplica só aqui)
	        String estado = viagem.getEstadoDestino();

	        if (estado.equals("Rio Grande do Sul") ||
	            estado.equals("Santa Catarina") ||
	            estado.equals("Paraná")) {

	            valorFinal = viagem.getPreco() * 0.85;
	        }
	    }

	    // 4. Atualiza lugares vendidos
	    viagem.setLugaresVendidos(viagem.getLugaresVendidos() + 1);

	    // 5. Atualiza valor arrecadado no aeroporto
	    this.valorTotalArrecadado += valorFinal;

	    // 6. Cria e retorna a passagem
	    
	    Passagem passagem = new Passagem(viagem, passageiro, valorFinal);
	    return passagem;
	    //return new Passagem(viagem, passageiro, valorFinal);
	    
	}
	
}
