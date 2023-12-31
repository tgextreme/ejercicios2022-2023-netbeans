/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.BDD;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Continente;
import model.Operaciones;

/**
 *
 * @author usuario
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButtonAnyadirPais = new javax.swing.JButton();
        jButtonEliminarPais = new javax.swing.JButton();
        jButtonConsultarPais = new javax.swing.JButton();
        jButtonCalcSupCont = new javax.swing.JButton();
        jButtonCalNumHab = new javax.swing.JButton();
        jButtonAnyadirContinente = new javax.swing.JButton();
        jButtonMostrarPaises = new javax.swing.JButton();
        jButtonMostListCont = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Conectar base de datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonAnyadirPais.setText("2.- Añadir País");
        jButtonAnyadirPais.setEnabled(false);
        jButtonAnyadirPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnyadirPaisActionPerformed(evt);
            }
        });

        jButtonEliminarPais.setText("3.- Eliminar País");
        jButtonEliminarPais.setEnabled(false);
        jButtonEliminarPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarPaisActionPerformed(evt);
            }
        });

        jButtonConsultarPais.setText("4.- Consultar país");
        jButtonConsultarPais.setEnabled(false);
        jButtonConsultarPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarPaisActionPerformed(evt);
            }
        });

        jButtonCalcSupCont.setText("6.- Calcular superficie según continente");
        jButtonCalcSupCont.setEnabled(false);
        jButtonCalcSupCont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcSupContActionPerformed(evt);
            }
        });

        jButtonCalNumHab.setText("5.- Calcular habitantes según continente");
        jButtonCalNumHab.setEnabled(false);
        jButtonCalNumHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalNumHabActionPerformed(evt);
            }
        });

        jButtonAnyadirContinente.setText("1.1.- Añadir Continente");
        jButtonAnyadirContinente.setEnabled(false);
        jButtonAnyadirContinente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnyadirContinenteActionPerformed(evt);
            }
        });

        jButtonMostrarPaises.setText("1.2.-Mostrar países");
        jButtonMostrarPaises.setEnabled(false);
        jButtonMostrarPaises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarPaisesActionPerformed(evt);
            }
        });

        jButtonMostListCont.setText("1.1.1.- Mostrar Lista de continentes");
        jButtonMostListCont.setEnabled(false);
        jButtonMostListCont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostListContActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonMostListCont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonMostrarPaises, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAnyadirPais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEliminarPais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonConsultarPais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCalNumHab, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                    .addComponent(jButtonCalcSupCont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAnyadirContinente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(4, 4, 4)
                .addComponent(jButtonAnyadirContinente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonMostListCont)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonMostrarPaises)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAnyadirPais)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEliminarPais)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonConsultarPais)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCalNumHab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCalcSupCont)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAnyadirPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnyadirPaisActionPerformed
        // TODO add your handling code here:
        AnyadirPais dialog = new AnyadirPais(this, true);
        dialog.setDefaultCloseOperation(0);;
        dialog.show();
    }//GEN-LAST:event_jButtonAnyadirPaisActionPerformed

    private void jButtonAnyadirContinenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnyadirContinenteActionPerformed
        // TODO add your handling code here:
        try {
            String name = JOptionPane.showInputDialog("Dígame el nuevo continente");
            BDD bdd = new BDD();
            if (name.length() > 3) {

                if (bdd.insertarContinente(name)) {
                    JOptionPane.showMessageDialog(null, "Continente añadido correctamente");

                } else {
                    JOptionPane.showMessageDialog(null, "Ha habido algún error, NO se ha podido añadir continente");

                }
            } else {
                JOptionPane.showMessageDialog(null, "La longitud debe tener mínimo 3 caracteres");
            }
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_jButtonAnyadirContinenteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        BddJDialog dialog = new BddJDialog(this, true);
        dialog.setDefaultCloseOperation(0);;
        dialog.show();
        BDD bdd = new BDD();
        if (bdd.getConn() == null) {
            jButtonAnyadirContinente.setEnabled(false);
            jButtonAnyadirPais.setEnabled(false);
            jButtonEliminarPais.setEnabled(false);
            jButtonConsultarPais.setEnabled(false);
            jButtonCalNumHab.setEnabled(false);
            jButtonCalcSupCont.setEnabled(false);
            jButtonMostrarPaises.setEnabled(false);
            jButtonMostListCont.setEnabled(false);
        } else {
            jButtonMostrarPaises.setEnabled(true);
            jButtonAnyadirContinente.setEnabled(true);
            jButtonAnyadirPais.setEnabled(true);
            jButtonEliminarPais.setEnabled(true);
            jButtonConsultarPais.setEnabled(true);
            jButtonCalNumHab.setEnabled(true);
            jButtonCalcSupCont.setEnabled(true);
            jButtonMostListCont.setEnabled(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonMostListContActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostListContActionPerformed
        // TODO add your handling code here:
        BDD bdd = new BDD();

        //ArrayList<contin =bdd.select("SELECT * FROM `continente`", 1);
        ArrayList<Continente> cont = bdd.select("SELECT * FROM `continente`", 1);
        String str = "";
        for (Continente c : cont) {
            str = str + c.getId() + " " + c.getNombreContinente() + "\n";
        }
        JOptionPane.showMessageDialog(null, str);

        //op.getTextSql(, 1);

    }//GEN-LAST:event_jButtonMostListContActionPerformed

    private void jButtonMostrarPaisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarPaisesActionPerformed
        // TODO add your handling code here:
        PaisTabla pais = new PaisTabla(this, true);
        pais.show();

    }//GEN-LAST:event_jButtonMostrarPaisesActionPerformed

    private void jButtonConsultarPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarPaisActionPerformed
        PaisTabla pais = new PaisTabla(this, true);
        pais.show();        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonConsultarPaisActionPerformed

    private void jButtonCalNumHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalNumHabActionPerformed
        // TODO add your handling code here:

        Operaciones operaciones = new Operaciones();

        String str = operaciones.getNumHabCont();

        JOptionPane.showMessageDialog(null, str);
    }//GEN-LAST:event_jButtonCalNumHabActionPerformed

    private void jButtonCalcSupContActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcSupContActionPerformed
        Operaciones operaciones = new Operaciones();

        String str = operaciones.getNumSupKm2();

        JOptionPane.showMessageDialog(null, str);        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCalcSupContActionPerformed

    private void jButtonEliminarPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarPaisActionPerformed
        // TODO add your handling code here:
        BDD bdd =new BDD();
        String pais=JOptionPane.showInputDialog(null, "Dígame el nombre del país a eliminar");
        boolean check =bdd.eliminarPais(pais);
        if(check){
            JOptionPane.showMessageDialog(null, "Eliminado correctamente");  
        }else{
            JOptionPane.showMessageDialog(null, "Ha habido un error al eliminar");  
        }
        
    }//GEN-LAST:event_jButtonEliminarPaisActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAnyadirContinente;
    private javax.swing.JButton jButtonAnyadirPais;
    private javax.swing.JButton jButtonCalNumHab;
    private javax.swing.JButton jButtonCalcSupCont;
    private javax.swing.JButton jButtonConsultarPais;
    private javax.swing.JButton jButtonEliminarPais;
    private javax.swing.JButton jButtonMostListCont;
    private javax.swing.JButton jButtonMostrarPaises;
    // End of variables declaration//GEN-END:variables
}
