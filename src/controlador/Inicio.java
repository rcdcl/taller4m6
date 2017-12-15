package controlador;


import vista.MaquinaCafe;

/**
 *
 * @author MBpro_Rafa
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Controlador(new MaquinaCafe()).iniciar();
    }

}
