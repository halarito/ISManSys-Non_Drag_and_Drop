
package Formulários;

import java.awt.*;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Tela_Sobre extends JInternalFrame{

    public Tela_Sobre(){
        
        initComponents();
    
    }
    
    @SuppressWarnings("unchecked")
    
    private void initComponents(){
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 970, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setClosable(true);
        setMaximizable(true);
        setResizable(false);
        
        
        lb0.setBounds(10, 10, 958, 30);
        lb0.setHorizontalAlignment(JLabel.CENTER);
        lb0.setFont(fonte);
        lb0.setForeground(Color.BLACK);
        
        p.setBounds(1, 50, 968, 310);
        p.setLayout(null);
        p.setBackground(Color.LIGHT_GRAY);
        
        lb24.setHorizontalAlignment(JLabel.CENTER);
        lb24.setBounds(5, 10, 310, 30);
        lb24.setFont(fonte2);
        lb24.setForeground(Color.BLACK);
        
        txtA.setBounds(15, 50, 290, 230);
        txtA.setFont(fonte1);
        
        js1.setOrientation(JSeparator.VERTICAL);
        js1.setBackground(Color.GRAY);
        js1.setBounds(320, 40, 10, 250);
        
        lb16.setHorizontalAlignment(JLabel.CENTER);
        lb16.setBounds(320, 10, 230, 30);
        lb16.setFont(fonte2);
        lb16.setForeground(Color.BLACK);
        
        lb17.setHorizontalAlignment(JLabel.CENTER);
        lb17.setBounds(315, 50, 250, 30);
        
        lb18.setHorizontalAlignment(JLabel.CENTER);
        lb18.setBounds(315, 85, 250, 30);
        
        lb19.setHorizontalAlignment(JLabel.CENTER);
        lb19.setBounds(315, 120, 250, 30);
        
        lb20.setHorizontalAlignment(JLabel.CENTER);
        lb20.setBounds(315, 155, 250, 30);
        
        lb21.setHorizontalAlignment(JLabel.CENTER);
        lb21.setBounds(315, 190, 250, 30);
        
        lb22.setHorizontalAlignment(JLabel.CENTER);
        lb22.setBounds(315, 225, 250, 30);
        
        lb23.setHorizontalAlignment(JLabel.CENTER);
        lb23.setBounds(315, 260, 250, 30);
        
        js2.setOrientation(JSeparator.VERTICAL);
        js2.setBackground(Color.GRAY);
        js2.setBounds(550, 40, 10, 250);
        
        lb8.setHorizontalAlignment(JLabel.CENTER);
        lb8.setBounds(550, 10, 250, 30);
        lb8.setFont(fonte2);
        lb8.setForeground(Color.BLACK);
        
        lb9.setHorizontalAlignment(JLabel.CENTER);
        lb9.setBounds(545, 50, 250, 30);
        
        lb10.setHorizontalAlignment(JLabel.CENTER);
        lb10.setBounds(545, 85, 250, 30);
        
        lb11.setHorizontalAlignment(JLabel.CENTER);
        lb11.setBounds(545, 120, 250, 30);
        
        lb12.setHorizontalAlignment(JLabel.CENTER);
        lb12.setBounds(545, 155, 250, 30);
        
        lb13.setHorizontalAlignment(JLabel.CENTER);
        lb13.setBounds(545, 190, 250, 30);
        
        lb14.setHorizontalAlignment(JLabel.CENTER);
        lb14.setBounds(545, 225, 250, 30);
        
        lb15.setHorizontalAlignment(JLabel.CENTER);
        lb15.setBounds(545, 260, 250, 30);
        
        js3.setOrientation(JSeparator.VERTICAL);
        js3.setBackground(Color.GRAY);
        js3.setBounds(800, 40, 10, 250);
        
        lb1.setHorizontalAlignment(JLabel.CENTER);
        lb1.setBounds(840, 10, 80, 30);
        lb1.setFont(fonte2);
        lb1.setForeground(Color.BLACK);
        
        lb2.setHorizontalAlignment(JLabel.CENTER);
        lb2.setBounds(810, 65, 135, 30);
        
        lb3.setHorizontalAlignment(JLabel.CENTER);
        lb3.setBounds(810, 100, 135, 30);
        
        lb4.setHorizontalAlignment(JLabel.CENTER);
        lb4.setBounds(810, 135, 135, 30);
        
        lb5.setHorizontalAlignment(JLabel.CENTER);
        lb5.setBounds(810, 170, 135, 30);
        
        lb6.setHorizontalAlignment(JLabel.CENTER);
        lb6.setBounds(810, 205, 135, 30);
        
        lb7.setHorizontalAlignment(JLabel.CENTER);
        lb7.setBounds(810, 240, 135, 30);
        
        
        p.add(js1);
        p.add(js3);
        p.add(js2);
        
        p.add(lb1);
        p.add(lb2);
        p.add(lb3);
        p.add(lb4);
        p.add(lb5);
        p.add(lb6);
        p.add(lb7);
        p.add(lb8);
        p.add(lb9);
        p.add(lb10);
        p.add(lb11);
        p.add(lb12);
        p.add(lb13);
        p.add(lb14);
        p.add(lb15);
        p.add(lb16);
        p.add(lb17);
        p.add(lb18);
        p.add(lb19);
        p.add(lb20);
        p.add(lb21);
        p.add(lb22);
        p.add(lb23);
        p.add(lb24);
        
        p.add(txtA);
        
        add(lb0);
        add(p);
        
        
        
        pack();
        
    }
 
    JPanel p = new JPanel();
    
    JLabel lb1 = new JLabel("Valores");
    JLabel lb2 = new JLabel("Honestidade");
    JLabel lb3 = new JLabel("Humildade");
    JLabel lb4 = new JLabel("Disciplina");
    JLabel lb5 = new JLabel("Respeito");
    JLabel lb6 = new JLabel("Empatia");
    JLabel lb7 = new JLabel("Rigor");
    JLabel lb16 = new JLabel("Missão");
    JLabel lb8 = new JLabel("Visão");
    JLabel lb9 = new JLabel("Ser uma instituição de referencia ");
    JLabel lb10 = new JLabel("no ensino da lingua inglesa e pre-");
    JLabel lb11 = new JLabel("parando os nossos estudantes e");
    JLabel lb12 = new JLabel("oferenco ao mercado um pessoal");
    JLabel lb13 = new JLabel("de qualidade sob o ponto de vista");
    JLabel lb14 = new JLabel("da comunicação fluente na ");
    JLabel lb15 = new JLabel("lingua inglesa");
    JLabel lb17 = new JLabel("Exercer com competê-");
    JLabel lb18 = new JLabel("ncias o ensino da lingua");
    JLabel lb19 = new JLabel("Inglesa, de modo a ca-");
    JLabel lb20 = new JLabel("pacitar os nossos for-");
    JLabel lb21 = new JLabel("mandos a se comunicar");
    JLabel lb22 = new JLabel("sem problemas com o");
    JLabel lb23 = new JLabel("mundo na lingua inglesa");
    JLabel lb24 = new JLabel("A Instituição");
    
    JTextArea txtA = new JTextArea(
                "   A ABGAIL'S ENGLISH SCHOOL \n" +
                "      é uma instituição vocacio-\n" +
                "       nada no ensino ensino da \n" +
                "      lingua inglesa, sediada na\n" +
                "       cidade de  Tete, que alem \n" +
                "      de dar o ensino, presta ser-\n" +
                "       viços de tradução e inter-\n" +
                "       preetação, escrita de docu-\n" +
                "      mentos em Inglês faz prepa-\n" +
                "         ração para entrevistas.  \n" +
                " \n" +
                "");
    
    Font fonte = new Font("Stencil", Font.BOLD, 30);
    Font fonte1 = new Font("Tahoma", Font.PLAIN, 18);
    Font fonte2 = new Font("Tahoma", Font.BOLD, 18);
    
    JLabel lb0 = new JLabel("SOBRE NóS");
    
    JSeparator js1 = new JSeparator();
    JSeparator js2 = new JSeparator();
    JSeparator js3 = new JSeparator();
    
}
