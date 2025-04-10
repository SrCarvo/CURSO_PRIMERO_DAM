/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progressbar;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author tomaa
 */
public class progressThread extends Thread {

    Random aleatorio = new Random();
    String nombre;
    JProgressBar P;

    public progressThread() {
    }

    public progressThread(String nombre, JProgressBar P) {
        this.nombre = nombre;
        this.P=P;
    }

    @Override
    public void run() {
        
        
        int valor; //valores entre 0 y 100
        boolean valor2;
        do {
            valor = aleatorio.nextInt(5);
            valor2 = aleatorio.nextBoolean();
            if (valor2) {
                P.setValue(P.getValue()+valor);
            }
            else{
                 P.setValue(P.getValue()-valor);       
            }
            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(progressThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (valor <= 100);
        
            
            
        }
        
    }
