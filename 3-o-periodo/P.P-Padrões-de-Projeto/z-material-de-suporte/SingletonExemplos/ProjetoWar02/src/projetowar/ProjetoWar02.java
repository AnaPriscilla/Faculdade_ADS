/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetowar;
import classes.*;
/**
 *
 * @author eugeniojulio
 */
public class ProjetoWar02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Jogador godofredo = new Jogador("Godofredo das Cove",Tabuleiro.getInstanciaDoTabuleiro());
        
        System.out.println(godofredo.descricao());

        Jogador orozimbo = new Jogador("Orozimbo dos Pepinos", Tabuleiro.getInstanciaDoTabuleiro());
        
        System.out.println(orozimbo.descricao());
        
        Jogador nabuco = new Jogador("Nabuco das Rosas ",Tabuleiro.getInstanciaDoTabuleiro());
        
        System.out.println(nabuco.descricao());
        
        
    }
    
}
