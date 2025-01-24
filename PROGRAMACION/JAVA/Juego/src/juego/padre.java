/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego;

/**
 *
 * @author tomaa
 */
public class padre {
    public String color_piel;
    public String color_ojos;
    public boolean magia;
    
    public padre(){}
    public void cargar_datos(String piel, String ojos, boolean magia){
        this.color_piel=piel;
        this.color_ojos=ojos;
        this.magia=magia;
    }
    public void comparacion(){
        String valor1 = "Java";
        String[] valor2 = {"J","a","v","a"};
        String valor3 = "";
        for (String valor : valor2) {
            valor3 = valor3+valor;
        }
        boolean b1 = (valor1 == valor3); //falso
        boolean b2 = (valor1.equals(valor3)); //verdadero
        System.out.println(b1+", "+b2);
    }
}
