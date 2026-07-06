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
}
