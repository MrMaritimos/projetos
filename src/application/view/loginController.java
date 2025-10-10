package application.view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;

public class loginController {

	 @FXML
	    private TextField senha;

	 @FXML
	    private TextField usuario;
	 
    public void sair() {
        System.exit(0);
    }

    public void entrar() {
    	try {
    	String usuarioText = usuario.getText();
        String senhaText = senha.getText();

        Alert aviso;
        if (usuarioText.equals("brasil") && senhaText.equals("brasil011")) {
            aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("Confirmação");
            aviso.setContentText("Bem Vindo ao Sistema " + usuarioText);
            aviso.showAndWait();
            
            usuario.getScene().getWindow().hide();
            
            Parent root = FXMLLoader.load(getClass().getResource("aplicativo.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        
        } else {
            aviso = new Alert(Alert.AlertType.ERROR);
            aviso.setTitle("Erro");
            aviso.setContentText("Usuário ou senha incorretos!");
            aviso.showAndWait();
        }
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
        
    }
    
    @FXML //@FXML ou @Override indica que o codigo sera executado assim que carregar a página
   
    	private void initialize() {
    	//Quando pressionar enter no campo do usuário foca a adição no campo de senha
    	usuario.setOnAction(e->{senha.requestFocus();});
    	//Quando pressionar enter no campo senha aciona o metodo de entrar
    	senha.setOnAction(e->{entrar();});
    	
    }
}