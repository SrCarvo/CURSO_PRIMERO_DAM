/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toma.andrei.adelin;

import java.util.Scanner;

/**
 *
 * @author tomaa
 */
public class Animales {
    //aqui estoy creando las arrays privadas, para luego introducirlas enlos metodos y llamarlos en el main directamente, ya que contienen todo el resultado

    private int maxAnimales;
    private String[] id;
    private String[] nombre;
    private int[] peso;
    private String[] dueño;
    private int memoria;
    Scanner sn = new Scanner(System.in);

    public Animales() {
        //aqui un constructor vacio
        maxAnimales = 4;
        id = new String[maxAnimales];
        nombre = new String[maxAnimales];
        peso = new int[maxAnimales];
        dueño = new String[maxAnimales];
        memoria = 0;
    }
//aqui estan los diferentes getters y setter, para obtener o modificar variables privadas, que en mi caso no me han servido

    public int getMaxAnimales() {
        return maxAnimales;
    }

    public String[] getId() {
        return id;
    }

    public String[] getNombre() {
        return nombre;
    }

    public int[] getPeso() {
        return peso;
    }

    public String[] getDueño() {
        return dueño;
    }

    public void setMaxAnimales(int maxAnimales) {
        this.maxAnimales = maxAnimales;
    }

    public void setId(String[] id) {
        this.id = id;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public void setPeso(int[] peso) {
        this.peso = peso;
    }

    public void setDueño(String[] dueño) {
        this.dueño = dueño;
    }

    public void guardarAnimales() {
        //este for es para ir metiendo los datos de los animales con paso de 1 y como maximo hasta la capacidad maxima de las arrays (maxAnimales)
        for (int i = memoria; i < maxAnimales + 1; i++) {
            //este if esta para no sobreescribir la base, que lo he dejado asi intencionadamente para visen que la memoria funciona correctamente
            if (memoria == maxAnimales) {
                System.out.println("Has agregado el numero maximo de animales");
                break;
            }
            int contador = i + 1;
            String seguir;
            System.out.println("Agrege el ID del animal nº " + contador);

            id[i] = sn.nextLine();
            System.out.println("Agrege el nombre del animal nº " + contador);

            while (sn.hasNextInt()) {
                System.out.println("Valor inválido, el nombre no puedo solo contener numeros");
                sn.nextLine();
            }
            nombre[i] = sn.nextLine();

            System.out.println("Agrege el peso del animal nº " + contador);

            while (!sn.hasNextInt()) {
                System.out.println("Valor inválido, el peso solo puede contener valores numericos");
                sn.nextLine();
            }
            peso[i] = sn.nextInt();
            sn.nextLine();//elimina buffer que ha quedado del nextInt()
            memoria++;
            if (i > 2) {
                System.out.println("Agrege el dueño del animal nº " + contador);
                dueño[i] = sn.nextLine();

                break;
            }
            if (i <= 2) {
                //una opcion interesante con memoria para poder salir cuando se necesite y poder volver desde donde lo has dejado (la siguiente a la ultima que has introducido)
                System.out.println("¿Quiere seguir introduciendo animales?");
                seguir = sn.nextLine();
                if (seguir.equalsIgnoreCase("Sí")) {
                }
                if (seguir.equalsIgnoreCase("No")) {
                    break;
                }
            }
        }
    }

    public void visualizarAnimales() {
        //menú guay
        int opcion;
        System.out.println("");
        System.out.println("------------VISUALIZADOR DE ANIMALES 3000------------");
        System.out.println("1.-Ver todos los animales");
        System.out.println("2.-Ver solo un animal por ID");
        System.out.println("");
        //el do hace iniciar la parte del codigo que tiene dentro y luego lo pasa por el while, para comprobar si se selecciona los numeros deseados o no
        do {
            opcion = sn.nextInt();
            if (opcion < 1 || opcion > 2) {
                System.out.println("Valor invalido, seleccione una opcion entre los valores 1 y 2");
            }
        } while (opcion < 1 || opcion > 2);
        //vista completa de todos los animales
        if (opcion == 1) {
            for (int i = 0; i < maxAnimales; i++) {
                int posicion = i + 1;
                System.out.println("");
                System.out.println("ID DEL ANIMAL " + posicion + ": " + id[i]);
                System.out.println("NOMBRE DEL ANIMAL " + posicion + ": " + nombre[i]);
                System.out.println("PESO DEL ANIMAL " + posicion + ": " + peso[i]);
                if (i > 2 && !dueño.equals("")) {
                    System.out.println("DUEÑO DEL ANIMAL " + posicion + ": " + dueño[i]);
                    System.out.println("------------------------------------------------");
                }
            }
        }
        //vista por id del animal
        if (opcion == 2) {
            int opcion2;

            System.out.println("¿Que animal quiere ver?. Asegurese de que el ID este escrito correctamente");
            opcion2 = sn.nextInt();
            for (int i = 0; i < maxAnimales; i++) {
                if (id[i].contains(String.valueOf(opcion2))) {
                    int posicion2 = i + 1;
                    System.out.println("");
                    System.out.println("ID DEL ANIMAL " + posicion2 + ": " + id[i]);
                    System.out.println("NOMBRE DEL ANIMAL " + posicion2 + ": " + nombre[i]);
                    System.out.println("PESO DEL ANIMAL " + posicion2 + ": " + peso[i]);
                    if (i > 2 && !dueño.equals("")) {
                        System.out.println("DUEÑO DEL ANIMAL " + posicion2 + ": " + dueño[i]);
                        System.out.println("------------------------------------------------");
                        System.out.println("--------------------------------------------------------");
                    }

                }

            }

        }
    }

    //un facil metodo que simplemente comprueba si un animal pesa mas de 20 kg o no, y si este tiene un peso superior lo muestra en pantalla
    public void pesoMayor() {
        for (int i = 0; i < maxAnimales; i++) {
            if (peso[i] > 20) {
                System.out.println("El animal con id " + id[i] + "tiene un peso de " + peso[i] + " kg.");
            }
        }
    }
}
