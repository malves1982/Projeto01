/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import projeto01.CadastroNull;
import projeto01.LoginNull;

/**
 *
 * @author malves
 */
public class BotaoLoginEvento implements ActionListener {
    
    String defaultUser = "user";
    String defaultPassword = "123";
    TextField userTextField;
    TextField passTextField;
    CadastroNull janelaCadastro;

    public BotaoLoginEvento(TextField user, TextField senha) {
        this.userTextField = user;
        this.passTextField = senha;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("ola");
        String usuarioDigitado = this.userTextField.getText();
        String senhaDigitada = this.passTextField.getText();
        if (usuarioDigitado.equals(defaultUser) && senhaDigitada.equals(defaultPassword)) {
            if (janelaCadastro == null) {
                janelaCadastro = new CadastroNull();
            }
        } else {
            System.out.println("usuario ou senhas invalidos;");
        }
        
    }
    
}
