/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import modelo.Modelo;
import vista.Acerca;
import vista.Administracion;

import vista.MaquinaCafe;


/**
 *
 * @author MBpro_Rafa
 */
public class Controlador implements ActionListener {

    //Declarar vista
    
    MaquinaCafe vistaInicial;
    Acerca vistaAcerca = new Acerca();
    Administracion vistaAdmin = new Administracion();

    

    //Declaro el modelo
    Modelo modeloDato = new Modelo();

    //Metodo enumerar donde se agregan los botones o elementos que van a desencadenar acciones (que voy a escuchar)
    public enum Accion {
        
        //opciones menú
        mmenuadmin, //menu MaquinaCafe->menu->admin
        mmenusalir, //menu MaquinaCafe->menu->salir
        macercaintegrantes, // menu MaquinaCafe->acreca de->integrantes
        
        //Comboboxs
        cbotipoleche,// combo tipo de leche vista cliente
        cboendulzante, // combo endulzante vista cliente
        //cbotipopago, // combo paga con (efectivo o tarjeta vista cliente
        
        //radio buttons café
        optespresso, // radio button café espresso vista cliente
        optamericano, // radio button café americano vista cliente
        optcapuccion, // radio button café capuccino vista cliente
        optcortado,// radio button café cortado vista cliente
        
        //radio buttons vaso
        optgrande, // radio button vaso grande
        optmediano, // radio button vaso mediano
        optchico, // radio button vaso chico
        
        
        //Checkbox
        chkextradulce, //Checkbox extra dulce
        
        //Botónes
        btnpagar, // botón pagar vista cliente 
        btnvolver, // botón volver vista acerca de
        btnvolverad, // botón volver vista administracion
        btncancelar, // botón cancelar preparación de café - todo vuelve a cero
        bg_tipo_cafe, // grupo de botones tipo café
        bg_tamano, // grupo de botones tamaño vaso
        
    }

    //Agregamos el constructor de la clase
    public Controlador(MaquinaCafe vistaInicial) {
        this.vistaInicial = vistaInicial;
        //this.vistaElDato.setVisible(true);

    }

    //Creamos metodo para iniciar
    public void iniciar() {

        try {
            this.vistaInicial.setVisible(true);//Hago que la vista sea visible
            this.vistaInicial.setLocationRelativeTo(null);
            this.vistaInicial.setTitle("Máquina de Cafe");

            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            //SwingUtilities.updateComponentTreeUI(vistaInicial);
        } catch (Exception ex) {
        }

        // Escuchamos la opción admin de la barra menú
        this.vistaInicial.mmenuadmin.setActionCommand("mmenuadmin");
        this.vistaInicial.mmenuadmin.addActionListener(this);
        // Escuchamos la opción salir de la barra menú
        this.vistaInicial.mmenusalir.setActionCommand("mmenusalir");
        this.vistaInicial.mmenusalir.addActionListener(this);
        // Escuchamos la opción acerca de integrantes de la barra menú
        this.vistaInicial.macercaintegrantes.setActionCommand("macercaintegrantes");
        this.vistaInicial.macercaintegrantes.addActionListener(this);
        // Escuchamos el boton pagar
        this.vistaInicial.btnpagar.setActionCommand("btnpagar");
        this.vistaInicial.btnpagar.addActionListener(this);

        // Escuchamos el checkbok etra dulce
        this.vistaInicial.chkextradulce.setActionCommand("chkextradulce");
        this.vistaInicial.chkextradulce.addActionListener(this);
        
        // Escuchamos el combobox endulzante
        this.vistaInicial.cboendulzante.setActionCommand("cboendulzante");
        this.vistaInicial.cboendulzante.addActionListener(this);
        // Escuchamos el combobox tipo de leche
        this.vistaInicial.cbotipoleche.setActionCommand("cbotipoleche");
        this.vistaInicial.cbotipoleche.addActionListener(this);
        // Escuchamos el radio button grande
        this.vistaInicial.optgrande.setActionCommand("optgrande");
        this.vistaInicial.optgrande.addActionListener(this);
        // Escuchamos el radio button mediano
        this.vistaInicial.optmediano.setActionCommand("optmediano");
        this.vistaInicial.optmediano.addActionListener(this);
        // Escuchamos el radio button chico
        this.vistaInicial.optchico.setActionCommand("optchico");
        this.vistaInicial.optchico.addActionListener(this);
        // Escuchamos el radio button espresso
        this.vistaInicial.optespresso.setActionCommand("optespresso");
        this.vistaInicial.optespresso.addActionListener(this);
        // Escuchamos el radio button americano
        this.vistaInicial.optamericano.setActionCommand("optamericano");
        this.vistaInicial.optamericano.addActionListener(this);
        // Escuchamos el radio button capuccino
        this.vistaInicial.optcapuccino.setActionCommand("optcapuccino");
        this.vistaInicial.optcapuccino.addActionListener(this);
        // Escuchamos el radio button cortado
        this.vistaInicial.optcortado.setActionCommand("optcortado");
        this.vistaInicial.optcortado.addActionListener(this);
        // Escuchamos botón pagar vista menú
        this.vistaInicial.btnpagar.setActionCommand("btnpagar");
        this.vistaInicial.btnpagar.addActionListener(this);
        // Escuchamos botón volver vista acerca de
        this.vistaAcerca.btnvolver.setActionCommand("btnvolver");
        this.vistaAcerca.btnvolver.addActionListener(this);
        // Escuchamos botón volver vista administración
        this.vistaAdmin.btnvolverad.setActionCommand("btnvolverad");
        this.vistaAdmin.btnvolverad.addActionListener(this);        
        // Escuchamos botón cancelar preparación vista MaquinaCafe
        this.vistaInicial.btncancelar.setActionCommand("btncancelar");
        this.vistaInicial.btncancelar.addActionListener(this);
        // Escuchamos grupo de botones tipo café
        //this.vistaInicial.bg_tipo_cafe.setActionCommand("bg_tipo_cafe");
        //this.vistaInicial.bg_tipo_cafe.addActionListener(this);
        // Escuchamos grupo de botones tamaño vaso
        //this.vistaInicial.bg_tamano.setActionCommand("bg_tamano");
        //this.vistaInicial.bg_tamano.addActionListener(this);
        
        
        
        

    }

    //limpia la tabla
    
    /*public void eliminar() {
        DefaultTableModel tb = (DefaultTableModel) this.vistaInicial.tbProducto.getModel();
        int a = this.vistaInicial.tbProducto.getRowCount() - 1;
        System.out.println(a);
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount() - 1);
        }

    }
    */
    //limpia los datos de pantalla
    public void LimpiarTodo() {
        //limpiamos textfields
        this.vistaInicial.txtvalor.setText("");
        this.vistaInicial.txtvalor.setEnabled(false);
        this.vistaInicial.txtpago.setText("");
        this.vistaInicial.txtpago.setEnabled(false);
        this.vistaInicial.txtvuelto.setText("");
        this.vistaInicial.txtvuelto.setEnabled(false);
        //limpiamos comboboxes
        this.vistaInicial.cboendulzante.setSelectedIndex(0);
        this.vistaInicial.cboendulzante.setEnabled(false);
        this.vistaInicial.cbotipoleche.setSelectedIndex(0);
        this.vistaInicial.cbotipoleche.setEnabled(false);
        //Limpiamos radio buttons
        
        this.vistaInicial.optamericano.setEnabled(false);
        this.vistaInicial.optcapuccino.setEnabled(false);
        this.vistaInicial.optcortado.setEnabled(false);
        this.vistaInicial.optespresso.setEnabled(false);

        this.vistaInicial.bg_tamano.clearSelection();
        this.vistaInicial.bg_tipo_cafe.clearSelection();
        
        
        //limpiamos checkboxes
        this.vistaInicial.chkextradulce.setSelected(false);
        this.vistaInicial.chkextradulce.setEnabled(false);


    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (Accion.valueOf(e.getActionCommand())) {
            
            // case botones
            case btnpagar:
                //llamamos al metodo que esta en el modelo para agragar el dato y le enviamos lo que captura del textField
                
                break;

            case btnvolver:

                this.vistaAcerca.setVisible(false);
                
                break;
            case btnvolverad:

                this.vistaAdmin.setVisible(false);
                this.vistaInicial.setLocationRelativeTo(null);
                this.vistaInicial.setTitle("Máquina de Cafe");
                this.vistaInicial.setVisible(true);

                break;
                
            case btncancelar:
                
                LimpiarTodo();

                break;
            
                
            //Case Radio buttons Vaso

            
            //case opciones barra menú vista MaquinaCafe
            case mmenuadmin:
                try {
                    
                    this.vistaAdmin.setLocationRelativeTo(null);
                    this.vistaAdmin.setTitle("Administración");
                    this.vistaAdmin.setVisible(true);
                    this.vistaInicial.setVisible(false);

                } catch (Exception ex) {
                }
                break;
                
            case mmenusalir:
                System.exit(0);
                break;

            case macercaintegrantes:

                this.vistaAcerca.setLocationRelativeTo(null);
                this.vistaAcerca.setTitle("Acerca de ...");
                this.vistaAcerca.setVisible(true);
                break;

        }

    }

}
