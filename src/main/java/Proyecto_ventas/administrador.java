
package Proyecto_ventas;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class administrador extends JFrame{
   
    JTabbedPane pestañas = new JTabbedPane();
        
    private void inicio(){
        setTitle("Administrador");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setBounds(50, 175, 900, 700);
        setVisible(true);
        
        sucursales_vistas sv = new sucursales_vistas();
        sv.ejecutar();
        productos_vistas pv = new productos_vistas();
        pv.ejecutar();
        clientes_vistas cv = new clientes_vistas();
        cv.ejecutar();
        vendedores_vistas vv = new vendedores_vistas();
        vv.ejecutar();
        
        pestañas.addTab("Sucursales", sv.sucursales);
        pestañas.addTab("Productos", pv.productos);
        pestañas.addTab("Clientes", cv.clientes);
        pestañas.addTab("Vendedores", vv.vendedores);
        
        add(pestañas);
        
    }
    
    public void ejecutar(){
        inicio();
    }
    
    public static void main(String[] args) {
        administrador ad = new administrador();
        ad.ejecutar();
    }
    
}
