package aula007;

public class Locadora {
	
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
	
	public Contrato alugarVeiculo(Cliente cliente, Veiculo veiculo) {
	
	double vlrdiaria = 0;
	
		if (cliente.getIdade() < 21) { //clientes com menos de 21 anos pagam 30% a mais no valor da diária (motoristas jovens); 
			vlrdiaria = veiculo.getPrecoDiaria() + veiculo.getPrecoDiaria() *0.30;
			veiculo.setPrecoDiaria(vlrdiaria);
		}
		else if( cliente.getIdade() > 64 ) { //clientes com 65 anos ou mais pagam apenas 70% do valor da diária (desconto para terceira idade); 
			vlrdiaria = veiculo.getPrecoDiaria() - veiculo.getPrecoDiaria()* 0.15;
			veiculo.setPrecoDiaria(vlrdiaria);
		}
		else if( cliente.isExperiente()) { //clientes com CNH há mais de 10 anos (representado por um booleano cnh_experiente) recebem 15% de desconto; 
			vlrdiaria = veiculo.getPrecoDiaria() - veiculo.getPrecoDiaria()* 0.15;
			veiculo.setPrecoDiaria(vlrdiaria);
		}
		else if(){ //demais clientes pagam o valor integral da diária, exceto quando o veículo for um SUV ou pickup (categorias premium), cujo valor é acrescido de 10%.
			
			
		}
		
		
		return;
	} 
	

}
