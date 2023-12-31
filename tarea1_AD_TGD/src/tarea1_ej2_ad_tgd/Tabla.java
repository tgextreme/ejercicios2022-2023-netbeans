/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tarea1_ej2_ad_tgd;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author usuario
 */
public class Tabla extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Tabla() {
        initComponents();
        setDefaultCloseOperation(0);
        try {
            DefaultTableModel model = new DefaultTableModel();
       
            FileReader fr = null;
            BufferedReader br = null;
           // JFileChooser fileChooser = new JFileChooser();
            int seleccion;
            String[] parts;
            //seleccion = fileChooser.showSaveDialog(this);
            //if (seleccion == JFileChooser.APPROVE_OPTION) {
                File fichero =new File("alumnos.dat");
                fr = new FileReader(fichero);
                br = new BufferedReader(fr);

                // Lectura del fichero
                String linea;

                model.addColumn("Usuario");
                model.addColumn("Email");
                model.addColumn("Edad");
                model.addColumn("Teléfono");

                while ((linea = br.readLine()) != null) {
                  //  System.out.println(linea);
                    parts = linea.split(";");

                    model.addRow(new Object[]{parts[0], parts[1], parts[2], parts[3]});

                }

                jTable.setModel(model);

      //      }
        }catch(Exception ex){
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Email", "Edad", "Teléfono"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        jButton1.setText("Elegir archivo alumnos.dat");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cerrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel model = new DefaultTableModel();

            FileReader fr = null;
            BufferedReader br = null;
            JFileChooser fileChooser = new JFileChooser();
            int seleccion;
            String[] parts;
            seleccion = fileChooser.showSaveDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                File fichero = fileChooser.getSelectedFile();
                fr = new FileReader(fichero);
                br = new BufferedReader(fr);

                // Lectura del fichero
                String linea;

                model.addColumn("Usuario");
                model.addColumn("Email");
                model.addColumn("Edad");
                model.addColumn("Teléfono");

                while ((linea = br.readLine()) != null) {
                  //  System.out.println(linea);
                    parts = linea.split("#");

                    model.addRow(new Object[]{parts[0], parts[1], parts[2], parts[3]});

                }

                jTable.setModel(model);

            }
        } catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();;
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
