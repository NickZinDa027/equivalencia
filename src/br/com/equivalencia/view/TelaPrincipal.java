/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.equivalencia.view;

import java.awt.Color;

/**
 *
 * @author nferreira
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        getContentPane().setBackground(Color.pink);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        btnArea = new javax.swing.JButton();
        btnCurso = new javax.swing.JButton();
        btnGrupoEquiv = new javax.swing.JButton();
        btnUnidades = new javax.swing.JButton();
        btnPpc = new javax.swing.JButton();
        btnEquivalencia = new javax.swing.JButton();
        menPrincipal = new javax.swing.JMenuBar();
        menCad = new javax.swing.JMenu();
        menCadArea = new javax.swing.JMenuItem();
        menCadCurso = new javax.swing.JMenuItem();
        menCadPpc = new javax.swing.JMenuItem();
        menCadGrupo = new javax.swing.JMenuItem();
        menCadUnidade = new javax.swing.JMenuItem();
        menCadUsuario = new javax.swing.JMenuItem();
        menEquiv = new javax.swing.JMenu();
        menEquivalencia = new javax.swing.JMenuItem();
        menOpc = new javax.swing.JMenu();
        menLogout = new javax.swing.JMenuItem();
        menSair = new javax.swing.JMenuItem();
        menAjuda = new javax.swing.JMenu();
        menFluxo = new javax.swing.JMenuItem();
        menManual = new javax.swing.JMenuItem();

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIS Equivalência - SENAI Vitória - Tela Principal");
        setResizable(false);

        btnArea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/equivalencia/imagens/6572257_ai_creative_education_idea_knowledge_icon.png"))); // NOI18N

        btnCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/equivalencia/imagens/6771595_education_graduation_learning_school_study_icon.png"))); // NOI18N

        btnGrupoEquiv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/equivalencia/imagens/balança.png"))); // NOI18N

        btnUnidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/equivalencia/imagens/6585301_books_education_learning_school_study_icon.png"))); // NOI18N
        btnUnidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnidadesActionPerformed(evt);
            }
        });

        btnPpc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/equivalencia/imagens/certificado.png"))); // NOI18N

        btnEquivalencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/equivalencia/imagens/balança de mão.png"))); // NOI18N

        menCad.setText("Cadastro");

        menCadArea.setText("Área Tecnolôgica");
        menCadArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadAreaActionPerformed(evt);
            }
        });
        menCad.add(menCadArea);

        menCadCurso.setText("Cursos");
        menCad.add(menCadCurso);

        menCadPpc.setText("PPC");
        menCadPpc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadPpcActionPerformed(evt);
            }
        });
        menCad.add(menCadPpc);

        menCadGrupo.setText("Grupo Equivalência");
        menCad.add(menCadGrupo);

        menCadUnidade.setText("Unidades Curriculares");
        menCad.add(menCadUnidade);

        menCadUsuario.setText("Usuários");
        menCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadUsuarioActionPerformed(evt);
            }
        });
        menCad.add(menCadUsuario);

        menPrincipal.add(menCad);

        menEquiv.setText("Equivlência");

        menEquivalencia.setText("Realizar Equivalência");
        menEquivalencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menEquivalenciaActionPerformed(evt);
            }
        });
        menEquiv.add(menEquivalencia);

        menPrincipal.add(menEquiv);

        menOpc.setText("Opções");
        menOpc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menOpcActionPerformed(evt);
            }
        });

        menLogout.setText("Logout");
        menLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menLogoutActionPerformed(evt);
            }
        });
        menOpc.add(menLogout);

        menSair.setText("Sair");
        menSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menSairActionPerformed(evt);
            }
        });
        menOpc.add(menSair);

        menPrincipal.add(menOpc);

        menAjuda.setText("Ajuda");

        menFluxo.setText("Fluxo de Processo");
        menAjuda.add(menFluxo);

        menManual.setText("Manual");
        menAjuda.add(menManual);

        menPrincipal.add(menAjuda);

        setJMenuBar(menPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnArea, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(btnCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(btnGrupoEquiv, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(btnPpc, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(btnEquivalencia, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnArea, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGrupoEquiv, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUnidades)
                    .addComponent(btnPpc)
                    .addComponent(btnEquivalencia))
                .addGap(43, 43, 43))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menCadAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadAreaActionPerformed
    TelaArea area = new TelaArea();
    area.setVisible(true);
    }//GEN-LAST:event_menCadAreaActionPerformed

    private void btnUnidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUnidadesActionPerformed

    private void menCadPpcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadPpcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menCadPpcActionPerformed

    private void menCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menCadUsuarioActionPerformed

    private void menEquivalenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menEquivalenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menEquivalenciaActionPerformed

    private void menOpcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menOpcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menOpcActionPerformed

    private void menLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menLogoutActionPerformed
    TelaLogin login = new TelaLogin();
    login.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_menLogoutActionPerformed

    private void menSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menSairActionPerformed
    System.exit(0);
    }//GEN-LAST:event_menSairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArea;
    private javax.swing.JButton btnCurso;
    private javax.swing.JButton btnEquivalencia;
    private javax.swing.JButton btnGrupoEquiv;
    private javax.swing.JButton btnPpc;
    private javax.swing.JButton btnUnidades;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu menAjuda;
    public static javax.swing.JMenu menCad;
    private javax.swing.JMenuItem menCadArea;
    private javax.swing.JMenuItem menCadCurso;
    private javax.swing.JMenuItem menCadGrupo;
    private javax.swing.JMenuItem menCadPpc;
    private javax.swing.JMenuItem menCadUnidade;
    private javax.swing.JMenuItem menCadUsuario;
    private javax.swing.JMenu menEquiv;
    private javax.swing.JMenuItem menEquivalencia;
    private javax.swing.JMenuItem menFluxo;
    private javax.swing.JMenuItem menLogout;
    private javax.swing.JMenuItem menManual;
    private javax.swing.JMenu menOpc;
    private javax.swing.JMenuBar menPrincipal;
    private javax.swing.JMenuItem menSair;
    // End of variables declaration//GEN-END:variables
}