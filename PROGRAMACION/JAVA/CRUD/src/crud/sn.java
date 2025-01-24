/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import java.util.Scanner;

/**
 *
 * @author tomaa
 */
public class sn {

    Scanner sn = new Scanner(System.in);

    public String string() {
        String respuesta = sn.nextLine();
        return respuesta;
    }

    public int integer() {

        String respuesta;

        do {
            respuesta = sn.nextLine();
            if (!respuesta.matches("^-?\\d+$")) {
                System.out.println("Valor invalido, seleccione un valor de 0 a 9");
            }
        }
         while (!respuesta.matches("^-?\\d+$"));
    int respuestaint;
    respuestaint  = Integer.parseInt(respuesta);
    return respuestaint ;
    }
   



    
}
