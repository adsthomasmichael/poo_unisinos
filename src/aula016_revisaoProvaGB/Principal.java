package aula016_revisaoProvaGB;

public class Principal {
    public static void main(String[] args){

        /*  Crie uma classe chamada Principal, que possui o metodo main. Neste metodo, faça o que se pede:
            a- Crie um array de Hospital com 10 posições. Preencha o array com dados
            variados, sendo que informações definidas como SORTEAR devem possuir valor
            aleatório. O array deve conter instâncias tanto de HospitalPublico quanto de
            HospitalPrivado, com pelo menos 3 de cada tipo.

            hpu Cristo Redentor / 004.310.0005/51 / 100000 / 130000 / 20 / 0013 - Publico 1
            hpu Conceicao / 004.310.0005/51 / 700000 / 700000 / 24 / 0014 - Publico 2
            hpu Clínicas 03 / 004.310.0005/51 / 400000 / 150000 / 18 / 0013 - Publico 3

            hpr Mohamed X / 004.310.0005/51 / 1000000 / 1300000 / 20 / "Grupo Xmed" - Privado 1
            hpr Incor / 004.310.0005/51 / 70000 / 100000 / 24 / "Grupo Xmed" - Privado 2
            hpr Moinhos / 004.310.0005/51 / 200000 / 230000 / 27 / "Moinhos Center" - Privado 3

            */

        Hospital[] hospitales = {
                new HospitalPublico("HPU Cristo Redentor", "004.310.0005/51",100000, 130000, (int)(Math.random() * 30 + 1), 1331 ),
                new HospitalPublico("HPU Conceicao", "004.310.0005/51",700000, 700000, (int)(Math.random() * 30 + 1), 1441 ),
                new HospitalPublico("HPU Clínicas", "004.310.0005/51",400000, 150000, (int)(Math.random() * 30 + 1), 1551 ),
                new HospitalPrivado("HPR Mohamed X","004.310.0005/51", 1000000, 100000, (int)(Math.random() * 30 + 1), "Grupo Xmed" ),
                new HospitalPrivado("HPR Incor","004.310.0005/51", 70000, 1300000, (int)(Math.random() * 30 + 1), "Grupo Coramed" ),
                new HospitalPrivado("HPR Moinhos","004.310.0005/51", 200000, 230000, (int)(Math.random() * 30 + 1), "Moinhos Center" )

                };

        for ( int i = 0; i < hospitales.length; i++){
            Funcionario[] funcionario = hospitales[i].getArrayFuncionario();

            for (int j = 0; j < funcionario.length; j++){
                double salarioBruto = Math.random()* 10000 + 2000;
                double salarioLiquido = salarioBruto * (Math.random()* 0.6 + 0.4);

                funcionario[j] = new Funcionario(
                        "Funcionario " + j,
                        salarioBruto,
                        salarioLiquido);
            }
        }



        /*  Imprima o número de registro no SUS (se for HospitalPublico) ou o nome do grupo empresarial (se for HospitalPrivado) de todos os hospitais irregulares,
            separados por tipo de irregularidade: excesso de funcionários, devolução de
            salário ou desvio de orçamento. */

        DetectaIrregularidades detecta01 = new DetectaIrregularidades(hospitales);

        // ================= DESVIAM ORÇAMENTO =================
        Hospital[] hospDesvios = detecta01.hospitaisComDesviodeOrcamento();

        System.out.println("\n=== Hospitais que desviam Orçamento ===");

        for ( int i = 0; i < hospDesvios.length; i++){
            if (hospDesvios[i] != null){
                if ( hospDesvios[i] instanceof HospitalPublico){
                    System.out.printf("O Hospital %s é público e possui o numero de registro %d no SUS. \n",hospDesvios[i].getNome(), ((HospitalPublico) hospDesvios[i]).getRegistroSUS());
                } else if (hospDesvios[i] instanceof HospitalPrivado) {
                    System.out.printf("O Hospital %s é privado e faz parte do grupo empresarial %s. \n", hospDesvios[i].getNome(), ((HospitalPrivado) hospDesvios[i]).getNomeGrupo());
                }
                else System.out.println("Nenhum hospital listado");
            }
        }

        // ================= EXCESSO DE FUNCIONARIOS =================
        Hospital[] hospExcessoFunc = detecta01.hospitaisComExcessoDeFuncionarios();

        System.out.println("\n=== Hospitais com excesso de funcionários ===");

        for ( int i = 0; i < hospExcessoFunc.length; i++){
            if (hospExcessoFunc[i] != null){
                if ( hospExcessoFunc[i] instanceof HospitalPublico){
                    System.out.printf("O Hospital %s é público e possui o numero de registro %d no SUS. \n",hospExcessoFunc[i].getNome(), ((HospitalPublico) hospExcessoFunc[i]).getRegistroSUS());
                } else if (hospExcessoFunc[i] instanceof HospitalPrivado) {
                    System.out.printf("O Hospital %s é privado e faz parte do grupo empresarial %s. \n", hospExcessoFunc[i].getNome(), ((HospitalPrivado) hospExcessoFunc[i]).getNomeGrupo());
                }
                else System.out.println("Nenhum hospital listado");
            }
        }

        // ================= DEVOLUÇÃO DE SALARIOS =================
        Hospital[] hospDevolucaoSalario = detecta01.hospitaisComDevolucaoDeSalario();

        System.out.println("\n=== Hospitais com devolução de salário dos funcionários ===");

        for ( int i = 0; i < hospDevolucaoSalario.length; i++){
            if (hospDevolucaoSalario[i] != null){
                if ( hospDevolucaoSalario[i] instanceof HospitalPublico){
                    System.out.printf("O Hospital %s é público e possui o numero de registro %d no SUS. \n",hospDevolucaoSalario[i].getNome(), ((HospitalPublico) hospDevolucaoSalario[i]).getRegistroSUS());
                } else if (hospDevolucaoSalario[i] instanceof HospitalPrivado) {
                    System.out.printf("O Hospital %s é privado e faz parte do grupo empresarial %s. \n", hospDevolucaoSalario[i].getNome(), ((HospitalPrivado) hospDevolucaoSalario[i]).getNomeGrupo());
                }
                else System.out.println("Nenhum hospital listado");
            }
        }




    }



}
