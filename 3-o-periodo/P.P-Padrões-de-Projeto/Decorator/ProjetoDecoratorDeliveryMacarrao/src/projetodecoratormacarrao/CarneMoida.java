/*
 */
package projetodecoratormacarrao;
import projetodecoratormacarrao.Adicional;
/**
 *
 * @author anapriscilla
 */
public class CarneMoida extends Adicional{
    private Massa massa;
    public CarneMoida(Massa massa){
        this.massa = massa;
    }
    public String getDescricao(){
        return massa.getDescricao() + "+ carne moída temperada com celoba caramelizada";
    }
    public double preco(){
        return 15 + massa.preco();
    }
}