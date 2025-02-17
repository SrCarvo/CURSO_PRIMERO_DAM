/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciapersonaje;

import java.util.ArrayList;

/**
 *
 * @author tomaa
 */
public class Namekiano extends Personaje {
    
    private boolean regeneracion = true;
    private ArrayList<String> Amigos = new ArrayList<>();
    
    public Namekiano(){}

    public boolean isRegeneracion() {
        return regeneracion;
    }

    public void setRegeneracion(boolean regeneracion) {
        this.regeneracion = regeneracion;
    }

    public ArrayList<String> getAmigos() {
        return Amigos;
    }

    public void setAmigos(ArrayList<String> Amigos) {
        this.Amigos = Amigos;
    }

   
    
}
