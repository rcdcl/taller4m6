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
        //Object[][] data = new String[registros][11];
            Object[][] data = new String[2][11];
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
            int campo1=6, campo2=6, campo3=6, campo4=6, campo5=6, campo6=6, campo7=6, campo8=6, campo9=6, campo10=6, campo11=6; 
            while (res1.next()) {

                data[i][0] = res1.getString("stock_c");
                
                campo1= Integer.parseInt(String.valueOf(data[i][0]));
                if (campo1 <=5){
                    data[1][0] = "S. BAJO";
                } else {
                    data[1][0] = "S. OK";
                }
            }
            while (res2.next()) {
                data[i][1] = res2.getString("endulzante.stock_end");
                campo2= Integer.parseInt(String.valueOf(data[i][1]));
                if (campo2 <=5){
                    data[1][1] = "S. BAJO";
                } else {
                    data[1][1] = "S. OK";
                }
            }
            while (res3.next()) {               
                data[i][2] = res3.getString("endulzante.stock_end");
                campo3= Integer.parseInt(String.valueOf(data[i][2]));
                if (campo3 <=5){
                    data[1][2] = "S. BAJO";
                } else {
                    data[1][2] = "S. OK";
                }
            }
            while (res4.next()) {               
                data[i][3] = res4.getString("endulzante.stock_end");
                campo4= Integer.parseInt(String.valueOf(data[i][3]));
                if (campo4 <=5){
                    data[1][3] = "S. BAJO";
                } else {
                    data[1][3] = "S. OK";
                }
            }
            while (res5.next()) {               
                data[i][4] = res5.getString("leche.stock_leche");
                campo5= Integer.parseInt(String.valueOf(data[i][4]));
                if (campo5 <=5){
                    data[1][4] = "S. BAJO";
                } else {
                    data[1][4] = "S. OK";
                }
            }
            while (res6.next()) {               
                data[i][5] = res6.getString("leche.stock_leche");
                campo6= Integer.parseInt(String.valueOf(data[i][5]));
                if (campo6 <=5){
                    data[1][5] = "S. BAJO";
                } else {
                    data[1][5] = "S. OK";
                }
            }
            while (res7.next()) {               
                data[i][6] = res7.getString("leche.stock_leche");
                campo7= Integer.parseInt(String.valueOf(data[i][6]));
                if (campo7 <=5){
                    data[1][6] = "S. BAJO";
                } else {
                    data[1][6] = "S. OK";
                }
            }
            while (res8.next()) {               
                data[i][7] = res8.getString("leche.stock_leche");
                campo8= Integer.parseInt(String.valueOf(data[i][7]));
                if (campo8 <=5){
                    data[1][7] = "S. BAJO";
                } else {
                    data[1][7] = "S. OK";
                }
               
            }            
            while (res9.next()) {               
                data[i][8] = res9.getString("vaso.stock_vaso");
                campo9= Integer.parseInt(String.valueOf(data[i][8]));
                if (campo9 <=5){
                    data[1][8] = "S. BAJO";
                } else {
                    data[1][8] = "S. OK";
                }
            }
            while (res10.next()) {               
                data[i][9] = res10.getString("vaso.stock_vaso");
                campo10= Integer.parseInt(String.valueOf(data[i][9]));
                if (campo10 <=5){
                    data[1][9] = "S. BAJO";
                } else {
                    data[1][9] = "S. OK";
                }
            }
            while (res11.next()) {               

                data[i][10] = res11.getString("vaso.stock_vaso");
                campo11= Integer.parseInt(String.valueOf(data[i][10]));
                if (campo11 <=5){
                    data[1][10] = "S. BAJO";
                } else {
                    data[1][10] = "S. OK";
                }                
            }
            
            if ((campo1 <=5)|| (campo2 <=5)|| (campo3 <=5)|| (campo4 <=5)|| (campo5 <=5)|| (campo6 <=5)|| (campo7 <=5)|| (campo8 <=5)|| (campo9 <=5)|| (campo10 <=5)|| (campo11 <=5)){
            JOptionPane.showMessageDialog(null, "¡¡¡ALERTA!!! Stock de insumos crítico.\nRevise detalle en Menu=>Admin=>Reporte de Stock");
            
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
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT venta.id_venta, tipo_cafe.nombre, cafe.cafe, endulzante.tipo_end, venta.ext_end, vaso.tipo_vaso, leche.tipo_leche, venta.descuento, venta.valor_venta FROM venta INNER JOIN tipo_cafe ON venta.id_cafe=tipo_cafe.id_cafe INNER JOIN cafe ON venta.id_coffe=cafe.id_coffe INNER JOIN endulzante ON venta.id_end=endulzante.id_end INNER JOIN leche ON venta.id_leche=leche.id_leche INNER JOIN vaso ON venta.id_vaso=vaso.id_vaso ORDER BY id_venta ASC");
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

    public boolean alertaStock (){
        
        return false;
    }
       
    public boolean descontarStock(){
        
        
        return false;
    }


}
