/*
 */
package brinquedos;

/**
 *
 * @author anapriscilla
 */
public class Cartas extends Brinquedo{
    
    //Metodos  
    public Cartas(String tipo, String nome, String pecas, String idade, float preco) {
        super(tipo, nome, pecas, idade, preco);
    }
    
    @Override
    public String descricao() {
        return("Brinquedo coletivo a partir de 3 pessoas");
    }
}
