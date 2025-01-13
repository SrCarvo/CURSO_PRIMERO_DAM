/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author tomaa
 */
public class Ejercicios {

    static Scanner sn = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        decimalBinario();

    }

    public static int Fizz_Buzz() {
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " es FIZZ");
            }
            if (i % 5 == 0) {
                System.out.println(i + " es BUZZ");
            }
            if ((i % 5 == 0) && (i % 3 == 0)) {
                System.out.println(i + " es FIZZ BUZZ");
            }

        }
        return 0;

    }

    public static void Anagrama() {
        System.out.println("Ingrese la primera palabra");
        String palabra1 = sn.nextLine().toLowerCase();
        System.out.println("Ingrese la segunda palabra");
        String palabra2 = sn.nextLine().toLowerCase();

        if (palabra1.equals(palabra2)) {
            System.out.println("No es anagrama");
            return;
        }

        if (palabra1.length() != palabra2.length()) {
            System.out.println("No es anagrama");
            return;
        }

        for (int i = 0; i < palabra1.length(); i++) {
            char letra = palabra1.charAt(i);

            // Si no encontramos la letra en palabra2, no es un anagrama
            if (palabra2.indexOf(letra) == -1) {
                System.out.println("No es anagrama");
                return;
            }

            // Eliminar la letra encontrada de palabra2
            palabra2 = palabra2.replaceFirst(String.valueOf(letra), "");
        }

        // Si todas las letras coinciden, es un anagrama
        System.out.println("Es anagrama");
    }

    public static int Fibonacci() {
        int a;
        int b = 0;
        int contenedor = 1;
        /*creamos 3 variables, compuestas por dos dinamicas y una termporal.
        La variable dinamica "a", almacena la informacion de b, definida como 0 en el primer bucle.
        La variable dinamica "b" almacena la informacion de contenedir, definida como 1
        La variable temporal contenedor es la suma de las dos variables dinámicas*/

        for (int i = 0; i < 51; i++) {

            a = b;
            b = contenedor;
            contenedor = a + b;
            System.out.println(a + " + " + b + " = " + contenedor);

        }
        return 0;
    }

    public static int Primo() {
        int numero;
        System.out.println("Ingrese un numero");
        numero = sn.nextInt();
        esPrimo(numero);
        return 0;

    }

    public static int esPrimo(int numero) {
        int contador = 0;
        for (int i = 2; i <= numero; i++) {
            if (numero % i == 0) {
                contador++;
            }
            if (contador > 1) {
                break;
            }
        }

        if (contador == 1) {
            System.out.println("Es primo");
        } else if (contador > 1 || contador < 1) {
            System.out.println("No es primo");
        }
        return numero;
    }

    public static int Area() {
        String respuesta = "";

        System.out.println("Indicame que poligonos te interesa calcular");
        System.out.println("Solo puedo calcular un triangulo, cuadrado o rectangulo a la vez");
        boolean respuestaCorrecta = false;
        do {
            String contenedor = sn.nextLine();
            //esto hacinedo una revision antes de darle el valor a  la variable respuesta

            if (contenedor.equalsIgnoreCase("triangulo") || contenedor.equalsIgnoreCase("cuadrado") || contenedor.equalsIgnoreCase("rectangulo")) {
                respuesta = String.valueOf(contenedor);
                respuestaCorrecta = true;
            } else {
                System.out.println("Tienes que escribir triangulo, cuadrado o rectangulo");
            }

        } while (respuestaCorrecta == false);
        CalcularArea(respuesta);

        return 0;

    }

    public static void CalcularArea(String respuesta) {
        double num1;
        double num2;
        double area = 0;
        switch (respuesta) {
            case "triangulo" -> {
                System.out.println("Triangulo");
                System.out.println("¿Cuanto mide la base del " + respuesta + "?");
                num1 = sn.nextDouble();
                System.out.println("¿Cuanto mide la altura de " + respuesta + "?");
                num2 = sn.nextDouble();
                area = (0.5) * num1 * num2;
                System.out.println("El area del " + respuesta + " es de " + area);
            }
            case "cuadrado" -> {
                System.out.println("Dime cuanto mide uno de los lados del " + respuesta);
                num1 = sn.nextDouble();
                area = num1 * num1;
                System.out.println("El area del " + respuesta + " es de " + area);
            }
            case "rectangulo" -> {
                System.out.println("rectangulo");
                System.out.println("Dime cuando mide la longitus del " + respuesta);
                num1 = sn.nextDouble();
                System.out.println("Ahora dime cuando mide su ancho");
                num2 = sn.nextDouble();
                area = num1 * num2;
                System.out.println("El area del " + respuesta + " es de " + area);
            }
        }

    }

    public static void invirtiendoCadenas() {
        String frase;

        System.out.println("Ingresa el texto que quiero que te invierta");
        frase = sn.nextLine();

        invirtiendoCadenasResultado(frase);
    }

    public static void invirtiendoCadenasResultado(String frase) {
        String fraseInvertida = "";

        for (int i = frase.length() - 1; i >= 0; i--) {
            fraseInvertida = fraseInvertida + (String.valueOf(frase.charAt(i)));
        }
        System.out.println(fraseInvertida);

    }

    public static void contarPalabras() {
        String frase;
        char letra;
        System.out.println("Escribe una frase");
        frase = sn.nextLine();
        System.out.println("Escribe la letra a buscar");

        while (sn.hasNextInt()) {
            System.out.println("No puedo buscar valores numericos.");
            sn.next().charAt(0);
        }
        letra = sn.next().charAt(0);
        contarLetra(letra, frase);

    }

    public static char contarLetra(char letra, String frase) {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (letra == frase.charAt(i)) {
                contador++;
            }
        }
        System.out.println("Esta frase contiene la letra " + letra + ", " + contador + " veces.");

        return 0;

    }

    public static void decimalBinario() {
        int numero;
        System.out.println("Ingresa el numero que desees cambiar a binario");
        numero = sn.nextInt();
        binario(numero);

    }

    public static int binario(int numero) {
        String binario="";
        String binarioNuevo="";
        if (numero==0||numero==1) {
            System.out.println(numero);
            return numero;
        }
        for (int i = numero; numero/2>=0; i++) {
            
            binario=binario + (numero%2);
            numero=numero/2;
            if (numero==1) {
                binario=binario + ("1");
                break;
            }
        }
        for (int i = binario.length()-1; i >= 0; i--) {
            binarioNuevo=binarioNuevo+String.valueOf(binario.charAt(i));
        }
        System.out.println(binarioNuevo);
        

      return 0;  
    }

}
