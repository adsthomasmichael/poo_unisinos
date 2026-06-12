package aula016_revisaoProvaGB;

/* Sabendo que os hospitais devem ter no máximo 20 funcionários cadastrados no
sistema, juntamente com as informações descritas acima, crie uma classe chamada
DetectaIrregularidades, que possui um array de Hospital. Crie o construtor
e os métodos de acesso. Nesta classe, crie os seguintes métodos:*/

public class DetectaIrregularidades {

    protected Hospital[] arrayHospital;

    public DetectaIrregularidades(int qtdHospital) {
        this.arrayHospital = new Hospital[qtdHospital];
    }

    public Hospital[] getArrayHospital() {
        return arrayHospital;
    }

    public void setArrayHospital(Hospital[] arrayHospital) {
        this.arrayHospital = arrayHospital;
    }

    /*A- hospitaisComExcessoDeFuncionarios — retorna um array de Hospital
        contendo os hospitais que possuem mais funcionários do que o limite estipulado*/

    public Hospital[] hospitaisComExcessoDeFuncionarios(){
        Hospital[] retornoArrayHospital = new Hospital[arrayHospital.length];

            for( int i = 0; i < arrayHospital.length; i++ ){
                if(arrayHospital[i] != null){
                    if (arrayHospital[i].getArrayFuncionario().length > 20){
                        retornoArrayHospital[i] = arrayHospital[i];
                    }
                }
            }
            return retornoArrayHospital;
    }

    /*B- hospitaisComDevolucaoDeSalario — retorna um array de Hospital
        contendo todos os hospitais em que ao menos um funcionário devolve dinheiro
        para a chefia. Sabe-se que o funcionário devolve dinheiro quando o seu salário
        líquido é inferior ao esperado, que deveria ser sempre 75% do salário bruto. */

    public Hospital[] hospitaisComDevolucaoDeSalario(){
        Hospital[] retornoArrayDevolve = new Hospital[arrayHospital.length];

        for ( int i = 0; i < arrayHospital.length; i++){
            if (arrayHospital[i] != null){ //verificando se não está nulo
                Funcionario[] arrayFuncionarios = arrayHospital[i].getArrayFuncionario(); //criando Array e recebendo os funcionarios do Hospital

                for ( int j = 0; j < arrayFuncionarios.length; j++){
                    if (arrayFuncionarios[j] != null){ //verificando se não está nulo
                        double salarioCorreto = arrayFuncionarios[j].getSalarioBruto() *0.75; //variavel que calcula e recebe o valor correto do salario
                        if (salarioCorreto > arrayFuncionarios[j].getSalarioLiquido()){ // verifica se o salario está dentro da regra
                            retornoArrayDevolve[i] = arrayHospital[i];
                        }
                    }

                }
            }
        }
        return retornoArrayDevolve;
    }

    /* C- hospitaisComDesviodeOrcamento — retorna um array de Hospital
        contendo todos os hospitais que desviam verbas, o que ocorre quando o
        orçamento líquido do hospital é maior do que deveria ser (85% do orçamento
        bruto). */

    public Hospital[] hospitaisComDesviodeOrcamento(){
        Hospital[] retornoArrayDesvio = new Hospital[arrayHospital.length];

        for (int i = 0; i < arrayHospital.length; i++){
            if (arrayHospital[i] != null){
                double orcamentoOk = arrayHospital[i].getOrcamentoBruto() *0.85;
                if (orcamentoOk > arrayHospital[i].getOrcamentoLiquido()){
                    retornoArrayDesvio[i] = arrayHospital[i];
                }
            }
        }
    return retornoArrayDesvio;
    }


}
