/*
Lógica do Sistema, computa os votos e faz a porcentagem 
 */
package senai.com.br.funcionalidades;

/**
 *
 * @author anapriscilla
 */
public class Votacao_Ana_Priscilla extends javax.swing.JFrame {

    /**
     * Creates new form Registro_Candidato_Ana_Priscilla
     */
    Voto_Votacao tela;

    public Votacao_Ana_Priscilla() {
        initComponents();
        tela = new Voto_Votacao();
    }

    public void enviaPalavra(Registro_Candidato_Ana_Priscilla tela_Registro_Candidato_Ana_Priscilla, String nome) {
        votarCandidato1.setText(nome);
    }

    public void enviaPalavra2(Registro_Candidato_Ana_Priscilla tela_Registro_Candidato_Ana_Priscilla, String nome) {
        votarCandidato2.setText(nome);
    }

    public void enviaPalavra3(Registro_Candidato_Ana_Priscilla tela_Registro_Candidato_Ana_Priscilla, String nome) {
        votarCandidato3.setText(nome);
    }

    public class Voto_Votacao {

        Votacao voto;

        public Voto_Votacao() {
            voto = new Votacao();
            voto.iniciar();
        }

        public void votar(int opcao) {
            voto.votar(opcao);
        }

        public String exibirResultado() {
            return voto.resultadoDaVotacao();
        }
    }

    public class Votacao {
        //Vetor de 3 posições

        public String[] botao = new String[3];
        public int[] quantidadeDeVotos = new int[3];
        int totalDeVotos;

        //Métodos 
        public void iniciar() {
            botao[0] = "1";
            botao[1] = "2";
            botao[2] = "3";
            quantidadeDeVotos[0] = 0;
            quantidadeDeVotos[1] = 0;
            quantidadeDeVotos[2] = 0;
            totalDeVotos = 0;
        }

        public void votar(int botao) {
            quantidadeDeVotos[botao]++;
            totalDeVotos++;
        }

        public float calcularPorcentagem(int botao) {
            return (float) ((float) quantidadeDeVotos[botao] * 100.0 / (float) totalDeVotos);
        }

        public String resultadoDaVotacao() {
            String resultado = "Quantidade de Votos: \n";
            for (int i = 0; i < 3; i++) {
                resultado = resultado + botao[i] + "| :" + quantidadeDeVotos[i] + "\n";
            }
            resultado += "Porcentagem da Votação: \n";
            for (int i = 0; i < 3; i++) {
                resultado = resultado + botao[i] + "| : " + calcularPorcentagem(i) + "%\n";
            }
            return resultado;
        }
    }

    /* private Registro_Candidato_Ana_Priscilla tela_registro;*/

 /*Chamando a proxima janela*/
    Resultado_Ana_Priscilla resultadoVotos = new Resultado_Ana_Priscilla();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        votarCandidato1 = new javax.swing.JButton();
        votarCandidato2 = new javax.swing.JButton();
        votarCandidato3 = new javax.swing.JButton();
        resultadoVotacao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(42, 79, 150));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(42, 79, 150));
        jLabel2.setText("URnas - Sistema de Votação - VOTAR");

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\vote 1 (1).png")); // NOI18N
        jLabel6.setText("jLabel6");

        votarCandidato1.setBackground(new java.awt.Color(255, 255, 255));
        votarCandidato1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        votarCandidato1.setForeground(new java.awt.Color(102, 102, 102));
        votarCandidato1.setText("Candidato 1");
        votarCandidato1.setBorder(null);
        votarCandidato1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                votarCandidato1ActionPerformed(evt);
            }
        });

        votarCandidato2.setBackground(new java.awt.Color(255, 255, 255));
        votarCandidato2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        votarCandidato2.setForeground(new java.awt.Color(102, 102, 102));
        votarCandidato2.setText("Candidato 2");
        votarCandidato2.setBorder(null);
        votarCandidato2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                votarCandidato2ActionPerformed(evt);
            }
        });

        votarCandidato3.setBackground(new java.awt.Color(255, 255, 255));
        votarCandidato3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        votarCandidato3.setForeground(new java.awt.Color(102, 102, 102));
        votarCandidato3.setText("Candidato 3");
        votarCandidato3.setBorder(null);
        votarCandidato3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                votarCandidato3ActionPerformed(evt);
            }
        });

        resultadoVotacao.setBackground(new java.awt.Color(42, 79, 150));
        resultadoVotacao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        resultadoVotacao.setForeground(new java.awt.Color(255, 255, 255));
        resultadoVotacao.setText("RESULTADO");
        resultadoVotacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoVotacaoActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Escolha seu candidato:");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(resultadoVotacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(votarCandidato1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(votarCandidato2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(votarCandidato3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(65, 65, 65))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(votarCandidato1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(votarCandidato2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(votarCandidato3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resultadoVotacao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(Votacao_Ana_Priscilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Votacao_Ana_Priscilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Votacao_Ana_Priscilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Votacao_Ana_Priscilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resultado_Ana_Priscilla().setVisible(true);
            }
        });
    }
    
    private void votarCandidato2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_votarCandidato2ActionPerformed
        // TODO add your handling code here:
        tela.votar(1);
        //resultadoVotacao.setText(tela.exibirResultado());
    }//GEN-LAST:event_votarCandidato2ActionPerformed

    private void votarCandidato1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_votarCandidato1ActionPerformed
        // TODO add your handling code here:
        tela.votar(0);
        //resultadoVotacao.setText(tela.exibirResultado());

    }//GEN-LAST:event_votarCandidato1ActionPerformed

    private void votarCandidato3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_votarCandidato3ActionPerformed
        // TODO add your handling code here:
        tela.votar(2);
        //resultadoVotacao.setText(tela.exibirResultado());
    }//GEN-LAST:event_votarCandidato3ActionPerformed

    private void resultadoVotacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoVotacaoActionPerformed
        // TODO add your handling code here:
        if (!resultadoVotacao.getText().isEmpty()) {
            if (resultadoVotos == null) {
                resultadoVotos = new Resultado_Ana_Priscilla();
                resultadoVotos.setLocationRelativeTo(null);
                resultadoVotos.setVisible(true);
                resultadoVotos.setResizable(false);
            } else {
                resultadoVotos.setLocationRelativeTo(null);
                resultadoVotos.setVisible(true);
                resultadoVotos.setResizable(false);
            }

            resultadoVotos.enviaResultado(this, tela.exibirResultado());
        }
    }//GEN-LAST:event_resultadoVotacaoActionPerformed

    /**
         * @param args the command line arguments
         */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton resultadoVotacao;
    private javax.swing.JButton votarCandidato1;
    private javax.swing.JButton votarCandidato2;
    private javax.swing.JButton votarCandidato3;
    // End of variables declaration//GEN-END:variables
}