/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofabrica01;
import javax.swing.JOptionPane;
import modelos.*;
/**
 *
 * @author ejmcc
 */
public class ProjetoFabrica01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean controle = true;
        Object[] opcoes = { "ONIX", "PALIO", "CAPTIVA"};
        Object tipoDoCarro;
        do{
            tipoDoCarro = JOptionPane.showInputDialog(null,
                                "Deseja finalizar o programa?",
                                "Finalização",
                                JOptionPane.PLAIN_MESSAGE,
                                null,opcoes,"ONIX");
       if(tipoDoCarro.equals("ONIX")){
                Onix obj = new Onix("Onix LT","GM","Direção Hidraulica, Ar condicionado",87567.89F);
                String saida = "Marca: " + obj.getMarca() + "\n";
                saida += "Modelo: " + obj.getModelo() + "\n";
                saida += "Lista de Opcionais: " + obj.getAcessorios()+ "\n";
                saida += "Preco: R$ " + obj.getValorVenda();
                JOptionPane.showMessageDialog(null, saida);
            }
            else if(tipoDoCarro.equals("PALIO")){
                    Palio obj = new Palio("Palio TSI","Fiat","Direção Hidraulica, Ar condicionado, Câmbio Automático",120456.67F);
                    String saida ="Marca: " + obj.getMarca() + "\n"; 
                    saida += "Modelo: " + obj.getModelo() + "\n";
                    saida += "Lista de Opcionais: " + obj.getAcessorios()+ "\n";
                    saida += "Preco: R$ " + obj.getValorVenda();
                    JOptionPane.showMessageDialog(null, saida);
            }
            else if(tipoDoCarro.equals("CAPTIVA")){
                    Captiva obj = new Captiva("Captiva AWD","GM","Direção Hidraulica, Ar condicionado, Câmbio Automático",120456.67F);
                    String saida ="Marca: " + obj.getMarca() + "\n"; 
                    saida += "Modelo: " + obj.getModelo() + "\n";
                    saida += "Lista de Opcionais: " + obj.getAcessorios()+ "\n";
                    saida += "Preco: R$ " + obj.getValorVenda();
                    JOptionPane.showMessageDialog(null, saida);
            }
        }while(controle);
    }
    
}
