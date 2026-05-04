package aula010;

public class Fruta {
	
	protected String nome;
	protected String cor;
	protected double peso;
	protected double preco;
	
	
	public Fruta(String nome, String cor, double peso, double preco) {
		
		this.nome = nome;
		this.cor = cor;
		this.peso = peso;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

	
	public double calculaPreco(double preco, double peso) {
		double precofinal = (preco * peso); 
		return precofinal;
	}
	
	

}


