/*
 */
package iluminacao;

/**
 *
 * @author anapriscilla
 */
public class Spotlights extends Iluminacao{
    
    //Metodos  
    public Spotlights(String tipo, String tamanho, float preco) {
        super(tipo, tamanho, preco);
    }
    
    @Override
    public String descricao() {
        return("Kit Spot para Trilho LED 9W Luz Amarela Inspire Bivolt");
    }
}
