package application.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class calculadoraMedia {

    @FXML
    private Button btncalcular;

    @FXML
    private Label txtResultado;

    @FXML
    private TextField txtn1;

    @FXML
    private TextField txtn2;

    @FXML
    private TextField txtn3;

    @FXML
    private TextField txtn4;
    
    public void CalcularMedia() {

    	double numero1 = Double.valueOf(txtn1.getText());    	
    	double numero2 = Double.valueOf(txtn2.getText());
    	double numero3 = Double.valueOf(txtn3.getText());
    	double numero4 = Double.valueOf(txtn4.getText());
    	
    	double resultado=(numero1+numero2+numero3+numero4)/4;
    	
    	txtResultado.setText(String.format("Resultado da Média: %.2f", resultado));

}
}
