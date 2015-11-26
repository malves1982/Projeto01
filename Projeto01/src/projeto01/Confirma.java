/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

/**
 *
 * @author malves
 */
public class Confirma {

    Frame f = new Frame();
    Panel pLabel = new Panel();
    Panel pButtons = new Panel();
    Dialog d;

    public Confirma() {
        this.d = new Dialog(f, "deseja realmente cadastrar estas informações?");
        d.setSize(750, 150);
        d.setLocation(300, 200);
        d.setVisible(true);

        Label label = new Label("deseja realmente cadastrar estas informações?");
        Button confirma = new Button("Confirma");
        Button cancela = new Button("Cancela");

        pLabel.add(label);
        pButtons.add(confirma);
        pButtons.add(cancela);

        d.add(pLabel, BorderLayout.NORTH);
        d.add(pButtons, BorderLayout.AFTER_LAST_LINE);
    }

    public static void main(String[] args) {
        Confirma c = new Confirma();
    }

}
