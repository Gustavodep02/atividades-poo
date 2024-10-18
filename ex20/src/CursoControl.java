import java.util.ArrayList;
import java.util.List;

public class CursoControl {
    private List<Curso> listaCursos = new ArrayList<>();

    public void gravar(Curso curso) {
        listaCursos.add(curso);
    }

    public Curso pesquisar(String parteNome) {
        for (Curso curso : listaCursos) {
            if (curso.getNome().contains(parteNome)) {
                return curso;
            }
        }
        return null;
    }

    public List<Curso> getListaCursos() {
        return listaCursos;
    }
}