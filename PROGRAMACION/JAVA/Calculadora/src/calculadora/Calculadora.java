/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package calculadora;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author tomaa
 */
public class Calculadora extends Application {
    
    @Override
    public void start(Stage primaryStage) {
    }
    public static void main(String[] args) {
        
    new CalculadoraUI().setVisible(true);
    
}
    
}
