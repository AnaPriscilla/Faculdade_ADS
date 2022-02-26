/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author eugeniojulio
 */
public class Tabuleiro {
    private String identificador = "JOGO DE ESTRAGÉGIA EM TABULEIRO - WAR";
    private int quantidadeDeJogadores = 0;
    
    //Atributo Estatico de controle de instancia
    private static Tabuleiro tabulerioUnico = null;
    
    //Construtor Private
    private  Tabuleiro(){
    }
    
    //Metodo estatico para obter a instancia unica da classe
    public static Tabuleiro getInstanciaDoTabuleiro(){
        if(tabulerioUnico == null) tabulerioUnico = new Tabuleiro();
        return tabulerioUnico;
    }
    
    public String getIdentificador(){return identificador;}

    public int getQuantidadeDeJogadores() {
        return quantidadeDeJogadores;
    }

    public void setQuantidadeDeJogadores() {
        this.quantidadeDeJogadores++;
    }
    
}
