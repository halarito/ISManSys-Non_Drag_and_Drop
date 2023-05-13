package Formulários;

import java.awt.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import Modulo.Conexao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Tela_Professores extends JInternalFrame{
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public Tela_Professores() {
        initComponents();
        
        conexao = Conexao.conector();
        
        preencher();
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
        
        p2.setBounds(494, 50, 484, 250);
        p2.setLayout(null);
        p2.setBackground(Color.LIGHT_GRAY);
        
        p3.setBounds(0, 312, 978, 50);
        p3.setLayout(null);
        p3.setBackground(Color.LIGHT_GRAY);
        
        js.setBackground(Color.GRAY);
        js.setBounds(485, 60, 8, 230);
        js.setOrientation(JSeparator.VERTICAL);
        
        lb0.setBounds(5, 10, 968, 30);
        lb0.setHorizontalAlignment(JLabel.CENTER);
        lb0.setFont(fonte);
        lb0.setForeground(Color.BLACK);
        
        lb1.setBounds(10, 10, 460, 30);
        lb1.setHorizontalAlignment(JLabel.CENTER);
        lb1.setFont(fonte1);
        lb1.setForeground(Color.BLACK);
        
        lb2.setBounds(10, 10, 460, 30);
        lb2.setHorizontalAlignment(JLabel.CENTER);
        lb2.setFont(fonte1);
        lb2.setForeground(Color.BLACK);
        
        tbl.setBounds(20, 55, 430, 120);
        
        lb12.setHorizontalAlignment(JLabel.CENTER);
        lb12.setBounds(20, 175, 430, 30);
        
        lb13.setHorizontalAlignment(JLabel.CENTER);
        lb13.setBounds(20, 215, 70, 30);
        
        txt7.setHorizontalAlignment(JTextField.CENTER);
        txt7.setBounds(100, 215, 135, 30);
        
        lb14.setHorizontalAlignment(JLabel.CENTER);
        lb14.setBounds(240, 215, 60, 30);
        
        ps.setHorizontalAlignment(JTextField.CENTER);
        ps.setBounds(315, 215, 125, 30);
        
        js1.setBackground(Color.GRAY);
        js1.setBounds(10, 45, 460, 5);

        js2.setBackground(Color.GRAY);
        js2.setBounds(10, 45, 450, 5);
        
        js3.setBackground(Color.GRAY);
        js3.setBounds(10, 305, 943, 5);

        js4.setBackground(Color.GRAY);
        js4.setBounds(10, 260, 450, 5);

        btn1.setBounds(286, 5, 120, 40);
        btn1.setFont(font);
        btn1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                inserir();
                preencher();
            }
        });
        
        btn2.setBounds(436, 5, 100, 40);
        btn2.setFont(font);
        btn2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                editar();
                preencher();
            }
        });
        
        btn3.setBounds(566, 5, 120, 40);
        btn3.setFont(font);
        btn3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                excluir();
                preencher();
            }
        });
        
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

        p2.add(lb2);
        p2.add(lb12);
        p2.add(lb13);
        p2.add(lb14);
        p2.add(txt7);
        p2.add(ps);
        p2.add(js2);
        p2.add(tbl);
        
        p3.add(btn1);
        p3.add(btn2);
        p3.add(btn3);
        
        add(p1);
        add(p2);
        add(p3);
        add(js);
        add(lb0);
        add(js3);
        
        pack();
    }
    
    void preencher() {
        String sql = "Select d.id, d.nome, p.descricao, d.contacto from Professor d inner join perfil p on p.id = d.perfil";

        try {
            pst = conexao.prepareStatement(sql);

            rs = pst.executeQuery();

            tbl.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    
    void inserir(){
        
        String inserir = "insert into Professor (nome, bi, morada, contacto, email, perfil, username, password) values(?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            pst = conexao.prepareStatement(inserir);
            
            pst.setString(1, txt1.getText());
            pst.setString(2, txt2.getText());
            pst.setString(3, txt3.getText());
            pst.setString(4, txt4.getText());
            pst.setString(5, txt5.getText());
            pst.setString(6, "1");
            pst.setString(7, txt7.getText());
            pst.setString(8, ps.getText());
            
            if (txt1.getText().isEmpty() ||  txt2.getText().isEmpty() || txt3.getText().isEmpty() || txt4.getText().isEmpty() || ps.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "Preencha todos  os campos por favor");
            }
            else{
                int registrarN = JOptionPane.showConfirmDialog(null, "Registrar novo Professor?", "Confirme", JOptionPane.YES_NO_OPTION);
                
                if(registrarN == JOptionPane.YES_OPTION){
                    int registrado = pst.executeUpdate();
                    
                    if(registrado > 0){
                        JOptionPane.showMessageDialog(null, "Professor adicionado com sucesso!");
                        
                        txt1.setText(null);
                        txt2.setText(null);
                        ps.setText(null);
                        txt7.setText(null);
                        txt3.setText(null);
                        txt4.setText(null);
                        txt5.setText(null);
                    }
                }
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        
    }
    
    void excluir(){
        String excluir = "delete from Professor where id = ?";
        
        if(txt6.getText().isEmpty()){
                    JOptionPane.showMessageDialog(rootPane, "Insira o ID do Professor no respectivo campo");
                    
        }
        else{
            id = Integer.parseInt(txt6.getText().toString());
        
            try {
            pst = conexao.prepareStatement(excluir);
            
            pst.setString(1, String.valueOf(id));
            
            int per = JOptionPane.showConfirmDialog(rootPane, "Excluir o Professor? ", "Confirme", JOptionPane.YES_NO_OPTION);
        
            if(per == JOptionPane.YES_OPTION){
                
                if(txt6.getText().isEmpty()){
                    JOptionPane.showMessageDialog(rootPane, "Insira o ID do Professor no respectivo campo");
                }
                else{
                    int actua = pst.executeUpdate();
                
                    if(actua > 0){
                    JOptionPane.showMessageDialog(rootPane, "Professor excluido com sucesso!");
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "Exclusão nao sucedida!");
                    
                }
                
            }
        } 
        
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
                    
        }
        }    
    }

    void editar(){
        
        String act = "update professor set nome = ?, bi = ?, naturalidade = ?, contacto = ?, email = ?, perfil = ?, username = ?, password = ? where id = ?";
        
        if(tbl.getSelectedRow() != -1){
            int tab = tbl.getSelectedRow();
            
            String id = tbl.getModel().getValueAt(tab, 0).toString();
        
        try {
            pst = conexao.prepareStatement(act);
            
            pst.setString(1, txt1.getText());
            pst.setString(2, txt2.getText());
            pst.setString(3, txt3.getText());
            pst.setString(4, txt4.getText());
            pst.setString(5, txt5.getText());
            pst.setString(6, "1");
            pst.setString(7, txt7.getText());
            pst.setString(8, ps.getText());
            pst.setString(9, id);
            
            int per = JOptionPane.showConfirmDialog(rootPane, "Acualizar dados do Professor? ", "Confirme", JOptionPane.YES_NO_OPTION);
        
            if(per == JOptionPane.YES_OPTION){
                int actua = pst.executeUpdate();
                
                if(actua > 0){
                    JOptionPane.showMessageDialog(rootPane, "DAdos do Professor actualizados com sucesso!");
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "Actualização nao sucedida!");
                    
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        }
        else if (tbl.getSelectedRow() != -1 && txt7.getText().isEmpty() ){
            JOptionPane.showMessageDialog(rootPane, "Selecione na tabela o Professor que pretende actualizar");
        }
    }
    
    int id;
    
    
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    
    JLabel lb0 = new JLabel("DADOS DO Professor");
    JLabel lb1 = new JLabel("DADOS PESSOAIS");
    JLabel lb2 = new JLabel("DADOS ADICIONAIS");
    JLabel lb4 = new JLabel("ID: ");
    JLabel lb5 = new JLabel("Morada: ");
    JLabel lb6 = new JLabel("Sexo: ");
    JLabel lb7 = new JLabel("Contacto: ");
    JLabel lb8 = new JLabel("E-mail: ");
    JLabel lb9 = new JLabel("Nome: ");
    JLabel lb10 = new JLabel("BI: ");
    JLabel lb12 = new JLabel("Credenciais:");
    JLabel lb13 = new JLabel("Usuário:");
    JLabel lb14 = new JLabel("Senha:");
    
    JTextField txt1 = new JTextField();
    JTextField txt2 = new JTextField();
    JTextField txt3 = new JTextField();
    JTextField txt4 = new JTextField();
    JTextField txt5 = new JTextField();
    JTextField txt6 = new JTextField();
    JTextField txt7 = new JTextField();
    
    JPasswordField ps = new JPasswordField();
    
    JRadioButton rb1 = new JRadioButton("M");
    JRadioButton rb2 = new JRadioButton("F");
    
    ButtonGroup rbg = new ButtonGroup();
    
    JSeparator js = new JSeparator();
    JSeparator js1 = new JSeparator();
    JSeparator js2 = new JSeparator();
    JSeparator js3 = new JSeparator();
    JSeparator js4 = new JSeparator();
    
    Font font = new Font("Tahoma", Font.PLAIN, 18);
    Font fonte = new Font("Stencil", Font.BOLD, 30);
    Font fonte1 = new Font("Tahoma", Font.BOLD, 18);
    
    JTable tbl = new JTable();
    
    JButton btn1 = new JButton("Matricular");
    JButton btn2 = new JButton("Editar");
    JButton btn3 = new JButton("Excluir");
}
