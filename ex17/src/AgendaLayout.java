import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AgendaLayout extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		TextField textField1 = new TextField();
		textField1.setPrefWidth(200);
		TextField textField2 = new TextField();
		textField2.setPrefWidth(200);
		TextField textField3 = new TextField();
		textField3.setPrefWidth(200);
		Label label1 = new Label("Id:");
		Label label2 = new Label("Nome:");
		Label label3 = new Label("Telefone:");
		label1.setPrefWidth(50);
		label2.setPrefWidth(50);
		label3.setPrefWidth(50);
        FlowPane flowPane1 = new FlowPane();
        flowPane1.setHgap(10);  
        flowPane1.setVgap(10);  
        flowPane1.getChildren().addAll(
            label1,
            textField1
            
        );

       
        FlowPane flowPane2 = new FlowPane();
        flowPane2.setHgap(10);
        flowPane2.setVgap(10);  
        flowPane2.getChildren().addAll(
        		label2,
            textField2

        );
        FlowPane flowPane3 = new FlowPane();
        flowPane3.setHgap(10);
        flowPane3.setVgap(10);  
        flowPane3.getChildren().addAll(
        		label3,
            textField3

        );
        FlowPane flowPane4 = new FlowPane();
        flowPane4.setHgap(10);
        flowPane4.setVgap(10);  
        flowPane4.getChildren().addAll(
            new Button("Salvar"),
            new Button("Pesquisar")

        );
        
        VBox vbox = new VBox(20);  // Espaçamento entre FlowPanes
        vbox.getChildren().addAll(flowPane1,flowPane2,flowPane3,flowPane4); // Adiciona os FlowPanes ao HBox

        Scene scene = new Scene(vbox, 500, 200);
        stage.setScene(scene);
        stage.setTitle("Agenda de Contatos");
        stage.show();
	    }

	    public static void main(String[] args) {
	        launch(args);
	    }
		
	

}
