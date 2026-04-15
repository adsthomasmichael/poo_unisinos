package aula007;

public class Veiculo {
	
	private String modelo;
	private int placa;
	private double precoDiaria;
	private boolean indDisponibilidade;

	public Veiculo(String modelo, int placa, double precoDiaria) {
		this.modelo = modelo;
		this.placa = placa;
		this.precoDiaria = precoDiaria;
		this.indDisponibilidade = true;
		
	
		
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPlaca() {
		return placa;
	}

	public void setPlaca(int placa) {
		this.placa = placa;
	}

	public double getPrecoDiaria() {
		return precoDiaria;
	}

	public void setPrecoDiaria(double precoDiaria) {
		this.precoDiaria = precoDiaria;
	}

	public boolean isIndDisponibilidade() {
		return indDisponibilidade;
	}

	public void setIndDisponibilidade(boolean indDisponibilidade) {
		this.indDisponibilidade = indDisponibilidade;
	}
	
	public void exibirInformacoes() {
		System.out.println("Dados do carro: \n");
		System.out.println("Modelo: "+ getModelo());
		System.out.println("Placa: "+ getPlaca()+"\n");
		System.out.println("Preço diaário: %.2f"+ getPrecoDiaria());
		System.out.println("Disponível: "+ isIndDisponibilidade());
	}
	
}
