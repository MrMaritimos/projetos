package application.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;

public class jogoController {

    @FXML
    private Canvas Canva;
 
    private double playerX= 200;
    private final double playerY=500;
    private final double raio=16;
    private final double largura=360;
    private final double altura=600;
    private int pontuacao=0;
    @SuppressWarnings({ "unchecked", "rawtypes" })
	private ArrayList<obstaculo> obstaculos= new ArrayList();
    @SuppressWarnings("unused")
	private Random random = new Random();
    @SuppressWarnings("unused")
	private boolean esquerda, direita;
    
    @FXML
    public void initialize() {
    	Canva.setFocusTraversable(true);
    	Canva.requestFocus();
    	@SuppressWarnings("unused")
		GraphicsContext gc = Canva.getGraphicsContext2D();
    	Canva.setOnKeyPressed(e->{
    		if(e.getCode()==KeyCode.LEFT) { esquerda=true;}
    		if(e.getCode()==KeyCode.RIGHT) { direita=true;}
    	});
    	
    	Canva.setOnKeyReleased(e->{
    		if(e.getCode()==KeyCode.LEFT) { esquerda=false;}
    		if(e.getCode()==KeyCode.RIGHT) { direita=false;}
    	});
    }
    
    @SuppressWarnings("unused")
	private void desenhar(GraphicsContext gc) {
    	gc.setFill(Color.LIGHTSKYBLUE);
    	gc.fillRect(0, 0, largura, altura);
    	
    	gc.setFill(Color.RED);
    	gc.fillOval(playerX-raio, playerY-raio, raio*2, raio*2);
    	
    	gc.setFill(Color.DARKGRAY);
    	for(obstaculo obs: obstaculos) {
    		gc.fillRect(obs.x, obs.y, obs.largura, obs.altura);
    	}
    	
    	gc.setFill(Color.BLACK);
    	gc.setFont(javafx.scene.text.Font.font(18));
    	gc.fillText("pontuacao"+pontuacao, 10, 20);
    }
    
    @SuppressWarnings("unused")
	private void atualizar() {
    	if(esquerda && playerX-raio > 0) {playerX-=5;}
    	if(direita && playerX-raio > 0) {playerX+=5;}
    	double velocidade=4;
    	
    	Iterator<obstaculo> it = obstaculos.iterator();
    	while(it.hasNext()) {
    		obstaculo obs = it.next();
    		obs.y+=velocidade;
    		double centroPlayerX=playerX+raio;
    		double centroPlayerY=playerY+raio;
    		double obsTopo=obs.y;
    		double obsBase=obs.y+obs.altura;
    		double obsEsquerda=obs.x;
    		double obsDireita=obs.x+obs.largura;
    		
    		boolean colidiu= centroPlayerX>=obsEsquerda &&
    				centroPlayerX<=obsDireita &&
    				centroPlayerY>= obsTopo &&
    				centroPlayerY<=obsBase;
    			if(colidiu) {
    				
    			}else if(obs.y>altura) {
    				pontuacao++;
    				it.remove();
    			}
    				
    				
    	}
    }
    
    class obstaculo{
    	double x,y;
    	final double largura=70;
    	final double altura= 60;
    	obstaculo(double x, double y){
    		this.x=x;
    		this.y=y;
    		}
    		
    }
}