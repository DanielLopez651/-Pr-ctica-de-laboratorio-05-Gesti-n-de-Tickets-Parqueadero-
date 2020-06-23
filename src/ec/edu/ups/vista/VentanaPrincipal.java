/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class VentanaPrincipal extends javax.swing.JFrame {

   
    public VentanaPrincipal() {
        initComponents();
      
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menuItemIngreso = new javax.swing.JMenu();
        menuItemRegistrarse = new javax.swing.JMenuItem();
        menuItemSalirI = new javax.swing.JMenuItem();
        menuItemSalida = new javax.swing.JMenu();
        menuItemValidarTicket = new javax.swing.JMenuItem();
        menuItemRegresarSalida = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(0, 0, 255));

        menuItemIngreso.setMnemonic('f');
        menuItemIngreso.setText("Ingreso");

        menuItemRegistrarse.setMnemonic('o');
        menuItemRegistrarse.setText("Registarse");
        menuItemIngreso.add(menuItemRegistrarse);

        menuItemSalirI.setMnemonic('x');
        menuItemSalirI.setText("Salir");
        menuItemSalirI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalirIActionPerformed(evt);
            }
        });
        menuItemIngreso.add(menuItemSalirI);

        menuBar.add(menuItemIngreso);

        menuItemSalida.setMnemonic('e');
        menuItemSalida.setText("Salida");

        menuItemValidarTicket.setMnemonic('t');
        menuItemValidarTicket.setText("Ingrese su ticket");
        menuItemSalida.add(menuItemValidarTicket);

        menuItemRegresarSalida.setMnemonic('y');
        menuItemRegresarSalida.setText("Salir");
        menuItemRegresarSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRegresarSalidaActionPerformed(evt);
            }
        });
        menuItemSalida.add(menuItemRegresarSalida);

        menuBar.add(menuItemSalida);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Ayuda");
        helpMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpMenuActionPerformed(evt);
            }
        });

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contactenos");
        helpMenu.add(contentMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemSalirIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalirIActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuItemSalirIActionPerformed

    private void helpMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpMenuActionPerformed
     
    }//GEN-LAST:event_helpMenuActionPerformed

    private void menuItemRegresarSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRegresarSalidaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuItemRegresarSalidaActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuItemIngreso;
    private javax.swing.JMenuItem menuItemRegistrarse;
    private javax.swing.JMenuItem menuItemRegresarSalida;
    private javax.swing.JMenu menuItemSalida;
    private javax.swing.JMenuItem menuItemSalirI;
    private javax.swing.JMenuItem menuItemValidarTicket;
    // End of variables declaration//GEN-END:variables

}
