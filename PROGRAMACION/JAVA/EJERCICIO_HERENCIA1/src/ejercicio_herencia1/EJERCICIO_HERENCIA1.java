/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_herencia1;

import java.util.ArrayList;

/**
 *
 * @author tomaa
 */
public class EJERCICIO_HERENCIA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Perro());
        animales.add(new Gato());
        
        for (Animal animal : animales) {
            animal.hacerSonido();
        }
        // TODO code application logic here
    }
    
    
}

