/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crud;


/**
 *
 * @author tomaa
 */
public class CRUD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Crear crear = new Crear();
        sn sn = new sn();
        boolean bucle=false;
        int opcion = 0;
        System.out.println("BIENVENIDOS A LA MAYOR BASES DE DATOS CREADA DEL MUNDO");
        while (bucle==false) {
            
            System.out.println("//////////////////////////////////");
            System.out.println("1.¿Por que se ha creado este proyecto?/EXPLICAION PROYECTO" + "\n");
            System.out.println("2.Agregar contenido" + "\n");
            System.out.println("3.Leer contenido" + "\n");
            System.out.println("4.Modificar contenido" + "\n");
            System.out.println("5.Borrar contenido" + "\n");
            System.out.println("6.Salir");
            System.out.println("//////////////////////////////////");
            System.out.println("");

            do {
                opcion = sn.integer();
                
                if (opcion <= 0 || opcion > 6) {
                    System.out.println("Ingresa un valor valido, entre 1 y 6");
                }
            } while (opcion <= 0 || opcion > 6);

            switch (opcion) {
                case 1 -> {
                    System.out.println("");
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("La creacion de este proyecto es entender como crear un proyecto CRUD. Crear, leer, modificar y eliminar");
                    System.out.println("");
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("La opcion de '2.Agregar contenido' es para crear la tabla de las bases de datos.");
                    System.out.println("Esta opcion es algo larga, teniendo que crear la cantidad de objetos y de datos");
                    System.out.println("Seguidamente deberás asignar el nombre de cada objeto y datos, aunque hay una opcion automatica si no se desea nada en especial");
                    System.out.println("Al haber seleccionado los nombres, podras ingresar los valores de cada dato, de cada objeto");
                    System.out.println("Como ultimo, al haber terminado la tabla, no podrás ingresar mas valores hasta que borres la misma");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("La opcion '3.Leer contenido' es para leer la tabla  que has creado, bien diferenciada por objetos");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("La opcion '4.Modificar Contenido' te dará la posibilidad de modificar cualquier parametro de la base de datos.");
                    System.out.println("Teniendo que especificar la posicion en la que se encuentra ese dato dentro del rango establecido que se mencionará automáticamente");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("La opcion '5.Borrar contenido' elimina la tabla que has creado para que puedas comenzar una nueva");
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("");
                }
                case 2 -> {
                    crear.Creado();
                }
                case 3 -> {
                    crear.leido();
                }
                case 4 -> {
                    crear.modificado();
                }
                case 5 -> {
                    crear.borrar();
                }
                default -> {
                    bucle=true;
                }

            }
        }
    }

}
