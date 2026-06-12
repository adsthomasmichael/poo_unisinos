package aula016_revisaoProvaGB;
/* Crie uma classe HospitalPrivado, que é um tipo de Hospital. Um Hospital
Privado possui, além dos demais atributos, o nome do grupo empresarial ao qual
pertence. Crie os métodos de acesso e construtor necessários. */

public class HospitalPrivado extends Hospital{

    protected String nomeGrupo;

    public HospitalPrivado(String nome, String numCNPJ, double orcamentoLiquido, double orcamentoBruto, int qtdFuncionarios, String nomeGrupo) {
        super(nome, numCNPJ, orcamentoLiquido, orcamentoBruto, qtdFuncionarios);
        this.nomeGrupo = nomeGrupo;
    }

    public String getNomeGrupo() {
        return nomeGrupo;
    }

    public void setNomeGrupo(String nomeGrupo) {
        this.nomeGrupo = nomeGrupo;
    }


}
