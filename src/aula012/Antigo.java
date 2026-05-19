package aula012;

public class Antigo extends Livro{
    //Crie a classe Antigo, que é um tipo de Livro e possui um número de edição. Crie o construtores e métodos necessários. Crie o método toString.

    protected int numEdicao;

    //Construtores
    public Antigo() {
        super();
    }

    public Antigo(String titulo, String autor, double preco, int ano, int numEdicao) {
        super(titulo, autor, preco, ano);
        this.numEdicao = numEdicao;
    }

    //Metodos GET e SET
    public int getNumEdicao() {
        return numEdicao;
    }

    public void setNumEdicao(int numEdicao) {
        this.numEdicao = numEdicao;
    }

    @Override
    public String toString() {
        return super.toString() + ", numEdicao=" + numEdicao;
    }
}
