package application.view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;

public class aplicativoController {

    @FXML
    private AnchorPane conteudoPane;
    
    @FXML
    private Button btcalculadora;
    

    @FXML
    private Button btcalculadoraIMC;
    
    
    private void carregarTela(String fxmlfile) {
        try {
            
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlfile));
            AnchorPane newContent = loader.load();

            
            conteudoPane.getChildren().clear();
            conteudoPane.getChildren().add(newContent);

           
            AnchorPane.setTopAnchor(newContent, 0.0);
            AnchorPane.setBottomAnchor(newContent, 0.0);
            AnchorPane.setLeftAnchor(newContent, 0.0);
            AnchorPane.setRightAnchor(newContent, 0.0);


            Scene cena = conteudoPane.getScene();
            if (cena != null) {
                @SuppressWarnings("unused")
				Stage stage = (Stage) cena.getWindow();
             
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void abrirPaginaInicial() {
        carregarTela("aplicativo.fxml");
    }

    @FXML
    private void abrirCalculadora() {
        carregarTela("calculadora.fxml");
    }
    
    @FXML
    private void initialize() {
    	
    }

    @FXML
    private void abrirCalculadoraIMC() {
        carregarTela("IMC.fxml");
    }
}