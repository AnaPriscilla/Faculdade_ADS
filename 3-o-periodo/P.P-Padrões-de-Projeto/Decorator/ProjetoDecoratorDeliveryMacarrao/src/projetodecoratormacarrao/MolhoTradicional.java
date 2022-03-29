/*
 */
package projetodecoratormacarrao;
import projetodecoratormacarrao.Adicional;

/**
 *
 * @author anapriscilla
 */
public class MolhoTradicional extends Adicional {

    private Massa massa;
    public MolhoTradicional(Massa massa){
        this.massa = massa;
    }
    public String getDescricao(){
        return massa.getDescricao() + " + molho tradicional (tomates + alho + cebolas e temperos do chefe)";
    }
    public double preco(){
        return 5 + massa.preco();
    }
}
