package Proyecto_ventas;
import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    
    Connection con;
    
    String url="jdbc:mysql://localhost:3306/sistema_ventas";
    String user= "root";
    String pass="";
    
    public Connection Conectar(){
    try
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection(url,user,pass);
       // System.out.println("Finalizado");//Mensaje para saber que hubo conexión
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    return con;
    }
    
}

