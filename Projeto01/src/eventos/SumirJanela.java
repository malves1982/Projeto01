/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author malves
 */
public class SumirJanela extends WindowAdapter{

    Frame j;

    public SumirJanela(Frame j) {
        this.j = j;
    }
    
    @Override
    public void windowClosing(WindowEvent e) {
        this.j.setVisible(false);
    }
    
    
    
}
