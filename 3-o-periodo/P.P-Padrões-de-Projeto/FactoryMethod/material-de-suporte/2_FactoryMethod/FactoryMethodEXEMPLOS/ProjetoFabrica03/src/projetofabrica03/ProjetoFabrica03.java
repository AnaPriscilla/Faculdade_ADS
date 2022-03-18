/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofabrica03;
import javax.swing.JOptionPane;
import modelos.*;
import fabrica.FabricaCarros;
/**
 *
 * @author ejmcc
 */
public class ProjetoFabrica03 {

    /**
     * @param args the command line arguments
     */
    private static void imprimirDados(Carro objeto){
        String saida = "Marca: " + objeto.getMarca() + "\n";
        saida += "Modelo: " + objeto.getModelo() + "\n";
        saida += "Lista de Opcionais: " + objeto.getAcessorios()+ "\n";
        saida += "Preco: R$ " + objeto.getValorVenda() + "\n";
        saida += "Descrição: " + objeto.descricao();
        JOptionPane.showMessageDialog(null, saida);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        boolean controle = true;
        Object[] opcoes = { "ONIX", "PALIO", "CAPTIVA"};
        Object tipoDoCarro;
        Carro obj = null;
        do{
            tipoDoCarro = JOptionPane.showInputDialog(null,
                                "Deseja finalizar o programa?",
                                "Finalização",
                                JOptionPane.PLAIN_MESSAGE,
                                null,opcoes,"ONIX");
            obj = FabricaCarros.getCarro(tipoDoCarro.toString());
            imprimirDados(obj);
        }while(controle);
    }
    
}
