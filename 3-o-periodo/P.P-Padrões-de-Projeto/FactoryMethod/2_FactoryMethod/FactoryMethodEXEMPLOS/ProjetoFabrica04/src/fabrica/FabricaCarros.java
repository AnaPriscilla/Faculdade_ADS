/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;
import modelos.*;
/**
 *
 * @author ejmcc
 */


public class FabricaCarros {
    
    public enum Carros{
        CAPTIVA, ONIX, PALIO;
    }
    
    public static Carro getCarro(String tipoDoCarro){
        Carros tipo = Carros.valueOf(tipoDoCarro);
        switch (tipo){
            case CAPTIVA:
                return new Captiva("Captiva AWD","GM","Direção Hidraulica, Ar condicionado, Câmbio Automático",120456.67F);
            case ONIX:
                return new Onix("Onix LT","GM","Direção Hidraulica, Ar condicionado",87567.89F);
            case PALIO:
                return new Palio("Palio TSI","Fiat","Direção Hidraulica, Ar condicionado, Câmbio Automático",120456.67F);
            default:
                return null;
        }
    }
}
