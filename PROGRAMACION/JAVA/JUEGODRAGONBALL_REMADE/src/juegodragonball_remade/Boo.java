
package juegodragonball_remade;

import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author tomaa
 */
public class Boo extends Personaje {
    
    boolean regeneracion;
    String convertir = "Galleta";
    
    public Boo () {}

    public boolean isRegeneracion() {
        return regeneracion;
    }

    public void setRegeneracion(boolean regeneracion) {
        this.regeneracion = regeneracion;
    }

    public String getConvertir() {
        return convertir;
    }

    public String convertido(){
        
        if (regeneracion) {
             return "Te he convertido en " + this.convertir;
        }
        else{
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(Boo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return "No te he convertido en nada";
        }
        
    }

    public void setConvertir(String convertir) {
        this.convertir = convertir;
    }
    
    
}
