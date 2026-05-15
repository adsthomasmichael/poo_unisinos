package aula012;

public class Livro {
    //1 - Crie a classe Livro, com titulo, autor, preço e ano de criação, com os construtore e métodos necessários. Crie o método toString.

    protected String titulo;
    protected String autor;
    protected double proce;
    protected int ano;

    //Construtores
    public Livro() {
    }

    public Livro(String titulo, String autor, double proce, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.proce = proce;
        this.ano = ano;
    }

    // metodos GET e SET
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getProce() {
        return proce;
    }

    public void setProce(double proce) {
        this.proce = proce;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", proce=" + proce +
                ", ano=" + ano +
                '}';
    }

}
