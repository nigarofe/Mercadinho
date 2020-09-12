
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;
import javax.swing.JOptionPane;


public class FakeDB {
    private static Vector<Produto> produtos;
    
    private static void carregarArquivo(){
        if(produtos == null){
            produtos = new Vector<>();
        } else {
            // Vetor já criado. Limpa o vetor para que informações repetidas não sejam adicionadas
            produtos.clear();
        }
        
        
        File arquivoCsv = new File("C:\\Users\\N\\Downloads\\produtos.csv");
        
        try{
            FileReader leitorDeArquivo = new FileReader(arquivoCsv);   // Informa ao sistema operacional que o arquivo está em uso
            BufferedReader leitorDeLinhas = new BufferedReader(leitorDeArquivo);
            
            leitorDeLinhas.readLine();  // Descartar cabeçalho
            String linha = leitorDeLinhas.readLine();
            
            while(linha != null){
                String[] fragmentos = linha.split(";");
                
                int codigo = Integer.parseInt(fragmentos[0]);
                String nome = fragmentos[1];
                Double preco = Double.parseDouble(fragmentos[2]);
                int quantidade = Integer.parseInt(fragmentos[3]);
                
                produtos.add(new Produto(codigo, nome, preco, quantidade));
                linha = leitorDeLinhas.readLine();
            }
            
            leitorDeLinhas.close();
        } catch (FileNotFoundException ex){
            JOptionPane.showConfirmDialog(null, "\"produtos.csv\" não encontrado!", "Erro!", 0);
        } catch (IOException ex){
            JOptionPane.showConfirmDialog(null, "\"produtos.csv\" corrompido!", "Erro!", 0);
        }
    }
    
    public static Produto getProdutoComCodigo(int codigo){
        if(produtos == null){
            carregarArquivo();
        }
        
        for(Produto prod : produtos){
            if(prod.getCodigo() == codigo){
                return prod;
            }
        }
        return null;
    }
    
}
