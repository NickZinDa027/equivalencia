/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.equivalencia.view;

import br.com.equivalencia.dao.ModuloConexao;
import java.awt.Color;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author nferreira
 */
public class TelaArea extends javax.swing.JFrame {
    
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public void adicionar(){
        String sql = "insert into tb_area_tecnologica(nome_area) values (?)";
        
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtNomeArea.getText());
            
            if (txtNomeArea.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null,"Campo de preenchimento obrigatório não foi preenchido");
                
            } else {
                int adicionado = pst.executeUpdate();
                System.out.println(adicionado);
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Área tecnológica cadastrada com sucesso!");
                }
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, e);        
        }
    }
    
       private void consultar() {
        String sql = "select id_area as Id, nome_area as Área from tb_area_tecnologica where nome_area like ?";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtConsultaArea.getText() + "%");
            rs = pst.executeQuery();
            tblAreaConsulta.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }


    public void setar_campos() {
        tblAreaConsulta.setVisible(true);
        int setar = tblAreaConsulta.getSelectedRow();
        txtIdArea.setText(tblAreaConsulta.getModel().getValueAt(setar,0).toString());
        txtNomeArea.setText(tblAreaConsulta.getModel().getValueAt(setar,1).toString());
        btnAdicionarArea.setEnabled(false);
        btnEditarArea.setEnabled(true);
        btnExcluirArea.setEnabled(true);
}

    public void alterar(){
        String sql = "update tb_area_tecnologica set nome_area=? where id_area=?";
        
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1,txtNomeArea.getText());
            pst.setString(2,txtIdArea.getText());
            
            //validação dos campos obrigatórios
            if ((txtIdArea.getText().isEmpty()) || (txtNomeArea.getText().isEmpty())){
                JOptionPane.showMessageDialog(null, "Campo de preenchimento obrigatório, não preenchidos");
                
            } else {
                int adicionado = pst.executeUpdate();
                
                if (adicionado > 0){
                    JOptionPane.showMessageDialog(null, "Área Tecnologica alterada com sucesso");
                    btnAdicionarArea.setEnabled(true);
                    btnEditarArea.setEnabled(false);
                    txtIdArea.setText(null);
                    txtNomeArea.setText(null);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
      
        }
    }
    
    public void excluir(){
        int confim =  JOptionPane.showConfirmDialog(null,"Você tem certeza?, pessoas podem ser demitidas.","Atenção",JOptionPane.YES_NO_OPTION);
        
        if (confim == JOptionPane.YES_OPTION);
            String sql = "delete from tb_area_tecnologica where id_area=?";
            
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1,txtIdArea.getText());
                int apagado = pst.executeUpdate();
                
                if(apagado >0){
                    JOptionPane.showMessageDialog(null,"Área Tecnológica apagada com sucesso.");
                    txtIdArea.setText(null);
                    txtNomeArea.setText(null);
                    btnAdicionarArea.setEnabled(true);
                    btnEditarArea.setEnabled(false);
                    btnExcluirArea.setEnabled(false);
                }
        } catch (java.sql.SQLIntegrityConstraintViolationException e){
            JOptionPane.showMessageDialog(null, "A área não pode ser deletada.\n Tente deletar os cursos vinculados a ela antes de apagar a mesme.");
                
        } catch (Exception el) {
            JOptionPane.showMessageDialog(null, el);
        }
        
    }
    
    /**
     * Creates new form TelaArea
     */
    public TelaArea() {
        initComponents();
        getContentPane().setBackground(Color.pink);
        conexao = ModuloConexao.conector();
        tblAreaConsulta.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdArea = new javax.swing.JTextField();
        txtNomeArea = new javax.swing.JTextField();
        btnEditarArea = new javax.swing.JButton();
        btnPesquisarArea = new javax.swing.JButton();
        btnExcluirArea = new javax.swing.JButton();
        btnAdicionarArea = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAreaConsulta = new javax.swing.JTable();
        txtConsultaArea = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SIS Equivalência - SENAI Vitória - Tela Area");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setText("ID:");

        jLabel2.setText("Nome:");

        txtIdArea.setEnabled(false);

        btnEditarArea.setBackground(new java.awt.Color(255, 204, 255));
        btnEditarArea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/equivalencia/imagens/Editar.png"))); // NOI18N
        btnEditarArea.setEnabled(false);
        btnEditarArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAreaActionPerformed(evt);
            }
        });

        btnPesquisarArea.setBackground(new java.awt.Color(255, 204, 255));
        btnPesquisarArea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/equivalencia/imagens/Pesquisar (1).png"))); // NOI18N

        btnExcluirArea.setBackground(new java.awt.Color(255, 153, 153));
        btnExcluirArea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/equivalencia/imagens/Excluir.png"))); // NOI18N
        btnExcluirArea.setEnabled(false);
        btnExcluirArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirAreaActionPerformed(evt);
            }
        });

        btnAdicionarArea.setBackground(new java.awt.Color(204, 255, 204));
        btnAdicionarArea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjetoEquivalencia/src/br/com/equivalencia/imagens/Adicionar.png"))); // NOI18N
        btnAdicionarArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarAreaActionPerformed(evt);
            }
        });

        tblAreaConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID Área", "Nome Área"
            }
        ));
        tblAreaConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAreaConsultaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAreaConsulta);

        txtConsultaArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtConsultaAreaMouseClicked(evt);
            }
        });
        txtConsultaArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConsultaAreaKeyReleased(evt);
            }
        });

        jLabel4.setText("Pesquisar :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeArea, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdArea, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdicionarArea, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnEditarArea, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnPesquisarArea, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnExcluirArea, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConsultaArea, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConsultaArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIdArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNomeArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEditarArea, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisarArea, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdicionarArea, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnExcluirArea, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarAreaActionPerformed
        adicionar();
        consultar();
    }//GEN-LAST:event_btnAdicionarAreaActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        try {
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(TelaArea.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosed

    private void txtConsultaAreaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultaAreaKeyReleased
        consultar();
    }//GEN-LAST:event_txtConsultaAreaKeyReleased

    private void txtConsultaAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConsultaAreaMouseClicked
        tblAreaConsulta.setVisible(true);
        consultar();
    }//GEN-LAST:event_txtConsultaAreaMouseClicked

    private void tblAreaConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAreaConsultaMouseClicked
        // TODO add your handling code here:
        setar_campos();
        consultar();
    }//GEN-LAST:event_tblAreaConsultaMouseClicked

    private void btnEditarAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAreaActionPerformed
         alterar();
         consultar();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarAreaActionPerformed

    private void btnExcluirAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirAreaActionPerformed
        // TODO add your handling code here:
        excluir();
        consultar();
    }//GEN-LAST:event_btnExcluirAreaActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaArea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarArea;
    private javax.swing.JButton btnEditarArea;
    private javax.swing.JButton btnExcluirArea;
    private javax.swing.JButton btnPesquisarArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAreaConsulta;
    private javax.swing.JTextField txtConsultaArea;
    private javax.swing.JTextField txtIdArea;
    private javax.swing.JTextField txtNomeArea;
    // End of variables declaration//GEN-END:variables
}