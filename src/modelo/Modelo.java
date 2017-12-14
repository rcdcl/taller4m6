package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sql.Conexion;
import vista.Peliculas;

public class Modelo extends Conexion {

    Peliculas vistaElProducto;

    public Modelo() {
    }

    public Modelo(Peliculas vistaElProducto) {
        this.vistaElProducto = vistaElProducto;
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
    public boolean eliminarDato(int codigo) {
        // Se arma la consulta
        Peliculas ep = new Peliculas();
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

    //Muestra los datos de la BD
    public DefaultTableModel mostrarDato() {
        DefaultTableModel tablemodel = new DefaultTableModel();
        int registros = 0;
        String[] columNames = {"Codigo", "Precio", "Descripcion", "Formato 4K", "Nombre"};
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(*) as total from pelicula");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        Object[][] data = new String[registros][5];
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT pelicula.codigo, pelicula.precio, categoria.descripcion, pelicula.formato4k, pelicula.nombre FROM pelicula INNER JOIN categoria ON pelicula.id_categoria=categoria.id");
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {

                data[i][0] = res.getString("pelicula.codigo");
                data[i][1] = res.getString("pelicula.precio");
                data[i][2] = res.getString("categoria.descripcion");
                data[i][3] = res.getString("pelicula.formato4k");
                data[i][4] = res.getString("pelicula.nombre");
 

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
