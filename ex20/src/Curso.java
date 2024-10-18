public class Curso {
    private int id;
    private String nome;
    private String codigoCurso;
    private String nomeCoordenador;
    private int quantidadeAlunos;


    public Curso(int id, String nome, String codigoCurso, String nomeCoordenador, int quantidadeAlunos) {
        this.id = id;
        this.nome = nome;
        this.codigoCurso = codigoCurso;
        this.nomeCoordenador = nomeCoordenador;
        this.quantidadeAlunos = quantidadeAlunos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getNomeCoordenador() {
        return nomeCoordenador;
    }

    public void setNomeCoordenador(String nomeCoordenador) {
        this.nomeCoordenador = nomeCoordenador;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public void setQuantidadeAlunos(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }
}