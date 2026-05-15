package aula012;

public class Novo extends Livro{
    //Crie a classe Novo, que é um tipo de Livro e possui um valor de desconto. Crie os construtores e métodos necessários. Crie o método toString.

    protected double valorDesconto;

    //Construtores
    public Novo() {
        super();
    }

    public Novo(String titulo, String autor, double proce, int ano, double valorDesconto) {
        super(titulo, autor, proce, ano);
        this.valorDesconto = valorDesconto;
    }

    //Metodos GET  e SET
    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    @Override
    public String toString() {
        return "Novo{" +
                "valorDesconto=" + valorDesconto +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", proce=" + proce +
                ", ano=" + ano +
                '}';
    }
}
