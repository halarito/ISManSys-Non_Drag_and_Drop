
package Span;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Tela_Entrada extends JFrame {
    
    public Tela_Entrada(){
        
        JFrame tela1 = new JFrame("Tela De Login");
        tela1.setBounds(550, 200, 450, 355);
        tela1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela1.setLayout(null);
        tela1.setLocationRelativeTo(null);

        JPanel p1 = new JPanel();
        p1.setBounds(2, 2, 155, 310);
        p1.setLayout(null);
        p1.setBackground(Color.LIGHT_GRAY);
        
        JPanel p2 = new JPanel();
        p2.setBounds(160, 2, 272, 310);
        p2.setLayout(null);
        p2.setBackground(new Color(195, 195, 195));
        
        Font fg = new Font("Stencil", Font.BOLD, 36);
        Font fc = new Font("Viner Hand ITC", Font.BOLD, 14);
        
        JLabel l1 = new JLabel("ABGAIL'S");
        l1.setBounds(2, 7, 260, 40);
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setForeground(Color.BLACK);
        l1.setFont(fg);

        JLabel l2 = new JLabel("ENg. SCHOOL");
        l2.setBounds(2, 50, 260, 40);
        l2.setHorizontalAlignment(JLabel.CENTER);
        l2.setForeground(Color.BLACK);
        l2.setFont(fg);
        
        JSeparator js = new JSeparator();
        js.setBounds(5, 95, 260, 5);
        
        JLabel l3 = new JLabel("Insira as suas credenciais");
        l3.setBounds(2, 105, 260, 30);
        l3.setHorizontalAlignment(JLabel.CENTER);
        l3.setFont(fc);
        
        JLabel l4 = new JLabel("Nome do usuário: ");
        l4.setBounds(2, 140, 260, 25);
        
        JTextField t1 = new JTextField();
        t1.setBounds(15, 170, 247, 25);
        
        JLabel l5 = new JLabel("Palavra passe: ");
        l5.setBounds(2, 210, 260, 25);
        
        JTextField t2 = new JTextField();
        t2.setBounds(15, 240, 247, 25);
        
        JButton b1 = new JButton("Sair");
        b1.setBounds(15, 275, 80, 25);
        
        JButton b2 = new JButton("Entrar");
        b2.setBounds(180, 275, 80, 25);
        
        ImageIcon img = new ImageIcon(getClass().getResource("Login.png"));
        
        JLabel limg = new JLabel(img);
        limg.setBounds(2, 2, 151, 306);
        
        ActionListener al = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
               if("sair".equals(e.getActionCommand())){
                   
                   int ask = JOptionPane.showConfirmDialog(null, "Sair da tela de Login?", "Confirme", JOptionPane.YES_NO_OPTION);
                   
                   if(ask == JOptionPane.YES_OPTION){
                       
                       System.exit(0);
                       
                   }
                   
               }
                
            }
        };
        
        b1.setActionCommand("sair");
        b1.addActionListener(al);
        
        ActionListener ac = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                if("entrar".equals(e.getActionCommand())){
                   
                    tela1.dispose();
                    new Tela_Main().setVisible(true);
                
                }
            }
        };
        
        b2.setActionCommand("entrar");
        b2.addActionListener(ac);
        
        tela1.add(p1);
        tela1.add(p2);
        
        p1.add(limg);
        
        p2.add(l1);
        p2.add(l2);
        p2.add(js);
        p2.add(l3);
        p2.add(l4);
        p2.add(t1);
        p2.add(l5);
        p2.add(t2);
        p2.add(b1);
        p2.add(b2);
       
        tela1.setVisible(true);
         
        
    }
    
    public static void main(String[] args) {
        
        new Tela_Entrada();
    
    }
}
