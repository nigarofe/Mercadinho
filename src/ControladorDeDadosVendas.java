
import javax.swing.table.AbstractTableModel;
import java.util.Vector;

public class ControladorDeDadosVendas extends AbstractTableModel {

    Vector<Produto> produtosDoCarrinho;
    VendasGUI painelDeVendas;

    public ControladorDeDadosVendas(VendasGUI painel) {
        produtosDoCarrinho = new Vector<>();
        painelDeVendas = painel;
    }

    @Override
    public int getRowCount() {
        return produtosDoCarrinho.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Código";
            case 1:
                return "Nome";
            case 2:
                return "Valor Unitário";
            case 3:
                return "Quantidade";
            case 4:
                return "Valor Parcial";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        Produto t = produtosDoCarrinho.get(linha);
        switch (coluna) {
            case 0:
                return t.getCodigo();
            case 1:
                return t.getNome();
            case 2:
                return t.getPreco();
            case 3:
                return t.getQuantidade();
            case 4:
                return t.getQuantidade() * t.getPreco();
            default:
                return null;
        }
    }

    public void adicionarProduto(Produto p) {
        produtosDoCarrinho.add(p);
    }

    public void removerProduto(int n) {
        produtosDoCarrinho.remove(n);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 3:
                return true;
            default:
                return false;
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return Double.class;
            case 3:
                return Integer.class;
            case 4:
                return Double.class;
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        produtosDoCarrinho.get(rowIndex).setQuantidade((int) aValue);
        this.painelDeVendas.updateUI();
        this.painelDeVendas.atualizarValorTotal();
    }

    public Double calcularPrecoTotal() {
        Double total = 0.0;
        for (Produto p : produtosDoCarrinho) {
            total += p.getPreco() * p.getQuantidade();
        }
        return total;
    }

    public void limparCarrinho() {
        produtosDoCarrinho.clear();
    }
}
