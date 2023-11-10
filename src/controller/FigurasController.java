package controller;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class FigurasController implements Initializable{
	
	@FXML
	private Line linea1, linea2, linea3;
	private Rectangle cuadrado;
	private Circle circulo;
	private Polygon pentagono;
	private Button transformar;

	private double anguloRotacion = 0;
	
	//importo Random para poder generar el color aleatorio
	private Random random = new Random();
	

    public void handleButtonAction(ActionEvent event) {
        //Compruebo que el botón funcione
    	System.out.println("A metamorfosearse");
        
    	//Hago rotar las líneas
		anguloRotacion += 30;
		/*Pensaba que había que corregir el ángulo a la primera vuelta, pero parece funcionar
		 * if (anguloRotacion >= 360) {
			anguloRotacion = 0;
		}*/ 
        linea1.setRotate(anguloRotacion);
        linea2.setRotate(anguloRotacion);
        linea3.setRotate(anguloRotacion);

        
        //Cambio de color de las líneas. Genero un color aleatorio, y cambio el stroke.
        Color colorAleatorio = Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256));
        linea1.setStroke(colorAleatorio);
        colorAleatorio = Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256));
        linea2.setStroke(colorAleatorio);
        colorAleatorio = Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256));
        linea3.setStroke(colorAleatorio);
        
    }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		System.out.println("Inicializo FigurasController");
	}


}
