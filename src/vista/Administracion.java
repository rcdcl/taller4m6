/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author MBpro_Rafa
 */
public class Administracion extends javax.swing.JFrame {

    /**
     * Creates new form ListarProducto
     */
    public Administracion() {
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

        bg_tipo_cafe = new javax.swing.ButtonGroup();
        bg_tamano = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btncargastock = new javax.swing.JButton();
        btnreportestock = new javax.swing.JButton();
        btnreporteventa = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        maropt = new javax.swing.JMenu();
        mnventa = new javax.swing.JMenuItem();
        mnadmin = new javax.swing.JMenuItem();
        marsalir = new javax.swing.JMenuItem();
        macerca = new javax.swing.JMenu();
        macercaintegrantes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("* El sistema de reposición completa la capacidad máxima de la máquina de café.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 740, 410));

        btncargastock.setText("Cargar Stock de Máquina");
        getContentPane().add(btncargastock, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 230, 60));

        btnreportestock.setText("Reporte Stock");
        btnreportestock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreportestockActionPerformed(evt);
            }
        });
        getContentPane().add(btnreportestock, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 230, 60));

        btnreporteventa.setText("Reporte  Ventas");
        btnreporteventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreporteventaActionPerformed(evt);
            }
        });
        getContentPane().add(btnreporteventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 240, 60));

        maropt.setText("Menu");

        mnventa.setText("Venta");
        mnventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnventaActionPerformed(evt);
            }
        });
        maropt.add(mnventa);

        mnadmin.setText("Admin");
        maropt.add(mnadmin);

        marsalir.setText("Salir");
        maropt.add(marsalir);

        jMenuBar1.add(maropt);

        macerca.setText("Acerca de");

        macercaintegrantes.setText("Integrantes");
        macerca.add(macercaintegrantes);

        jMenuBar1.add(macerca);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnventaActionPerformed

    private void btnreportestockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreportestockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnreportestockActionPerformed

    private void btnreporteventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreporteventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnreporteventaActionPerformed

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
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.ButtonGroup bg_tamano;
    public javax.swing.ButtonGroup bg_tipo_cafe;
    private javax.swing.JButton btncargastock;
    private javax.swing.JButton btnreportestock;
    private javax.swing.JButton btnreporteventa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenu macerca;
    public javax.swing.JMenuItem macercaintegrantes;
    public javax.swing.JMenu maropt;
    public javax.swing.JMenuItem marsalir;
    private javax.swing.JMenuItem mnadmin;
    public javax.swing.JMenuItem mnventa;
    // End of variables declaration//GEN-END:variables
}
