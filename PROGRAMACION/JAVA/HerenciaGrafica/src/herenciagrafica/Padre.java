/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciagrafica;

/**
 *
 * @author tomaa
 */
public class Padre {
    private double dinero;
    private String apellido;
    
    public Padre(){
        
    }

    public Padre(double dinero, String apellido) {
        this.dinero = dinero;
        this.apellido = apellido;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
}
