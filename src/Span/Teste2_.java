package Span;

import java.awt.*;
import javax.swing.*;

public class Teste2_ extends JFrame{
    
    public static void main(String[] args) {
        
        JFrame jf = new JFrame("Tela Alunos");
        jf.setLayout(null);
        jf.setBounds(1, 1, 978, 403);
        jf.setBackground(Color.GRAY);
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //jf.setLocationRelativeTo(null);
        jf.setVisible(true);
         
        JPanel p1 = new JPanel();
        p1.setBounds(0, 50, 480, 250);
        p1.setLayout(null);
        p1.setBackground(Color.LIGHT_GRAY);
        
        JLabel lb4 = new JLabel("ID: ");
        lb4.setBounds(320, 95, 40, 30);
        lb4.setHorizontalAlignment(JLabel.CENTER);
        
        JLabel lb5 = new JLabel("Morada: ");
        lb5.setBounds(20, 135, 80, 30);
        lb5.setHorizontalAlignment(JLabel.CENTER);
        
        JLabel lb6 = new JLabel("Sexo: ");
        lb6.setBounds(320, 135, 40, 30);
        lb6.setHorizontalAlignment(JLabel.CENTER);
        
        JLabel lb7 = new JLabel("Contacto: ");
        lb7.setBounds(20, 175, 80, 30);
        lb7.setHorizontalAlignment(JLabel.CENTER);
        
        JLabel lb8 = new JLabel("E-mail: ");
        lb8.setBounds(20, 215, 80, 30);
        lb8.setHorizontalAlignment(JLabel.CENTER);
        
        JLabel lb9 = new JLabel("Nome: ");
        lb9.setBounds(20, 55, 95, 30);
        lb9.setHorizontalAlignment(JLabel.CENTER);
        
        JLabel lb10 = new JLabel("BI: ");
        lb10.setBounds(20, 95, 80, 30);
        lb10.setHorizontalAlignment(JLabel.CENTER);
        
        JTextField txt1 = new JTextField();
        txt1.setBounds(120, 55, 340, 30);
        txt1.setHorizontalAlignment(JLabel.CENTER);
        
        JTextField txt2 = new JTextField();
        txt2.setBounds(120, 95, 180, 30);
        txt2.setHorizontalAlignment(JLabel.CENTER);
        
        JTextField txt3 = new JTextField();
        txt3.setBounds(120, 135, 180, 30);
        txt3.setHorizontalAlignment(JLabel.CENTER);
        
        JTextField txt4 = new JTextField();
        txt4.setBounds(120, 175, 340, 30);
        txt4.setHorizontalAlignment(JLabel.CENTER);
        
        JTextField txt5 = new JTextField();
        txt5.setBounds(120, 215, 340, 30);
        txt5.setHorizontalAlignment(JLabel.CENTER);
        
        JTextField txt6 = new JTextField();
        txt6.setBounds(365, 95, 95, 30);
        txt6.setHorizontalAlignment(JLabel.CENTER);
        
        JRadioButton rb1 = new JRadioButton("M");
        rb1.setBounds(365, 135, 45, 30);
        rb1.setHorizontalAlignment(JRadioButton.CENTER);
        
        JRadioButton rb2 = new JRadioButton("F");
        rb2.setBounds(414, 135, 45, 30);
        rb2.setHorizontalAlignment(JRadioButton.CENTER);
        
        ButtonGroup rbg = new ButtonGroup();
        
        rbg.add(rb1);
        rbg.add(rb2);
        
        JPanel p2 = new JPanel();
        p2.setBounds(494, 50, 484, 250);
        p2.setLayout(null);
        p2.setBackground(Color.LIGHT_GRAY);
        
        JPanel p3 = new JPanel();
        p3.setBounds(0, 312, 978, 50);
        p3.setLayout(null);
        p3.setBackground(Color.LIGHT_GRAY);
        
        JSeparator js = new JSeparator();
        js.setBackground(Color.GRAY);
        js.setBounds(485, 60, 8, 230);
        js.setOrientation(JSeparator.VERTICAL);
        
        Font fonte = new Font("Stencil", Font.BOLD, 30);
        Font fonte1 = new Font("Tahoma", Font.BOLD, 18);
        
        JLabel lb0 = new JLabel("DADOS DO ALUNO");
        lb0.setBounds(5, 10, 968, 30);
        lb0.setHorizontalAlignment(JLabel.CENTER);
        lb0.setFont(fonte);
        
        JLabel lb1 = new JLabel("DADOS PESSOAIS");
        lb1.setBounds(10, 10, 460, 30);
        lb1.setHorizontalAlignment(JLabel.CENTER);
        lb1.setFont(fonte1);
        
        JLabel lb2 = new JLabel("DADOS ACADEMICOS");
        lb2.setBounds(10, 10, 460, 30);
        lb2.setHorizontalAlignment(JLabel.CENTER);
        lb2.setFont(fonte1);
        
        JSeparator js1 = new JSeparator();
        js1.setBackground(Color.GRAY);
        js1.setBounds(10, 45, 460, 5);
        
        JSeparator js2 = new JSeparator();
        js2.setBackground(Color.GRAY);
        js2.setBounds(10, 45, 450, 5);
        
        
        JLabel lb3 = new JLabel("Ano Lectivo");
        lb3.setBounds(10, 50, 148, 30);
        lb3.setHorizontalAlignment(JLabel.CENTER);
        
        JSpinner jp = new JSpinner();
        //jp.add("2022");
        
        //////////////////////////////////////////
        
        JLabel lb11 = new JLabel("Semestre");
        lb11.setBounds(168, 50, 148, 30);
        lb11.setHorizontalAlignment(JLabel.CENTER);
        
        JRadioButton rb3 = new JRadioButton("1º Semestre");
        rb3.setBounds(168, 130, 148, 30);
        rb3.setHorizontalAlignment(JRadioButton.CENTER);
        
        JRadioButton rb4 = new JRadioButton("1º Semestre");
        rb4.setBounds(168, 170, 148, 30);
        rb4.setHorizontalAlignment(JRadioButton.CENTER);
        
        ButtonGroup rbg1 = new ButtonGroup();
        
        rbg1.add(rb3);
        rbg1.add(rb4);
        
        
        JLabel lb12 = new JLabel("Nível");
        lb12.setBounds(326, 50, 148, 30);
        lb12.setHorizontalAlignment(JLabel.CENTER);
        
        JRadioButton rb5 = new JRadioButton("1º Nível");
        rb5.setBounds(326, 90, 135, 30);
        rb5.setHorizontalAlignment(JRadioButton.CENTER);
        
        JRadioButton rb6 = new JRadioButton("2º Nível");
        rb6.setBounds(326, 130, 135, 30);
        rb6.setHorizontalAlignment(JRadioButton.CENTER);
        
        JRadioButton rb7 = new JRadioButton("3º Nível");
        rb7.setBounds(326, 170, 135, 30);
        rb7.setHorizontalAlignment(JRadioButton.CENTER);
        
        JRadioButton rb8 = new JRadioButton("4º Nível");
        rb8.setBounds(326, 210, 135, 30);
        rb8.setHorizontalAlignment(JRadioButton.CENTER);
        
          
        JSeparator js3 = new JSeparator();
        js3.setBackground(Color.GRAY);
        js3.setBounds(10, 305, 943, 5);
        
        JSeparator js4 = new JSeparator();
        js4.setBackground(Color.GRAY);
        js4.setBounds(10, 260, 450, 5);
        
        Font font = new Font("Tahoma", Font.PLAIN, 18);
        
        JButton btn1 = new JButton("Matricular");
        btn1.setBounds(286, 5, 120, 40);
        btn1.setFont(font);
        
        JButton btn2 = new JButton("Editar");
        btn2.setBounds(436, 5, 100, 40);
        btn2.setFont(font);
        
        JButton btn3 = new JButton("Excluir");
        btn3.setBounds(566, 5, 120, 40);
        btn3.setFont(font);
        
        p1.add(js1);
        
        p1.add(lb1);
        p1.add(lb4);
        p1.add(lb5);
        p1.add(lb6);
        p1.add(lb7);
        p1.add(lb8);
        p1.add(lb9);
        p1.add(lb10);
        
        p1.add(txt1);
        p1.add(txt2);
        p1.add(txt3);
        p1.add(txt4);
        p1.add(txt5);
        p1.add(txt6);
        
        p1.add(rb1);
        p1.add(rb2);
        
        
        
        p2.add(js2);
        
        p2.add(lb2);
        p2.add(lb3);
        p2.add(lb11);
        p2.add(lb12);

        p2.add(rb3);
        p2.add(rb4);
        p2.add(rb5);
        p2.add(rb6);
        p2.add(rb7);
        p2.add(rb8);
        
        p3.add(btn1);
        p3.add(btn2);
        p3.add(btn3);
       
        jf.add(p1);
        jf.add(p2);
        jf.add(p3);
        jf.add(js);
        jf.add(lb0);
        jf.add(js3);
    }
    
}
