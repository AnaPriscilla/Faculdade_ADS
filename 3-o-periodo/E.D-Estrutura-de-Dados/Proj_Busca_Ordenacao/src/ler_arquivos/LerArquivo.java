/*
1 - Ler arquivo txt.
2 - Ordenar de forma crescente.
 */
package ler_arquivos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

//Contar caractere
import java.util.ArrayList;


/*
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;
*/
/**
 *
 * @author anapriscilla
 */
public class LerArquivo {

    /**
     * @param args the command line arguments
     */
    
    /*public static void main(String[] args) {
        // TODO code application logic here
        Path caminho = Paths.get("src\\dicionarios\\frutas.txt");
        try {
            byte[] texto = Files.readAllBytes(caminho);
            String leitura = new String(texto);

            JOptionPane.showMessageDialog(null, leitura);
        
        } catch(Exception erro){
            
            }
        }*/
    
    
    //Modificando o arquivo txt. criando o padrão finalizando com ;
    public static void main(String[] args) throws FileNotFoundException {
        try {
        FileInputStream arquivo = new FileInputStream("src\\dicionarios\\Portuguese.txt");
        InputStreamReader input = new InputStreamReader(arquivo);
        BufferedReader br = new BufferedReader(input);
        
        String linha;
        
        do{
            linha = br.readLine();
            if (linha != null){
                String[] palavras = linha.split(";");
                
                for (int i=0; i<palavras.length; i++){
                    System.out.println(palavras[i]+";");
                }
                }
            }while (linha != null);
        }
        
        catch(Exception e) {
            System.out.println("Erro ao ler o arquivo");
        }
      }
    
    
    /*
    
    //CONTANDO CARACTERES EM UMA STRING
    private ArrayList <Character> caracteres;
    private ArrayList <Integer> quantidades;
    
    LerArquivo(){
        contar("Priscilla");
        printResult();
        
    }
    
    public static void main(String[] args) {
        new LerArquivo();
    }
    
    private void printResult(){
        System.out.println("---------------------------------");
        
        for(Character i: caracteres) {
            System.out.println(i + " - " + quantidades.get(caracteres.indexOf(i)));
        }
    }

    private void contar(String texto) {
        caracteres = new ArrayList();
        quantidades = new ArrayList();
        
        for (Character i: texto.toCharArray()){
            i = Character.toUpperCase(i);
            
            if(!caracteres.contains(i)){
                caracteres.add(i);
                quantidades.add(1);
            }else {
                int indice = caracteres.indexOf(i);
                quantidades.set(indice, quantidades.get(indice) +1);
            }
        }
    }

   */
    
}