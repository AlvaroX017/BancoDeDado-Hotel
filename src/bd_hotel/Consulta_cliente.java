package bd_hotel;

import static java.lang.Integer.parseInt;

import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

public class Consulta_cliente extends javax.swing.JFrame {
    private static final long serialVersionUID = 1L;

	Conexao conectado;

    DefaultTableModel modelo;
    
    public Consulta_cliente() {
        initComponents();
        conectado = new Conexao();
        modelo = new DefaultTableModel();
        conectado.conectar();
        JTcod.setEditable(false);
        modelo.addColumn("Código");
        modelo.addColumn("Nome");
        modelo.addColumn("Idade");
        modelo.addColumn("Sexo");
        modelo.addColumn("Nº Quarto");
        modelo.addColumn("Data E");
        modelo.addColumn("Data S");
        JTinfo.setModel(modelo);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        popupMenu2 = new java.awt.PopupMenu();
        JTnome = new javax.swing.JTextField();
        JTidade = new javax.swing.JTextField();
        JTsexo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jBinserir = new javax.swing.JButton();
        JBlimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTinfo = new javax.swing.JTable();
        JBpesquisar = new javax.swing.JButton();
        jTPesquisar = new javax.swing.JTextField();
        JBquartos = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JTquarto = new javax.swing.JTextField();
        jBalterar = new javax.swing.JButton();
        JFde = new javax.swing.JFormattedTextField();
        JFds = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        JTcod = new javax.swing.JTextField();
        JBvoltar = new javax.swing.JButton();

        popupMenu1.setLabel("popupMenu1");

        popupMenu2.setLabel("popupMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JTsexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTsexoActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("Idade");

        jLabel3.setText("Sexo");

        jBinserir.setText("Inserir");
        jBinserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBinserirActionPerformed(evt);
            }
        });

        JBlimpar.setText("Limpar");
        JBlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBlimparActionPerformed(evt);
            }
        });

        JTinfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        JTinfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTinfoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTinfo);

        JBpesquisar.setText("Pesquisar");
        JBpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBpesquisarActionPerformed(evt);
            }
        });

        jTPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPesquisarActionPerformed(evt);
            }
        });

        JBquartos.setText("Quartos");
        JBquartos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBquartosActionPerformed(evt);
            }
        });

        jLabel4.setText("Nº Quarto");

        jLabel5.setText("Data de entrada");

        jLabel6.setText("Data de Saida");

        jBalterar.setText("Alterar");
        jBalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBalterarActionPerformed(evt);
            }
        });

        JFde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFdeActionPerformed(evt);
            }
        });
        try {

            MaskFormatter mascara = new MaskFormatter("##/##/####");
            mascara.setPlaceholderCharacter('_');

            JFde.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(mascara));

        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel7.setText("Código do cliente");

        JTcod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTcodActionPerformed(evt);
            }
        });

        JBvoltar.setText("Voltar");
        JBvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBvoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18)
                                                .addComponent(JTnome, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLabel3))
                                                .addGap(23, 23, 23)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(JBlimpar)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jBinserir)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jBalterar))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(JTidade, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                                            .addComponent(JTsexo))
                                                        .addGap(101, 101, 101)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel4)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(JTquarto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(jLabel6))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                    .addComponent(JFde, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                                                    .addComponent(JFds))))))))
                                        .addGap(81, 81, 81))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTPesquisar)
                                        .addGap(14, 14, 14)))
                                .addGap(28, 28, 28))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTcod, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(396, 396, 396)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JBvoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JBpesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JBquartos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(JTcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBvoltar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(JTquarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JFde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JTsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JFds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBinserir)
                    .addComponent(JBlimpar)
                    .addComponent(JBquartos)
                    .addComponent(jBalterar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBpesquisar)
                    .addComponent(jTPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        try {

            MaskFormatter mascara = new MaskFormatter("##/##/####");
            mascara.setPlaceholderCharacter('_');

            JFds.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(mascara));

        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBinserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBinserirActionPerformed
        Conexao conectado = new Conexao();
        conectado.conectar();
        
        String nome = JTnome.getText();
        String idade = JTidade.getText();
        String sexo = JTsexo.getText();
        String quarto = JTquarto.getText();
        String de = JFde.getText();
        String ds = JFds.getText();

        if(nome.isEmpty() || idade.isEmpty() || sexo.isEmpty() || quarto.isEmpty() || de.isEmpty()|| ds.isEmpty()){
            JOptionPane.showMessageDialog(this, "Todos os dados devem ser preenchidos!");
        }
        if(parseInt(idade) < 18){
            JOptionPane.showMessageDialog(this, "O cliente deve ser maior de idade para se cadastrar!");
        }
  
        else{
            conectado.manipularDados("INSERT INTO Clientes VALUES (0,'"+nome+"','"+idade+"','"+sexo+"','"+quarto+"')");
            conectado.manipularDados("INSERT INTO Reserva VALUES (0,'1','"+de+"','"+ds+"','"+quarto+"')");

            JOptionPane.showMessageDialog(this, "Sucesso");
        clear();}
    }//GEN-LAST:event_jBinserirActionPerformed

    private void JBlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBlimparActionPerformed
        clear();
    }//GEN-LAST:event_JBlimparActionPerformed

    private void JTsexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTsexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTsexoActionPerformed

    private void JBpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBpesquisarActionPerformed
       try{String p = jTPesquisar.getText(); 
        
        if(p.isEmpty()){
           JOptionPane.showMessageDialog(this, "Insira o nome que deseja encontrar!");
       }else{

       conectado.executarConsulta( " SELECT * FROM clientes FULL JOIN reserva ON quarto_c=reserva_q where nome like '%"+p+"%' ORDER BY nome;");

        preencherTabela();}}
       catch(NullPointerException ev){
           JOptionPane.showMessageDialog(this, "Verifique se o banco de dados está ativo!");
       }
    }//GEN-LAST:event_JBpesquisarActionPerformed

    private void JTinfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTinfoMouseClicked
        int linha = JTinfo.getSelectedRow();
        JTcod.setText((String) modelo.getValueAt(linha, 0));
        JTnome.setText((String) modelo.getValueAt(linha, 1));
        JTidade.setText((String) modelo.getValueAt(linha, 2));
        JTsexo.setText((String) modelo.getValueAt(linha, 3));
        JTquarto.setText((String) modelo.getValueAt(linha, 4));
        JFde.setText((String) modelo.getValueAt(linha, 5));
        JFds.setText((String) modelo.getValueAt(linha, 6));
        
       
    }//GEN-LAST:event_JTinfoMouseClicked

    private void JFdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JFdeActionPerformed
        
    }//GEN-LAST:event_JFdeActionPerformed

    private void jBalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBalterarActionPerformed
        String C = JTcod.getText(); 
        String N = JTnome.getText(); 
        String I = JTidade.getText(); 
        String S = JTsexo.getText(); 
        String Q = JTquarto.getText(); 
        String DE = JFde.getText(); 
        String DS = JFds.getText(); 
        
        if (N.isEmpty() || S.isEmpty() || I.isEmpty()|| Q.isEmpty() || DE.isEmpty()|| DS.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos os dados devem ser preenchidos!" ) ;
    }
        if(parseInt(I) < 18){
            JOptionPane.showMessageDialog(this, "O cliente deve ser maior de idade para se cadastrar!");
        }
        
        else {     
        conectado.manipularDados("UPDATE Clientes SET nome='"+N+"', idade= '"+I+"', Sexo= '"+S+"', quarto_c= '"+Q+"' WHERE Cliente_Id = '"+C+"'");
        conectado.manipularDados("UPDATE Reserva SET Data_e='"+DE+"', Data_s= '"+DS+"' WHERE reserva_q = '"+Q+"'");
        JOptionPane.showMessageDialog(this, "Dados inseridos com Sucesso!") ;
        clear();}
    }//GEN-LAST:event_jBalterarActionPerformed

    private void JTcodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTcodActionPerformed

    }//GEN-LAST:event_JTcodActionPerformed

    private void JBquartosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBquartosActionPerformed
        new Quartos().setVisible(true);
    }//GEN-LAST:event_JBquartosActionPerformed

    private void JBvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBvoltarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_JBvoltarActionPerformed

    private void jTPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPesquisarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Consulta_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consulta_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consulta_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulta_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consulta_cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBlimpar;
    private javax.swing.JButton JBpesquisar;
    private javax.swing.JButton JBquartos;
    private javax.swing.JButton JBvoltar;
    private javax.swing.JFormattedTextField JFde;
    private javax.swing.JFormattedTextField JFds;
    private javax.swing.JTextField JTcod;
    private javax.swing.JTextField JTidade;
    private javax.swing.JTable JTinfo;
    private javax.swing.JTextField JTnome;
    private javax.swing.JTextField JTquarto;
    private javax.swing.JTextField JTsexo;
    private javax.swing.JButton jBalterar;
    private javax.swing.JButton jBinserir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTPesquisar;
    private java.awt.PopupMenu popupMenu1;
    private java.awt.PopupMenu popupMenu2;
    // End of variables declaration//GEN-END:variables


private void clear(){
    JTcod.setText("");
    JTidade.setText("");
    JTnome.setText("");
    JTsexo.setText("");
    JTquarto.setText("");
    JFde.setText(""); 
    JFds.setText("");
}

private void preencherTabela(){ 
    modelo.setRowCount(0);
    try{
        while(conectado.resultado.next()){ 
        String co = conectado.resultado.getString("Cliente_Id");
        String no = conectado.resultado.getString("nome");
        String ida = conectado.resultado.getString("idade");
        String se = conectado.resultado.getString("sexo");
        String qua = conectado.resultado.getString("Quarto_c");
        String de = conectado.resultado.getString("Data_e");
        String ds = conectado.resultado.getString("Data_s");
        
                
        modelo.addRow(new Object[] {co, no, ida, se, qua, de, ds});    
        }
    }
    
    catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "Não existe dados gravados!");
        }     
}


}
