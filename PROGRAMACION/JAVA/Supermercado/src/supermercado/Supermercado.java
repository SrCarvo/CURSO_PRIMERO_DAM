/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package supermercado;

import javafx.application.Application;

import javafx.stage.Stage;

/**
 *
 * @author tomaa
 */
public class Supermercado extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        UI ui = new UI();
        ui.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
