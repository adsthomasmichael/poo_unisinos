package aula013_TesteGB;

public class Federal extends Deputado{
    //Crie uma classe Federal, que é um tipo de Deputado. Um Deputado Federal possui, além
    //dos demais atributos, um número de cadastro. Crie os métodos de acesso e construtor necessários.

    protected int numCadastro;

    public Federal(int numCadastro) {
        this.numCadastro = numCadastro;
    }

    public Federal(String nome, String partido, double salarioBruto, double salarioLiquido, int qtdFuncionario, int numCadastro) {
        super(nome, partido, salarioBruto, salarioLiquido, qtdFuncionario);
        this.numCadastro = numCadastro;
    }

    public int getNumCadastro() {
        return numCadastro;
    }

    public void setNumCadastro(int numCadastro) {
        this.numCadastro = numCadastro;
    }
}
