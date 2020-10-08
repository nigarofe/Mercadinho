
import javax.swing.JOptionPane;
import java.util.Vector;
import java.io.*;
import java.util.Collections;

public class FakeDB {

    public static Vector<Produto> produtos;
    public static String diretorioDaPlanilha;
    public static File arquivoCsv;

    public static void carregarArquivo() {
        if (produtos == null) {
            produtos = new Vector<>();
        } else {
            // Vetor já criado. Limpa o vetor para que informações repetidas não sejam adicionadas
            produtos.clear();
        }

        //File 
        arquivoCsv = new File("C:\\Users\\N\\Downloads\\produtos.csv");
        // Selecionador de arquivo
//        if (arquivoCsv == null) {
//            arquivoCsv = new File("");
//            JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
//            jfc.setDialogTitle("Selecione a localização do arquivo \"produtos.csv\": ");
//            jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
//
//            int returnValue = jfc.showSaveDialog(null);
//            if (returnValue == JFileChooser.APPROVE_OPTION) {
//                if (jfc.getSelectedFile().isFile()) {
//                    //System.out.println("You selected the directory: " + jfc.getSelectedFile());
//                    arquivoCsv = jfc.getSelectedFile();
//                }
//            }
//        }

        try {
            FileReader leitorDeArquivo = new FileReader(arquivoCsv);   // Informa ao sistema operacional que o arquivo está em uso
            BufferedReader leitorDeLinhas = new BufferedReader(leitorDeArquivo);

            leitorDeLinhas.readLine();  // Descartar cabeçalho
            String linha = leitorDeLinhas.readLine();

            // Enquanto o arquivo não tiver acabado
            while (linha != null) {
                // Ler e separar informações da planilha
                String[] fragmentos = linha.split(";");
                int codigo = Integer.parseInt(fragmentos[0]);
                String nome = fragmentos[1];
                Double preco = Double.parseDouble(fragmentos[2]);
                int quantidade = Integer.parseInt(fragmentos[3]);

                // Adicionar produto mo vetor
                produtos.add(new Produto(codigo, nome, preco, quantidade));

                // Ler uma nova linha
                linha = leitorDeLinhas.readLine();
            }

            leitorDeLinhas.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showConfirmDialog(null, "\"produtos.csv\" não encontrado!", "Erro!", 0);
        } catch (IOException ex) {
            JOptionPane.showConfirmDialog(null, "\"produtos.csv\" corrompido!", "Erro!", 0);
        }
    }

    public static void atualizarArquivo() {
        //File 
        arquivoCsv = new File("C:\\Users\\N\\Downloads\\produtos.csv");
        // Selecionador de arquivo
//        if (arquivoCsv == null) {
//            arquivoCsv = new File("");
//            JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
//            jfc.setDialogTitle("Selecione a localização do arquivo \"produtos.csv\": ");
//            jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
//
//            int returnValue = jfc.showSaveDialog(null);
//            if (returnValue == JFileChooser.APPROVE_OPTION) {
//                if (jfc.getSelectedFile().isFile()) {
//                    //System.out.println("You selected the directory: " + jfc.getSelectedFile());
//                    arquivoCsv = jfc.getSelectedFile();
//                }
//            }
//        }

        try {
            FileWriter escritorDeArquivos = new FileWriter(arquivoCsv);
            BufferedWriter escritorDeLinhas = new BufferedWriter(escritorDeArquivos);

            escritorDeLinhas.write("codigo;produto;preco;quantidade\n");
            for (int i = 0; i < produtos.size(); i++) {
                escritorDeLinhas.write(produtos.get(i).toString());
            }

            escritorDeLinhas.flush();
            escritorDeLinhas.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Diretório corrompido!");
        }

    }

    public static Produto getProdutoComCodigo(int codigo) {
        if (produtos == null) {
            carregarArquivo();
        }

        for (Produto prod : produtos) {
            if (prod.getCodigo() == codigo) {
                return prod;
            }
        }
        return null;
    }

    public static Vector<Produto> getProdutoComNome(String nome) {
        if (produtos == null) {
            carregarArquivo();
        }

        if (nome.equals("")) {
            return produtos;
        } else {

            Vector<Produto> temp = new Vector<>();
            for (Produto prod : produtos) {
                if (prod.getNome().toLowerCase().contains(nome.toLowerCase())) {
                    temp.add(prod);
                }
            }
            return temp;
        }
    }
    
    public static void adicionarProduto(Produto prod){
        produtos.add(prod);
        atualizarArquivo();
    }
    
    public static void removerProduto(Produto prod){
        produtos.remove(prod);
        atualizarArquivo();
    }
    
    public static int getMaiorCodigo(){
        Vector<Integer> codigos = new Vector<>();
        for(Produto prod: produtos){
            codigos.add(prod.getCodigo());
        }
        return Collections.max(codigos);
    }
}
