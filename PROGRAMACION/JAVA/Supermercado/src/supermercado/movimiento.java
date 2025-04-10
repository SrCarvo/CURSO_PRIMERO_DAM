/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercado;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author tomaa
 */
/*Crea un programa que simule un supermercado, con varias lineales de caja, cada lineal procesa varios carros de la compra
con un nºaleatorio de productos, cada producto tarda un tiempo diferente en procesdar, ademas tiene un precio diferente. Calcula
cuanto tiempo tarda cada cajero en procedsar cada carro y cuanto cuesta*/
public class movimiento extends Thread {

    Random aleatorio = new Random();
    JLabel L;
    JLabel fin;
    private long tiempoComienzo;
    private long tiempoFin;

    public movimiento() {
    }

    public movimiento(JLabel L, JLabel fin) {
        this.L = L;
        this.fin = fin;
    }

    @Override
    public void run() {
        int coordenadaFinY = fin.getY();
        int coordenadaComienzoY = L.getY();
        int coordenadaComienzoX = L.getX();
        int valor;
        tiempoComienzo = System.currentTimeMillis();
        for (int i = coordenadaComienzoY; coordenadaComienzoY > coordenadaFinY; i += valor) {
            valor = aleatorio.nextInt(15);
            coordenadaComienzoY = L.getY();
            L.setLocation(coordenadaComienzoX, coordenadaComienzoY - valor);
            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        tiempoFin = (System.currentTimeMillis() - tiempoComienzo) / 100;
    }

    public int numeroRandomEntero() {
        int numero = 1+aleatorio.nextInt(5);
        return numero;

    }

    public long gettiempoRequerido() {

        return tiempoFin;

    }
}
