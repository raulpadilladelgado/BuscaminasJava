/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiBuscaminas;

import java.awt.Dimension;

/**
 *
 * @author Pady
 */
public class MiBuscaminas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VentantaPrincipal nueva = new VentantaPrincipal();
        nueva.iniciar();
        nueva.setTitle("BUSCAMINAS BY:PADY");
        nueva.setVisible(true);
    }
    
}
