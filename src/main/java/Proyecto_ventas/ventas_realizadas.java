
package Proyecto_ventas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;


public class ventas_realizadas {
    
    JPanel ventas_general = new JPanel();
    JTable tabla;
    JScrollPane sp;
    
    JTextField factura = new JTextField();
    JTextField nit = new JTextField();
    JTextField nombre = new JTextField();
    JTextField fecha = new JTextField();
    
   private void inicio(){
                
        JLabel l1 = new JLabel("No. Factura");
        l1.setBounds(140, 20, 75, 30);

        JLabel l2 = new JLabel("NIT");
        l2.setBounds(420, 20, 75, 30);

        JLabel l3 = new JLabel("Nombre");
        l3.setBounds(140, 100, 75, 30);

        JLabel l4 = new JLabel("Fecha");
        l4.setBounds(420, 100, 75, 30);

        factura.setBounds(225, 20, 160, 30);
        nit.setBounds(520, 20, 160, 30);

        nombre.setBounds(225, 100, 160, 30);
        fecha.setBounds(520, 100, 160, 30);

        JButton b1 = new JButton("Buscar");
        b1.setBounds(142, 180, 540, 30);
        
        ventas_general.add(l1);
        ventas_general.add(l2);
        ventas_general.add(l3);
        ventas_general.add(l4);

        ventas_general.add(factura);
        ventas_general.add(nit);
        ventas_general.add(nombre);
        ventas_general.add(fecha);
        
        ventas_general.add(b1);


    }
    
    private void tabla(){
        String columnas []= {"No_Factura","NIT","Nombre","Fecha","Total"};
        VentasDAO vd = new VentasDAO();
        
        Object filas [][] = vd.listar_tabla();
        
        tabla = new JTable(filas,columnas);
        sp = new JScrollPane(tabla);
        sp.setBounds(50, 800, 750, 300);       
        ventas_general.add(tabla);
       
    }
    
    
    public void ejecutar(){
        inicio();
        tabla();
    }
}
