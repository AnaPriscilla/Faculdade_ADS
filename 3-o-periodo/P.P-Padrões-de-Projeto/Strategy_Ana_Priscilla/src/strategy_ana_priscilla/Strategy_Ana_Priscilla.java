/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strategy_ana_priscilla;

import Dados.Venda;

/**
 *
 * @author anapriscilla
 */
public class Strategy_Ana_Priscilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Criando as vendas usando Singleton
        Venda v1 = Venda.getInstance(350, "Páscoa");
        Venda v2 = Venda.getInstance(460, "Natal");
        Venda v3 = Venda.getInstance(590, "Dia das mães");
        
        // Imprimindo o total das vendas de cada feriado implementando o Strategies
        System.out.println("A venda com desconto da Páscoa ficou em: " + v1.calcularDesconto());
        System.out.println("A venda com desconto da Natal ficou em: " + v2.calcularDesconto());
        System.out.println("A venda com desconto da Dia das mães ficou em: " + v3.calcularDesconto());
    }
    
}
