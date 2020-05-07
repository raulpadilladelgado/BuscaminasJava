/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiBuscaminas;

import javafx.scene.control.Button;
import javax.swing.JButton;

/**
 *
 * @author Pady
 */
public class Cuadro extends JButton {

    boolean mina;
    boolean marcado;
    int proximidad;
    int id = 0;

    public Cuadro(int id) {
        super();
        if (Math.random() > 0.90) {
            this.mina = true;
        } else {
            this.mina = false;
        }
        this.marcado = false;
        this.proximidad = 0;
        this.id = id;
    }

    public boolean isMina() {
        return mina;
    }

    public void setMina(boolean mina) {
        this.mina = mina;
    }

    public boolean isMarcado() {
        return marcado;
    }

    public void setMarcado(boolean marcado) {
        this.marcado = marcado;
    }

    public int getProximidad() {
        return proximidad;
    }

    public void setProximidad(int proximidad) {
        this.proximidad = proximidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
