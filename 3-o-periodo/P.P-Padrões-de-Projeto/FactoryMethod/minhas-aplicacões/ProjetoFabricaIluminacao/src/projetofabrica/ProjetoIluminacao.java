/*
 */
package projetofabrica;
import iluminacao.Iluminacao;
import javax.swing.JOptionPane;
import fabrica.FabricaIluminacao;
/**
 *
 * @author anapriscilla
 */
public class ProjetoIluminacao {

    private static void imprimirDados(Iluminacao objeto){
        String saida = "Tipo: " + objeto.getTipo() + "\n";
        saida += "Tamanho: " + objeto.getTamanho() + "\n";
        saida += "Preço: R$ " + objeto.getPreco() + "\n";
        saida += "Descrição: " + objeto.descricao();
        JOptionPane.showMessageDialog(null, saida);
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        boolean controle = true;
        Object[] opcoes = { "Arandelas", "Spotlights", "Tables"};
        Object tipoDaIluminacao;
        Iluminacao obj = null;
        do{
            tipoDaIluminacao = JOptionPane.showInputDialog(null,
                                "Escolha a Iluminação:",
                                "Iluminações Disponíveis",
                                JOptionPane.PLAIN_MESSAGE,
                                null,opcoes,"Arandelas");
            obj = FabricaIluminacao.getIluminacao(tipoDaIluminacao.toString());
            imprimirDados(obj);
        }while(controle);
    }
    
}
