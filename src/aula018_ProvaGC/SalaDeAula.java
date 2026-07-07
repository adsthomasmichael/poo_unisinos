package aula018_ProvaGC;

public class SalaDeAula {
    /* Crie uma classe chamada SalaDeAula, que possui uma identificação (String), uma
capacidade de alunos e um atributo booleano chamado "reservado", que indica se a sala está ou não
reservada. No construtor, receba os valores para inicializar todos os atributos. Sobrescreva o metodo
toString e crie os métodos de acesso dos atributos. */

    protected String id;
    protected int capacidadeAlunos;
    protected boolean reservado;

    public SalaDeAula() {
    }

    public SalaDeAula(String id, int capacidadeAlunos) {
        this.id = id;
        this.capacidadeAlunos = capacidadeAlunos;
        this.reservado = false;
    }

    public SalaDeAula(String id, int capacidadeAlunos, boolean reservado) {
        this.id = id;
        this.capacidadeAlunos = capacidadeAlunos;
        this.reservado = reservado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCapacidadeAlunos() {
        return capacidadeAlunos;
    }

    public void setCapacidadeAlunos(int capacidadeAlunos) {
        this.capacidadeAlunos = capacidadeAlunos;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    @Override
    public String toString() {
        return "SalaDeAula{" +
                "id='" + id + '\'' +
                ", capacidadeAlunos=" + capacidadeAlunos +
                ", reservado=" + reservado +
                '}';
    }
}
