/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudbiblioteca;

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
public class ArchivoObjeto {

    public ArchivoObjeto() {
    }

    // Método para escribir la lista completa en el archivo
    public void guardarArrayList(ArrayList<Libro> libros, String ruta) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta))) {
            oos.writeObject(libros);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Leer todas las personas del archivo
    public ArrayList<Libro> leerLibros(String ruta) {
        ArrayList<Libro> libros = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta))) {
            libros = (ArrayList<Libro>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return libros;
    }

    public String libroBuscado(String ruta, int ISBN) {

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta));
            Libro[] libros = (Libro[]) ois.readObject(); // Leer el array de libros

            // Buscar el libro por ISBN
            int i = 0;
            for (Libro libro : libros) {
               
                if (ISBN == (libro.getIsbn())) {
                    return String.valueOf(i);
                } i++;

            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();

        }
        return null;
    }
}
