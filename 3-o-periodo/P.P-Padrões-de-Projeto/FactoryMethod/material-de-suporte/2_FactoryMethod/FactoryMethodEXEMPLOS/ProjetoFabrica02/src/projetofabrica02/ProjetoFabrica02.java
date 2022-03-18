/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofabrica02;
import javax.swing.JOptionPane;
import modelos.*;
/**
 *
 * @author ejmcc
 */
public class ProjetoFabrica02 {

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
            if(tipoDoCarro.equals("ONIX")){
                obj = new Onix("Onix LT","GM","Direção Hidraulica, Ar condicionado",87567.89F);
            }
            else if(tipoDoCarro.equals("PALIO")){
                    obj = new Palio("Palio TSI","Fiat","Direção Hidraulica, Ar condicionado, Câmbio Automático",120456.67F);
                    
                }
                else if(tipoDoCarro.equals("CAPTIVA")){
                        obj = new Captiva("Captiva AWD","GM","Direção Hidraulica, Ar condicionado, Câmbio Automático",120456.67F);
                }
            imprimirDados(obj);
        }while(controle);
    }
    
}
