package application.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class calculadoraIMC {

    @FXML
    private Label btResultado;

    @FXML
    private Button btnCalcular;

    @FXML
    private TextField txtAltura;

    @FXML
    private TextField txtPeso;
    
    @FXML
    private Label txtExplicacao;
    
    public void calcularIMC() {
        double altura = 0;
        double peso = 0;

        
        try {
            altura = Double.parseDouble(txtAltura.getText());
            if (altura <= 0) {
                txtAltura.setText("0");
                btResultado.setText("Altura deve ser maior que zero!");
                return;
            }
        } catch (NumberFormatException e) {
            txtAltura.setText("0");
            btResultado.setText("Digite uma altura válida!");
            return;
        }

       
        try {
            peso = Double.parseDouble(txtPeso.getText());
            if (peso <= 0) {
                txtPeso.setText("0");
                btResultado.setText("Peso deve ser maior que zero!");
                return;
            }
        } catch (NumberFormatException e) {
            txtPeso.setText("0");
            btResultado.setText("Digite um peso válido!");
            return;
        }

       
        double resultado = peso / (altura * altura);
        
        String categoria = null;
        	
        	if (resultado < 18.5 ) {
        		categoria = "Abaixo do peso";
        	} else if(resultado > 18.5 && resultado < 25) {
        		categoria = "peso normal";
        	} else if(resultado > 25 && resultado < 30) {
        		categoria = "Sobrepeso";
        	} else if(resultado > 30 && resultado < 35) {
        		categoria = "Obesidade: Grau I";
        	} else if(resultado > 30 && resultado < 35) {
        		categoria = "Obesidade: Grau II";
        	} else if(resultado > 30 && resultado < 35) {
        		categoria = "Obesidade: Grau III";
        	}
        		
        btResultado.setText(String.format("IMC: %.2f (%s)", resultado, categoria));
        
        	
        
    }
    
    
    
}