/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto01;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

/**
 *
 * @author malves
 */
public class Projeto01 extends Frame {

    public Projeto01() {
        setVisible(true);
        setSize(300, 300);
        setTitle("Projeto 01");
        
        SeClicarNoBotao scnb = new SeClicarNoBotao();
        
        Panel p = new Panel();
        
        Button b = new Button("botão");
        b.addActionListener(scnb);
        
        p.add(b);
        
        add(p);
        
    }

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Projeto01();
    }
    
}
