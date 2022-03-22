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
public class ProjetoWar01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Tabuleiro tUnico = new Tabuleiro();
        
        Jogador godofredo = new Jogador("Godofredo das cove",tUnico);
        
        System.out.println(godofredo.descricao());

        Jogador orozimbo = new Jogador("Orozimbo dos Pepinos", tUnico);
        
        System.out.println(orozimbo.descricao());
        
        Jogador nabuco = new Jogador("Nabuco das Rosas ",tUnico);
        
        System.out.println(nabuco.descricao());
        
        
    }
    
}
