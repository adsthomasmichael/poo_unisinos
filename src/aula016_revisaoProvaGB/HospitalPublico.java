package aula016_revisaoProvaGB;

/* Crie uma classe HospitalPublico, que é um tipo de Hospital. Um Hospital
Público possui, além dos demais atributos, um número de registro junto ao SUS.
Crie os métodos de acesso e construtor necessários.*/

public class HospitalPublico extends Hospital{

    protected int registroSUS;

    public HospitalPublico(String nome, String numCNPJ, double orcamentoLiquido, double orcamentoBruto, int qtdFuncionarios, int registroSUS) {
        super(nome, numCNPJ, orcamentoLiquido, orcamentoBruto, qtdFuncionarios);
        this.registroSUS = registroSUS;
    }

    public int getRegistroSUS() {
        return registroSUS;
    }

    public void setRegistroSUS(int registroSUS) {
        this.registroSUS = registroSUS;
    }
}
