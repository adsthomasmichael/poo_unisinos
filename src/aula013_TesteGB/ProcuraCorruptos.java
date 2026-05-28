package aula013_TesteGB;

public class ProcuraCorruptos {
    /*  Sabendo que os deputados devem ter no máximo 10 funcionários, juntamente com as
        informações descritas acima, crie uma classe chamada ProcuraCorruptos, que possui um array de
        Deputado. Crie o construtor e os métodos de acesso. Nesta classe, crie os seguintes métodos: */

    protected Deputado[] arrayDeputados;

    public ProcuraCorruptos(Deputado[] arrayDeputados) {
        this.arrayDeputados = arrayDeputados;
    }

    public Deputado[] getArrayDeputados() {
        return arrayDeputados;
    }

    public void setArrayDeputados(Deputado[] arrayDeputados) {
        this.arrayDeputados = arrayDeputados;
    }

    /*  A - deputadosMaisFuncionarios, que retorna um array de Deputado que contém os
        deputados que possuem mais funcionários do que o estipulado. */
    public Deputado[] deputadosMaisFuncionarios(){
        Deputado[] retornoArray = new Deputado[arrayDeputados.length];

        for (int i = 0; i < arrayDeputados.length; i++){
            if (arrayDeputados[i] != null){
                if (arrayDeputados[i].arrayFuncionarios.length > 10){
                    retornoArray[i] = arrayDeputados[i];
                }
            }

        }
        return retornoArray;
    }

    /* B - deputadosRecebemValores, que retorna um array de Deputado que contém todos
        os deputados que fazem os funcionários (pelo menos 1) devolverem dinheiro. Sabe-se que o
        funcionário devolve dinheiro de acordo com o salário líquido que ele recebe, que deveria ser
        sempre 70% do seu salário bruto. */
    public Deputado[] deputadosRecebemValores(){
        Deputado[] retornoArray = new Deputado[arrayDeputados.length];

        for (int i = 0; i < arrayDeputados.length; i++){
            if(arrayDeputados[i] != null){
                Funcionario[] funcionarios = arrayDeputados[i].getArrayFuncionarios();

                for (int j = 0; j < funcionarios.length; j++){
                    if (funcionarios[j] != null){
                        double salarioCorreto = funcionarios[j].getSalarioBruto() *0.70;

                        if (funcionarios[j].getSalarioLiquido() < salarioCorreto){
                            retornoArray[i] = arrayDeputados[i];
                            break;
                        }
                    }
                }
            }
        }
        return retornoArray;
    }

    /* C - deputadosDesviamVerbas, que retorna um array de Deputado que contém todos
        os deputados que desviam verbas, que ocorre quando o salário líquido do deputado é maior do
        que deveria ser (80% do salário bruto).*/

    public Deputado[] deputadosDesviamVerbas(){
        Deputado[] retornoArray = new Deputado[arrayDeputados.length];

        for (int i = 0; i < arrayDeputados.length; i++){
            if ( arrayDeputados[i] != null){
                double salarioCorreto = arrayDeputados[i].getSalarioBruto() *80;

                if (arrayDeputados[i].getSalarioLiquido() > salarioCorreto){
                    retornoArray[i] = arrayDeputados[i];
                }
            }
        }
        return retornoArray;
    }
}
