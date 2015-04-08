
package coneccionoracle;

/**
 *
 * @author alumno04
 */
public class ConexionOracle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        if (Coneccion.conectar() ==null) {
            
            System.out.println("La coneccion falló!!!.");
        } else {
            System.out.println("La coneccion fue Exitosa :)");
        }
  
    }
    
}
