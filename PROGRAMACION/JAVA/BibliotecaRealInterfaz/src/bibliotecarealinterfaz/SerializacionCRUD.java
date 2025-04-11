/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecarealinterfaz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tomaa
 */
public class SerializacionCRUD {

    ArrayList<Libros> libros = new ArrayList<>();
    private final String ruta = "biblioteca.dat";

    public SerializacionCRUD() {
        cargarLibro();

    }
    public void agregarLibro(Libros nuevoLibro) {
        System.out.println("libro con isbn: " + nuevoLibro.getISBN());
    libros.add(nuevoLibro);
    guardarEnArchivo();
}

    public void guardarEnArchivo() {

        try {
            ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream(ruta));
            ois.writeObject(libros);
            System.out.println("Se ha guardado el nuevo libro correctamente");

        } catch (IOException ex) {
            Logger.getLogger(SerializacionCRUD.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    /**
     *
     */
    private void cargarLibro() {
    File archivo = new File(ruta);
    if (archivo.exists() && archivo.length() > 0) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta))) {
            libros = (ArrayList<Libros>) ois.readObject();
            System.out.println("Se han cargado todos los libros. ArrayList actualizada, tamaño: " + libros.size());
            
            // Imprimir todos los ISBN de los libros cargados
            for (Libros libro : libros) {
                System.out.println("ISBN cargado: " + libro.getISBN());
            }
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(SerializacionCRUD.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al cargar libros. ArrayList inicializado vacío.");
            libros = new ArrayList<>();
        }
    } else {
        System.out.println("El archivo no existe o está vacío. Inicializando lista vacía.");
        libros = new ArrayList<>();
    }
}


    public Libros leerLibro(String isbn) {
        System.out.println("Buscando libro con ISBN: " + isbn); // Depuración
        for (Libros libro : libros) {
            System.out.println("Comprobando libro con ISBN: " + libro.getISBN()); // Depuración
            if (libro.getISBN().equals(isbn)) {
                System.out.println("Se ha encontrado el libro con ISBN: " + isbn); // Depuración
                return libro;
            }
        }
        System.out.println("No se encontró ningún libro con el ISBN: " + isbn); // Depuración
        return null;
    }
}
