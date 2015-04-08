
package coneccionoracle;

import java.sql.ResultSet;
import java.sql.Statement;


public class ConexionOracle {

    
    public static void main(String[] args) {
        
        if (Coneccion.conectar() ==null) {
            
            System.out.println("La coneccion falló!!!.");
        } 
        else {
            System.out.println("La coneccion fue Exitosa :)");
            try {
                 Statement st =Coneccion.conectar().createStatement();
                 ResultSet rs=st.executeQuery("SELECT * FROM persona");
                 while (rs.next()) {
                     System.out.println("ID:"+rs.getInt("IDPERSONA"));
                     System.out.println("1:"+rs.getString("NOMBRE"));
                     System.out.println("2:"+rs.getString("APELLIDO_PAT"));
                     System.out.println("3:"+rs.getString("APELLIDO_MAT"));
                     System.out.println("4:"+rs.getString("DNI"));
                    
                }
            } 
            catch (Exception e) {
                
            }
           
        }
  
    }
    
}
