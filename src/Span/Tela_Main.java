package Span;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Tela_Main extends JFrame{

    public Tela_Main(){
        
        JFrame tela1 = new JFrame("Tela Principal");
        tela1.setBounds(50, 50, 990, 700);
        tela1.setResizable(false);
        tela1.setLocationRelativeTo(null);
        tela1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        tela1.setLayout(null);
        
        JPanel painel1 = new JPanel();
        painel1.setLayout(null);
        painel1.setBackground(Color.GRAY);
        painel1.setBounds(2, 2, 980, 110);
        
        Font font1 = new Font("Stencil", Font.BOLD, 48);
        
        JLabel lb1 = new JLabel("Abgail's English School");
        lb1.setBounds(2, 5, 976, 70);
        lb1.setHorizontalAlignment(JLabel.CENTER);
        lb1.setForeground(Color.BLACK);
        lb1.setFont(font1);
        
        Font font2 = new Font("Viner Hand ITC", Font.BOLD, 14);
                
        JLabel lb2 = new JLabel("Venha aprender conosco e comunique-se com e em todo o mundo");
        lb2.setBounds(2, 70, 976, 30);
        lb2.setHorizontalAlignment(JLabel.CENTER);
        lb2.setForeground(Color.BLACK);
        lb2.setFont(font2);
        
        JPanel painel2 = new JPanel();
        painel2.setLayout(null);
        painel2.setBackground(Color.LIGHT_GRAY);
        painel2.setBounds(2, 115, 980, 120);
        
        Font font3 = new Font("Stencil", Font.BOLD, 36);
        
        JLabel lb3 = new JLabel("Menú");
        lb3.setBounds(2, 10, 976, 30);
        lb3.setHorizontalAlignment(JLabel.CENTER);
        lb3.setForeground(Color.BLACK);
        lb3.setFont(font3);
        
        Font font4 = new Font("Viner Hand ITC", Font.BOLD, 16);
        
        JButton jb1 = new JButton("ALUNOS");
        jb1.setBounds(10, 50, 184, 60);
        jb1.setFont(font4);
              
        JButton jb2 = new JButton("PROFESSORES");
        jb2.setBounds(204, 50, 184, 60);
        jb2.setFont(font4);
        
        JButton jb3 = new JButton("TURMAS");
        jb3.setBounds(398, 50, 184, 60);
        jb3.setFont(font4);
        
        JButton jb4 = new JButton("SAIR");
        jb4.setBounds(592, 50, 184, 60);
        jb4.setFont(font4);
        
        JButton jb5 = new JButton("SOBRE NOS");
        jb5.setBounds(786, 50, 184, 60);
        jb5.setFont(font4);
        
        JDesktopPane painel3 = new JDesktopPane();
        painel3.setLayout(null);
        painel3.setBackground(Color.LIGHT_GRAY);
        painel3.setBounds(2, 240, 980, 405);
        
        JLabel lb4 = new JLabel("Copyright © 2022, Powered by Abgail LOIDE, Todos os direitos reservados");
        lb4.setBounds(5, 645, 990, 20);
        lb4.setHorizontalAlignment(JLabel.CENTER);
        
        ActionListener al1 = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                if("alunos".equals(e.getActionCommand())){
                   
                    Tela_Alunos inst = new Tela_Alunos();
                    painel3.removeAll();
                    painel3.add(inst).setVisible(true);
                    //inst.setVisible(true);
                    

                    //painel3.setBackground(Color.red);
                }
            }
        };
        
        jb1.setActionCommand("alunos");
        jb1.addActionListener(al1);
        
        
        ActionListener al2 = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                if("prof".equals(e.getActionCommand())){
                   
                    Tela_Professores inst = new Tela_Professores();
                    painel3.add(inst);
                    inst.setVisible(true);
                    
                }
            }
        };
        
        jb2.setActionCommand("prof");
        jb2.addActionListener(al2);
        
        
        painel2.add(lb3);
        painel2.add(jb1);
        painel2.add(jb2);
        painel2.add(jb3);
        painel2.add(jb4);
        painel2.add(jb5);
        
        painel1.add(lb1);
        painel1.add(lb2);
        
        tela1.add(painel1);
        tela1.add(painel2);
        tela1.add(painel3);
        tela1.add(lb4);
        
        tela1.setVisible(true);
          
    }
    
    public static void main(String[] args) {
        
        new Tela_Main();
        
    }
    
}
