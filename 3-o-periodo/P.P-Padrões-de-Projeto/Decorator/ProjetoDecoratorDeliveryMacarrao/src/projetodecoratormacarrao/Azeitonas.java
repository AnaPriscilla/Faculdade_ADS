/*
 */
package projetodecoratormacarrao;
import projetodecoratormacarrao.Adicional;
/**
 *
 * @author anapriscilla
 */
public class Azeitonas extends Adicional{
    private Massa massa;
    public Azeitonas(Massa massa){
        this.massa = massa;
    }
    public String getDescricao(){
        return massa.getDescricao() + "+ azeitonas (verdes)";
    }
    public double preco(){
        return 2 + massa.preco();
    }
}