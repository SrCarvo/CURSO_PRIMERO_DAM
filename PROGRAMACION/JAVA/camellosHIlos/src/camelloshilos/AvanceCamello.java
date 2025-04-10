package camelloshilos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Random;
import javax.swing.JLabel;

/**
 *
 * @author Usuario
 */
public class AvanceCamello {
    Random aleatorio = new Random();
    String nombre;

    public AvanceCamello() {
    }

    public AvanceCamello(String nombre) {
        this.nombre = nombre;
    }
    
    
    public void mover_camello (JLabel L) throws InterruptedException{
        
        int coordenada_y = L.getY();
        int coordenada_x = L.getX();
        
        int valor = aleatorio.nextInt(100);
        
        for (int i = coordenada_x; coordenada_x+valor<1070; i+=valor) {
            valor = aleatorio.nextInt(100);
            coordenada_x= L.getX();
            L.setLocation(coordenada_x+valor,coordenada_y);
            Thread.currentThread().sleep(100);
            
        }
        
        
    }
    
    
    
}