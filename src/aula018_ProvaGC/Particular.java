package aula018_ProvaGC;

import java.util.Arrays;

public class Particular extends Universidade{

    protected double vlrMensalidade;

    public Particular(String nome, int qtdSalasDeAula, double vlrMensalidade) {
        super(nome, qtdSalasDeAula);
        this.vlrMensalidade = vlrMensalidade;
    }

    public double getVlrMensalidade() {
        return vlrMensalidade;
    }

    public void setVlrMensalidade(double vlrMensalidade) {
        this.vlrMensalidade = vlrMensalidade;
    }

    @Override
    public String toString() {
        return "Particular{" +
                "vlrMensalidade=" + vlrMensalidade +
                ", nome='" + nome + '\'' +
                ", arraySalaDeAula=" + Arrays.toString(arraySalaDeAula) +
                '}';
    }
}
