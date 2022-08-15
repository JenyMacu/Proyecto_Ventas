
package Proyecto_ventas;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class vendedor extends JFrame {
    
      JTabbedPane pestañas = new JTabbedPane();
        
    private void inicio(){
        setTitle("Ventas");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setBounds(50, 175, 900, 700);
        setVisible(true);
        
        Nueva_venta nv = new Nueva_venta();
        nv.ejecutar();
        ventas_realizadas vr = new ventas_realizadas();
        vr.ejecutar();
        
               
        pestañas.addTab("Nueva venta", nv.general);
        pestañas.addTab("Productos", vr.ventas_general);
        
        add(pestañas);
        
    }
    
    public void ejecutar(){
        inicio();
    }
    public static void main(String[] args) {
        vendedor v = new vendedor();
        v.inicio();
    }
}
