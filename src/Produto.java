
public class Produto implements Comparable<Produto>{

    private int codigo;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(int codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return this.codigo + ";" + this.nome + ";" + this.preco + ";" + this.quantidade + "\n";
    }
    
    

    @Override
    public int compareTo(Produto o) {
        return this.nome.toLowerCase().compareTo(o.getNome().toLowerCase());
    }
}
