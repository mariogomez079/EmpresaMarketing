/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Gui;
import Gui.Trabajadores.JFrameAgregarTrabajadores;
import Gui.Trabajadores.JFrameEliminarTrabajadores;
import Gui.Trabajadores.JFrameListarTrabajadores;
import Gui.Trabajadores.JFrameModificarTrabajadores;
/**
 *
 * @author mariogomez
 */
public class JFrameDashboad extends javax.swing.JFrame {

    /**
     * Creates new form JFrameDashboad
     */
    public JFrameDashboad() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemListarTrabajadores = new javax.swing.JMenuItem();
        jMenuItemAgregarTrabajadores = new javax.swing.JMenuItem();
        jMenuItemModificarTrabajadores = new javax.swing.JMenuItem();
        jMenuItemEliminarTrabajadores = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Archivo");

        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Trabajadores");

        jMenuItemListarTrabajadores.setText("Listar");
        jMenuItemListarTrabajadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListarTrabajadoresActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemListarTrabajadores);

        jMenuItemAgregarTrabajadores.setText("Agregar");
        jMenuItemAgregarTrabajadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAgregarTrabajadoresActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemAgregarTrabajadores);

        jMenuItemModificarTrabajadores.setText("Modificar");
        jMenuItemModificarTrabajadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemModificarTrabajadoresActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemModificarTrabajadores);

        jMenuItemEliminarTrabajadores.setText("Eliminar");
        jMenuItemEliminarTrabajadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEliminarTrabajadoresActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemEliminarTrabajadores);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 276, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jMenuItemAgregarTrabajadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAgregarTrabajadoresActionPerformed
        JFrameAgregarTrabajadores AbrirAgregarTrabajadores = new JFrameAgregarTrabajadores();
        AbrirAgregarTrabajadores.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemAgregarTrabajadoresActionPerformed

    private void jMenuItemEliminarTrabajadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEliminarTrabajadoresActionPerformed
        JFrameEliminarTrabajadores EliminarTrabajadores = new JFrameEliminarTrabajadores();
        EliminarTrabajadores.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemEliminarTrabajadoresActionPerformed

    private void jMenuItemListarTrabajadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListarTrabajadoresActionPerformed
        JFrameListarTrabajadores ListarTrabajadores = new JFrameListarTrabajadores();
        ListarTrabajadores.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemListarTrabajadoresActionPerformed

    private void jMenuItemModificarTrabajadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemModificarTrabajadoresActionPerformed
        JFrameModificarTrabajadores ModificarTrabajadores = new JFrameModificarTrabajadores();
        ModificarTrabajadores.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemModificarTrabajadoresActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameDashboad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameDashboad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameDashboad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameDashboad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameDashboad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAgregarTrabajadores;
    private javax.swing.JMenuItem jMenuItemEliminarTrabajadores;
    private javax.swing.JMenuItem jMenuItemListarTrabajadores;
    private javax.swing.JMenuItem jMenuItemModificarTrabajadores;
    private javax.swing.JMenuItem jMenuItemSalir;
    // End of variables declaration//GEN-END:variables
}
