/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tomaa
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // prueba juego dragon ball original
        /*
        Namekiano namekiano = new Namekiano();
        String textField4;

        Scanner sn = new Scanner(System.in);
        ArrayList<String> Amigos = new ArrayList<>();
        textField4 = sn.nextLine();
        if (!textField4.equals("") || !textField4.contains(null)) {
            String amigoSeparado = "";

            for (int i = 0; i < textField4.length(); i++) {
               
                if (amigoSeparado.contains(" ")) {
                    
                    Amigos.add(amigoSeparado);
                    namekiano.setAmigos(Amigos);
                    amigoSeparado = "";
                    
                    
                }
                amigoSeparado = amigoSeparado + textField4.charAt(i);

            }
            Amigos.add(amigoSeparado);
            namekiano.setAmigos(Amigos);
                    
            System.out.println(namekiano.amigos.size());
            for (String amigo : namekiano.amigos) {
                System.out.print(amigo + " ");
            }
            
        }*/

        //conteo de letras
        String[] letras = {"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ",
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ",
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ",
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ",
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa "};
        int letrasnum=0;
        int contador=0;
        for (int i = 0; i < letras.length; i++) {
            for (int j = 0; j < letras[i].length(); j++) {
                if (String.valueOf(letras[i].charAt(j)).equals("a")) {
                    contador++;
                }
 
            }
            System.out.println(contador);
            contador=0;
            }
            
        }

    }


