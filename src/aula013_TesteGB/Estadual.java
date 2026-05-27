package aula013_TesteGB;

public class Estadual extends Deputado{
    //Crie uma classe Estadual, que é um tipo de Deputado. Um Deputado Estadual possui, além
    //dos demais atributos, um estado. Crie os métodos de acesso e construtor necessários.

    protected String estado;

    public Estadual(String estado) {
        this.estado = estado;
    }

    public Estadual(String nome, String partido, double salarioBruto, double salarioLiquido, int qtdFuncionario, String estado) {
        super(nome, partido, salarioBruto, salarioLiquido, qtdFuncionario);
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
