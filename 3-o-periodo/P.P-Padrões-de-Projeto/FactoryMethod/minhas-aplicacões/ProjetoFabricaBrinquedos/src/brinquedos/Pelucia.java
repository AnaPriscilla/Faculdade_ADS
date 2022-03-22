/*
 */
package brinquedos;

/**
 *
 * @author anapriscilla
 */
public class Pelucia extends Brinquedo{
    //Atributos
    
    //Metodos

    public Pelucia(String tipo, String nome, String pecas, String idade, float preco) {
        super(tipo, nome, pecas, idade, preco);
    }

    @Override
    public String descricao() {
        return ("Brinquedo com textura fofa");
    }

    
}
