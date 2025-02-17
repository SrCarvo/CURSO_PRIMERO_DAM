package crud;

public class Crear {

    sn sn = new sn();
    int dato; // Cantidad de objetos
    int cantidadDatos; // Cantidad de datos por objeto
    boolean creado = false; // Verifica si ya se creó
    int cantidadNombres; // Opción de creación de nombres (manual o automática)
    String[] datos;
    String[][] nombres;
    int datosmax;

    public void Creado() {
        System.out.println("");
        System.out.println("--------------------------------------------------------------------------------------");
        if (!creado) { // Solo se crea si no está creado
            System.out.println("Cuántos objetos vas a querer crear?");
            System.out.println("");
            do {
                dato = sn.integer();
                if (dato == 0) {
                    System.out.println("Ese no es un valor válido!");
                    System.out.println("");
                }
            } while (dato == 0);
            System.out.println("");
            System.out.println("Perfecto, ahora dime cuántos datos vas a meter a cada objeto (id, nombre, etc.):");
            System.out.println("");
            cantidadDatos = sn.integer();

            // Inicializar los arreglos
            datosmax = (cantidadDatos * dato);
            datos = new String[(datosmax)];
            nombres = new String[dato + 1][cantidadDatos + 1];

            System.out.println("");
            System.out.println("Si deseas asignar los nombres manualmente, pulsa 0. Si quieres que se creen automáticamente, pulsa 1:");
            System.out.println("");

            do {
                cantidadNombres = sn.integer();
                if (cantidadNombres != 0 && cantidadNombres != 1) {
                    System.out.println("Valor inválido, selecciona 0 o 1.");
                    System.out.println("");
                }
            } while (cantidadNombres != 0 && cantidadNombres != 1);

            if (cantidadNombres == 0) { // Manual
                for (int i = 0; i < dato; i++) {
                    // Asignar el nombre del objeto
                    System.out.println("--------------------------------------------------------------------------------------");
                    System.out.println("");
                    System.out.println("Introduce el nombre del objeto número " + (i + 1) + ":");
                    System.out.println("");
                    nombres[i][0] = sn.string();

                    // Asignar los datos del objeto
                    for (int j = 1; j <= cantidadDatos; j++) { // Empieza en 1
                        System.out.println("");
                        System.out.println("Introduce el nombre del dato número " + j + " del objeto " + nombres[i][0] + ":");
                        System.out.println("");
                        nombres[i][j] = sn.string();
                    }
                }
                System.out.println("");
                System.out.println("--------------------------------------------------------------------------------------");
            } else { // Automático
                for (int i = 0; i < dato; i++) {
                    nombres[i][0] = "Objeto_" + (i + 1);
                    for (int j = 1; j <= cantidadDatos; j++) {
                        nombres[i][j] = "Dato_" + j;
                    }
                }
            }
            int b = 1;
            int c = 1;

            System.out.println("Perfecto, vamos a introducir los valores de cada dato");
            System.out.println("");
            System.out.println("--------------------------------------------------------------------------------------");
            for (int i = 0; i < datos.length; i++) {

                System.out.println("Ingresa el dato " + nombres[c-1][b] + " de " + nombres[c - 1][0]);
                datos[i] = sn.string();

                if (String.valueOf(cantidadDatos).equals(String.valueOf(b))) {
                    b = 0;
                    c++;
                    System.out.println("--------------------------------------------------------------------------------------");
                    System.out.println("");
                }
                b++;
            }
            creado = true;

        } else {
            System.out.println("");
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.println("La estructura de la base ya ha sido ingresada");
            System.out.println("");
            System.out.println("--------------------------------------------------------------------------------------");
        }
    }

    public void leido() {
        int cuenteo = 0;

        System.out.println("Objetos creados con sus datos:");
        for (int i = 0; i < dato; i++) {
            System.out.println("");
            System.out.println("--------------------------------------------------------------------------------------");

            System.out.print("Nombre del objeto: " + nombres[i][0] + "->");
            System.out.print(" Datos: ");
            for (int j = 1; j <= cantidadDatos; j++) {
                cuenteo = cuenteo + 1;
                System.out.print( nombres[i][j] + ": ");
                System.out.print(datos[cuenteo - 1] + " | ");

            }
            System.out.println("");
            System.out.println("--------------------------------------------------------------------------------------");

        }
        System.out.println("");

    }

    public void modificado() {
        int opcion;
        int posicion;
        int posicion1;

        System.out.println("Pulsa 0 si quieres modificar un objeto, 1 si quieres modificar un dato y 2 si quieres modificar un valor y 3 si quieres salir");
        opcion = sn.integer();
        switch (opcion) {
            case 0 -> {
                System.out.println("Cual de los " + dato + " objetos quieres modificar?. Elige del 1 al " + dato);
                do {
                    posicion = sn.integer();
                    if (posicion < 1 || posicion > dato) {
                        System.out.println("Posicion invalida, tienes que escoger una posicion del 1 al " + dato);
                    }

                } while (posicion < 1 || posicion > dato);
                System.out.println("Ingresa el nuevo objeto");
                nombres[posicion - 1][0] = sn.string();
            }
            case 1 -> {
                System.out.println("Cual de los " + dato + " objetos quieres modificar?. Elige del 1 al " + dato);
                do {
                    posicion = sn.integer();
                    if (posicion < 1 || posicion > dato) {
                        System.out.println("Posicion invalida, tienes que escoger una posicion del 1 al " + dato);
                    }

                } while (posicion < 1 || posicion > dato);
                System.out.println("Cual de los " + cantidadDatos + " datos quieres modificar?. Elige del 1 al " + cantidadDatos);
                do {
                    posicion1 = sn.integer();
                    if (posicion1 < 1 || posicion1 > cantidadDatos) {
                        System.out.println("Posicion invalida, tienes que escoger una posicion del 1 al " + cantidadDatos);
                    }

                } while (posicion1 < 1 || posicion1 > cantidadDatos);
                System.out.println("Ingresa el nuevo dato");
                nombres[posicion - 1][posicion1] = sn.string();
            }

            case 2 -> {
                System.out.println("Cual de los " + dato + " objetos quieres modificar?. Elige del 1 al " + dato);
                do {
                    posicion = sn.integer();
                    if (posicion < 1 || posicion > dato) {
                        System.out.println("Posicion invalida, tienes que escoger una posicion del 1 al " + dato);
                    }

                } while (posicion < 1 || posicion > dato);
                System.out.println("Cual es el valor de los " + cantidadDatos + " datos que quieres modificar?. Elige del 1 al " + cantidadDatos);
                do {
                    posicion1 = sn.integer();
                    if (posicion1 < 1 || posicion1 > cantidadDatos) {
                        System.out.println("Posicion invalida, tienes que escoger una posicion del 1 al " + cantidadDatos);
                    }

                } while (posicion1 < 1 || posicion1 > cantidadDatos);
                System.out.println("Ingresa el nuevo valor");
                int indice = ((posicion - 1) * cantidadDatos) + (posicion1 - 1);
                datos[indice] = sn.string();
            }

            case 3 ->
                System.out.println("Saliendo...");

        }
    }

    public void borrar() {
        datosmax = 0;
        dato = 0;
        cantidadDatos = 0;
        cantidadNombres = 0;
        creado = false;

    }
}
