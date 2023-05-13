
package Formulários;

import Modulo.Conexao;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;


public class Tela_Alunos extends JInternalFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public Tela_Alunos() {
        initComponents();
        
        conexao = Conexao.conector();
    }

    static int sem;
    static int nivel;
    
    @SuppressWarnings("unchecked")
                             
    private void initComponents() {

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
        
        
        p1.setBounds(0, 50, 480, 250);
        p1.setLayout(null);
        p1.setBackground(Color.LIGHT_GRAY);
        
        lb4.setBounds(320, 95, 40, 30);
        lb4.setHorizontalAlignment(JLabel.CENTER);
        
        lb5.setBounds(20, 135, 80, 30);
        lb5.setHorizontalAlignment(JLabel.CENTER);
        
        lb6.setBounds(320, 135, 40, 30);
        lb6.setHorizontalAlignment(JLabel.CENTER);
        
        lb7.setBounds(20, 175, 80, 30);
        lb7.setHorizontalAlignment(JLabel.CENTER);
        
        lb8.setBounds(20, 215, 80, 30);
        lb8.setHorizontalAlignment(JLabel.CENTER);
        
        lb9.setBounds(20, 55, 95, 30);
        lb9.setHorizontalAlignment(JLabel.CENTER);
        
        lb10.setBounds(20, 95, 80, 30);
        lb10.setHorizontalAlignment(JLabel.CENTER);
        
        txt1.setBounds(120, 55, 340, 30);
        txt1.setHorizontalAlignment(JLabel.CENTER);
        
        txt2.setBounds(120, 95, 180, 30);
        txt2.setHorizontalAlignment(JLabel.CENTER);
        
        txt3.setBounds(120, 135, 180, 30);
        txt3.setHorizontalAlignment(JLabel.CENTER);
        
        txt4.setBounds(120, 175, 340, 30);
        txt4.setHorizontalAlignment(JLabel.CENTER);
        
        txt5.setBounds(120, 215, 340, 30);
        txt5.setHorizontalAlignment(JLabel.CENTER);
        
        txt6.setBounds(365, 95, 95, 30);
        txt6.setHorizontalAlignment(JLabel.CENTER);
        
        rb1.setBounds(365, 135, 45, 30);
        rb1.setHorizontalAlignment(JRadioButton.CENTER);
        
        rb2.setBounds(414, 135, 45, 30);
        rb2.setHorizontalAlignment(JRadioButton.CENTER);
        
        rbg.add(rb1);
        rbg.add(rb2);
        
        rb3.setBounds(168, 130, 148, 30);
        rb3.setHorizontalAlignment(JRadioButton.CENTER);
        
        rb4.setBounds(168, 170, 148, 30);
        rb4.setHorizontalAlignment(JRadioButton.CENTER);
        
        rbg1.add(rb3);
        rbg1.add(rb4);
        
        rb5.setBounds(326, 90, 135, 30);
        rb5.setHorizontalAlignment(JRadioButton.CENTER);
        
        rb6.setBounds(326, 130, 135, 30);
        rb6.setHorizontalAlignment(JRadioButton.CENTER);
        
        rb7.setBounds(326, 170, 135, 30);
        rb7.setHorizontalAlignment(JRadioButton.CENTER);
        
        rb8.setBounds(326, 210, 135, 30);
        rb8.setHorizontalAlignment(JRadioButton.CENTER);
        
        
        lb0.setBounds(5, 10, 968, 30);
        lb0.setHorizontalAlignment(JLabel.CENTER);
        lb0.setFont(new Font("Stencil", Font.BOLD, 30));
        lb0.setForeground(Color.BLACK);
        
        lb1.setBounds(10, 10, 460, 30);
        lb1.setHorizontalAlignment(JLabel.CENTER);
        lb1.setFont(new Font("Tahoma", Font.BOLD, 18));
        lb1.setForeground(Color.BLACK);
        
        js.setBackground(Color.GRAY);
        js.setBounds(485, 60, 8, 230);
        js.setOrientation(JSeparator.VERTICAL);
        
        js1.setBackground(Color.GRAY);
        js1.setBounds(10, 45, 460, 5);
        
        js2.setBackground(Color.GRAY);
        js2.setBounds(10, 45, 450, 5);
        
        js3.setBackground(Color.GRAY);
        js3.setBounds(10, 305, 943, 5);
        
        js4.setBackground(Color.GRAY);
        js4.setBounds(10, 260, 450, 5);
        
        
        p2.setBounds(494, 50, 484, 250);
        p2.setLayout(null);
        p2.setBackground(Color.LIGHT_GRAY);
        
        p3.setBounds(0, 312, 978, 50);
        p3.setLayout(null);
        p3.setBackground(Color.LIGHT_GRAY);
        
        btn1.setBounds(286, 5, 120, 40);
        btn1.setFont(font);
        btn1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                inserir();
            }
        });
        
        
        btn2.setBounds(436, 5, 100, 40);
        btn2.setFont(font);
        btn2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actualizar();
            }
        });
        
        btn3.setBounds(566, 5, 120, 40);
        btn3.setFont(font);
        btn3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                apagar();
            }
        });
        
        lb2.setBounds(10, 10, 460, 30);
        lb2.setHorizontalAlignment(JLabel.CENTER);
        lb2.setFont(new Font("Tahoma", Font.BOLD, 18));
        lb2.setForeground(Color.BLACK);
        
        lb11.setBounds(168, 50, 148, 30);
        lb11.setHorizontalAlignment(JLabel.CENTER);
        
        lb12.setBounds(326, 50, 148, 30);
        lb12.setHorizontalAlignment(JLabel.CENTER);
        
        lb3.setBounds(10, 50, 148, 30);
        lb3.setHorizontalAlignment(JLabel.CENTER);
        
        jsp.setBounds(30, 150, 108, 30);
        
        
        rbg2.add(rb5);
        rbg2.add(rb6);
        rbg2.add(rb7);
        rbg2.add(rb8);
        
        add(lb0);
        add(js);
        add(js3);
        
        add(p1);
        add(p2);
        add(p3);
        
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
        
        p1.add(js1);
        
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
        
        p2.add(jsp);
        
        p3.add(btn1);
        p3.add(btn2);
        p3.add(btn3);
        
        add(p1);
        
        pack();
        
    }
    
    void inserir() {

        if (rb3.isSelected()) {
            sem = 1;
        } else if (rb4.isSelected()) {
            sem = 2;
        }

        if (rb5.isSelected()) {
            nivel = 1;
        } else if (rb6.isSelected()) {
            nivel = 2;
        } else if (rb7.isSelected()) {
            nivel = 4;
        } else if (rb8.isSelected()) {
            nivel = 5;
        }

        String inserir = "insert into aluno (nome, bi, morada, contacto, email, ano, semestre_id, nivel_id) values(?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            pst = conexao.prepareStatement(inserir);

            pst.setString(1, txt1.getText());
            pst.setString(2, txt2.getText());
            pst.setString(3, txt3.getText());
            pst.setString(4, txt4.getText());
            pst.setString(5, txt5.getText());
            pst.setString(6, String.valueOf(jsp.getValue()));
            pst.setString(7, String.valueOf(sem));
            pst.setString(8, String.valueOf(nivel));

            if (txt1.getText().isEmpty() || txt2.getText().isEmpty() || txt3.getText().isEmpty() || txt3.getText().isEmpty() || txt4.getText().isEmpty() || txt5.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Preencha todos  os campos por favor");
            } else {
                int registrarN = JOptionPane.showConfirmDialog(null, "Registrar novo Aluno?", "Confirme", JOptionPane.YES_NO_OPTION);

                if (registrarN == JOptionPane.YES_OPTION) {
                    int registrado = pst.executeUpdate();

                    if (registrado > 0) {
                        JOptionPane.showMessageDialog(null, "Aluno adicionado com sucesso!");

                        txt1.setText(null);
                        txt1.setText(null);
                        txt1.setText(null);
                        txt1.setText(null);
                        txt1.setText(null);
                    }
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }

    }
    
    void actualizar() {
        
       

        if (rb3.isSelected()) {
            sem = 1;
        } else if (rb4.isSelected()) {
            sem = 2;
        }

        if (rb5.isSelected()) {
            nivel = 1;
        } else if (rb6.isSelected()) {
            nivel = 2;
        } else if (rb7.isSelected()) {
            nivel = 4;
        } else if (rb8.isSelected()) {
            nivel = 5;
        }
        
        String act = "update aluno set nome = ?, bi = ?, morada = ?, contacto = ?, email = ?, ano_id = ?, semestre_id = ?, nivel_id = ? where id = ?";
        
        try {
            pst = conexao.prepareStatement(act);
            
            pst.setString(1, txt1.getText());
            pst.setString(2, txt2.getText());
            pst.setString(3, txt3.getText());
            pst.setString(4, txt4.getText());
            pst.setString(5, txt5.getText());
            pst.setString(6, String.valueOf(jsp));
            pst.setString(7, String.valueOf(sem));
            pst.setString(8, String.valueOf(nivel));
            
            int per = JOptionPane.showConfirmDialog(rootPane, "Acualizar dados do Aluno? ", "Confirme", JOptionPane.YES_NO_OPTION);
        
            if(per == JOptionPane.YES_OPTION){
                int actua = pst.executeUpdate();
                
                if(actua > 0){
                    JOptionPane.showMessageDialog(rootPane, "Dados do Aluno actualizados com sucesso!");
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "Actualização nao sucedida!");
                    
                }
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        
        
    }

    void apagar() {

        String cmd = "delete from aluno where id = ?";

        int id = Integer.parseInt(txt6.getText().toString());

        try {
            pst = conexao.prepareStatement(cmd);

            pst.setString(1, String.valueOf(id));

            int per = JOptionPane.showConfirmDialog(rootPane, "Excluir o Aluno? ", "Confirme", JOptionPane.YES_NO_OPTION);

            if (per == JOptionPane.YES_OPTION) {

                if (txt6.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(rootPane, "Insira o ID do Professor no respectivo campo");
                } else {
                    int del = pst.executeUpdate();

                    if (del > 0) {
                        JOptionPane.showMessageDialog(rootPane, "Aluno excluido com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Exclusão nao sucedida!");

                    }

                }
            }
        } catch (Exception e) {

        }

    }
    
    
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    
    JLabel lb0 = new JLabel("DADOS DO ALUNO");
    JLabel lb1 = new JLabel("DADOS PESSOAIS");
    JLabel lb2 = new JLabel("DADOS ACADEMICOS");
    JLabel lb3 = new JLabel("Ano Lectivo");
    JLabel lb4 = new JLabel("ID: ");
    JLabel lb5 = new JLabel("Morada: ");
    JLabel lb6 = new JLabel("Sexo: ");
    JLabel lb7 = new JLabel("Contacto: ");
    JLabel lb8 = new JLabel("E-mail: ");
    JLabel lb9 = new JLabel("Nome: ");
    JLabel lb10 = new JLabel("BI: ");
    JLabel lb11 = new JLabel("Semestre");
    JLabel lb12 = new JLabel("Nível");
    
    JTextField txt1 = new JTextField("txt1");
    JTextField txt2 = new JTextField("txt2");
    JTextField txt3 = new JTextField("txt3");
    JTextField txt4 = new JTextField("txt4");
    JTextField txt5 = new JTextField("txt5");
    JTextField txt6 = new JTextField("txt6");

    JRadioButton rb1 = new JRadioButton("M");
    JRadioButton rb2 = new JRadioButton("F");
    JRadioButton rb3 = new JRadioButton("1º Semestre");
    JRadioButton rb4 = new JRadioButton("1º Semestre");
    JRadioButton rb5 = new JRadioButton("1º Nível");
    JRadioButton rb6 = new JRadioButton("2º Nível");
    JRadioButton rb7 = new JRadioButton("3º Nível");
    JRadioButton rb8 = new JRadioButton("4º Nível");
    
    ButtonGroup rbg = new ButtonGroup();
    ButtonGroup rbg1 = new ButtonGroup();
    ButtonGroup rbg2 = new ButtonGroup(); 
    
    JSeparator js = new JSeparator();
    JSeparator js1 = new JSeparator();
    JSeparator js2 = new JSeparator();
    JSeparator js3 = new JSeparator();
    JSeparator js4 = new JSeparator();
    
    JButton btn1 = new JButton("Matricular");
    JButton btn2 = new JButton("Editar");
    JButton btn3 = new JButton("Excluir");
    
    Font font = new Font("Tahoma", Font.PLAIN, 18);
    
    JSpinner jsp = new JSpinner();
       
}

