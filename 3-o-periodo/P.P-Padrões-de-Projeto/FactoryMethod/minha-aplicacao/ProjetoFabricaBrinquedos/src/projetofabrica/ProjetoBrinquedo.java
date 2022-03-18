/*
 */
package projetofabrica;
import brinquedos.Brinquedo;
import javax.swing.JOptionPane;
import fabrica.FabricaBrinquedos;
/**
 *
 * @author anapriscilla
 */
public class ProjetoBrinquedo {

    /**
     * @param args the command line arguments
     */
    private static void imprimirDados(Brinquedo objeto){
        String saida = "Tipo: " + objeto.getTipo() + "\n";
        saida += "Nome: " + objeto.getNome() + "\n";
        saida += "A caixa contém: " + objeto.getPecas()+ "\n";
        saida += "Indicado: " + objeto.getIdade()+ "\n";
        saida += "Preço sugerido: R$ " + objeto.getPreco() + "\n";
        saida += "Descrição: " + objeto.descricao();
        JOptionPane.showMessageDialog(null, saida);
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        boolean controle = true;
        Object[] opcoes = { "Cartas", "Pelucia", "QuebraCabeca"};
        Object tipoDoBrinquedo;
        Brinquedo obj = null;
        do{
            tipoDoBrinquedo = JOptionPane.showInputDialog(null,
                                "Escolha o Brinquedo:",
                                "Brinquedos",
                                JOptionPane.PLAIN_MESSAGE,
                                null,opcoes,"Quebra-Cabeça");
            obj = FabricaBrinquedos.getBrinquedo(tipoDoBrinquedo.toString());
            imprimirDados(obj);
        }while(controle);
    }
    
}
