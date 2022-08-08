
package Proyecto_ventas;

import javax.swing.JButton;
import javax.swing.JPanel;

public class productos_vistas {
    JPanel productos = new JPanel();    
     
    private void botones_productos(){
        productos.setLayout(null);
        JButton crear = new JButton("Crear");
        crear.setBounds(500,100,130,50);
        productos.add(crear);
        
        JButton carga = new JButton("Carga Masiva");
        carga.setBounds(670,100,130,50);
        productos.add(carga);
        
        JButton actualizar = new JButton("Actualizar");
        actualizar.setBounds(500,250,130,50);
        productos.add(actualizar);
        
        JButton eliminar = new JButton("Eliminar");
        eliminar.setBounds(670,250,130,50);
        productos.add(eliminar);
        
        JButton exportar = new JButton("Exportar PDF");
        exportar.setBounds(500,400,300,50);
        productos.add(exportar);
        
    }
       
    public void ejecutar(){
    botones_productos();    
    }
       
}
