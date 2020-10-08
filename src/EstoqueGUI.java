
import java.awt.Dialog;
import javax.swing.JOptionPane;
import java.util.Vector;
import javax.swing.JDialog;

public class EstoqueGUI extends javax.swing.JPanel {

    Produto produtoTemporario;
    ControladorDeDadosEstoque controladorDeDados;

    public EstoqueGUI() {
        initComponents();
        controladorDeDados = new ControladorDeDadosEstoque(this);
        tabela.setModel(controladorDeDados);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botao_voltar = new javax.swing.JButton();
        campoDeTexto_nome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        botao_adicionarProduto = new javax.swing.JButton();
        botao_removerProduto = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        botao_voltar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botao_voltar.setText("Voltar");
        botao_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_voltarActionPerformed(evt);
            }
        });

        campoDeTexto_nome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        campoDeTexto_nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoDeTexto_nomeKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Nome");

        tabela.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabelaMouseReleased(evt);
            }
        });
        tabela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabelaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        botao_adicionarProduto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botao_adicionarProduto.setText("Adicionar Produto");
        botao_adicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_adicionarProdutoActionPerformed(evt);
            }
        });

        botao_removerProduto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botao_removerProduto.setText("Remover produto selecionado");
        botao_removerProduto.setEnabled(false);
        botao_removerProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_removerProdutoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("Produtos do estoque");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(botao_voltar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botao_removerProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoDeTexto_nome)
                            .addComponent(botao_adicionarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(273, 273, 273))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(campoDeTexto_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botao_removerProduto)
                        .addGap(18, 18, 18)
                        .addComponent(botao_adicionarProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botao_voltar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botao_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_voltarActionPerformed
        TelaPrincipalGUI.mudarPainel("vendas", new VendasGUI());
    }//GEN-LAST:event_botao_voltarActionPerformed

    private void campoDeTexto_nomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoDeTexto_nomeKeyReleased
        controladorDeDados.atualizarTabela(campoDeTexto_nome.getText());
    }//GEN-LAST:event_campoDeTexto_nomeKeyReleased

    private void botao_removerProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_removerProdutoActionPerformed
        // Remove um produto do estoque
        int linhaSelecionada = tabela.getSelectedRow();
        int confirmacao = JOptionPane.showConfirmDialog(null, "Deseja remover " + tabela.getValueAt(linhaSelecionada, 1) + " do carrinho de compras?", "Confirmar remoção de produto.", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (confirmacao == JOptionPane.YES_OPTION) {
            controladorDeDados.removerProduto(linhaSelecionada);
            botao_removerProduto.setEnabled(false);
            tabela.updateUI();
        }
    }//GEN-LAST:event_botao_removerProdutoActionPerformed

    private void tabelaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseReleased
        if (tabela.getSelectedRow() != -1) {
            botao_removerProduto.setEnabled(true);
        }
    }//GEN-LAST:event_tabelaMouseReleased

    private void tabelaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaKeyReleased
    }//GEN-LAST:event_tabelaKeyReleased

    private void botao_adicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_adicionarProdutoActionPerformed
        JDialog janelaCadastro = new JDialog();
        janelaCadastro.setLocationRelativeTo(this);
        janelaCadastro.setModalityType(Dialog.ModalityType.TOOLKIT_MODAL);
        janelaCadastro.setSize(new InserirProdutoGUI(janelaCadastro, this.controladorDeDados).getPreferredSize());
        janelaCadastro.add(new InserirProdutoGUI(janelaCadastro, this.controladorDeDados));
        janelaCadastro.setVisible(true);
    }//GEN-LAST:event_botao_adicionarProdutoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_adicionarProduto;
    private javax.swing.JButton botao_removerProduto;
    private javax.swing.JButton botao_voltar;
    private javax.swing.JTextField campoDeTexto_nome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
