package aula007;

public class Locadora {
	
	/* 	Uma locadora possui um nome e um atributo que armazena o valor total
		arrecadado com locações (inicializado em zero no(s) construtor(es)).
		Crie os métodos de acesso e os construtores que desejar. */
	
	private String nome;
	private double vlrTotalArrecadado;
	
	public Locadora(String nome) {
		super();
		this.nome = nome;
		this.vlrTotalArrecadado = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getVlrTotalArrecadado() {
		return vlrTotalArrecadado;
	}

	public void setVlrTotalArrecadado(double vlrTotalArrecadado) {
		this.vlrTotalArrecadado = vlrTotalArrecadado;
	}
	
	/* O método recebe um objeto do tipo Cliente e um objeto do tipo Veiculo por parâmetro, simulando que o cliente vai alugar aquele veículo. 
	 * O método retorna	um objeto do tipo Contrato, de acordo com as seguintes regras: */
	public Contrato alugarVeiculo(Cliente cliente, Veiculo veiculo) {
	
	double vlrdiaria = 0;
	
		if (cliente.getIdade() < 21) { //clientes com menos de 21 anos pagam 30% a mais no valor da diária (motoristas jovens); 
			vlrdiaria = veiculo.getPrecoDiaria() + veiculo.getPrecoDiaria() *0.30;
			veiculo.setPrecoDiaria(vlrdiaria);
		}
		else if( cliente.getIdade() > 64 ) { //clientes com 65 anos ou mais pagam apenas 70% do valor da diária (desconto para terceira idade); 
			vlrdiaria = veiculo.getPrecoDiaria() - veiculo.getPrecoDiaria()* 0.30;
			veiculo.setPrecoDiaria(vlrdiaria);
		}
		else if( cliente.isExperiente()) { //clientes com CNH há mais de 10 anos (representado por um booleano cnh_experiente) recebem 15% de desconto; 
			vlrdiaria = veiculo.getPrecoDiaria() - veiculo.getPrecoDiaria()* 0.15;
			veiculo.setPrecoDiaria(vlrdiaria);
		}
		else{ /*demais clientes pagam o valor integral da diária, exceto quando o veículo for um SUV ou pickup (categorias premium), cujo valor é acrescido de 10%.*/
			if(veiculo.getModelo().contains("SUV") || veiculo.getModelo().contains("Pickup")) {
				vlrdiaria = veiculo.getPrecoDiaria() + veiculo.getPrecoDiaria()*0.10;
				veiculo.setPrecoDiaria(vlrdiaria);
			}
			vlrdiaria = veiculo.getPrecoDiaria();
						
		}
	Contrato contrato = new Contrato(veiculo, cliente, 1, vlrdiaria);
	return contrato;		
	} 
	
	public Contrato alugarVeiculo(Cliente c, Veiculo v, int qtdDias) {
		/* 	Sobrecarga: crie uma segunda versão do método alugarVeiculo(Cliente c,
		Veiculo v, int qtdDias) que, além de aplicar todas as regras acima, já
		registra diretamente a quantidade de dias da locação no contrato gerado. A versão
		sem qtdDias deve assumir 1 dia como padrão.
		
		Só é possível alugar o veículo se disponivel == true. Caso contrário, retorne
		null. Ao realizar a locação, marque o veículo como disponivel = false e
		atualize o total arrecadado da locadora. */
		
		
		if( v.isIndDisponibilidade()) {
			
			double vlrdiaria = 0;
			
			if (c.getIdade() < 21) { //clientes com menos de 21 anos pagam 30% a mais no valor da diária (motoristas jovens); 
				vlrdiaria = v.getPrecoDiaria() + v.getPrecoDiaria() *0.30;
				v.setPrecoDiaria(vlrdiaria);
			}
			else if( c.getIdade() > 64 ) { //clientes com 65 anos ou mais pagam apenas 70% do valor da diária (desconto para terceira idade); 
				vlrdiaria = v.getPrecoDiaria() - v.getPrecoDiaria()* 0.30;
				v.setPrecoDiaria(vlrdiaria);
			}
			else if( c.isExperiente()) { //clientes com CNH há mais de 10 anos (representado por um booleano cnh_experiente) recebem 15% de desconto; 
				vlrdiaria = v.getPrecoDiaria() - v.getPrecoDiaria()* 0.15;
				v.setPrecoDiaria(vlrdiaria);
			}
			else{ /*demais clientes pagam o valor integral da diária, exceto quando o veículo for um SUV ou pickup (categorias premium), cujo valor é acrescido de 10%.*/
				if(v.getModelo().contains("SUV") || v.getModelo().contains("Pickup")) {
					vlrdiaria = v.getPrecoDiaria() + v.getPrecoDiaria()*0.10;
					v.setPrecoDiaria(vlrdiaria);
				}
				vlrdiaria = v.getPrecoDiaria();
							
			}
			v.setIndDisponibilidade(false);
			setVlrTotalArrecadado(vlrdiaria);
			
			Contrato contrato = new Contrato(v, c, qtdDias, vlrdiaria);
			return contrato; 
		}
		else {
			return null;
		}
		
		
		
		
	}
	

}
