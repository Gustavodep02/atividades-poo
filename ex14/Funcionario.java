import java.time.LocalDate;

public class Funcionario {
    long id;
    String nome;
    String matricula;
    LocalDate admissao;
    LocalDate demissao;
    float salario;
    String horario;

    public Funcionario(long id, String nome, String matricula, LocalDate admissao, LocalDate demissao, float salario, String horario) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.admissao = admissao;
        this.demissao = demissao;
        this.salario = salario;
        this.horario = horario;
    }

    public void exibir() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Data de Admissão: " + admissao);
        System.out.println("Data de Demissão: " + (demissao != null ? demissao : "Ainda não demitido"));
        System.out.println("Salário: " + salario);
        System.out.println("Horário: " + horario);
    }
}