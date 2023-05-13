
package Span;

import java.awt.*;
import javax.swing.*;

public class Tela_Turmas {

    public Tela_Turmas(){
        JFrame jf = new JFrame();
        jf.setLayout(null);
        jf.setBounds(1, 1, 978, 403);
        jf.setBackground(Color.GRAY);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
        
        Font fonte = new Font("Stencil", Font.BOLD, 30);
        
        JLabel lb0 = new JLabel("DADOS DO Professor");
        lb0.setBounds(5, 10, 968, 30);
        lb0.setHorizontalAlignment(JLabel.CENTER);
        lb0.setFont(fonte); 
        
        JPanel p = new JPanel();
        p.setBounds(1, 50, 960, 310);
        p.setLayout(null);
        p.setBackground(Color.LIGHT_GRAY);
        
        JLabel lb1 = new JLabel("Ano Lectivo: ");
        lb1.setHorizontalAlignment(JLabel.CENTER);
        lb1.setBounds(210, 20, 100, 30);
        
        JSpinner js = new JSpinner();
        js.setBounds(311, 20, 80, 30);
        
        
        JLabel lb2 = new JLabel("Semetre: ");
        lb2.setHorizontalAlignment(JLabel.CENTER);
        lb2.setBounds(410, 20, 60, 30);
        
        JComboBox cb1 = new JComboBox();
        cb1.setBounds(480, 20, 120, 30);
        cb1.addItem("1º Semestre");
        cb1.addItem("2º Semestre");
        
        JLabel lb3 = new JLabel("Nível: ");
        lb3.setHorizontalAlignment(JLabel.CENTER);
        lb3.setBounds(615, 20, 50, 30);
        
        JComboBox cb2 = new JComboBox();
        cb2.setBounds(666, 20, 100, 30);
        cb2.addItem("1º Nível");
        cb2.addItem("2º Nível");
        cb2.addItem("3º Nível");
        cb2.addItem("4º Nível");
        
        JSeparator js1 = new JSeparator();
        js1.setBackground(Color.GRAY);
        js1.setBounds(15, 60, 930, 10);
        
        JTable tbl = new JTable();
        tbl.setBounds(20, 70, 920, 200);
        
        JButton btn = new JButton("Pesquisar");
        btn.setBounds(440, 275, 110, 30);
        btn.setHorizontalAlignment(JButton.CENTER);
        
        p.add(lb1);
        p.add(lb2);
        p.add(lb3);
        
        p.add(js);
        p.add(js1);
        
        p.add(cb1);
        p.add(cb2);
        
        p.add(tbl);
        
        p.add(btn);
        
        jf.add(lb0);
        jf.add(p);
    }
    
    public static void main(String[] args) {
        new Tela_Turmas();
    }
    
}
