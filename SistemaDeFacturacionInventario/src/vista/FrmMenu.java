/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Dimension;

import javax.swing.JDesktopPane;



/**
 *
 * @author Carlos
 */
public class FrmMenu extends javax.swing.JFrame {

    
    public static JDesktopPane jDesktopPane_menu;


    /**
     * Creates new form FrmMenu
     */
    public FrmMenu() {
        initComponents();
        this.setSize(new Dimension(1200,700));
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema de Ventas");
        

        this.setLayout(null);
        jDesktopPane_menu = new JDesktopPane();
        
        int anchura = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int altura = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.jDesktopPane_menu.setBounds(0, 0, anchura, (altura - 110 ));
        this.add(jDesktopPane_menu);
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1_nuevoUsuario = new javax.swing.JMenuItem();
        jMenuItem2_gestionarUsuario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3_nuevoProducto = new javax.swing.JMenuItem();
        jMenuItem5_gestionarProducto = new javax.swing.JMenuItem();
        jMenuItem6_actualizarStock = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7_nuevoCliente = new javax.swing.JMenuItem();
        jMenuItem8_gestionarCliente = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem9_nuevaCategoria = new javax.swing.JMenuItem();
        jMenuItem10_gestionarCategoria = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem11_nuevaVenta = new javax.swing.JMenuItem();
        jMenuItem12_gestionarVenta = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem13_reporteClientes = new javax.swing.JMenuItem();
        jMenuItem14_reporteCategorias = new javax.swing.JMenuItem();
        jMenuItem15_reporteProductos = new javax.swing.JMenuItem();
        jMenuItem16_reporteVentas = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem17_verHistorial = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem18_cerrarSesion = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N
        jMenu1.setText("Usuario");
        jMenu1.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem1_nuevoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-cliente.png"))); // NOI18N
        jMenuItem1_nuevoUsuario.setText("Nuevo Usuario");
        jMenuItem1_nuevoUsuario.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem1_nuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1_nuevoUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1_nuevoUsuario);

        jMenuItem2_gestionarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuraciones.png"))); // NOI18N
        jMenuItem2_gestionarUsuario.setText("Gestionar Usuario");
        jMenuItem2_gestionarUsuario.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem2_gestionarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2_gestionarUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2_gestionarUsuario);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto.png"))); // NOI18N
        jMenu2.setText("Producto");
        jMenu2.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem3_nuevoProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-producto.png"))); // NOI18N
        jMenuItem3_nuevoProducto.setText("Nuevo Producto");
        jMenuItem3_nuevoProducto.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem3_nuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3_nuevoProductoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3_nuevoProducto);

        jMenuItem5_gestionarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuraciones.png"))); // NOI18N
        jMenuItem5_gestionarProducto.setText("Gestionar Productos");
        jMenuItem5_gestionarProducto.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem5_gestionarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5_gestionarProductoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5_gestionarProducto);

        jMenuItem6_actualizarStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        jMenuItem6_actualizarStock.setText("Actualizar Existencias");
        jMenuItem6_actualizarStock.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem6_actualizarStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6_actualizarStockActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6_actualizarStock);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        jMenu3.setText("Cliente");
        jMenu3.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem7_nuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-cliente.png"))); // NOI18N
        jMenuItem7_nuevoCliente.setText("Nuevo Cliente");
        jMenuItem7_nuevoCliente.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem7_nuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7_nuevoClienteActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7_nuevoCliente);

        jMenuItem8_gestionarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuraciones.png"))); // NOI18N
        jMenuItem8_gestionarCliente.setText("Gestionar Clientes");
        jMenuItem8_gestionarCliente.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem8_gestionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8_gestionarClienteActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8_gestionarCliente);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/categorias.png"))); // NOI18N
        jMenu4.setText("Categoría");
        jMenu4.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem9_nuevaCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anadir.png"))); // NOI18N
        jMenuItem9_nuevaCategoria.setText("Nueva Categoría");
        jMenuItem9_nuevaCategoria.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem9_nuevaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9_nuevaCategoriaActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9_nuevaCategoria);

        jMenuItem10_gestionarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuraciones.png"))); // NOI18N
        jMenuItem10_gestionarCategoria.setText("Gestionar Categoría");
        jMenuItem10_gestionarCategoria.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem10_gestionarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10_gestionarCategoriaActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10_gestionarCategoria);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carrito.png"))); // NOI18N
        jMenu5.setText("Facturar");
        jMenu5.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jMenu5.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem11_nuevaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anadir.png"))); // NOI18N
        jMenuItem11_nuevaVenta.setText("Nueva Venta");
        jMenuItem11_nuevaVenta.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem11_nuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11_nuevaVentaActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem11_nuevaVenta);

        jMenuItem12_gestionarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuraciones.png"))); // NOI18N
        jMenuItem12_gestionarVenta.setText("Gestionar Ventas");
        jMenuItem12_gestionarVenta.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem12_gestionarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12_gestionarVentaActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem12_gestionarVenta);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reportes.png"))); // NOI18N
        jMenu6.setText("Reportes");
        jMenu6.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jMenu6.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem13_reporteClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem13_reporteClientes.setText("Reportes Clientes");
        jMenuItem13_reporteClientes.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu6.add(jMenuItem13_reporteClientes);

        jMenuItem14_reporteCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem14_reporteCategorias.setText("Reportes Categorías");
        jMenuItem14_reporteCategorias.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu6.add(jMenuItem14_reporteCategorias);

        jMenuItem15_reporteProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem15_reporteProductos.setText("Reportes Productos");
        jMenuItem15_reporteProductos.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu6.add(jMenuItem15_reporteProductos);

        jMenuItem16_reporteVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem16_reporteVentas.setText("Reportes Ventas");
        jMenuItem16_reporteVentas.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu6.add(jMenuItem16_reporteVentas);

        jMenuBar1.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historial1.png"))); // NOI18N
        jMenu7.setText("Historial");
        jMenu7.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jMenu7.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem17_verHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historial1.png"))); // NOI18N
        jMenuItem17_verHistorial.setText("Ver Historial");
        jMenuItem17_verHistorial.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu7.add(jMenuItem17_verHistorial);

        jMenuBar1.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jMenu8.setText("Cerrar Sesión");
        jMenu8.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jMenu8.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem18_cerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jMenuItem18_cerrarSesion.setText("Cerrar Sesión");
        jMenuItem18_cerrarSesion.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem18_cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18_cerrarSesionActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem18_cerrarSesion);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1_nuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1_nuevoUsuarioActionPerformed
       InterUsuario interUsuario = new InterUsuario();
       jDesktopPane_menu.add(interUsuario);
       interUsuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem1_nuevoUsuarioActionPerformed

    private void jMenuItem6_actualizarStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6_actualizarStockActionPerformed
       InterActualizarStock interActualizarStock= new InterActualizarStock();
       jDesktopPane_menu.add(interActualizarStock);
       interActualizarStock.setVisible(true);
    }//GEN-LAST:event_jMenuItem6_actualizarStockActionPerformed

    private void jMenuItem8_gestionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8_gestionarClienteActionPerformed
       InterGestionarCliente interGestionarCliente = new InterGestionarCliente();
       jDesktopPane_menu.add(interGestionarCliente);
       interGestionarCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem8_gestionarClienteActionPerformed

    private void jMenuItem10_gestionarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10_gestionarCategoriaActionPerformed
       InterGestionarCategoria interGestionarCategoria = new InterGestionarCategoria();
       jDesktopPane_menu.add(interGestionarCategoria);
       interGestionarCategoria.setVisible(true);
    }//GEN-LAST:event_jMenuItem10_gestionarCategoriaActionPerformed

    private void jMenuItem9_nuevaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9_nuevaCategoriaActionPerformed
       InterCategoria interCategoria = new InterCategoria();
       jDesktopPane_menu.add(interCategoria);
       interCategoria.setVisible(true);
    }//GEN-LAST:event_jMenuItem9_nuevaCategoriaActionPerformed

    private void jMenuItem3_nuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3_nuevoProductoActionPerformed
       InterProducto interProducto = new InterProducto();
       jDesktopPane_menu.add(interProducto);
       interProducto.setVisible(true);
    }//GEN-LAST:event_jMenuItem3_nuevoProductoActionPerformed

    private void jMenuItem5_gestionarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5_gestionarProductoActionPerformed
       InterGestionarProducto interGestionarProducto = new InterGestionarProducto();
       jDesktopPane_menu.add(interGestionarProducto);
       interGestionarProducto.setVisible(true);
    }//GEN-LAST:event_jMenuItem5_gestionarProductoActionPerformed

    private void jMenuItem7_nuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7_nuevoClienteActionPerformed
       InterCliente interCliente = new InterCliente();
       jDesktopPane_menu.add(interCliente);
       interCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem7_nuevoClienteActionPerformed

    private void jMenuItem18_cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18_cerrarSesionActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem18_cerrarSesionActionPerformed

    private void jMenuItem2_gestionarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2_gestionarUsuarioActionPerformed
       InterGestionarUsuario interGestionarUsuario = new InterGestionarUsuario();
       jDesktopPane_menu.add(interGestionarUsuario);
       interGestionarUsuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem2_gestionarUsuarioActionPerformed

    private void jMenuItem11_nuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11_nuevaVentaActionPerformed
        InterFacturacion interFacturacion = new InterFacturacion();
        jDesktopPane_menu.add(interFacturacion);
        interFacturacion.setVisible(true);
    }//GEN-LAST:event_jMenuItem11_nuevaVentaActionPerformed

    private void jMenuItem12_gestionarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12_gestionarVentaActionPerformed
        // TODO add your handling code here:
        InterGestionarVentas interGestionarVentas = new InterGestionarVentas();
        jDesktopPane_menu.add(interGestionarVentas);
        interGestionarVentas.setVisible(true);
    }//GEN-LAST:event_jMenuItem12_gestionarVentaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10_gestionarCategoria;
    private javax.swing.JMenuItem jMenuItem11_nuevaVenta;
    private javax.swing.JMenuItem jMenuItem12_gestionarVenta;
    private javax.swing.JMenuItem jMenuItem13_reporteClientes;
    private javax.swing.JMenuItem jMenuItem14_reporteCategorias;
    private javax.swing.JMenuItem jMenuItem15_reporteProductos;
    private javax.swing.JMenuItem jMenuItem16_reporteVentas;
    private javax.swing.JMenuItem jMenuItem17_verHistorial;
    private javax.swing.JMenuItem jMenuItem18_cerrarSesion;
    private javax.swing.JMenuItem jMenuItem1_nuevoUsuario;
    private javax.swing.JMenuItem jMenuItem2_gestionarUsuario;
    private javax.swing.JMenuItem jMenuItem3_nuevoProducto;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5_gestionarProducto;
    private javax.swing.JMenuItem jMenuItem6_actualizarStock;
    private javax.swing.JMenuItem jMenuItem7_nuevoCliente;
    private javax.swing.JMenuItem jMenuItem8_gestionarCliente;
    private javax.swing.JMenuItem jMenuItem9_nuevaCategoria;
    // End of variables declaration//GEN-END:variables
}
