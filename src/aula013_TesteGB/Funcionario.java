package aula013_TesteGB;

public class Funcionario {

    //Crie uma classe chamada Funcionario. Um funcionário possui um nome, um salário bruto e
    //um salário líquido. Crie os métodos de acesso e o metodo construtor.

    protected String nome;
    protected double salarioBruto;
    protected double salarioLiquido;

    public Funcionario() {}

    public Funcionario(String nome, double salarioBruto, double salarioLiquido) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.salarioLiquido = salarioLiquido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }
}
