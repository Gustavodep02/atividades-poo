import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Agenda extends Application{
    public void start(Stage stage) throws Exception{
    	Pane panel = new Pane();
    	Scene scn = new Scene(panel);
    	stage.setScene(scn);
    	Label id = new Label("Id:");
    	panel.getChildren().add(id);
    	Label nome = new Label("Nome:");
    	nome.relocate(0, 30);
    	panel.getChildren().add(nome);
    	Label telefone = new Label("Telefone:");
    	telefone.relocate(0, 60);
    	panel.getChildren().add(telefone);
    	Button btnSalvar = new Button("Salvar");
    	btnSalvar.relocate(0, 90);
    	panel.getChildren().add(btnSalvar);
    	Button btnPesquisar = new Button("Pesquisar");
    	btnPesquisar.relocate(50, 90);
    	panel.getChildren().add(btnPesquisar);
    	TextField txtId = new TextField();
    	txtId.relocate(70, 0);
    	panel.getChildren().add(txtId);
    	txtId.setPrefWidth(300);
    	TextField txtNome = new TextField();
    	txtNome.relocate(70, 30);
    	txtNome.setPrefWidth(300);
    	panel.getChildren().add(txtNome);
    	TextField txtTelefone = new TextField();
    	txtTelefone.relocate(70, 60);
    	txtTelefone.setPrefWidth(300);
    	panel.getChildren().add(txtTelefone);
    	stage.setTitle("Agenda de Contatos");
    	stage.show();
    	
    }
    public static void main(String[] args){
        launch(args);
    }
}	
