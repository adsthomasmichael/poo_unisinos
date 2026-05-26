package aula013_TesteGB;

public class Deputado {
    /*  Crie uma classe chamada Deputado. Um deputado possui um nome, um partido, um salário
        líquido, um salário bruto e um array de Funcionario (que indica os funcionários que este Deputado
        emprega, logo, o tamanho do array indica quantos funcionários o deputado possui). Crie os métodos de
        acesso e um metodo construtor que recebe parâmetros para inicializar todos os atributos */

    protected String nome;
    protected double salarioBruto;
    protected double salarioLiquido;
    Funcionario[] arrayFuncionarios;

    public Deputado() {
    }

    public Deputado(String nome, double salarioBruto, double salarioLiquido, int qtdFuncionario) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.salarioLiquido = salarioLiquido;
        this.arrayFuncionarios = new Funcionario[qtdFuncionario];
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

    public Funcionario[] getArrayFuncionarios() {
        return arrayFuncionarios;
    }

    public void setArrayFuncionarios(Funcionario[] arrayFuncionarios) {
        this.arrayFuncionarios = arrayFuncionarios;
    }
}
