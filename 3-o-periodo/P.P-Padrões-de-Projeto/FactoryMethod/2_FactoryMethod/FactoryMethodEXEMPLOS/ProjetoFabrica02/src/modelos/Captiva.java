/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author ejmcc
 */
public class Captiva extends Carro{
    
    //Metodos  
    public Captiva(String modelo, String marca, String acessorios, float valorVenda) {
        super(modelo, marca, acessorios, valorVenda);
    }

    @Override
    public String descricao() {
        String saida = "Veiculo do tipo SUV Captiva \n";
        saida += "\n";
        return(saida);
    }
}
