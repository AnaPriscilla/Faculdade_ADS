package ordenacao;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ProgramaPrincipal {

    public static void main(String[] args) throws IOException {
        
        Scanner ler = new Scanner(System.in);
        
        String[] palavras = null;
        
        Ordenacao ordem = new Ordenacao();
        
        String casoTeste = "****** CASO TESTE ******\n";
        
        System.out.println("------ ESCOLHA O DICIONÁRIO PARA ORDENAR ------\n");
        System.out.println("""
                           Digite 1 para: Português BR
                           Digite 2 para: Francês
                           Digite 3 para: Inglês""");
        
        int opcaoDicionario = ler.nextInt();

        switch (opcaoDicionario) {
            case 1 ->
                palavras = obterDicionarioPortugues();
            case 2 ->
                palavras = obterDicionarioFrances();
            case 3 ->
                palavras = obterDicionarioIngles();
            default ->
                throw new AssertionError();
        }
        
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
                            long tempoinicialBubble = System.currentTimeMillis();
                            
                            ordem.bubbleSort(palavras);
                            
                            long tempofinalBubble = System.currentTimeMillis();
                            long tempototalBubble = tempofinalBubble - tempoinicialBubble;
                            
                            casoTeste += "BubbleSort: " + tempototalBubble + " ms\n";
                            break;
                        case 2:
                            long tempoinicialSelection = System.currentTimeMillis();
                            
                            ordem.selectionSort(palavras);
                            
                            long tempofinalSelection = System.currentTimeMillis();
                            long tempototalSelection = tempofinalSelection - tempoinicialSelection;
                            casoTeste += "SelectionSort: " + tempototalSelection + " ms\n";
                            break;
                        case 3:
                            long tempoinicialInsertion = System.currentTimeMillis();
                            
                            ordem.insertionSort(palavras);
                            
                            long tempofinalInsertion = System.currentTimeMillis();
                            long tempototalInsertion = tempofinalInsertion - tempoinicialInsertion;
                            casoTeste += "InsertionSort: " + tempototalInsertion + " ms\n";
                            break;
                        case 4:
                            long tempoinicialMerge = System.currentTimeMillis();
                            
                            ordem.mergeSort(palavras);
                            
                            long tempofinalMerge = System.currentTimeMillis();
                            long tempototalMerge = tempofinalMerge - tempoinicialMerge;
                            casoTeste += "MergeSort: " + tempototalMerge + " ms\n";
                            break;
                        case 5:
                            long tempoinicialQuick = System.currentTimeMillis();
                            
                            ordem.quickSort(palavras);
                            
                            long tempofinalQuick = System.currentTimeMillis();
                            long tempototalQuick = tempofinalQuick - tempoinicialQuick;
                            casoTeste += "QuickSort: " + tempototalQuick + " ms\n";
                            break;
                        default:
                            throw new AssertionError();
                    }
                    break;
                case 2:
                    long tempoinicialBuscaSeq = System.currentTimeMillis();
                    
                    ordem.BuscaSeq(palavras, palavras[48000]);
                    
                    long tempofinalBuscaSeq = System.currentTimeMillis();
                    long tempototalBuscaSeq = tempofinalBuscaSeq - tempoinicialBuscaSeq;
                    casoTeste += "Busca Sequencial: " + tempototalBuscaSeq + " ms\n";
                    
                    long tempoinicialBuscaBin = System.currentTimeMillis();

                    ordem.BuscaBin(palavras, palavras[48000], 0, palavras.length - 1);
                    
                    long tempofinalBuscaBin = System.currentTimeMillis();
                    long tempototalBuscaBin = tempofinalBuscaBin - tempoinicialBuscaBin;
                    casoTeste += "Busca Binária: " + tempototalBuscaBin + " ms\n";
                    break;
                case 3:
                    System.out.println(casoTeste);
                    System.out.println("------------------");
                    menuAtivo = false;
                    break;
                default:
                    throw new AssertionError();
            }
        } while (menuAtivo);

        /*for(String p : palavras) {
            System.out.println("palavra: " + p);
        }*/
    }
    
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
}
