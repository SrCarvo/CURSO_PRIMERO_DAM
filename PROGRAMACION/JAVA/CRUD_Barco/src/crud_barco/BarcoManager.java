/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud_barco;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tomaa
 */
public class BarcoManager {

/*creamos la ruta del archivoy el array donde se guardara los barcos*/
    private static final String ARCHIVO_BARCOS = "barcos.dat";
    private ArrayList<Barco> barcos;
    /*se inicializan*/
    public BarcoManager() {
        this.barcos = new ArrayList<>();
        cargarBarcos();
    }
    
    // añadimos un nuevo barco
    public boolean agregarBarco(Barco barco) {
    // Verificar si la MATRICULA ya existe
    if (buscarPorMatricula(barco.getMatrícula()) != null) {
        return false; // No se puede agregar un barco con MATRICULA duplicada
    }
    
    barcos.add(barco);
    guardarBarcos();
    return true;
}
    
    // Buscar libro por matricula
    public Barco buscarPorMatricula(String matricula){
    for (Barco barco : barcos) {
        if (barco.getMatrícula().equals(matricula)) {
            return barco;
        }
    }
    return null;
}
    /*Se elimina por matricula*/
    public boolean eliminarBarco(String matricula) {
    Barco barcoAEliminar= buscarPorMatricula(matricula);
    if (barcoAEliminar != null) {
        barcos.remove(barcoAEliminar); 
        guardarBarcos(); 
        System.out.println("Barco eliminado: " + barcoAEliminar.getNombre());
        System.out.println("Barcos restantes: " + barcos.size());
        return true;
    }
    return false;
}


    
    // Obtener todos los barcos
    public List<Barco> obtenerTodosLosBarcos() {
        return new ArrayList<>(barcos);
    }
    
    // Guardar barcos en archivo
    private void guardarBarcos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO_BARCOS))) {
            oos.writeObject(barcos);
           
        } catch (IOException e) {
            System.out.println("Error al guardar el barco: " + e.getMessage());
            /*curiosidad, el sout puede ser con .err tambien, que se refiere a errores*/
        }
    }
    
    // Cargar barcos desde archivo
    @SuppressWarnings("unchecked")
    private void cargarBarcos() {
        File archivo = new File(ARCHIVO_BARCOS);
        if (archivo.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARCHIVO_BARCOS))) {
                barcos = (ArrayList<Barco>) ois.readObject();
                System.out.println("Barco cargado exitosamente desde " + ARCHIVO_BARCOS);
            } catch (IOException | ClassNotFoundException e) {
                System.err.println("Error al cargar el barco " + e.getMessage());
                barcos = new ArrayList<>();
            }
        } else {
            System.out.println("No existe archivo el archivo. Se creará uno nuevo.");
            barcos = new ArrayList<>();
        }
    }
}
