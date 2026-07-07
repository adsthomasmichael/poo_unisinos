package aula018_ProvaGC;

import java.util.Arrays;

public class Universidade {
    /* Crie uma classe chamada Universidade. Esta classe possui um nome e um array de
SalaDeAula. No construtor da classe Universidade, receba o nome e a quantidade máxima de salas
de aula (que serve para inicializar o array de SalaDeAula). Crie os métodos de acesso para os atributos e
o metodo toString. */

    protected String nome;
    protected SalaDeAula[] arraySalaDeAula;

    public Universidade(String nome, int qtdSalasDeAula) {
        this.nome = nome;
        this.arraySalaDeAula = new SalaDeAula[qtdSalasDeAula];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public SalaDeAula[] getArraySalaDeAula() {
        return arraySalaDeAula;
    }

    public void setArraySalaDeAula(SalaDeAula[] arraySalaDeAula) {
        this.arraySalaDeAula = arraySalaDeAula;
    }

    @Override
    public String toString() {
        return "Universidade{" +
                "nome='" + nome + '\'' +
                ", arraySalaDeAula=" + Arrays.toString(arraySalaDeAula) +
                '}';
    }

    /* 3 - Na classe Universidade, crie um metodo insereSala, que insere uma sala recebida por
    parâmetro no array (na primeira posição livre). O metodo deve retornar verdadeiro caso a sala seja
    inserida ou falso caso contrário. */

    public boolean insereSala(SalaDeAula salaDeAula){

        for( int i = 0; i < arraySalaDeAula.length; i++) {
            if (arraySalaDeAula[i] == null) {
                arraySalaDeAula[i] = salaDeAula;
                return true;
            }
        }
        return false;
    }

    /* 4 - Na classe Universidade, crie um metodo chamado reservaSala, que recebe um inteiro
        referente à quantidade de alunos desejada para a reserva. Este metodo retorna a sala reservada, ou
        null caso não haja sala disponível que comporte uma turma do tamanho indicado. Não esqueça de
        reservar a sala retornada em caso de sucesso na reserva. */

        public SalaDeAula reservaSala(int qtdAlunos){
            SalaDeAula salaDeAula = new SalaDeAula();
            for (int i = 0; i < arraySalaDeAula.length; i++){
                if (arraySalaDeAula[i] != null){
                    if (arraySalaDeAula[i].getCapacidadeAlunos() >= qtdAlunos){
                        salaDeAula = arraySalaDeAula[i];
                        salaDeAula.setReservado(true);
                        return salaDeAula;
                    }
                }
            }
            return null;
        }

    // 5 - Na classe Universidade, crie um mtodo chamado imprimeSalas, que imprime todas salas do array.

    public void imprimeSalas(){
        System.out.println("=== TODAS AS SALAS === ");
            for (int i = 0; i < arraySalaDeAula.length; i++){
                if (arraySalaDeAula[i] != null){
                    System.out.println("Sala "+ arraySalaDeAula[i] + 1 +": \n");
                    arraySalaDeAula[i].toString();
                }
            }
    }

    // 6 - Na classe Universidade, crie um metodo chamado imprimeSalasDisponiveis, que imprime as informações de todas as salas disponíveis para reserva.
    public void imprimeSalasDisponiveis(){
        //boolean disponivel = true;

        System.out.println("=== SALAS DISPONIVEIS === ");

        for (int i = 0; i < arraySalaDeAula.length;i++) {
            if (arraySalaDeAula[i] != null) {
                if (!arraySalaDeAula[i].isReservado()) {
                    System.out.println("Sala " + arraySalaDeAula[i] + 1 + ": \n");
                    arraySalaDeAula[i].toString();
                }
            }
        }
    }

// 8 - Na classe Universidade, crie um metodo chamado maiorSala, que retorna a maior sala disponível para reserva (com maior capacidade).
public SalaDeAula maiorSala(){
            int maior = 0;
            SalaDeAula salaDeAula = new SalaDeAula();
            for (int i = 0; i < arraySalaDeAula.length; i++) {
                if (arraySalaDeAula[i] != null) {
                    if (arraySalaDeAula[i].getCapacidadeAlunos() > maior) {
                        maior = arraySalaDeAula[i].getCapacidadeAlunos();
                        salaDeAula = arraySalaDeAula[i];
                    }
                }
            }
            return salaDeAula;
}


}
