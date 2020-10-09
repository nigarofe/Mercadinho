
import javax.swing.table.AbstractTableModel;
import java.util.Collections;
import java.util.Vector;

public class ControladorDeDadosEstoque extends AbstractTableModel {

    private Vector<Produto> produtosDoEstoque;
    private EstoqueGUI painelDeEstoque;

    public ControladorDeDadosEstoque(EstoqueGUI painel) {
        this.produtosDoEstoque = new Vector<>();
        this.painelDeEstoque = painel;
        atualizarTabela("");
    }

    @Override
    public int getRowCount() {
        return produtosDoEstoque.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return produtosDoEstoque.get(rowIndex).getCodigo();
            case 1:
                return produtosDoEstoque.get(rowIndex).getNome();
            case 2:
                return produtosDoEstoque.get(rowIndex).getPreco();
            case 3:
                return produtosDoEstoque.get(rowIndex).getQuantidade();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Código";
            case 1:
                return "Nome";
            case 2:
                return "Preço";
            case 3:
                return "Quantidade";
            default:
                return null;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return false;
            default:
                return true;
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
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 1:
                produtosDoEstoque.get(rowIndex).setNome(String.valueOf(aValue));
                break;
            case 2:
                produtosDoEstoque.get(rowIndex).setPreco(Double.parseDouble(String.valueOf(aValue)));
                break;
            case 3:
                produtosDoEstoque.get(rowIndex).setQuantidade(Integer.parseInt(String.valueOf(aValue)));
                break;
        }
    }

    public void atualizarTabela(String nome) {
        produtosDoEstoque = FakeDB.getProdutoComNome(nome);
        painelDeEstoque.updateUI();

        Collections.sort(produtosDoEstoque);
    }

    public void removerProduto(int n) {
        FakeDB.removerProduto(produtosDoEstoque.get(n));
        produtosDoEstoque.remove(n);
    }
}
