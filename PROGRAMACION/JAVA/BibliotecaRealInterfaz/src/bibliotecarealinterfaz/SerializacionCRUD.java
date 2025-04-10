/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecarealinterfaz;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tomaa
 */

public class SerializacionCRUD implements Serializable {
    Libros libro = new Libros();
    private String ruta = "biblioteca.dat";
    public void guardarEnArchivo(){
        try {
            ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream(ruta));
            ois.writeObject(libro);
        } catch (IOException ex) {
            Logger.getLogger(SerializacionCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
