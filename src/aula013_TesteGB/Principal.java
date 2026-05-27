package aula013_TesteGB;

public class Principal {
    public static void main(String[] args) {
     /* A - crie um array de Deputado com 10 posições. Coloque os seguintes dados no array
        (informações definidas como SORTEAR na tabela devem possuir valor aleatório): */

        int opcao = (int) (Math.random() * 2 + 1);
            String partido = null;
            if (opcao == 1) {
                partido = "PT";
            } else {
                partido = "PSL";
            }
        Deputado[] deputados01 = {
                new Estadual("Dep1", partido, 20000, 22000, 12, "RS"),
                new Federal("Dep2", partido, 25000, 32000, 34, 123),
                new Federal("Dep3", partido, 10000, 8000, 3, 456),
                new Federal("Dep4", partido, 13000, 13000, 34, 789),
                new Estadual("Dep5 ", partido, 9000, 7200, 21, "RS"),
                new Estadual("Dep6", partido, 22000, 17600, 10, "SP"),
                new Federal("Dep7", partido, 32000, 30000, 10, 321),
                new Federal("Dep8", partido, 25000, 29000, 4, 654),
                new Estadual("Dep9 ", partido, 10000, 8000, 9, "SC"),
                new Estadual("Dep10 ", partido, 21000, 16800, 32, "RJ")
        };

    /* B -  imprima o número de cadastro (se for Federal) ou o estado (se for Estadual) de
            todos os deputados corruptos, separados por tipo de corrupção (mais funcionários, que recebem
            valores ou desviam verbas). */
        for (int i = 0; i < deputados01.length; i++){
            ProcuraCorruptos pc01 = new ProcuraCorruptos(deputados01);
            if (pc01.deputadosDesviamVerbas() != null ){
                System.out.println("=== Desviam verbas ===");
                    if (deputados01[i] instanceof Federal){//se for Federal, imprimir o num Cadastro
                        System.out.println(((Federal) deputados01[i]).getNumCadastro());
                    }
                    else if (deputados01[i] instanceof  Estadual) { //se for Estadual, imprimir o Estado
                        System.out.println(((Estadual) deputados01[i]).getEstado());
                    }
            }
            if (pc01.deputadosMaisFuncionarios() != null){
                System.out.println("=== Excesso de funcionários ===");
                    if (deputados01[i] instanceof Federal){//se for Federal, imprimir o num Cadastro
                        System.out.println("Deputado federal "+ ((Federal) deputados01[i]).getNumCadastro());
                    }
                    else if (deputados01[i] instanceof  Estadual) { //se for Estadual, imprimir o Estado
                        System.out.println("Deputado estadual "+ ((Estadual) deputados01[i]).getEstado());
                    }
            }
            if (pc01.deputadosRecebemValores() != null){
                System.out.println("=== Recebem valores ===");
                    if (deputados01[i] instanceof Federal){//se for Federal, imprimir o num Cadastro
                        System.out.println("Deputado federal "+ ((Federal) deputados01[i]).getNumCadastro());
                    }
                    else if (deputados01[i] instanceof  Estadual) { //se for Estadual, imprimir o Estado
                        System.out.println("Deputado estadual "+ ((Estadual) deputados01[i]).getEstado());
                    }
            }

        }


    }

}
