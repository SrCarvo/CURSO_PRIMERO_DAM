/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstracto;

/**
 *
 * @author Arghi
 */
public abstract class Clase_Abstracta {
    
    private String texto;
    public int numero;
    
    public Clase_Abstracta(){
        
    }
    
    public String getTexto() {
        return texto;
    }
    
    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    public abstract int DoblarNumero();
}