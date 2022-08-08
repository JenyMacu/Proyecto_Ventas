
package Proyecto_ventas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class SucursalesDAO {
    
   PreparedStatement ps;
   ResultSet rs;
   Connection con;
   Conexion conectar = new Conexion();
   Object datos [][];
   
   public Object[][] listar_tabla(){
       
       return datos;
   }
    
}
