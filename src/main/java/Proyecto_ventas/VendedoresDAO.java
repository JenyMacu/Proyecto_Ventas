
package Proyecto_ventas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class VendedoresDAO {
   PreparedStatement ps;
   ResultSet rs;
   Connection con;   
   Conexion conectar = new Conexion();
   
   public int filtro (String nombre, String contra){
       String sql="select * from vendedor where nombre =" + "'" + nombre +"'"+ "and password=" + "'"+contra+"'"+";";
       try{
           con = conectar.Conectar();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           
         if( rs.next()) {
            
             return rs.getInt(7);
            //System.out.println(rs.getInt(1)+"");
           //System.out.println(rs.getString(2)+"");
       }
       }catch(Exception e){
           
       }
       return -1;
   }
   
   /* public static void main(String[] args) {
        VendedoresDAO dv = new VendedoresDAO();
        dv.filtro("Javier Castillo", "123456");
        
    }
*/
}
