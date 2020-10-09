
import javax.swing.JOptionPane;
import javax.swing.JDialog;

public class InserirProdutoGUI extends javax.swing.JPanel {

    JDialog janela;
    ControladorDeDadosEstoque controlador;

    public InserirProdutoGUI(JDialog janela, ControladorDeDadosEstoque controlador) {
        initComponents();
        this.janela = janela;
        this.controlador = controlador;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoDeTexto_nome = new javax.swing.JTextField();
        campoDeTexto_precoUnitario = new javax.swing.JTextField();
        campoDeTexto_quantidadeEmEstoque = new javax.swing.JTextField();
        botao_adicionarProduto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        botao_cancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        campoDeTexto_nome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        campoDeTexto_precoUnitario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        campoDeTexto_quantidadeEmEstoque.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        botao_adicionarProduto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botao_adicionarProduto.setText("Adicionar Produto");
        botao_adicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_adicionarProdutoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Preço unitário");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Quantidade em estoque");

        botao_cancelar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botao_cancelar.setText("Cancelar");
        botao_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_cancelarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Inserir Produto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(campoDeTexto_nome, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(campoDeTexto_quantidadeEmEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(campoDeTexto_precoUnitario, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                    .addComponent(botao_adicionarProduto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao_cancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(campoDeTexto_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addComponent(campoDeTexto_quantidadeEmEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addComponent(campoDeTexto_precoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botao_adicionarProduto)
                .addGap(18, 18, 18)
                .addComponent(botao_cancelar)
                .addGap(64, 64, 64))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botao_adicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_adicionarProdutoActionPerformed
        if (campoDeTexto_nome.getText().isEmpty() || campoDeTexto_precoUnitario.getText().isEmpty()
                || campoDeTexto_quantidadeEmEstoque.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        } else {
            try {
                int codigo = FakeDB.getMaiorCodigo();
                String nome = campoDeTexto_nome.getText();
                double precoUnitario = Double.parseDouble(campoDeTexto_precoUnitario.getText());
                int quantidadeASerComprada = Integer.parseInt(campoDeTexto_quantidadeEmEstoque.getText());

                Produto t = new Produto(codigo + 1, nome, precoUnitario, quantidadeASerComprada);
                FakeDB.adicionarProduto(t);

                janela.setVisible(false);
                controlador.atualizarTabela("");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Valores inseridos inválidos!");
            }
        }
    }//GEN-LAST:event_botao_adicionarProdutoActionPerformed

    private void botao_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_cancelarActionPerformed
        janela.setVisible(false);
    }//GEN-LAST:event_botao_cancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_adicionarProduto;
    private javax.swing.JButton botao_cancelar;
    private javax.swing.JTextField campoDeTexto_nome;
    private javax.swing.JTextField campoDeTexto_precoUnitario;
    private javax.swing.JTextField campoDeTexto_quantidadeEmEstoque;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
