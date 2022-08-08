
package Proyecto_ventas;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class sucursales_vistas {
    
     JPanel sucursales = new JPanel();
     JTable tabla = new JTable();
     JScrollPane sp = new JScrollPane();
     
    private void botones(){
        sucursales.setLayout(null);
        JButton crear = new JButton("Crear");
        crear.setBounds(500,100,130,50);
        sucursales.add(crear);
        
        JButton carga = new JButton("Carga Masiva");
        carga.setBounds(670,100,130,50);
        sucursales.add(carga);
        
        JButton actualizar = new JButton("Actualizar");
        actualizar.setBounds(500,250,130,50);
        sucursales.add(actualizar);
        
        JButton eliminar = new JButton("Eliminar");
        eliminar.setBounds(670,250,130,50);
        sucursales.add(eliminar);
        
        JButton exportar = new JButton("Exportar PDF");
        exportar.setBounds(500,400,300,50);
        sucursales.add(exportar);
        
    }
    
    public void tabla(){
        String columnas []= {"Código", "Nombre", "Dirección", "Corre", "Teléfono"};
        Object filas [][]=  {{"2022", "Jeny", "Guatemlaa", "jmacu@gmail.com", "54603625"}};
        tabla = new JTable(filas, columnas);
        sp = new JScrollPane(tabla);
        sp.setBounds(10,20,430,600);
        sucursales.add(sp);
    }
    
    public void ejecutar(){
    botones();
    tabla();
    }
}
