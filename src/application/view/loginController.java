package application.view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;



public class loginController {

	 @FXML
	    private TextField senha;

	 @FXML
	    private TextField usuario;
	 
	  @FXML
	    private Label lblCadastrar;
	 
    public void sair() {
        System.exit(0);
    }

    public void entrar() {
    	try {
    	String usuarioText = usuario.getText();
        String senhaText = senha.getText();

        Alert aviso;
        if (usuarioText.equals("") && senhaText.equals("")) {
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
    
   
    
    @FXML
	private void initialize() {
    	/* QUANDO PRESSIONAR ENTER NO CAMPO USUARIO 
    		FOCA A EDIÇÃO NO CAMPO DE SENHA
    	*/
    		usuario.setOnAction(e->{senha.requestFocus();});
    	/* QUANDO PRESSIONAR ENTER NO CAMPO SENHA 
    		ACIONA O METODO DE ENTRAR
    	*/
    		senha.setOnAction(e->{entrar();});
    		
    		lblCadastrar.setOnMouseClicked(event->{
    			try {
    				//ABRE A TELA CADASTRO USUARIO
    				Parent root = FXMLLoader.load(getClass().getResource("novoUsuario.fxml"));
    				Stage stage = new Stage();
    				Scene scene = new Scene(root);
    				stage.setScene(scene);
    				stage.show();
    			}catch (Exception e) {
    				e.printStackTrace();
    			}
    		});
    	}
    }