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
        public static Carro getCarro(String tipoDoCarro){
        Carro obj = null;
        if(tipoDoCarro.equalsIgnoreCase("CAPTIVA")){
            obj = new Captiva("Captiva AWD","GM","Direção Hidraulica, Ar condicionado, Câmbio Automático",120456.67F);
        }
        else if(tipoDoCarro.equalsIgnoreCase("ONIX")){
            obj = new Onix("Onix LT","GM","Direção Hidraulica, Ar condicionado",87567.89F);
        }
        else if(tipoDoCarro.equalsIgnoreCase("PALIO")){
            obj = new Palio("Palio TSI","Fiat","Direção Hidraulica, Ar condicionado, Câmbio Automático",120456.67F);
        }
        
        return obj;
    }
}
