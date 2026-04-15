package aula007;

public class Contrato {
	
	private Veiculo veiculo;
	private Cliente cliente;
	private int diasLocacao;
	private double valorEfetivoPago;
	
	public Contrato(Veiculo veiculo, Cliente cliente, int diasLocacao) {
		super();
		this.veiculo = veiculo;
		this.cliente = cliente;
		this.diasLocacao = diasLocacao;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getDiasLocacao() {
		return diasLocacao;
	}

	public void setDiasLocacao(int diasLocacao) {
		this.diasLocacao = diasLocacao;
	}

	public double getValorEfetivoPago() {
		return valorEfetivoPago;
	}

	public void setValorEfetivoPago(double valorEfetivoPago) {
		this.valorEfetivoPago = valorEfetivoPago;
	}
	
	public void exibirInformacoes() {
		System.out.println("Dados do contrato: \n");
		cliente.exibirInformacoes();
		System.out.println();
		veiculo.exibirInformacoes();
		System.out.println();
		System.out.println("Dias locaçao: "+getDiasLocacao());
		System.out.println("Valor efetivo pago: "+getValorEfetivoPago());
		
	}
	
	public double calcularTotal() {
		double calculaTotal = getDiasLocacao() * veiculo.getPrecoDiaria();
		return calcularTotal();
	}
	
	

}
