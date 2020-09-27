
import javax.swing.JOptionPane;
import java.util.Vector;

public class Vendas extends javax.swing.JPanel {

    Produto produtoTemporario;
    ControladorDeDados controladorDeDados;

    public Vendas() {
        initComponents();
        controladorDeDados = new ControladorDeDados(this);
        tabela.setModel(controladorDeDados);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botao_estoque = new javax.swing.JButton();
        campoDeTexto_codigo = new javax.swing.JTextField();
        campoDeTexto_nome = new javax.swing.JTextField();
        campoDeTexto_precoUnitario = new javax.swing.JTextField();
        campoDeTexto_quantidadeEmEstoque = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoDeTexto_quantidadeASerComprada = new javax.swing.JTextField();
        campoDeTexto_precoParcial = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        botao_adicionarProduto = new javax.swing.JButton();
        texto_valorTotalTexto = new javax.swing.JLabel();
        texto_valorTotalNumero = new javax.swing.JLabel();
        botao_finalizarCompra = new javax.swing.JButton();
        botao_removerProduto = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        botao_estoque.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botao_estoque.setText("Estoque");
        botao_estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_estoqueActionPerformed(evt);
            }
        });

        campoDeTexto_codigo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        campoDeTexto_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoDeTexto_codigoKeyReleased(evt);
            }
        });

        campoDeTexto_nome.setEditable(false);
        campoDeTexto_nome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        campoDeTexto_nome.setEnabled(false);

        campoDeTexto_precoUnitario.setEditable(false);
        campoDeTexto_precoUnitario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        campoDeTexto_precoUnitario.setEnabled(false);

        campoDeTexto_quantidadeEmEstoque.setEditable(false);
        campoDeTexto_quantidadeEmEstoque.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        campoDeTexto_quantidadeEmEstoque.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Código");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Preço unitário");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Quantidade em estoque");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Quantidade a ser comprada");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Preço parcial");

        campoDeTexto_quantidadeASerComprada.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        campoDeTexto_quantidadeASerComprada.setEnabled(false);
        campoDeTexto_quantidadeASerComprada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoDeTexto_quantidadeASerCompradaKeyReleased(evt);
            }
        });

        campoDeTexto_precoParcial.setEditable(false);
        campoDeTexto_precoParcial.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        campoDeTexto_precoParcial.setEnabled(false);

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
        botao_adicionarProduto.setEnabled(false);
        botao_adicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_adicionarProdutoActionPerformed(evt);
            }
        });

        texto_valorTotalTexto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        texto_valorTotalTexto.setText("Valor Total = R$");

        texto_valorTotalNumero.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        texto_valorTotalNumero.setText("0,00");

        botao_finalizarCompra.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botao_finalizarCompra.setText("Finalizar Compra");
        botao_finalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_finalizarCompraActionPerformed(evt);
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
        jLabel9.setText("Produtos do carrinho");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(189, 189, 189)
                                .addComponent(jLabel2)
                                .addGap(202, 202, 202)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(campoDeTexto_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(campoDeTexto_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(campoDeTexto_quantidadeASerComprada, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(campoDeTexto_quantidadeEmEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(campoDeTexto_precoParcial, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(campoDeTexto_precoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(149, 149, 149)
                                        .addComponent(botao_adicionarProduto))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addComponent(botao_removerProduto)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(texto_valorTotalTexto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(texto_valorTotalNumero))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botao_estoque)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botao_finalizarCompra)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoDeTexto_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoDeTexto_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoDeTexto_quantidadeASerComprada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoDeTexto_quantidadeEmEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoDeTexto_precoParcial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoDeTexto_precoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(botao_adicionarProduto)
                        .addGap(18, 18, 18)
                        .addComponent(botao_removerProduto))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_finalizarCompra)
                    .addComponent(botao_estoque)
                    .addComponent(texto_valorTotalTexto)
                    .addComponent(texto_valorTotalNumero))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botao_estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_estoqueActionPerformed
        String senha = JOptionPane.showInputDialog(null, "Insira a senha de administrador:", "Acessar gerenciador de estoque", 0);

        if (senha.equals(" ")) {
            TelaPrincipal.mudarPainel("estoque", new Estoque());
        } else {
            JOptionPane.showMessageDialog(null, "Senha incorreta!", "Acessar gerenciador de estoque", 0);
        }
    }//GEN-LAST:event_botao_estoqueActionPerformed

    private void campoDeTexto_codigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoDeTexto_codigoKeyReleased
        botao_adicionarProduto.setEnabled(false);
        campoDeTexto_quantidadeASerComprada.setEnabled(false);

        try {
            int n = Integer.parseInt(campoDeTexto_codigo.getText());
            produtoTemporario = FakeDB.getProdutoComCodigo(n);

            if (produtoTemporario != null) {
                String nome = produtoTemporario.getNome();
                String precoUnitario = String.valueOf(produtoTemporario.getPreco());
                String quantidadeEmEstoque = String.valueOf(produtoTemporario.getQuantidade());

                campoDeTexto_nome.setText(nome);
                campoDeTexto_precoUnitario.setText(precoUnitario);
                campoDeTexto_quantidadeEmEstoque.setText(quantidadeEmEstoque);

                botao_adicionarProduto.setEnabled(true);

                campoDeTexto_quantidadeASerComprada.setEnabled(true);
                campoDeTexto_quantidadeASerComprada.setText("1");
                campoDeTexto_precoParcial.setText(precoUnitario);
            } else {
                limparCampos();
                campoDeTexto_nome.setText("Produto inexistente!");
            }
        } catch (NumberFormatException ex) {
            limparCampos();
            campoDeTexto_nome.setText("Código inválido!");
        }
    }//GEN-LAST:event_campoDeTexto_codigoKeyReleased

    private void campoDeTexto_quantidadeASerCompradaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoDeTexto_quantidadeASerCompradaKeyReleased
        try {
            // Obtém o valor do campo de texto
            int quantidadeASerComprada = Integer.parseInt(campoDeTexto_quantidadeASerComprada.getText());

            // Impede que o operador insira uma quantidade maior do que há no estoque
            int quantidadeEmEstoque = produtoTemporario.getQuantidade();
            if (quantidadeASerComprada > quantidadeEmEstoque) {
                quantidadeASerComprada = quantidadeEmEstoque;
                campoDeTexto_quantidadeASerComprada.setText(quantidadeEmEstoque + "");
            }

            // Atualiza o preço parcial
            Double precoUnitario = produtoTemporario.getPreco();
            Double precoParcial = quantidadeASerComprada * precoUnitario;
            campoDeTexto_precoParcial.setText(String.format("%.2f", precoParcial));

            // Permite ao operador adicionar o produto no carrinho
            botao_adicionarProduto.setEnabled(true);

        } catch (NumberFormatException ex) {
            campoDeTexto_precoParcial.setText("Quantidade inválida!");
            botao_adicionarProduto.setEnabled(false);
        }
    }//GEN-LAST:event_campoDeTexto_quantidadeASerCompradaKeyReleased

    private void botao_adicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_adicionarProdutoActionPerformed
        int codigo = produtoTemporario.getCodigo();
        String nome = produtoTemporario.getNome();
        double precoUnitario = produtoTemporario.getPreco();
        int quantidadeASerComprada = Integer.parseInt(campoDeTexto_quantidadeASerComprada.getText());

        Produto t = new Produto(codigo, nome, precoUnitario, quantidadeASerComprada);
        controladorDeDados.adicionarProduto(t);
        tabela.updateUI();
        atualizarValorTotal();

        limparTodosOsCampos();
        campoDeTexto_quantidadeASerComprada.setEnabled(false);
        botao_adicionarProduto.setEnabled(false);
        produtoTemporario = null;
    }//GEN-LAST:event_botao_adicionarProdutoActionPerformed

    private void botao_removerProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_removerProdutoActionPerformed
        // Remove um produto do carrinho de compras
        int linhaSelecionada = tabela.getSelectedRow();
        int confirmacao = JOptionPane.showConfirmDialog(null, "Deseja remover " + tabela.getValueAt(linhaSelecionada, 1) + " do carrinho de compras?", "Confirmar remoção de produto.", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (confirmacao == JOptionPane.YES_OPTION) {
            controladorDeDados.removerProduto(linhaSelecionada);
            botao_removerProduto.setEnabled(false);
            tabela.updateUI();
            atualizarValorTotal();
        }
    }//GEN-LAST:event_botao_removerProdutoActionPerformed

    private void tabelaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseReleased
        // Habilita o botao de remover produto caso seja selecionada uma linha válida
        if (tabela.getSelectedRow() != -1) {
            botao_removerProduto.setEnabled(true);
        }
    }//GEN-LAST:event_tabelaMouseReleased

    private void tabelaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaKeyReleased
        // Impede que o operador insira uma quantidade maior do que há no estoque
        int codigo = (int) tabela.getValueAt(tabela.getSelectedRow(), 0);
        int quantidadeDigitada = (int) tabela.getValueAt(tabela.getSelectedRow(), 3);
        Produto t = FakeDB.getProdutoComCodigo(codigo);
        int quantidadeEmEstoque = t.getQuantidade();

        if (quantidadeDigitada > quantidadeEmEstoque) {
            tabela.setValueAt(t.getQuantidade(), tabela.getSelectedRow(), 3);
        }
    }//GEN-LAST:event_tabelaKeyReleased

    private void botao_finalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_finalizarCompraActionPerformed
        // Atualiza a quantidade de produtos do estoque
        Vector<Produto> produtosDoCarrinho = controladorDeDados.produtosDoCarrinho;

        for (Produto umProdutoDoCarrinho : produtosDoCarrinho) {
            int codigoAtual = umProdutoDoCarrinho.getCodigo();
            Produto produtoDoEstoque = FakeDB.getProdutoComCodigo(codigoAtual);

            int velhaQuantidade = produtoDoEstoque.getQuantidade();
            int quantidadeComprada = umProdutoDoCarrinho.getQuantidade();
            int novaQuantidade = velhaQuantidade - quantidadeComprada;
            produtoDoEstoque.setQuantidade(novaQuantidade);
        }

        FakeDB.atualizarArquivo();

        // Deixa a interface pronta para uma próxima compra
        controladorDeDados.limparCarrinho();
        tabela.updateUI();
        atualizarValorTotal();
        botao_removerProduto.setEnabled(false);
    }//GEN-LAST:event_botao_finalizarCompraActionPerformed

    public void atualizarValorTotal() {
        texto_valorTotalNumero.setText(String.format("%.2f", controladorDeDados.calcularPrecoTotal()));
    }

    public void limparCampos() {
        campoDeTexto_quantidadeASerComprada.setText("");
        campoDeTexto_quantidadeEmEstoque.setText("");
        campoDeTexto_precoUnitario.setText("");
        campoDeTexto_precoParcial.setText("");
    }

    public void limparTodosOsCampos() {
        campoDeTexto_quantidadeASerComprada.setText("");
        campoDeTexto_quantidadeEmEstoque.setText("");
        campoDeTexto_precoUnitario.setText("");
        campoDeTexto_precoParcial.setText("");
        campoDeTexto_codigo.setText("");
        campoDeTexto_nome.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_adicionarProduto;
    private javax.swing.JButton botao_estoque;
    private javax.swing.JButton botao_finalizarCompra;
    private javax.swing.JButton botao_removerProduto;
    private javax.swing.JTextField campoDeTexto_codigo;
    private javax.swing.JTextField campoDeTexto_nome;
    private javax.swing.JTextField campoDeTexto_precoParcial;
    private javax.swing.JTextField campoDeTexto_precoUnitario;
    private javax.swing.JTextField campoDeTexto_quantidadeASerComprada;
    private javax.swing.JTextField campoDeTexto_quantidadeEmEstoque;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    private javax.swing.JLabel texto_valorTotalNumero;
    private javax.swing.JLabel texto_valorTotalTexto;
    // End of variables declaration//GEN-END:variables
}
