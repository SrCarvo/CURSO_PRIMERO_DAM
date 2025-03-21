/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basesestudiantes;

/**
 *
 * @author tomaa
 */
public class Menu {
    ScannerImput sn = new ScannerImput();
    
    public void Menu(){
        int eleccionUsuario=1;
        while(eleccionUsuario<5 && eleccionUsuario>0){
            System.out.println("*1-Registrar estudiantes con nombre, edad y calificación.\n" +
"            *2-Mostrar todos los estudiantes registrados.\n" +
"            *3-Calcular y mostrar el promedio de calificaciones.\n" +
"            *4-Usar clases, métodos y encapsulación.*/");
            switch (sn.Int()){
                
                case 1->{
                    
                    System.out.println("Has elegido el numero 1");
                }
                    
                
            }
            
        }
    }
    
}
