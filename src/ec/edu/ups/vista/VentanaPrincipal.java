package ec.edu.ups.vista;

import javax.swing.JOptionPane;
import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.controlador.ControladorTicket;
import ec.edu.ups.controlador.ControladorVehiculo;
import ec.edu.ups.dao.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JMenuItem;

public class VentanaPrincipal extends javax.swing.JFrame {

    Calendar calendario;

    private VentanaRegistrarCliente ventanaRegistrarCliente;
    private VentanaRegistrarVehiculo ventanaRegistrarVehiculo;
    private VentanaIniciarSesion ventanaIniciarSesion;
    private VentanaImprimirTicket ventanaimprimirTicket;
    private VentanaVehiculos ventanaVehiculos;
//controladores
    private ControladorCliente controladorCliente;
    private ControladorVehiculo controladorVehiculo;
    private ControladorTicket controladorTicket;

//dao
    private ClienteDAO clienteDAO;
    private VehiculoDAO vehiculoDAO;
    private TicketDAO ticketDAO;

    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        //visibilidad

        registrarVehiculoItem.setVisible(false);
        MenuItemCerrarSesion.setVisible(false);
        menuItemVehiculos.setVisible(false);

        //instancia DAOS
        clienteDAO = new ClienteDAO();
        vehiculoDAO = new VehiculoDAO();
        ticketDAO = new TicketDAO();
        //instancia controloadores
        controladorCliente = new ControladorCliente(clienteDAO, vehiculoDAO);
        controladorVehiculo = new ControladorVehiculo(vehiculoDAO, controladorTicket);
        controladorTicket = new ControladorTicket(vehiculoDAO, ticketDAO);
        //instancia las vistas
        ventanaRegistrarVehiculo = new VentanaRegistrarVehiculo(controladorVehiculo, this);
        ventanaIniciarSesion = new VentanaIniciarSesion(controladorCliente, this);
        ventanaRegistrarCliente = new VentanaRegistrarCliente(controladorCliente, this);
        ventanaimprimirTicket = new VentanaImprimirTicket();
        ventanaVehiculos = new VentanaVehiculos();

        //añadir a destokpane
        desktopPane.add(ventanaRegistrarCliente);
        desktopPane.add(ventanaIniciarSesion);
        desktopPane.add(ventanaimprimirTicket);
        desktopPane.add(ventanaRegistrarVehiculo);
        desktopPane.add(ventanaVehiculos);
        calendario = new GregorianCalendar();

    }

    public JMenuItem getMenuItemCerrarSesion() {
        return MenuItemCerrarSesion;
    }

    public JMenuItem getIniciarMenuItem() {
        return iniciarMenuItem;
    }

    public JMenuItem getRegistrarMenuItem() {
        return registrarMenuItem;
    }

    public JMenuItem getRegistrarVehiculoItem() {
        return registrarVehiculoItem;
    }

    public JMenuItem getMenuItemVehiculos() {
        return menuItemVehiculos;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        ingresoMenu = new javax.swing.JMenu();
        registrarMenuItem = new javax.swing.JMenuItem();
        registrarVehiculoItem = new javax.swing.JMenuItem();
        iniciarMenuItem = new javax.swing.JMenuItem();
        menuItemVehiculos = new javax.swing.JMenuItem();
        MenuItemCerrarSesion = new javax.swing.JMenuItem();
        menuItemSalirI = new javax.swing.JMenuItem();
        menuItemSalida = new javax.swing.JMenu();
        menuItemValidarTicket = new javax.swing.JMenuItem();
        menuItemRegresarSalida = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);

        desktopPane.setBackground(new java.awt.Color(0, 0, 255));
        getContentPane().add(desktopPane, java.awt.BorderLayout.CENTER);

        ingresoMenu.setMnemonic('f');
        ingresoMenu.setText("Ingreso");

        registrarMenuItem.setMnemonic('o');
        registrarMenuItem.setText("Registarse");
        registrarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarMenuItemActionPerformed(evt);
            }
        });
        ingresoMenu.add(registrarMenuItem);

        registrarVehiculoItem.setText("Registar Vehiculo");
        registrarVehiculoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarVehiculoItemActionPerformed(evt);
            }
        });
        ingresoMenu.add(registrarVehiculoItem);

        iniciarMenuItem.setText("Usuario Recurrente");
        iniciarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarMenuItemActionPerformed(evt);
            }
        });
        ingresoMenu.add(iniciarMenuItem);

        menuItemVehiculos.setText("Sus Vehiculos");
        menuItemVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVehiculosActionPerformed(evt);
            }
        });
        ingresoMenu.add(menuItemVehiculos);

        MenuItemCerrarSesion.setText("Cerrar Usuario Recurrente");
        MenuItemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemCerrarSesionActionPerformed(evt);
            }
        });
        ingresoMenu.add(MenuItemCerrarSesion);

        menuItemSalirI.setMnemonic('x');
        menuItemSalirI.setText("Salir");
        menuItemSalirI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalirIActionPerformed(evt);
            }
        });
        ingresoMenu.add(menuItemSalirI);

        menuBar.add(ingresoMenu);

        menuItemSalida.setMnemonic('e');
        menuItemSalida.setText("Salida");

        menuItemValidarTicket.setMnemonic('t');
        menuItemValidarTicket.setText("Ingrese su ticket");
        menuItemValidarTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemValidarTicketActionPerformed(evt);
            }
        });
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

    private void registrarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarMenuItemActionPerformed

        ventanaRegistrarCliente.setVisible(true);

    }//GEN-LAST:event_registrarMenuItemActionPerformed

    private void iniciarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarMenuItemActionPerformed
        ventanaIniciarSesion.setVisible(true);
        menuItemVehiculos.setVisible(true);
    }//GEN-LAST:event_iniciarMenuItemActionPerformed

    private void MenuItemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemCerrarSesionActionPerformed
        MenuItemCerrarSesion.setVisible(false);
        registrarVehiculoItem.setVisible(false);
        iniciarMenuItem.setVisible(true);
        registrarMenuItem.setVisible(true);
        menuItemVehiculos.setVisible(false);
    }//GEN-LAST:event_MenuItemCerrarSesionActionPerformed

    private void registrarVehiculoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarVehiculoItemActionPerformed
        ventanaRegistrarVehiculo.setVisible(true);

    }//GEN-LAST:event_registrarVehiculoItemActionPerformed

    private void menuItemValidarTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemValidarTicketActionPerformed

        ventanaimprimirTicket.setVisible(true);
    }//GEN-LAST:event_menuItemValidarTicketActionPerformed

    private void menuItemVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVehiculosActionPerformed
        ventanaVehiculos.setVisible(true);
    }//GEN-LAST:event_menuItemVehiculosActionPerformed

    public static void main(String args[]) {

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
    private javax.swing.JMenuItem MenuItemCerrarSesion;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu ingresoMenu;
    private javax.swing.JMenuItem iniciarMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuItemRegresarSalida;
    private javax.swing.JMenu menuItemSalida;
    private javax.swing.JMenuItem menuItemSalirI;
    private javax.swing.JMenuItem menuItemValidarTicket;
    private javax.swing.JMenuItem menuItemVehiculos;
    private javax.swing.JMenuItem registrarMenuItem;
    private javax.swing.JMenuItem registrarVehiculoItem;
    // End of variables declaration//GEN-END:variables

}
