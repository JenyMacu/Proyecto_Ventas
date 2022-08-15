
package Proyecto_ventas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class ClientesDAO {
    
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
    String nombres [];
    
    public String[] filtro_vendedor(String nombre, int nit, String correo, String genero){
           
     String sql = "select * from clientes where nombre = '" + nombre + "'" + " or nit = " + "'" + nit + "'" + " or correo = " + "'" + correo + "'" + " or genero = " + "'" + genero + "'" + ";";
     try {
          con = conectar.Conectar();
          ps = con.prepareStatement(sql);
          rs = ps.executeQuery();
          int x = 0;
          
          while(rs.next()){
              x++;
          }        
          con = conectar.Conectar();
          ps = con.prepareStatement(sql);
          rs = ps.executeQuery();
          nombres = new String[x];
          x=0;
          
          while(rs.next()){
              nombres[x]=rs.getString(2); 
              x++;
          }
     }catch(Exception e){
         
     }
        return nombres;
     
    }
    
    public void crear_cliente(int codigo, String nombre, int nit, String correo,String genero){
       String sql = "insert into clientes(codigo, nombre, nit, correo,genero) values (?,?,?,?,?)";
       
       try{
          con = conectar.Conectar();
          ps = con.prepareStatement(sql);
          
          ps.setInt(1, codigo);
          ps.setString(2, nombre);
          ps.setInt(3, nit);
          ps.setString(4, correo);
          ps.setString(5, genero);
          ps.executeUpdate();
          
       }catch(Exception e){
           System.out.println(e);
       }
   }
    
    public int filtro_nit(String nombre) {

        String sql = "select * from clientes where nombre = '" + nombre + "'" +" ;";
        try {
            con = conectar.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                return rs.getInt(3);
            }

        } catch (Exception e) {

        }

        return 0;
    }
    
     public void crear(int codigo, String nombre, int nit, String correo, String genero){
        String sql = "insert into clientes(Codigo,Nombre,NIT,Correo,Genero) values (?,?,?,?,?)";
        try{
            con = conectar.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.setString(2, nombre);
            ps.setInt(3, nit);
            ps.setString(4, correo);
            ps.setString(5,genero);
            ps.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
        }
     }
    
    
    public static void main(String[] args) {
        ClientesDAO cd = new ClientesDAO();
        //cd.crear1(77, "Jeny", 124536,"jmacu@gmail.com", "f");
        //cd.filtro_vendedor(null, 0, null, "f");
        //cd.crear_cliente(100, "Aracely", 124536, "aracely@gmail.com", "m");
    }
    
    
    
    
}
