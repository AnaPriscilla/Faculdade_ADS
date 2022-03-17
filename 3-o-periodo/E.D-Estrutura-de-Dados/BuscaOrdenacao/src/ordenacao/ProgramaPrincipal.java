package ordenacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anapriscilla
 */

public class ProgramaPrincipal {

    public static void main(String[] args) throws IOException {
        
        Scanner ler = new Scanner(System.in);
        // Cria o vetor de palavras que vai receber do dicionário
        String[] palavras = null;
        // Instancia a classe ordenacao
        Ordenacao ordem = new Ordenacao();
        
        System.out.println("------ ESCOLHA O DICIONÁRIO PARA ORDENAR ------\n");
        System.out.println("""
                           Digite 1 para: Português BR
                           Digite 2 para: Francês
                           Digite 3 para: Inglês""" + "\n");
        // captura o valor digitado na tela
        int opcaoDicionario = ler.nextInt();
        // Menu que vai definir o Dicionário escolhido
        switch (opcaoDicionario) {
            case 1 ->
                // executa o método e salva o dicionario portugues no vetor de string palavras
                palavras = obterDicionarioPortugues();
            case 2 ->
                // executa o método e salva o dicionario frances no vetor de string palavras
                palavras = obterDicionarioFrances();
            case 3 ->
                // executa o método e salva o dicionario ingles no vetor de string palavras
                palavras = obterDicionarioIngles();
            default ->
                throw new AssertionError();
        }
        // variável para manter o menu em loop até a execucao dos testes
        boolean menuAtivo = true;
        
        do {
            System.out.println("------ MENU ------\n");
            System.out.println("""
                           0 - Retornar escolha idioma
                           1 - Ordenação
                           2 - Busca (Executa sequencial e em seguida a binária)
                           3 - Executar caso teste""");

            int opcaoMenu = ler.nextInt();

            switch (opcaoMenu) {
                case 0:
                    System.out.println("------ ESCOLHA O DICIONÁRIO PARA ORDENAR ------\n");
                    System.out.println("""
                           Digite 1 para: Português BR
                           Digite 2 para: Francês
                           Digite 3 para: Inglês""");

                    int opcaoDicionarioTxt = ler.nextInt();

                    switch (opcaoDicionarioTxt) {
                        case 1 ->
                            palavras = obterDicionarioPortugues();
                        case 2 ->
                            palavras = obterDicionarioFrances();
                        case 3 ->
                            palavras = obterDicionarioIngles();
                        default ->
                            throw new AssertionError();
                    }
                    break;
                case 1:
                    System.out.println("------ ESCOLHA O ALGORITMO DE ORDENAÇÃO ------\n");
                    System.out.println("""
                           Digite 1 para: BubbleSort
                           Digite 2 para: SelectionSort
                           Digite 3 para: InsertionSort
                           Digite 4 para: MergeSort
                           Digite 5 para: QuickSort""");

                    int opcaoAlgoritmo = ler.nextInt();

                    switch (opcaoAlgoritmo) {
                        case 1:
                            // Executa o método bubbleSort da classe Ordenacao passando o vetor como argumento
                            ordem.bubbleSort(palavras);
                            // chama o método para criar o arquivo txt
                            criaSaidaTxtOrdenado(palavras, "BubbleSort");
                            break;
                        case 2:
                            // Executa o método selectionSort da classe Ordenacao passando o vetor como argumento
                            ordem.selectionSort(palavras);
                            // chama o método para criar o arquivo txt
                            criaSaidaTxtOrdenado(palavras, "SelectionSort");
                            break;
                        case 3:
                            // Executa o método insertionSort da classe Ordenacao passando o vetor como argumento
                            ordem.insertionSort(palavras);
                            // chama o método para criar o arquivo txt
                            criaSaidaTxtOrdenado(palavras, "InsertionSort");
                            break;
                        case 4:
                            // Executa o método mergeSort da classe Ordenacao passando o vetor como argumento
                            ordem.mergeSort(palavras);
                            // chama o método para criar o arquivo txt
                            criaSaidaTxtOrdenado(palavras, "MergeSort");
                            break;
                        case 5:
                            // Executa o método quickSort da classe Ordenacao passando o vetor como argumento
                            ordem.quickSort(palavras);
                            // chama o método para criar o arquivo txt
                            criaSaidaTxtOrdenado(palavras, "QuickSort");
                            break;
                        default:
                            throw new AssertionError();
                    }
                    break;
                case 2:
                    // Executa o método BuscaSeq da classe Ordenacao passando o vetor como argumento, 
                    //e o index da palavra a ser pesquisada
                    ordem.BuscaSeq(palavras, palavras[48000]);

                    // Executa o método BuscaBin da classe Ordenacao passando o vetor como argumento, 
                    //e o index da palavra a ser pesquisada
                    //antes de realizar a busca a ordenação + busca
                    ordem.BuscaBin(palavras, palavras[0], 0, palavras.length - 1);

                    break;
                case 3:
                    menuAtivo = false;
                    break;
                default:
                    throw new AssertionError();
            }
        } while (menuAtivo);

        // Imprime a variável casoTeste que contém todos os resultados concatenados
        System.out.println(ordem.getCasoTeste());
        System.out.println("------------------");
    }
    
    /**
     * Método privado para ler o arquivo txt Portugues e salvar os dados no vetor de string
     * @return vetor de string palavras
     */
    private static String[] obterDicionarioPortugues() {
        String[] palavras = new String[307374];
        try {
            FileInputStream arquivo = new FileInputStream("src\\dicionarios\\PortuguesBr.txt");
            InputStreamReader input = new InputStreamReader(arquivo);
            BufferedReader br = new BufferedReader(input);
            
            String linha;
            int index = 0;
            do {
                linha = br.readLine();
                if (linha != null) {
                    palavras[index] = linha;
                    index++;
                }
            } while (index < 307374);

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        return palavras;
    }
    
    /**
     * Método privado para ler o arquivo txt Ingles e salvar os dados no vetor de string
     * @return vetor de string palavras
     */
    private static String[] obterDicionarioIngles() {
        String[] palavras = new String[48447];
        try {
            FileInputStream arquivo = new FileInputStream("src\\dicionarios\\Ingles.txt");
            InputStreamReader input = new InputStreamReader(arquivo);
            BufferedReader br = new BufferedReader(input);
            
            String linha;
            int index = 0;
            do {
                linha = br.readLine();
                if (linha != null) {
                    palavras[index] = linha;
                    index++;
                }
            } while (index < 48447);

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        return palavras;
    }
    
    /**
     * Método privado para ler o arquivo txt Frances e salvar os dados no vetor de string
     * @return vetor de string palavras
     */
    private static String[] obterDicionarioFrances() {
        String[] palavras = new String[73476];
        try {
            FileInputStream arquivo = new FileInputStream("src\\dicionarios\\Frances.txt");
            InputStreamReader input = new InputStreamReader(arquivo);
            BufferedReader br = new BufferedReader(input);
            
            String linha;
            int index = 0;
            do {
                linha = br.readLine();
                if (linha != null) {
                    palavras[index] = linha;
                    index++;
                }
            } while (index < 73476);

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        return palavras;
    }
    
    /**
     * método que cria arquivo txt com vetor de string ordenado
     * @param palavras (vetor de string)
     * @param algoritmoEscolhido (nome do algoritmo que ordenou)
     */
    private static void criaSaidaTxtOrdenado(String[] palavras, String algoritmoEscolhido) {
        // Cria string para setar o nome do arquivo
        String nomeArquivo = "";
        switch (algoritmoEscolhido) {
            case "BubbleSort":
                nomeArquivo = "SaidaBubbleSort.txt";
                break;
            case "InsertionSort":
                nomeArquivo = "SaidaInsertionSort.txt";
                break;
            case "SelectionSort":
                nomeArquivo = "SaidaInsertionSort.txt";
                break;
            case "MergeSort":
                nomeArquivo = "SaidaMergeSort.txt";
                break;
            case "QuickSort":
                nomeArquivo = "SaidaQuickSort.txt";
                break;
            default:
                throw new AssertionError();
        }
        // Cria file informando o diretório e nome do arquivo
        File filename = new File("src\\dicionarios\\"+nomeArquivo);

        try {
            // verifica se existe o file, se nao existe cria, se existe deleta e cria
            if (!filename.exists()) {
                filename.createNewFile();
            } else {
                filename.delete();
                filename.createNewFile();
            }
            // Criando objetos para gravar/escrever no txt
            FileWriter fw = new FileWriter(filename.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            // iterar no vetor de string para escrever as palavras no arquivo
            for (String str : palavras) {
                bw.write("\n");
                bw.write(str);
            }
        } catch (IOException ex) {
            Logger.getLogger(ProgramaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
