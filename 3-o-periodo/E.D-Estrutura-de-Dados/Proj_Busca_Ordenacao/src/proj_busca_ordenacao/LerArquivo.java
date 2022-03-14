/*
1 - Ler arquivo txt.
2 - Ordenar de forma crescente.
 */
package proj_busca_ordenacao;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

/**
 *
 * @author anapriscilla
 */
public class LerArquivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Path caminho = Paths.get("src\\dicionarios\\frutas.txt");
        try {
        byte[] texto = Files.readAllBytes(caminho);
        String leitura = new String(texto);
        
        JOptionPane.showMessageDialog(null, leitura);
        
        } catch(Exception erro){
            
            }
        
    }
    
}
