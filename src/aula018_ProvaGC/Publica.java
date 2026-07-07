package aula018_ProvaGC;

import java.util.Arrays;

public class Publica extends Universidade{
    protected String estado;

    public Publica(String nome, int qtdSalasDeAula, String estado) {
        super(nome, qtdSalasDeAula);
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Publica{" +
                "estado='" + estado + '\'' +
                ", nome='" + nome + '\'' +
                ", arraySalaDeAula=" + Arrays.toString(arraySalaDeAula) +
                '}';
    }
}
