package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sql.Conexion;


public class Modelo extends Conexion {

    /*
    Cliente vistaElProducto;

    public Modelo() {
    }

    public Modelo(Cliente vistaElProducto) {
        this.vistaElProducto = vistaElProducto;
    }
    */
    
    public DefaultTableModel reporteStock() {
        
        DefaultTableModel tablemodel = new DefaultTableModel();
        int registros = 0;
        String[] columNames = 
        {"Cafe", "A.Blanca", "A.Rubia", "Stevia","L.Entera","L.Descremada", "L.Soya", "L.Almendra",
            "V.Chico","V.Mediano","V.Grande"};

        try {
            PreparedStatement pstm1 = this.getConexion().prepareStatement("SELECT count(*) as total from cafe");
            ResultSet res1 = pstm1.executeQuery();
            res1.next();
            registros = res1.getInt("total");
            res1.close();
            //
            PreparedStatement pstm2 = this.getConexion().prepareStatement("SELECT count(*) as total from endulzante");
            ResultSet res2 = pstm2.executeQuery();
            res2.next();
            registros = res2.getInt("total");
            res2.close();
            //
            PreparedStatement pstm3 = this.getConexion().prepareStatement("SELECT count(*) as total from endulzante");
            ResultSet res3 = pstm3.executeQuery();
            res3.next();
            registros = res3.getInt("total");
            res3.close();
            //
            PreparedStatement pstm4 = this.getConexion().prepareStatement("SELECT count(*) as total from endulzante");
            ResultSet res4 = pstm4.executeQuery();
            res4.next();
            registros = res4.getInt("total");
            res4.close();
            //
            PreparedStatement pstm5 = this.getConexion().prepareStatement("SELECT count(*) as total from leche");
            ResultSet res5 = pstm5.executeQuery();
            res5.next();
            registros = res5.getInt("total");
            res5.close();
            //
            PreparedStatement pstm6 = this.getConexion().prepareStatement("SELECT count(*) as total from leche");
            ResultSet res6 = pstm6.executeQuery();
            res6.next();
            registros = res6.getInt("total");
            res6.close();
            //
            PreparedStatement pstm7 = this.getConexion().prepareStatement("SELECT count(*) as total from leche");
            ResultSet res7 = pstm7.executeQuery();
            res7.next();
            registros = res7.getInt("total");
            res7.close();
            //
            PreparedStatement pstm8 = this.getConexion().prepareStatement("SELECT count(*) as total from leche");
            ResultSet res8 = pstm8.executeQuery();
            res8.next();
            registros = res8.getInt("total");
            res8.close();
            //
            PreparedStatement pstm9 = this.getConexion().prepareStatement("SELECT count(*) as total from vaso");
            ResultSet res9 = pstm9.executeQuery();
            res9.next();
            registros = res9.getInt("total");
            res9.close();
            //
            PreparedStatement pstm10 = this.getConexion().prepareStatement("SELECT count(*) as total from vaso");
            ResultSet res10 = pstm10.executeQuery();
            res10.next();
            registros = res10.getInt("total");
            res10.close();
            //
            PreparedStatement pstm11 = this.getConexion().prepareStatement("SELECT count(*) as total from vaso");
            ResultSet res11 = pstm11.executeQuery();
            res11.next();
            registros = res11.getInt("total");
            res11.close();
            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        Object[][] data = new String[registros][11];
        try {
            PreparedStatement pstm1 = this.getConexion().prepareStatement(
            "select stock_c from cafe where id_coffe = 1;");    // Stock Cafe
            PreparedStatement pstm2 = this.getConexion().prepareStatement(
            "select stock_end from endulzante where id_end = 1;" );//Stock azucar blanca
            PreparedStatement pstm3 = this.getConexion().prepareStatement(
            "select stock_end from endulzante where id_end = 2;" ); //Stock azucar Rubia
            PreparedStatement pstm4 = this.getConexion().prepareStatement(
            "select stock_end from endulzante where id_end = 3;"); //Stock Stevia
            PreparedStatement pstm5 = this.getConexion().prepareStatement(
            "select stock_leche from leche where id_leche = 1;" ); //Stock Leche Entera
            PreparedStatement pstm6 = this.getConexion().prepareStatement(
            "select stock_leche from leche where id_leche = 2;"); //Stock Leche Descremada
            PreparedStatement pstm7 = this.getConexion().prepareStatement(
            "select stock_leche from leche where id_leche = 3;" ); //Stock Leche Soya
            PreparedStatement pstm8 = this.getConexion().prepareStatement(
            "select stock_leche from leche where id_leche = 4;"); //Stock Leche Almendra
            PreparedStatement pstm9 = this.getConexion().prepareStatement(
            "select stock_vaso from vaso where id_vaso = 1;" ); //Stock Vaso Chico
            PreparedStatement pstm10 = this.getConexion().prepareStatement(
            "select stock_vaso from vaso where id_vaso = 2;" ); //Stock Vaso Mediano
            PreparedStatement pstm11 = this.getConexion().prepareStatement(
            "select stock_vaso from vaso where id_vaso = 3;" ); //Stock Vaso Grande
     
            ResultSet res1 = pstm1.executeQuery();
            ResultSet res2 = pstm2.executeQuery();
            ResultSet res3 = pstm3.executeQuery();
            ResultSet res4 = pstm4.executeQuery();
            ResultSet res5 = pstm5.executeQuery();
            ResultSet res6 = pstm6.executeQuery();
            ResultSet res7 = pstm7.executeQuery();
            ResultSet res8 = pstm8.executeQuery();
            ResultSet res9 = pstm9.executeQuery();
            ResultSet res10 = pstm10.executeQuery();
            ResultSet res11 = pstm11.executeQuery();

            int i = 0;
            while (res1.next()) {

                data[i][0] = res1.getString("stock_c");               
            }
            while (res2.next()) {
                data[i][1] = res2.getString("endulzante.stock_end");                               
            }
            while (res3.next()) {               
                data[i][2] = res3.getString("endulzante.stock_end");              
            }
            while (res4.next()) {               
                data[i][3] = res4.getString("endulzante.stock_end");             
            }
            while (res5.next()) {               
                data[i][4] = res5.getString("leche.stock_leche");
            }
            while (res6.next()) {               
                data[i][5] = res6.getString("leche.stock_leche");               
            }
            while (res7.next()) {               
                data[i][6] = res7.getString("leche.stock_leche");              
            }
            while (res8.next()) {               
                data[i][7] = res8.getString("leche.stock_leche");
               
            }            
            while (res9.next()) {               
                data[i][8] = res9.getString("vaso.stock_vaso");             
            }
            while (res10.next()) {               
                data[i][9] = res10.getString("vaso.stock_vaso");              
            }
            while (res11.next()) {               

                data[i][10] = res11.getString("vaso.stock_vaso");                
            }
            res1.close(); res2.close();res3.close();res4.close();res5.close();res6.close();
            res7.close();res8.close();res9.close();res10.close();res11.close();
            tablemodel.setDataVector(data, columNames);            
            getConexion().close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return tablemodel;
       
    }

    public DefaultTableModel reporteVentas() {
        DefaultTableModel tablemodel = new DefaultTableModel();
        int registros = 0;
        String[] columNames = {"id_venta", "nombre", "café", "Endulzante", "Extra Endulzante", "Tamaño vaso", "Tipo Leche", "Descuento", "Valor Venta"};
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(*) as total from venta");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        Object[][] data = new String[registros][9];
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT venta.id_venta, tipo_cafe.nombre, cafe.cafe, endulzante.tipo_end, venta.ext_end, vaso.tipo_vaso, leche.tipo_leche, venta.descuento, venta.valor_venta FROM venta INNER JOIN tipo_cafe ON venta.id_cafe=tipo_cafe.id_cafe INNER JOIN cafe ON venta.id_coffe=cafe.id_coffe INNER JOIN endulzante ON venta.id_end=endulzante.id_end INNER JOIN leche ON venta.id_leche=leche.id_leche INNER JOIN vaso ON venta.id_vaso=vaso.id_vaso");
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {

                data[i][0] = res.getString("venta.id_venta");
                data[i][1] = res.getString("tipo_cafe.nombre");
                data[i][2] = res.getString("cafe.cafe");
                data[i][3] = res.getString("endulzante.tipo_end");
                data[i][4] = res.getString("venta.ext_end");
                data[i][5] = res.getString("vaso.tipo_vaso");
                data[i][6] = res.getString("leche.tipo_leche");
                data[i][7] = res.getString("venta.descuento");
                data[i][8] = res.getString("venta.valor_venta");
 

                i++;
            }
            res.close();
            tablemodel.setDataVector(data, columNames);
            getConexion().close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return tablemodel;

    }

    
    
    
    public boolean cargarStock() {

        return true;
    }
    // Método para consultar ventas que se usa en e controlador para generar descuento    
    public int consultaCantidadVendida(){
        DefaultTableModel tablemodel = new DefaultTableModel();
        int registros = 0;
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(*) as total from venta");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        
        
        //registros=6;
        return registros;
        
        
    }

    public boolean insertarVenta (int ext_end, int descuento, int id_cafe, int id_coffe, int id_end, int id_leche, int id_vaso, int valor_venta){
        
        //preparo el query
        String query = "INSERT INTO venta (ext_end, descuento, id_cafe, id_coffe, id_end, id_leche, id_vaso, valor_venta)" 
                + "values ('"+ext_end+"', '"+descuento+"', '"+id_cafe+"', '"+id_coffe+"', '"+id_end+"', '"+id_leche+"', '"+id_vaso+"', '"+valor_venta+"');";
        //envío query
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(query);
            pstm.execute();
            pstm.close();
            getConexion().close();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());

        }

        return false;
        
        
    }


        //Agregar datos a la BD
    public boolean agregarDatoProducto(int codigo, String nombre, int id_categoria, int precio, String formato) {
        // Se arma la consulta para verificar si el código a ingresar ya existe

        //Se envía el dato
        String query = "INSERT INTO pelicula (codigo, precio, id_categoria, formato4K, nombre)" 
                + "values ('"+codigo+"', '"+precio+"', '"+id_categoria+"', '"+formato+"', '"+nombre+"');";


        //se ejecuta la consulta
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(query);
            pstm.execute();
            pstm.close();
            getConexion().close();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());

        }

        return false;

    }
    //Buscar datos dentro de la BD

    public Object buscarDato(int codigo) {
        DefaultTableModel tablemodel = new DefaultTableModel();
        //int registros = 0;
        String[] columNames = {"Codigo", "Precio", "Descripcion", "Formato 4K", "Nombre"};

        Object[][] data = new String[1][5];
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT pelicula.codigo, pelicula.precio, categoria.descripcion, pelicula.formato4k, pelicula.nombre FROM pelicula INNER JOIN categoria ON pelicula.id_categoria=categoria.id where codigo ='" + codigo + "'");
            ResultSet res = pstm.executeQuery();
            System.out.println(codigo);
            String scodigo = String.valueOf(codigo);

            System.out.println(scodigo);

            int i = 0;
            while (res.next()) {

                data[0][0] = res.getString("pelicula.codigo");
                data[0][1] = res.getString("pelicula.precio");
                data[0][2] = res.getString("categoria.descripcion");
                data[0][3] = res.getString("pelicula.formato4k");
                data[0][4] = res.getString("pelicula.nombre");


                i++;
            }
            if (i == 0) {
                JOptionPane.showMessageDialog(null, "El código no existe en la BD");
            }

            res.close();
            tablemodel.setDataVector(data, columNames);
            getConexion().close();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return tablemodel;

    }

    //Eliminar Dato de la BD 
    /*
    public boolean eliminarDato(int codigo) {
        // Se arma la consulta
        Cliente ep = new Cliente();
        Object o = new Object();

        System.out.println("buscarDato()");
        System.out.println(codigo);
        //ResultSet rs = null;

        try {
            String query = "delete from pelicula where codigo ='" + codigo + "'";
            PreparedStatement pstm = this.getConexion().prepareStatement(query);
            pstm.execute(query);
            //pstm.close();

            pstm.close();
            getConexion().close();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());

        }

        return false;

    }
    */

    

    //Modificar los datos de la BD
    public boolean modificarDato(int codigo, String nombre, int id_categoria, int precio, String formato) {
        String query = "update pelicula set nombre= '" + nombre + "', id_categoria= '" + id_categoria + "', precio= '" + precio + "', formato4k= '" + formato + "' where codigo ='" + codigo + "'";

        //se ejecuta update
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(query);
            pstm.execute();
            pstm.close();
            getConexion().close();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());

        }

        return false;

    }

    //Modificar los datos de la BD


}
