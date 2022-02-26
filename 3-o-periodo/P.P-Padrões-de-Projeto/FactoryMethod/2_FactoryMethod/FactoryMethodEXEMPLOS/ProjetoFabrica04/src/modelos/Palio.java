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
public class Palio extends Carro{
    
    //Metodos
    public Palio(String modelo, String marca, String acessorios, float valorVenda) {
        super(modelo, marca, acessorios,valorVenda);
    }

    @Override
    public String descricao() {
        return("Carro do tipo fui enganado agora e tarde");
    }
    
}
