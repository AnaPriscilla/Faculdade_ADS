/*
 */
package iluminacao;

/**
 *
 * @author anapriscilla
 */
public class Arandelas extends Iluminacao{
    //Atributos
    
    //Metodos

    public Arandelas(String tipo, String descricao, float preco) {
        super(tipo, descricao, preco);
    }

    @Override
    public String descricao() {
        return ("Arandela 2 Fachos Slim Branca Luminária Externa ou Interna");
    }

    
}
