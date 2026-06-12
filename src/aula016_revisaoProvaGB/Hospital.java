package aula016_revisaoProvaGB;

/* Crie uma classe chamada Hospital. Um hospital possui um nome, um CNPJ, um
orçamento líquido, um orçamento bruto e um array de Funcionario (que indica os
funcionários que este hospital emprega, logo, o tamanho do array indica quantos
funcionários o hospital possui). Crie os métodos de acesso e um metodo construtor
que recebe parâmetros para inicializar todos os atributos.*/


public class Hospital {

    protected String nome;
    protected String numCNPJ;
    protected double orcamentoLiquido;
    protected double orcamentoBruto;
    protected Funcionario[] arrayFuncionario;

    public Hospital(String nome, String numCNPJ, double orcamentoLiquido, double orcamentoBruto, int qtdFuncionarios) {
        this.nome = nome;
        this.numCNPJ = numCNPJ;
        this.orcamentoLiquido = orcamentoLiquido;
        this.orcamentoBruto = orcamentoBruto;
        this.arrayFuncionario = new Funcionario[qtdFuncionarios];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumCNPJ() {
        return numCNPJ;
    }

    public void setNumCNPJ(String numCNPJ) {
        this.numCNPJ = numCNPJ;
    }

    public double getOrcamentoLiquido() {
        return orcamentoLiquido;
    }

    public void setOrcamentoLiquido(double orcamentoLiquido) {
        this.orcamentoLiquido = orcamentoLiquido;
    }

    public double getOrcamentoBruto() {
        return orcamentoBruto;
    }

    public void setOrcamentoBruto(double orcamentoBruto) {
        this.orcamentoBruto = orcamentoBruto;
    }

    public Funcionario[] getArrayFuncionario() {
        return arrayFuncionario;
    }

    public void setArrayFuncionario(Funcionario[] arrayFuncionario) {
        this.arrayFuncionario = arrayFuncionario;
    }
}
