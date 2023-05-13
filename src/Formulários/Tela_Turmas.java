package Formulários;

import Modulo.Conexao;
import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela_Turmas extends JInternalFrame{

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public Tela_Turmas() {
        initComponents();
        
        conexao = Conexao.conector();
        
        //preencher();
    }
    
    int anoT;
    int Semes;
    int nive;
    
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
        
        lb0.setBounds(5, 10, 968, 30);
        lb0.setHorizontalAlignment(JLabel.CENTER);
        lb0.setFont(fonte);
        
        p.setBounds(1, 50, 960, 310);
        p.setLayout(null);
        p.setBackground(Color.LIGHT_GRAY);
        
        lb1.setHorizontalAlignment(JLabel.CENTER);
        lb1.setBounds(210, 20, 100, 30);
        
        js.setBounds(311, 20, 80, 30);
        
        lb2.setHorizontalAlignment(JLabel.CENTER);
        lb2.setBounds(410, 20, 60, 30);
        
        cb1.setBounds(480, 20, 120, 30);
        cb1.addItem("1º Semestre");
        cb1.addItem("2º Semestre");
        
        lb3.setHorizontalAlignment(JLabel.CENTER);
        lb3.setBounds(615, 20, 50, 30);
        
        cb2.setBounds(666, 20, 100, 30);
        cb2.addItem("1º Nível");
        cb2.addItem("2º Nível");
        cb2.addItem("3º Nível");
        cb2.addItem("4º Nível");
        
        js1.setBackground(Color.GRAY);
        js1.setBounds(15, 60, 930, 10);
        
        tbl.setBounds(20, 70, 920, 200);
        
        btn.setBounds(440, 275, 110, 30);
        btn.setHorizontalAlignment(JButton.CENTER);
        
        btn.setActionCommand("pesquisar");
        btn.addActionListener(al);
        
        p.add(lb1);
        p.add(lb2);
        p.add(lb3);
        
        p.add(js);
        p.add(js1);
        
        p.add(cb1);
        p.add(cb2);
        
        p.add(tbl);
        
        p.add(btn);
        
        add(lb0);
        add(p);
        
        
        
        
        pack();
    }
    
    void preencher(){
       
        if(Integer.parseInt(js.getValue().toString()) == 2022){
            anoT = 1;
        }else if(Integer.parseInt(js.getValue().toString()) == 2023){
            anoT = 2;
        }else if(Integer.parseInt(js.getValue().toString()) == 2024){
            anoT = 3;
        }else if(Integer.parseInt(js.getValue().toString()) == 2025){
            anoT = 4;
        }else if(Integer.parseInt(js.getValue().toString()) == 2026){
            anoT = 5;
        }else if(Integer.parseInt(js.getValue().toString()) == 2027){
            anoT = 6;
        }else if(Integer.parseInt(js.getValue().toString()) == 2028){
            anoT = 7;
        }else if(Integer.parseInt(js.getValue().toString()) == 2029){
            anoT = 8;
        }else if(Integer.parseInt(js.getValue().toString()) == 2030){
            anoT = 9;
        }
        
        
        if(cb1.getSelectedIndex() == 0){
            Semes = 1;
        }else if(cb1.getSelectedIndex() == 1){
            Semes = 2;
        }
        
        if(cb2.getSelectedIndex() == 0){
            nive = 1;
        }else if(cb2.getSelectedIndex() == 1){
            nive = 2;
        }else if(cb2.getSelectedIndex() == 2){
            nive = 4;
        }else if(cb2.getSelectedIndex() == 3){
            nive = 5;
        }
        
        String cmd = "select id, nome, bi, naturalidade, contacto, email from aluno where  ano_id = ? and semestre_id = ? and nivel_id = ?";
       
        try {
            pst = conexao.prepareStatement(cmd);
            pst.setString(1, String.valueOf(anoT));
            pst.setString(2, String.valueOf(Semes));
            pst.setString(3, String.valueOf(nive));
            
            rs = pst.executeQuery();

            tbl.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        
    }
    
    ActionListener al = new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
        
            if(e.getActionCommand().equals("pesquisar")){
                preencher();
            }
        
        }
    };
    
    
    
    JPanel p = new JPanel();
    
    JLabel lb0 = new JLabel("TURMAS");
    JLabel lb1 = new JLabel("Ano Lectivo: ");
    JLabel lb2 = new JLabel("Semetre: ");
    JLabel lb3 = new JLabel("Nível: ");
    
    JComboBox cb1 = new JComboBox();
    JComboBox cb2 = new JComboBox();
    
    Font fonte = new Font("Stencil", Font.BOLD, 30);
    
    JSpinner js = new JSpinner();
    
    JSeparator js1 = new JSeparator();
    
    JTable tbl = new JTable();
    
    JButton btn = new JButton("Pesquisar");
    
}
