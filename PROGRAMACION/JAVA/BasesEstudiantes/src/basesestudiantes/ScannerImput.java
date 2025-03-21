/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basesestudiantes;
import java.util.Scanner;
/**
 *
 * @author tomaa
 */
public class ScannerImput {
    Scanner sn = new Scanner(System.in);
    private String escrituraUsuario;
    private int numeroEnteroUsuario;
    private double numeroDecimalUsuario;
    
    
    
    public void String(){
        
        escrituraUsuario= sn.nextLine();
        
        
            
        
    }
    public int Int(){
        System.out.print("Ingrese un número entero: ");
        while (!sn.hasNextInt()) {
            System.out.println("Entrada inválida. Debe ser un número entero.");
            sn.next(); // Descarta la entrada incorrecta
        }
        numeroEnteroUsuario = sn.nextInt();
        sn.nextLine(); // Limpia el buffer
        return numeroEnteroUsuario;
    }
    public void Double(){
        
    }
}
