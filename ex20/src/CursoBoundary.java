import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CursoBoundary extends Application {
    private TextField txtId = new TextField();
    private TextField txtNome = new TextField();
    private TextField txtCodigoCurso = new TextField();
    private TextField txtNomeCoordenador = new TextField();
    private TextField txtQuantidadeAlunos = new TextField();

    private Button btnGravar = new Button("Adicionar");
    private Button btnPesquisar = new Button("Pesquisar");

    private CursoControl control = new CursoControl();

    @Override
    public void start(Stage stage) {
        GridPane grid = new GridPane();

        grid.add(new Label("Id:"), 0, 0);
        grid.add(txtId, 1, 0);
        grid.add(new Label("Nome:"), 0, 1);
        grid.add(txtNome, 1, 1);
        grid.add(new Label("Código do Curso:"), 0, 2);
        grid.add(txtCodigoCurso, 1, 2);
        grid.add(new Label("Nome do Coordenador:"), 0, 3);
        grid.add(txtNomeCoordenador, 1, 3);
        grid.add(new Label("Quantidade de Alunos:"), 0, 4);
        grid.add(txtQuantidadeAlunos, 1, 4);
        grid.add(btnGravar, 0, 5);
        grid.add(btnPesquisar, 1, 5);

        btnGravar.setOnAction(e -> {
            Curso curso = toEntity();
            control.gravar(curso);
            limpar();
        });

        btnPesquisar.setOnAction(e -> {
            Curso curso = control.pesquisar(txtNome.getText());
            if (curso != null) {
                fromEntity(curso);
            } else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "Curso não encontrado!");
                alert.showAndWait();
            }
        });

        Scene scene = new Scene(grid, 400, 300);
        stage.setScene(scene);
        stage.setTitle("Cadastro de Cursos");
        stage.show();
    }

    public Curso toEntity() {
        return new Curso(
                Integer.parseInt(txtId.getText()),
                txtNome.getText(),
                txtCodigoCurso.getText(),
                txtNomeCoordenador.getText(),
                Integer.parseInt(txtQuantidadeAlunos.getText())
        );
    }

    public void fromEntity(Curso curso) {
        txtId.setText(String.valueOf(curso.getId()));
        txtNome.setText(curso.getNome());
        txtCodigoCurso.setText(curso.getCodigoCurso());
        txtNomeCoordenador.setText(curso.getNomeCoordenador());
        txtQuantidadeAlunos.setText(String.valueOf(curso.getQuantidadeAlunos()));
    }

    public void limpar() {
        txtId.clear();
        txtNome.clear();
        txtCodigoCurso.clear();
        txtNomeCoordenador.clear();
        txtQuantidadeAlunos.clear();
    }

    public static void main(String[] args) {
        launch(args);
    }
}