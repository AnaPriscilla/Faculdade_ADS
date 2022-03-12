/*
    Calculadora: Exercício de Arquitetura e Projeto e Software
 */
package senai.com.br.ana_priscilla;

/**
 *
 * @author anapriscilla
 */
public class Calculadora_Ana_Priscilla extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora_Ana_Priscilla
     */
    public Calculadora_Ana_Priscilla() {
        initComponents();
    }

    double numero1, numero2;
    String operacao;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        telaResultado = new javax.swing.JTextField();
        botaoZero = new javax.swing.JButton();
        botaoUm = new javax.swing.JButton();
        botaoDois = new javax.swing.JButton();
        botaoTres = new javax.swing.JButton();
        botaoQuatro = new javax.swing.JButton();
        botaoCinco = new javax.swing.JButton();
        botaoSeis = new javax.swing.JButton();
        botaoSete = new javax.swing.JButton();
        botaoOito = new javax.swing.JButton();
        botaoNove = new javax.swing.JButton();
        botaoDivisao = new javax.swing.JButton();
        botaoMultiplicacao = new javax.swing.JButton();
        botaoSubtracao = new javax.swing.JButton();
        botaoAdicao = new javax.swing.JButton();
        botaoIgual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(238, 238, 238));
        jPanel1.setPreferredSize(new java.awt.Dimension(475, 520));

        telaResultado.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        telaResultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        telaResultado.setText(" ");
        telaResultado.setToolTipText("");
        telaResultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 186, 191), 2));
        telaResultado.setMargin(new java.awt.Insets(2, 6, 2, 20));
        telaResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telaResultadoActionPerformed(evt);
            }
        });

        botaoZero.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        botaoZero.setForeground(new java.awt.Color(96, 96, 96));
        botaoZero.setText("0");
        botaoZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoZeroActionPerformed(evt);
            }
        });

        botaoUm.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        botaoUm.setForeground(new java.awt.Color(96, 96, 96));
        botaoUm.setText("1");
        botaoUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoUmActionPerformed(evt);
            }
        });

        botaoDois.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        botaoDois.setForeground(new java.awt.Color(96, 96, 96));
        botaoDois.setText("2");
        botaoDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDoisActionPerformed(evt);
            }
        });

        botaoTres.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        botaoTres.setForeground(new java.awt.Color(96, 96, 96));
        botaoTres.setText("3");
        botaoTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTresActionPerformed(evt);
            }
        });

        botaoQuatro.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        botaoQuatro.setForeground(new java.awt.Color(96, 96, 96));
        botaoQuatro.setText("4");
        botaoQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoQuatroActionPerformed(evt);
            }
        });

        botaoCinco.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        botaoCinco.setForeground(new java.awt.Color(96, 96, 96));
        botaoCinco.setText("5");
        botaoCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCincoActionPerformed(evt);
            }
        });

        botaoSeis.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        botaoSeis.setForeground(new java.awt.Color(96, 96, 96));
        botaoSeis.setText("6");
        botaoSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSeisActionPerformed(evt);
            }
        });

        botaoSete.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        botaoSete.setForeground(new java.awt.Color(96, 96, 96));
        botaoSete.setText("7");
        botaoSete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSeteActionPerformed(evt);
            }
        });

        botaoOito.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        botaoOito.setForeground(new java.awt.Color(96, 96, 96));
        botaoOito.setText("8");
        botaoOito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOitoActionPerformed(evt);
            }
        });

        botaoNove.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        botaoNove.setForeground(new java.awt.Color(96, 96, 96));
        botaoNove.setText("9");
        botaoNove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNoveActionPerformed(evt);
            }
        });

        botaoDivisao.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        botaoDivisao.setForeground(new java.awt.Color(96, 96, 96));
        botaoDivisao.setText("/");
        botaoDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDivisaoActionPerformed(evt);
            }
        });

        botaoMultiplicacao.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        botaoMultiplicacao.setForeground(new java.awt.Color(96, 96, 96));
        botaoMultiplicacao.setText("*");
        botaoMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMultiplicacaoActionPerformed(evt);
            }
        });

        botaoSubtracao.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        botaoSubtracao.setForeground(new java.awt.Color(96, 96, 96));
        botaoSubtracao.setText("-");
        botaoSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSubtracaoActionPerformed(evt);
            }
        });

        botaoAdicao.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        botaoAdicao.setForeground(new java.awt.Color(96, 96, 96));
        botaoAdicao.setText("+");
        botaoAdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicaoActionPerformed(evt);
            }
        });

        botaoIgual.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        botaoIgual.setForeground(new java.awt.Color(96, 96, 96));
        botaoIgual.setText("=");
        botaoIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIgualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoUm, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoSete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botaoCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botaoDois, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(botaoSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botaoMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(botaoTres, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botaoSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botaoOito, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botaoNove, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botaoDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(telaResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botaoZero, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botaoIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botaoAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(telaResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSete, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoOito, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoNove, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoTres, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoDois, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoUm, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoZero, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoZeroActionPerformed
        //Botão 0
        telaResultado.setText(telaResultado.getText() + "0");
    }//GEN-LAST:event_botaoZeroActionPerformed

    private void botaoNoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNoveActionPerformed
        //Botão 9
        telaResultado.setText(telaResultado.getText() + "9");
    }//GEN-LAST:event_botaoNoveActionPerformed

    private void botaoDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDivisaoActionPerformed
        // Botão divisão (/)
        numero1 = Double.parseDouble(telaResultado.getText());
        telaResultado.setText("");
        operacao = "divisao";
    }//GEN-LAST:event_botaoDivisaoActionPerformed

    private void telaResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telaResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telaResultadoActionPerformed

    private void botaoUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoUmActionPerformed
        //Botão 1
        telaResultado.setText(telaResultado.getText() + "1");
    }//GEN-LAST:event_botaoUmActionPerformed

    private void botaoDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDoisActionPerformed
        //Botão 2
        telaResultado.setText(telaResultado.getText() + "2");
    }//GEN-LAST:event_botaoDoisActionPerformed

    private void botaoTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTresActionPerformed
        //Botão 3
        telaResultado.setText(telaResultado.getText() + "3");
    }//GEN-LAST:event_botaoTresActionPerformed

    private void botaoQuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoQuatroActionPerformed
        //Botão 4
        telaResultado.setText(telaResultado.getText() + "4");
    }//GEN-LAST:event_botaoQuatroActionPerformed

    private void botaoCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCincoActionPerformed
        //Botão 5
        telaResultado.setText(telaResultado.getText() + "5");
    }//GEN-LAST:event_botaoCincoActionPerformed

    private void botaoSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSeisActionPerformed
        //Botão 6
        telaResultado.setText(telaResultado.getText() + "6");
    }//GEN-LAST:event_botaoSeisActionPerformed

    private void botaoSeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSeteActionPerformed
        //Botão 7
        telaResultado.setText(telaResultado.getText() + "7");
    }//GEN-LAST:event_botaoSeteActionPerformed

    private void botaoOitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOitoActionPerformed
        //Botão 8
        telaResultado.setText(telaResultado.getText() + "8");
    }//GEN-LAST:event_botaoOitoActionPerformed

    private void botaoAdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicaoActionPerformed
        // Botão +
        numero1 = Double.parseDouble(telaResultado.getText());
        telaResultado.setText("");
        operacao = "adicao";
    }//GEN-LAST:event_botaoAdicaoActionPerformed

    private void botaoSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSubtracaoActionPerformed
        // Botão -
        numero1 = Double.parseDouble(telaResultado.getText());
        telaResultado.setText("");
        operacao = "subtracao";
        
    }//GEN-LAST:event_botaoSubtracaoActionPerformed

    private void botaoMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMultiplicacaoActionPerformed
        // Botão *
        numero1 = Double.parseDouble(telaResultado.getText());
        telaResultado.setText("");
        operacao = "multiplicacao";
    }//GEN-LAST:event_botaoMultiplicacaoActionPerformed

    private void botaoIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIgualActionPerformed
        // Botão = 
        numero2 = Double.parseDouble(telaResultado.getText());
        
        if (operacao == "adicao"){
            telaResultado.setText(String.valueOf(numero1 + numero2));
        } else if (operacao == "subtracao"){
            telaResultado.setText(String.valueOf(numero1 - numero2));
        } else if (operacao == "multiplicacao"){
            telaResultado.setText(String.valueOf(numero1 * numero2));
        } else if (operacao == "divisao"){
            telaResultado.setText(String.valueOf(numero1 / numero2));
        } 
    }//GEN-LAST:event_botaoIgualActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora_Ana_Priscilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora_Ana_Priscilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora_Ana_Priscilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora_Ana_Priscilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora_Ana_Priscilla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdicao;
    private javax.swing.JButton botaoCinco;
    private javax.swing.JButton botaoDivisao;
    private javax.swing.JButton botaoDois;
    private javax.swing.JButton botaoIgual;
    private javax.swing.JButton botaoMultiplicacao;
    private javax.swing.JButton botaoNove;
    private javax.swing.JButton botaoOito;
    private javax.swing.JButton botaoQuatro;
    private javax.swing.JButton botaoSeis;
    private javax.swing.JButton botaoSete;
    private javax.swing.JButton botaoSubtracao;
    private javax.swing.JButton botaoTres;
    private javax.swing.JButton botaoUm;
    private javax.swing.JButton botaoZero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField telaResultado;
    // End of variables declaration//GEN-END:variables
}
