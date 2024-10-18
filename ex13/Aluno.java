import java.time.LocalDate;
public class Aluno{
    long id;
    LocalDate nascimento;
    String ra;
    String nome;

    public Aluno(long id, LocalDate nascimento, String ra, String nome) {
        this.id = id;
        this.nascimento = nascimento;
        this.ra = ra;
        this.nome = nome;
    }

    public String toString(){
        return "id: " + id + " nascimento: " + nascimento + " ra: " + ra + " nome: " + nome;
    }
}