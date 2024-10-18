import java.util.ArrayList;
import java.util.List;

public class AlunoControl {
    private List<Aluno> alunos = new ArrayList<>();

    public void adicionar(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> pesquisarPorNome(String nome) {
        List<Aluno> resultado = new ArrayList<>();
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nome)) {
                resultado.add(aluno);
            }
        }
        return resultado;
    }
}