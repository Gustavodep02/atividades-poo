import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculadora extends Application{
    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
    	
    	TextField textField1 = new TextField();
    	textField1.setPrefWidth(200);
    	Button btnCE = new Button("CE");
    	btnCE.setPrefWidth(30);
    	btnCE.setPrefHeight(30);
    	Button btn1 = new Button("1");
    	btn1.setPrefWidth(50);
    	btn1.setPrefHeight(50);
    	Button btn2 = new Button("2");
    	btn2.setPrefWidth(50);
    	btn2.setPrefHeight(50);
    	Button btn3 = new Button("3");
    	btn3.setPrefWidth(50);
    	btn3.setPrefHeight(50);
    	Button btn4 = new Button("4");
    	btn4.setPrefWidth(50);
    	btn4.setPrefHeight(50);
    	Button btn5 = new Button("5");
    	btn5.setPrefWidth(50);
    	btn5.setPrefHeight(50);
    	Button btn6 = new Button("6");
    	btn6.setPrefWidth(50);
    	btn6.setPrefHeight(50);
    	Button btn7 = new Button("7");
    	btn7.setPrefWidth(50);
    	btn7.setPrefHeight(50);
    	Button btn8 = new Button("8");
    	btn8.setPrefWidth(50);
    	btn8.setPrefHeight(50);
    	Button btn9 = new Button("9");
    	btn9.setPrefWidth(50);
    	btn9.setPrefHeight(50);
    	Button btn0 = new Button("0");
    	btn0.setPrefWidth(50);
    	btn0.setPrefHeight(50);
    	Button btnSoma = new Button("+");
    	btnSoma.setPrefWidth(50);
    	btnSoma.setPrefHeight(50);
    	Button btnSubtracao = new Button("-");
    	btnSubtracao.setPrefWidth(50);
    	btnSubtracao.setPrefHeight(50);
    	Button btnMultiplicacao = new Button("*");
    	btnMultiplicacao.setPrefWidth(50);
    	btnMultiplicacao.setPrefHeight(50);
    	Button btnDivisao = new Button("/");
    	btnDivisao.setPrefWidth(50);
    	btnDivisao.setPrefHeight(50);
    	Button btnIgual = new Button("=");
    	btnIgual.setPrefWidth(50);
    	btnIgual.setPrefHeight(50);
    	Button btnPonto = new Button(".");
    	btnPonto.setPrefWidth(50);
    	btnPonto.setPrefHeight(50);
    	
    	FlowPane flowPane1 = new FlowPane();
    	flowPane1.setHgap(10);
    	flowPane1.setVgap(10);
    	flowPane1.getChildren().addAll(textField1, btnCE);
    	
    	FlowPane flowPane2 = new FlowPane();
    	flowPane2.setHgap(10);
    	flowPane2.setVgap(10);
    	flowPane2.getChildren().addAll(btn1,btn2,btn3,btnSoma);
    	
    	FlowPane flowPane3= new FlowPane();
    	flowPane3.setHgap(10);
    	flowPane3.setVgap(10);
    	flowPane3.getChildren().addAll(btn4,btn5,btn6,btnSubtracao);
    	
    	FlowPane flowPane4 = new FlowPane();
    	flowPane4.setHgap(10);
    	flowPane4.setVgap(10);
    	flowPane4.getChildren().addAll(btn7,btn8,btn9,btnMultiplicacao);
    	
    	FlowPane flowPane5 = new FlowPane();
    	flowPane5.setHgap(10);
    	flowPane5.setVgap(10);
    	flowPane5.getChildren().addAll(btnPonto,btn0,btnIgual,btnDivisao);
    	
    	VBox vbox = new VBox(10);
    	vbox.getChildren().addAll(flowPane1,flowPane2,flowPane3,flowPane4,flowPane5);
    	Scene scene = new Scene(vbox, 250, 300);
        stage.setScene(scene);
        stage.setTitle("Calculadora");
        stage.show();
        
    }
}
