/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brinquedos;

/**
 *
 * @author anapriscilla
 */
public class QuebraCabeca extends Brinquedo{
    
    //Metodos
    public QuebraCabeca(String tipo, String nome, String pecas, String idade, float preco) {
        super(tipo, nome, pecas, idade, preco);
    }

    @Override
    public String descricao() {
        return("Brinquedo criativo e educativo!");
    }
    
}
