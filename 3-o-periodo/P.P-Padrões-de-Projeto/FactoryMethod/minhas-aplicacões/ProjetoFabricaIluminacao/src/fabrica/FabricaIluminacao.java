/*
 */
package fabrica;
import iluminacao.Arandelas;
import iluminacao.Spotlights;
import iluminacao.Iluminacao;
import iluminacao.Tables;
/**
 *
 * @author anapriscilla
 */


public class FabricaIluminacao {
    
    public enum Iluminacoes{
        Arandelas, Spotlights, Tables;
    }
    
    public static Iluminacao getIluminacao(String tipoDaIluminacao){
        //Static Factory Method 
        Iluminacoes tipo = Iluminacoes.valueOf(tipoDaIluminacao);
        switch (tipo){
            case Arandelas:
                return new Arandelas("Arandela", "10cm x 10cm", 24.00F);
            case Spotlights:
                return new Spotlights("SpotLights", "12,8cm x 5,9cm e de comprimento 98cm", 269.90F);
            case Tables:
                return new Tables("Tables", "20cm x 40cm e de comprimento 40cm", 40.00F);
            default:
                return null;
        }
    }
}
