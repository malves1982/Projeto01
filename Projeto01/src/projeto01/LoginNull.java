/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto01;

import eventos.BotaoLoginEvento;
import eventos.FechaJanelaEvento;
import eventos.SumirJanela;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

/**
 *
 * @author malves
 */
public class LoginNull {
    Frame f = new Frame();
    Panel p = new Panel();
    
    public LoginNull() {
        f.setSize(300, 200);
        f.setLocation(100, 100);
        f.setTitle("Login");
        f.setResizable(true);
        f.setVisible(true);
        f.addWindowListener(new SumirJanela(f));
        
        p.setLayout(null);
        
        Label labelEmail = new Label("Email:");
        labelEmail.setLocation(10, 10);
        labelEmail.setSize(80,25);
        
        TextField textFieldEmail = new TextField();
        textFieldEmail.setLocation(90, 10);
        textFieldEmail.setSize(80,25);
        
        Label labelSenha = new Label("Senha:");
        labelSenha.setLocation(10, 40);
        labelSenha.setSize(80,25);
        
        TextField textFieldSenha = new TextField();
        textFieldSenha.setLocation(90, 40);
        textFieldSenha.setSize(80,25);
        
        Button buttonLogin = new Button("Login");
        buttonLogin.setLocation(10, 70);
        buttonLogin.setSize(80,25);
        buttonLogin.addActionListener(new BotaoLoginEvento(textFieldEmail,textFieldSenha));
        
        p.add(labelEmail);
        p.add(textFieldEmail);
        p.add(labelSenha);
        p.add(textFieldSenha);
        p.add(buttonLogin);
                
        f.add(p);
    }
    
    public static void main(String[] args) {
        LoginNull login = new LoginNull(); 
    }
    
}
