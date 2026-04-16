package aula007;

public class Veiculo {
	
	private String modelo;
	private String placa;
	private double precoDiaria;
	private boolean disponibilidade;

	public Veiculo(String modelo, String placa, double precoDiaria) {
		this.modelo = modelo;
		this.placa = placa;
		this.precoDiaria = precoDiaria;
		this.disponibilidade = true;
		
	
		
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public double getPrecoDiaria() {
		return precoDiaria;
	}

	public void setPrecoDiaria(double precoDiaria) {
		this.precoDiaria = precoDiaria;
	}

	public boolean isDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	
	public void exibirInformacoes() {
		System.out.println("Dados do veículo: \n");
		System.out.println("Modelo: "+ getModelo());
		System.out.println("Placa: "+ getPlaca()+"\n");
		System.out.printf("Preço diário: %.2f\n", getPrecoDiaria());
		System.out.println("Disponível: "+ isDisponibilidade());
	}
	
}
