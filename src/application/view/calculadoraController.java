package application.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class calculadoraController {

    @FXML
    private Label btnR;

    @FXML
    private Button btndividir;

    @FXML
    private Button btnmultiplicar;

    @FXML
    private Button btnsoma;

    @FXML
    private Button btnsubtrair;

    @FXML
    private TextField txtn1;

    @FXML
    private TextField txtn2;
    
    @FXML
    private Button btnreset;
    
@SuppressWarnings("unused")
private void initialize() {
    	
    	
    	txtn1.setText("0");
		txtn2.setText("0");
    	
    	
    	
    	btnsubtrair.setOnAction(e->{Subtrair();});
    	btnmultiplicar.setOnAction(e->{Multiplicar();});
    	btndividir.setOnAction(e->{Dividir();});
    	btnreset.setOnAction(e->{
    		txtn1.setText("0");
    		txtn2.setText("0");
    		btnR.setText("Resultado:");    		
    	});
    	

    	
    	txtn1.textProperty().addListener(
    	(observable, oldValue, newValue)->{
    	txtn1.setText(newValue.replaceAll("[^\\d.]",""));	
    	});
    	
    	txtn2.textProperty().addListener(
    	(observable, oldValue, newValue)->{
    	 txtn2.setText(newValue.replaceAll("[^\\d.]",""));	
    	 });
    
    	
    
    }
    public void Somar() {

    	double numero1 = Double.valueOf(txtn1.getText());    	
    	double numero2 = Double.valueOf(txtn2.getText());
    	try {
       	 numero1 = Double.valueOf(txtn1.getText());
       	} catch(Exception e){
       		numero1 = 0;
       		txtn1.setText("0");
       	}
   	try {
      	 numero2 = Double.valueOf(txtn1.getText());
      	} catch(Exception e){
      		numero2 = 0;
      		txtn2.setText("0");
      	}
    	double resultado=numero1+numero2;
    	
    	btnR.setText(String.valueOf(resultado));
    	//retorna o valor de double para string
    	//informa o resultado na label com o setText
  /*  	
		String parOuImpar;
    	if (resultado %2 == 0 ) {
    		parOuImpar =" é par.";
    	} else {
    		parOuImpar = " é Impar.";
    	}
    	
    	btnR.setText("Resultado: "+String.valueOf(resultado)+parOuImpar);*/
    }
    public void Subtrair() {
    	double numero1 = Double.valueOf(txtn1.getText());
    	double numero2 = Double.valueOf(txtn2.getText());
    	double resultado=numero1-numero2;
    	try {
       	 numero1 = Double.valueOf(txtn1.getText());
       	} catch(Exception e){
       		numero1 = 0;
       		txtn1.setText("0");
       	}
   	try {
      	 numero2 = Double.valueOf(txtn1.getText());
      	} catch(Exception e){
      		numero2 = 0;
      		txtn2.setText("0");
      	}
    	btnR.setText(String.valueOf(resultado));
    	
    }
    public void Dividir() {
    	double numero1 = Double.valueOf(txtn1.getText());
    	double numero2 = Double.valueOf(txtn2.getText());
    	double resultado=numero1/numero2;
    	try {
       	 numero1 = Double.valueOf(txtn1.getText());
       	} catch(Exception e){
       		numero1 = 0;
       		txtn1.setText("0");
       	}
   	try {
      	 numero2 = Double.valueOf(txtn1.getText());
      	} catch(Exception e){
      		numero2 = 0;
      		txtn2.setText("0");
      	}
    	btnR.setText(String.valueOf(resultado));
    	
    }
    public void Multiplicar() {
    	double numero1 = Double.valueOf(txtn1.getText());
    	double numero2 = Double.valueOf(txtn2.getText());
    	double resultado=numero1*numero2;
    	try {
       	 numero1 = Double.valueOf(txtn1.getText());
       	} catch(Exception e){
       		numero1 = 0;
       		txtn1.setText("0");
       	}
   	try {
      	 numero2 = Double.valueOf(txtn1.getText());
      	} catch(Exception e){
      		numero2 = 0;
      		txtn2.setText("0");
      	}
    	btnR.setText(String.valueOf(resultado));
    	
    } 
    
    
    
}

