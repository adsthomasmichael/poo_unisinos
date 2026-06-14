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
        ProcuraCorruptos pc01 =
                new ProcuraCorruptos(deputados01);


// ================= DESVIAM VERBAS =================

        System.out.println("=== Desviam verbas ===");

        Deputado[] desvios =
                pc01.deputadosDesviamVerbas();

        for (int i = 0; i < desvios.length; i++) {

            if (desvios[i] != null) {

                if (desvios[i] instanceof Federal) {

                    Federal f = (Federal) desvios[i];

                    System.out.println(
                            "Federal: "
                                    + f.getNome()
                                    + " - Cadastro: "
                                    + f.getNumCadastro());

                } else {

                    Estadual e = (Estadual) desvios[i];

                    System.out.println(
                            "Estadual: "
                                    + e.getNome()
                                    + " - Estado: "
                                    + e.getEstado());
                }
            }
        }


// ================= MAIS FUNCIONÁRIOS =================

        System.out.println("\n=== Mais funcionários ===");

        Deputado[] funcionarios =
                pc01.deputadosMaisFuncionarios();

        for (int i = 0; i < funcionarios.length; i++) {

            if (funcionarios[i] != null) {

                if (funcionarios[i] instanceof Federal) {

                    Federal f = (Federal) funcionarios[i];

                    System.out.println(
                            "Federal: "
                                    + f.getNome()
                                    + " - Cadastro: "
                                    + f.getNumCadastro());

                } else {

                    Estadual e = (Estadual) funcionarios[i];

                    System.out.println(
                            "Estadual: "
                                    + e.getNome()
                                    + " - Estado: "
                                    + e.getEstado());
                }
            }
        }


// ================= RECEBEM VALORES =================

        System.out.println("\n=== Recebem valores ===");

        Deputado[] recebem =
                pc01.deputadosRecebemValores();

        for (int i = 0; i < recebem.length; i++) {

            if (recebem[i] != null) {

                if (recebem[i] instanceof Federal) {

                    Federal f = (Federal) recebem[i];

                    System.out.println(
                            "Federal: "
                                    + f.getNome()
                                    + " - Cadastro: "
                                    + f.getNumCadastro());

                } else {

                    Estadual e = (Estadual) recebem[i];

                    System.out.println(
                            "Estadual: "
                                    + e.getNome()
                                    + " - Estado: "
                                    + e.getEstado());
                }
            }
        }


    }

}
