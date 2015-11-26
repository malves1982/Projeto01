/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto01;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

/**
 *
 * @author malves
 */
public class CadastroNull {

    Frame f = new Frame();
    Panel p = new Panel();
    
    TextField textFieldNome;
    Choice choiceSexo;
    List listDisciplina;
    TextArea textAreaComentario;

    public CadastroNull() {
        f.setSize(400, 550);
        f.setLocation(100, 100);
        f.setTitle("Cadastro");
        f.setResizable(true);
        f.setVisible(true);

        p.setLayout(null);

        Label labelNome = new Label("Nome");
        labelNome.setSize(80,25);
        labelNome.setLocation(10, 10);
        textFieldNome = new TextField();
        textFieldNome.setLocation(10, 35);
        textFieldNome.setSize(80,25);

        p.add(labelNome);
        p.add(textFieldNome);

        Label labelSexo = new Label("Sexo");
        labelSexo.setLocation(10, 70);
        labelSexo.setSize(80,25);
        choiceSexo = new Choice();
        choiceSexo.addItem("Masculino");
        choiceSexo.addItem("Feminino");
        choiceSexo.setLocation(10, 105);
        choiceSexo.setSize(80,25);

        p.add(labelSexo);
        p.add(choiceSexo);

        Label labelDisciplina = new Label("Disciplina");
        labelDisciplina.setLocation(10, 140);
        labelDisciplina.setSize(80,25);
        listDisciplina = new List(5, true);
        listDisciplina.add("Inteligencia Artificial");
        listDisciplina.add("Programação Orientada a Objetos");
        listDisciplina.add("Compiladores");
        listDisciplina.add("Linguagens Formais e Automatos");
        listDisciplina.add("Redes");
        listDisciplina.setLocation(10, 175);
        listDisciplina.setSize(200,100);

        p.add(labelDisciplina);
        p.add(listDisciplina);

        Label labelComentario = new Label("Comentário");
        labelComentario.setLocation(10, 300);
        labelComentario.setSize(80,25);
        textAreaComentario = new TextArea();
        textAreaComentario.setLocation(10, 335);
        textAreaComentario.setSize(200,100);

        p.add(labelComentario);
        p.add(textAreaComentario);

        Button buttonCadastro = new Button("Cadastro");
        buttonCadastro.setLocation(10, 445);
        buttonCadastro.setSize(80,25);
        
        p.add(buttonCadastro);

        f.add(p);

    }

//    public void saveData() {
//        System.out.println("Salvando dados no banco de dados.");
//        System.out.println("Nome:" + textFieldNome.getText());
//        System.out.println("Sexo: "+ choiceSexo.getSelectedItem());
//        System.out.println("Disciplinas: "+ listDisciplina.getSelectedItem());
//        System.out.println("Comentario: "+ textAreaComentario.getText());
//    }

    public static void main(String[] args) {
        CadastroNull cadastro = new CadastroNull();
    }

}
