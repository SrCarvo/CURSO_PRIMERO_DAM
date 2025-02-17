package abstracto;

/**
 *
 * @author Arghi
 */
public class Clase_Hija extends Clase_Abstracta {
    
    public float precio = 123.45F;
    
    @Override
   public int DoblarNumero(){
       numero = numero*2;
       return numero;
   }
    
   public void nuevo_precio(float precio){
       this.precio = precio;
   }
}