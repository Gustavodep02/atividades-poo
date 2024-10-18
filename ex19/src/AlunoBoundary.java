import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.time.LocalDate;
import java.util.List;

public class AlunoBoundary extends Application {
    private AlunoControl control = new AlunoControl();

    private TextField txtId = new TextField();
    private TextField txtRa = new TextField();
    private TextField txtNome = new TextField();
    private DatePicker dtNascimento = new DatePicker();

    private TableView<Aluno> table = new TableView<>();

    @Override
    public void start(Stage stage) {
        GridPane pane = new GridPane();

        pane.add(new Label("Id"), 0, 0);
        pane.add(txtId, 1, 0);
        pane.add(new Label("Ra"), 0, 1);
        pane.add(txtRa, 1, 1);
        pane.add(new Label("Nome"), 0, 2);
        pane.add(txtNome, 1, 2);
        pane.add(new Label("Nascimento"), 0, 3);
        pane.add(dtNascimento, 1, 3);

        Button btnAdicionar = new Button("Adicionar");
        Button btnPesquisar = new Button("Pesquisar");
        pane.add(btnAdicionar, 0, 4);
        pane.add(btnPesquisar, 1, 4);

        TableColumn<Aluno, String> colId = new TableColumn<>("Id");
        colId.setCellValueFactory(data -> new SimpleStringProperty(String.valueOf(data.getValue().getId())));

        TableColumn<Aluno, String> colRa = new TableColumn<>("Ra");
        colRa.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getRa()));

        TableColumn<Aluno, String> colNome = new TableColumn<>("Nome");
        colNome.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getNome()));

        TableColumn<Aluno, String> colNascimento = new TableColumn<>("Nascimento");
        colNascimento.setCellValueFactory(data -> new SimpleStringProperty(String.valueOf(data.getValue().getNascimento())));

        table.getColumns().addAll(colId, colRa, colNome, colNascimento);

        pane.add(table, 0, 5, 2, 1);

        btnAdicionar.setOnAction(e -> {
            Aluno aluno = boundaryToEntity();
            control.adicionar(aluno);
            entityToBoundary(aluno);
        });

        btnPesquisar.setOnAction(e -> {
            List<Aluno> alunos = control.pesquisarPorNome(txtNome.getText());
            table.getItems().setAll(alunos);
        });

        Scene scene = new Scene(pane, 600, 400);
        stage.setScene(scene);
        stage.setTitle("Gestão de Alunos");
        stage.show();
    }

    private Aluno boundaryToEntity() {
        Aluno aluno = new Aluno();
        aluno.setId(Long.parseLong(txtId.getText()));
        aluno.setRa(txtRa.getText());
        aluno.setNome(txtNome.getText());
        aluno.setNascimento(dtNascimento.getValue());
        return aluno;
    }

    private void entityToBoundary(Aluno aluno) {
        txtId.setText(String.valueOf(aluno.getId()));
        txtRa.setText(aluno.getRa());
        txtNome.setText(aluno.getNome());
        dtNascimento.setValue(aluno.getNascimento());
    }

    public static void main(String[] args) {
        launch(AlunoBoundary.class, args);
    }
}