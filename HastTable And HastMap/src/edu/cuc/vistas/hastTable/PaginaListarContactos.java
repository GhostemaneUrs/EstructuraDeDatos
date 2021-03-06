/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cuc.vistas.hastTable;

import com.google.gson.Gson;
import edu.cuc.hastTable.NuevoContacto;
import edu.cuc.hastTable.Persona;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.util.Enumeration;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Ghostemane
 */
public final class PaginaListarContactos extends javax.swing.JInternalFrame {

    private final String[] nombreColumnas ={"Cedula","Nombres","Apellidos","Correos","Celular"};
    private final String arreglo[][];
    private NuevoContacto contacto;
    public PaginaListarContactos() {
        initComponents();
         
        arreglo= convertirHashToArray2D(contacto.size(),nombreColumnas.length);
        TableModel modelo = new ModeloTabla();
         tablaContactos.setModel(modelo);      
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaContactos = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setText("Lista de Contactos");

        jScrollPane2.setViewportView(tablaContactos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public String[][] convertirHashToArray2D(int m, int n){
        String[][] arreglo1 =new String[m][n];       
        Enumeration<Persona> lista=contacto.elements();
        int i=0;
       while (lista.hasMoreElements()){
           Persona  valor =lista.nextElement();
           
            arreglo1[i][0]=valor.getCedula();
            arreglo1[i][1]=valor.getNombres();
            arreglo1[i][2]=valor.getApellidos();
            arreglo1[i][3]=valor.getCorreos();
            arreglo1[i][4]=valor.getCelular();
            i++;
           }
         return arreglo1;           
    }
  public class ModeloTabla extends AbstractTableModel{

        @Override
        public int getRowCount() {
           return contacto.size();
        }

        @Override
        public int getColumnCount() {
            return nombreColumnas.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {           
           return arreglo[rowIndex][columnIndex];
        }

        @Override
        public String getColumnName(int column) {
           return nombreColumnas[column];
        }
    
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaContactos;
    // End of variables declaration//GEN-END:variables
}
