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
public class MaquinaCafe extends javax.swing.JFrame {

    /**
     * Creates new form ListarProducto
     */
    public MaquinaCafe() {
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
        optcortado = new javax.swing.JRadioButton();
        optespresso = new javax.swing.JRadioButton();
        optamericano = new javax.swing.JRadioButton();
        optcapuccino = new javax.swing.JRadioButton();
        optgrande = new javax.swing.JRadioButton();
        optmediano = new javax.swing.JRadioButton();
        optchico = new javax.swing.JRadioButton();
        txtvalor = new javax.swing.JTextField();
        txtvuelto = new javax.swing.JTextField();
        btnpagar = new javax.swing.JButton();
        cbotipoleche = new javax.swing.JComboBox<>();
        cboendulzante = new javax.swing.JComboBox<>();
        txtpago = new javax.swing.JTextField();
        chkextradulce = new javax.swing.JCheckBox();
        btncancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        maropt = new javax.swing.JMenu();
        mmenuadmin = new javax.swing.JMenuItem();
        mmenusalir = new javax.swing.JMenuItem();
        macerca = new javax.swing.JMenu();
        macercaintegrantes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg_tipo_cafe.add(optcortado);
        optcortado.setContentAreaFilled(false);
        optcortado.setEnabled(false);
        optcortado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optcortadoActionPerformed(evt);
            }
        });
        getContentPane().add(optcortado, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        bg_tipo_cafe.add(optespresso);
        optespresso.setContentAreaFilled(false);
        optespresso.setEnabled(false);
        optespresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optespressoActionPerformed(evt);
            }
        });
        getContentPane().add(optespresso, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        bg_tipo_cafe.add(optamericano);
        optamericano.setContentAreaFilled(false);
        optamericano.setEnabled(false);
        optamericano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optamericanoActionPerformed(evt);
            }
        });
        getContentPane().add(optamericano, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        bg_tipo_cafe.add(optcapuccino);
        optcapuccino.setContentAreaFilled(false);
        optcapuccino.setEnabled(false);
        optcapuccino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optcapuccinoActionPerformed(evt);
            }
        });
        getContentPane().add(optcapuccino, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        bg_tamano.add(optgrande);
        optgrande.setContentAreaFilled(false);
        optgrande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optgrandeActionPerformed(evt);
            }
        });
        getContentPane().add(optgrande, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        bg_tamano.add(optmediano);
        optmediano.setContentAreaFilled(false);
        optmediano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optmedianoActionPerformed(evt);
            }
        });
        getContentPane().add(optmediano, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, 20));

        bg_tamano.add(optchico);
        optchico.setContentAreaFilled(false);
        optchico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optchicoActionPerformed(evt);
            }
        });
        getContentPane().add(optchico, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        txtvalor.setBackground(new java.awt.Color(255, 255, 255));
        txtvalor.setForeground(new java.awt.Color(0, 0, 0));
        txtvalor.setEnabled(false);
        getContentPane().add(txtvalor, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 110, 30));

        txtvuelto.setBackground(new java.awt.Color(255, 255, 255));
        txtvuelto.setForeground(new java.awt.Color(0, 0, 0));
        txtvuelto.setEnabled(false);
        getContentPane().add(txtvuelto, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 110, 30));

        btnpagar.setBackground(new java.awt.Color(187, 187, 187));
        btnpagar.setForeground(new java.awt.Color(255, 255, 255));
        btnpagar.setText("PAGAR");
        btnpagar.setEnabled(false);
        btnpagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpagarActionPerformed(evt);
            }
        });
        getContentPane().add(btnpagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, 110, 70));

        cbotipoleche.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Entera", "Descremada", "Soya", "Almendra" }));
        cbotipoleche.setEnabled(false);
        getContentPane().add(cbotipoleche, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, -1, -1));

        cboendulzante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Blanca", "Rubia", "Stevia", "Sin Endulzar" }));
        cboendulzante.setEnabled(false);
        getContentPane().add(cboendulzante, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 370, -1, -1));

        txtpago.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 0, 0), new java.awt.Color(102, 0, 0)));
        txtpago.setEnabled(false);
        getContentPane().add(txtpago, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 100, 30));

        chkextradulce.setText("Extra Dulce");
        chkextradulce.setEnabled(false);
        getContentPane().add(chkextradulce, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, -1, -1));

        btncancelar.setText("Cancelar Preparación");
        getContentPane().add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jScrollPane1.setEnabled(false);
        jScrollPane1.setHorizontalScrollBar(null);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("IMPORTANTE: Si se equivoca en la\npreparación de su café presione el\nbotón \"Cancelar Preparación\" y\nvuelva a intentarlo.");
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 230, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/cliente.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        maropt.setText("Menu");

        mmenuadmin.setText("Admin");
        maropt.add(mmenuadmin);

        mmenusalir.setText("Salir");
        maropt.add(mmenusalir);

        jMenuBar1.add(maropt);

        macerca.setText("Acerca de");

        macercaintegrantes.setText("Integrantes");
        macerca.add(macercaintegrantes);

        jMenuBar1.add(macerca);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void optcortadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optcortadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optcortadoActionPerformed

    private void optespressoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optespressoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optespressoActionPerformed

    private void optamericanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optamericanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optamericanoActionPerformed

    private void optcapuccinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optcapuccinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optcapuccinoActionPerformed

    private void optgrandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optgrandeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optgrandeActionPerformed

    private void optmedianoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optmedianoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optmedianoActionPerformed

    private void optchicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optchicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optchicoActionPerformed

    private void btnpagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnpagarActionPerformed

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
            java.util.logging.Logger.getLogger(MaquinaCafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MaquinaCafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MaquinaCafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MaquinaCafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new MaquinaCafe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.ButtonGroup bg_tamano;
    public javax.swing.ButtonGroup bg_tipo_cafe;
    public javax.swing.JButton btncancelar;
    public javax.swing.JButton btnpagar;
    public javax.swing.JComboBox<String> cboendulzante;
    public javax.swing.JComboBox<String> cbotipoleche;
    public javax.swing.JCheckBox chkextradulce;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenu macerca;
    public javax.swing.JMenuItem macercaintegrantes;
    public javax.swing.JMenu maropt;
    public javax.swing.JMenuItem mmenuadmin;
    public javax.swing.JMenuItem mmenusalir;
    public javax.swing.JRadioButton optamericano;
    public javax.swing.JRadioButton optcapuccino;
    public javax.swing.JRadioButton optchico;
    public javax.swing.JRadioButton optcortado;
    public javax.swing.JRadioButton optespresso;
    public javax.swing.JRadioButton optgrande;
    public javax.swing.JRadioButton optmediano;
    public javax.swing.JTextField txtpago;
    public javax.swing.JTextField txtvalor;
    public javax.swing.JTextField txtvuelto;
    // End of variables declaration//GEN-END:variables
}
