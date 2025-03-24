/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudbiblioteca;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaManager {
    private static final String ARCHIVO_BIBLIOTECA = "biblioteca.dat";
    private ArrayList<Libro> libros;
    
    public BibliotecaManager() {
        this.libros = new ArrayList<>();
        cargarLibros();
    }
    
    // Añadir un nuevo libro
    public boolean agregarLibro(Libro libro) {
    // Verificar si el ISBN ya existe
    if (buscarPorIsbn(libro.getIsbn()) != null) {
        return false; // No se puede agregar un libro con ISBN duplicado
    }
    
    libros.add(libro);
    guardarLibros();
    return true;
}
    
    // Buscar libro por ISBN
    public Libro buscarPorIsbn(String isbn) {
    for (Libro libro : libros) {
        if (libro.getIsbn().equals(isbn)) {
            return libro;
        }
    }
    return null;
}
    
    public boolean eliminarLibro(String isbn) {
    Libro libroAEliminar = buscarPorIsbn(isbn);
    if (libroAEliminar != null) {
        libros.remove(libroAEliminar); 
        guardarLibros(); 
        System.out.println("Libro eliminado: " + libroAEliminar.getTitulo());
        System.out.println("Libros restantes: " + libros.size());
        return true;
    }
    return false;
}

public boolean modificarLibro(String isbn, String categoria, String titulo, int precio, int numpag) {
    Libro libroAModificar = buscarPorIsbn(isbn);
    if (libroAModificar != null) {
        libroAModificar.setIsbn(isbn);
        libroAModificar.setTitulo(titulo);
        libroAModificar.setCategoria(categoria);
        libroAModificar.setPrecio(precio);
        libroAModificar.setNumPaginas(numpag);
        guardarLibros(); // Guardar cambios en archivo
        return true;
    }
    return false; // No se encontró el libro
}
    
    // Obtener todos los libros
    public List<Libro> obtenerTodosLosLibros() {
        return new ArrayList<>(libros);
    }
    
    // Guardar libros en archivo
    private void guardarLibros() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO_BIBLIOTECA))) {
            oos.writeObject(libros);
           
        } catch (IOException e) {
            System.err.println("Error al guardar la biblioteca: " + e.getMessage());
        }
    }
    
    // Cargar libros desde archivo
    @SuppressWarnings("unchecked")
    private void cargarLibros() {
        File archivo = new File(ARCHIVO_BIBLIOTECA);
        if (archivo.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARCHIVO_BIBLIOTECA))) {
                libros = (ArrayList<Libro>) ois.readObject();
                System.out.println("Biblioteca cargada exitosamente desde " + ARCHIVO_BIBLIOTECA);
            } catch (IOException | ClassNotFoundException e) {
                System.err.println("Error al cargar la biblioteca: " + e.getMessage());
                libros = new ArrayList<>();
            }
        } else {
            System.out.println("No existe archivo de biblioteca. Se creará uno nuevo.");
            libros = new ArrayList<>();
        }
    }
}