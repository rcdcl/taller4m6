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
import vista.Peliculas;

/**
 *
 * @author MBpro_Rafa
 */
public class Controlador implements ActionListener {

    //Declarar vista
    Peliculas vistaElProducto;

    //Declaro el modelo
    Modelo modeloDato = new Modelo();

    //Metodo enumerar donde se agregan los botones o elementos que van a desencadenar acciones (que voy a escuchar)
    public enum Accion {
        btnagregar,//boton agregar de vista
        btnmodificar,// botón modificar de vista
        btneliminar,// botón eliminar de vista
        btnmostrar,// botón mostrar de vista
        btnlimpiar,//botón limpiar de vista
        btnsalir,// botón salir vista
        btnbuscar,// botón buscar vista
        cbodescripcion// combo descripcion vista
    }

    //Agregamos el constructor de la clase
    public Controlador(Peliculas vistaElProducto) {
        this.vistaElProducto = vistaElProducto;
        //this.vistaElDato.setVisible(true);

    }

    //Creamos metodo para iniciar
    public void iniciar() {

        try {
            this.vistaElProducto.setVisible(true);//Hago que la vista sea visible
            this.vistaElProducto.setLocationRelativeTo(null);
            this.vistaElProducto.setTitle("VideoBuster");

            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            //SwingUtilities.updateComponentTreeUI(vistaElProducto);
        } catch (Exception ex) {
        }

        //catch (UnsupportedLookAndFeelException ex){}
        //catch (ClassNotFoundException ex) {}
        //catch (InstantiationException ex) {}
        //catch (IllegalAccessException ex) {}
        // Escuchamos el boton que ingresa el dato
        this.vistaElProducto.btnagregar.setActionCommand("btnagregar");
        this.vistaElProducto.btnagregar.addActionListener(this);
        // Escuchamos el boton que modifica el dato
        this.vistaElProducto.btnmodificar.setActionCommand("btnmodificar");
        this.vistaElProducto.btnmodificar.addActionListener(this);
        // Escuchamos el boton que elimina el dato
        this.vistaElProducto.btneliminar.setActionCommand("btneliminar");
        this.vistaElProducto.btneliminar.addActionListener(this);
        // Escuchamos el boton que muestra el dato
        this.vistaElProducto.btnmostrar.setActionCommand("btnmostrar");
        this.vistaElProducto.btnmostrar.addActionListener(this);

        // Escuchamos el boton que limpia datos de pantalla
        this.vistaElProducto.btnlimpiar.setActionCommand("btnlimpiar");
        this.vistaElProducto.btnlimpiar.addActionListener(this);
        
        // Escuchamos el boton que salir
        this.vistaElProducto.btnsalir.setActionCommand("btnsalir");
        this.vistaElProducto.btnsalir.addActionListener(this);
        // Escuchamos el boton que buscar
        this.vistaElProducto.btnbuscar.setActionCommand("btnbuscar");
        this.vistaElProducto.btnbuscar.addActionListener(this);
        // Escuchamos el bcombo descripción
        this.vistaElProducto.cbodescripcion.setActionCommand("cbodescripcion");
        this.vistaElProducto.cbodescripcion.addActionListener(this);

    }

    //limpia la tabla
    public void eliminar() {
        DefaultTableModel tb = (DefaultTableModel) this.vistaElProducto.tbProducto.getModel();
        int a = this.vistaElProducto.tbProducto.getRowCount() - 1;
        System.out.println(a);
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount() - 1);
        }

    }

    //limpia los datos de pantalla
    public void limpiartodo() {
        this.vistaElProducto.txtnombre.setText("");
        this.vistaElProducto.cbodescripcion.setSelectedIndex(0);
        this.vistaElProducto.txtcodigo.setText("0");
        this.vistaElProducto.txtprecio.setText("0");
        this.vistaElProducto.cboformato.setSelectedIndex(0);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (Accion.valueOf(e.getActionCommand())) {
            case btnagregar:
                //llamamos al metodo que esta en el modelo para agragar el dato y le enviamos lo que captura del textField
                
                try{
                
                Peliculas ep = new Peliculas();
                String active, active2;


                active = String.valueOf(this.vistaElProducto.cboformato.getSelectedItem());
                active2 = String.valueOf(this.vistaElProducto.cbodescripcion.getSelectedItem());
                

                System.out.println(active);
                boolean correcto1 = false,
                 correcto2 = false;
                

                int verificacioncodigo = Integer.parseInt(this.vistaElProducto.txtcodigo.getText());

                int verificacionprecio = Integer.parseInt(this.vistaElProducto.txtprecio.getText());



                if (verificacioncodigo < 10000 || verificacioncodigo > 99999) {

                    JOptionPane.showMessageDialog(null, "El código debe estar entre 10000 y 99999. Intente nuevamente");

                } else {

                    if (active == "Seleccione" || active2 == "Seleccione") {
                        JOptionPane.showMessageDialog(null, "Debe seleccionar Formato de pelicula y descripción");

                        System.out.println(active);

                    } else {

                        if (verificacionprecio <= 0) {
                            JOptionPane.showMessageDialog(null, "El precio debe ser mayor que 0");
                        } else {

                            
                            
                            if (this.modeloDato.agregarDatoProducto(Integer.parseInt(this.vistaElProducto.txtcodigo.getText()), this.vistaElProducto.txtnombre.getText(), this.vistaElProducto.cbodescripcion.getSelectedIndex(), Integer.parseInt(this.vistaElProducto.txtprecio.getText()), String.valueOf(this.vistaElProducto.cboformato.getSelectedItem()))) {

                                JOptionPane.showMessageDialog(null, "El Producto se agregó correctamente");

                                limpiartodo();
                                eliminar();

                            } else {
                                JOptionPane.showMessageDialog(null, "No se pudo agregar");
                            }
                        }
                    }
                }
                } catch (Exception ex){}

                break;



            case btneliminar:
                //llamamos método para eliminar dato
                int codigos = Integer.parseInt(this.vistaElProducto.txtcodigo.getText());
                boolean confirmacion = false;
                System.out.println("btneliminar");
                confirmacion = this.modeloDato.eliminarDato(codigos);
                if (confirmacion == true) {
                    JOptionPane.showMessageDialog(null, "El registro fue eliminado con éxito");
                }
                this.vistaElProducto.tbProducto.setModel(this.modeloDato.mostrarDato());
                break;

            case btnmodificar:
                //lamamos método para modificar valores del producto menos el código
                if (this.modeloDato.modificarDato(Integer.parseInt(this.vistaElProducto.txtcodigo.getText()), this.vistaElProducto.txtnombre.getText(), this.vistaElProducto.cbodescripcion.getSelectedIndex(), Integer.parseInt(this.vistaElProducto.txtprecio.getText()), String.valueOf(this.vistaElProducto.cboformato.getSelectedItem()))) {

                    JOptionPane.showMessageDialog(null, "El Producto se modificó correctamente");

                    //Limpiamos
                    limpiartodo();
                    eliminar();

                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo modificar");
                }

                System.out.println("btnmodificar");
                this.vistaElProducto.tbProducto.setModel(this.modeloDato.mostrarDato());
                break;

            case btnmostrar:

                this.vistaElProducto.tbProducto.setModel(this.modeloDato.mostrarDato());
                break;

            case btnsalir:
            
                System.exit(0);
                break;
                
            case btnbuscar:
                int codigoss = Integer.parseInt(this.vistaElProducto.txtcodigo.getText());
                boolean bconfirmacion = false;
                System.out.println("buscar");
                this.vistaElProducto.tbProducto.setModel((TableModel) this.modeloDato.buscarDato(codigoss));
                if (bconfirmacion == true) {
                    JOptionPane.showMessageDialog(null, "El registro fue eliminado con éxito");
                }
                
                break;
                
            case btnlimpiar:
                eliminar();
                limpiartodo();
                break;

        }

    }

}
