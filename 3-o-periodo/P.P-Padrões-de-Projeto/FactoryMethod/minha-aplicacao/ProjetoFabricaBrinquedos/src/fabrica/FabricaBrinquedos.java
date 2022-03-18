/*
 */
package fabrica;
import brinquedos.*;
/**
 *
 * @author ejmcc
 */


public class FabricaBrinquedos {
    
    public enum Brinquedos{
        Cartas, Pelucia, QuebraCabeca;
    }
    
    public static Brinquedo getBrinquedo(String tipoDoBrinquedo){
        Brinquedos tipo = Brinquedos.valueOf(tipoDoBrinquedo);
        switch (tipo){
            case Cartas:
                return new Cartas("Jogos", "Uno", "114", "a partir dos 7 anos", 12.68F);
            case Pelucia:
                return new Pelucia("Bonecos", "Coelho", "1", "a partir dos 2 anos", 69.99F);
            case QuebraCabeca:
                return new QuebraCabeca("Educativos", "Disney:Mulan", "100", "a partir dos 5 anos", 40.00F);
            default:
                return null;
        }
    }
}
