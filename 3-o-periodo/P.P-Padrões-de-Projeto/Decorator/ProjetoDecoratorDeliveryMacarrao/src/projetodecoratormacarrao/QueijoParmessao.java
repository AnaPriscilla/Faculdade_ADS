/*
 */
package projetodecoratormacarrao;
import projetodecoratormacarrao.Adicional;
/**
 *
 * @author anapriscilla
 */
public class QueijoParmessao extends Adicional {

    private Adicional massa;
    public QueijoParmessao(Adicional massa){
        this.massa = massa;
    }
    public String getDescricao(){
        return massa.getDescricao() + ", queijo parmessao (ralado)";
    }
    public double preco(){
        return 2 + massa.preco();
    }
}