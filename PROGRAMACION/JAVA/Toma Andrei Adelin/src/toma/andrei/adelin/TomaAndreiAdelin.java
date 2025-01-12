/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package toma.andrei.adelin;

import java.util.Scanner;

/**
 *
 * @author tomaa
 */
public class TomaAndreiAdelin {

    static Scanner sn = new Scanner(System.in);
    static Animales animales = new Animales();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // vOY A PRESCINDIR DE LAS TILDES DEBIDO AL ERROR DE LECTURA QUE ESTE PRESENTA
        int opcion = 0;
        int opcionArgumentos;
        System.out.println("Necesito que me ingreses un numero, y al hacerlo, cuando salgas del menu... ¡¡te llevaras una sorpresa!!");
        opcionArgumentos = sn.nextInt();
        args[2] = String.valueOf(opcionArgumentos);

        while (opcion < 4) {

            //aqui es el menú, que es interactivo gracias al switch de dabjo, luego tambien es repetitivo gracias al while (opcion)
            System.out.println("");
            System.out.println("---------MENU ANDREI---------");
            System.out.println("1.- DAR DE ALTA ANIMALES");
            System.out.println("2.- VISUALIZAR ANIMALES");
            System.out.println("3.- PESO ANIMAL MAYOR A 20KG");
            System.out.println("4.- SALIR");
            System.out.println("-----------------------------");
            System.out.println("");

            while (!sn.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, ingresa un número:");
                sn.nextLine();
            }

            do {
                opcion = sn.nextInt();
                if (opcion < 1 || opcion > 4) {
                    System.out.println("Entrada inválida. Por favor, ingresa un número válido");
                }
            } while (opcion < 1 || opcion > 4);

            switch (opcion) {

                case 1 -> {
                    //aqui estoy llamando a guardarAnimales gracias al objeto Animales animales
                    animales.guardarAnimales();
                }
                case 2 -> {
                    //aqui estoy llamando a visualizarAnimales gracias al objeto Animales animales
                    animales.visualizarAnimales();
                }
                case 3 -> {
                    //aqui estoy llamando a pesoMayor gracias al objeto Animales animales
                    animales.pesoMayor();

                }
                case 4 -> {
                    //la opcion de salir
                    System.out.println("Saliendo... HASTA LUEGO!");
                    for (int i = 0; i <= Integer.parseInt(args[2]); i++) {
                        System.out.println(args[0] + " " + args[1]);
                    }
                }
            }
        }

    }

}
