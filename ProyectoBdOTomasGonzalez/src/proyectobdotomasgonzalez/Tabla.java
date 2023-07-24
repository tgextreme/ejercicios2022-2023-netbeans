/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package proyectobdotomasgonzalez;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Constraint;
import com.db4o.query.Query;
import java.awt.List;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class Tabla extends javax.swing.JDialog {

    /**
     * Creates new form Tabla
     */
    public Tabla(java.awt.Frame parent, boolean modal, int ejercicio, ObjectContainer bd, String str) {
        super(parent, modal);
        initComponents();
        // DefaultTableModel yourModel = (DefaultTableModel) jTable1.getModel();
        Libro l1;
        Autor a1;
        if (ejercicio == 1) {
            Autor b = new Autor(null, null, null, null);
            try {

                Query query = bd.query();

                query.constrain(Autor.class);
                query.descend("tipo").orderDescending();
                ObjectSet result = query.execute();
                DefaultTableModel yourModel = (DefaultTableModel) jTable1.getModel();
                yourModel.addColumn("Nombre");
                yourModel.addColumn("Nacionalidad");
                yourModel.addColumn("Tipo");
               yourModel.addColumn("Fecha");
                while (result.hasNext()) {
                    b = (Autor) result.next();
                    yourModel.addRow(new Object[]{b.getNombre(), b.getNacionalidad(), b.getTipo(),(b.getFechaNacimiento().getDayOfMonth()+"-"+(b.getFechaNacimiento().getMonthValue()+1+"")+"-")+b.getFechaNacimiento().getYear()});
                }

            } catch (Exception ex) {
                System.out.println("Err");
            }
        } else if (ejercicio == 2) {
            Autor a = new Autor(str, null, null, null);
            Autor b = new Autor(str, null, null, null);
            try {

                //Query query = bd.query();
                //query.constrain(b);
                //query.descend("tipo").orderDescending();
                ObjectSet result = bd.queryByExample(b);
                
                DefaultTableModel yourModel = (DefaultTableModel) jTable1.getModel();
                //               titulo, String editorial, String tipo, double precio

                yourModel.addColumn("Nombre");
                // yourModel.addColumn("Nacionalidad");
                 yourModel.addColumn("Nacionalidad");
                yourModel.addColumn("Tipo");
                yourModel.addColumn("Fecha");
                while (result.hasNext()) {
                    b = (Autor) result.next();
                    yourModel.addRow(new Object[]{b.getNombre(), b.getNacionalidad(), b.getTipo(),(b.getFechaNacimiento().getDayOfMonth()+"-"+(b.getFechaNacimiento().getMonthValue()+1+"")+"-")+b.getFechaNacimiento().getYear()});
                }

            } catch (Exception ex) {
                System.out.println("Err");
            }
        } else if (ejercicio == 3) {
            Libro a = new Libro(null, null, null, 0);

            try {

                String[] precios = str.split(" ");
                int numMenor = Integer.parseInt(precios[0]);
                int  numMayor= Integer.parseInt(precios[1]);
                Query query = bd.query();
                query.constrain(Libro.class);
                //se declara una de las restricciones con Constraint
                Constraint constra1 = query.descend("precio").constrain(numMayor).smaller();
                //se enlazan las dos restricciones a aplicar
                query.descend("precio").constrain(numMenor).greater().and(constra1);
                ObjectSet result = query.execute();
                DefaultTableModel yourModel = (DefaultTableModel) jTable1.getModel();

                yourModel.addColumn("Titulo");
                yourModel.addColumn("Editorial");
                yourModel.addColumn("Tipo");
                yourModel.addColumn("Precio");
                // yourModel.addColumn("Nacionalidad");

                while (result.hasNext()) {
                    a = (Libro) result.next();
                    yourModel.addRow(new Object[]{a.getTitulo(), a.getEditorial(), a.getTipo(), (a.getPrecio() + "")});
                }

            } catch (Exception ex) {
                System.out.println("Err");
                ex.printStackTrace();
            }
        }else if (ejercicio == 5) {
            Autor a = new Autor(null, "España", null, null);
            Autor b = new Autor(null, "España", null, null);
            try {

                //Query query = bd.query();

                //query.constrain(Autor.class);
                //ObjectSet result =;
               // query.descend("tipo").orderDescending();
                ObjectSet result =  bd.queryByExample(a);
                DefaultTableModel yourModel = (DefaultTableModel) jTable1.getModel();
                yourModel.addColumn("Nombre");
                yourModel.addColumn("Nacionalidad");
                yourModel.addColumn("Tipo");
                yourModel.addColumn("Fecha");
                while (result.hasNext()) {
                    b = (Autor) result.next();
                    yourModel.addRow(new Object[]{b.getNombre(), b.getNacionalidad(), b.getTipo(),(b.getFechaNacimiento().getDayOfMonth()+"-"+(b.getFechaNacimiento().getMonthValue()+1+"")+"-")+b.getFechaNacimiento().getYear()});
                }

            } catch (Exception ex) {
                System.out.println("Err");
            }
        } else if (ejercicio == 7) {
            Libro b = new Libro(null, null, null);
            try {

                Query query = bd.query();

                query.constrain(Libro.class);
                query.descend("tipo").orderDescending();
                ObjectSet result = query.execute();
                DefaultTableModel yourModel = (DefaultTableModel) jTable1.getModel();
                //String titulo, String editorial, String tipo, double precio
                yourModel.addColumn("Titulo");
                yourModel.addColumn("Editorial");
                yourModel.addColumn("Tipo");
               yourModel.addColumn("Precio");
                while (result.hasNext()) {
                    b = (Libro) result.next();
                    yourModel.addRow(new Object[]{b.getTitulo(), b.getEditorial(), b.getTipo(),(b.getPrecio()+"")});
                }

            } catch (Exception ex) {
                System.out.println("Err");
            }
            bd.commit();
            bd.close();
        }

    }

    public Tabla(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //DefaultTableModel yourModel = (DefaultTableModel) jTable1.getModel();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
