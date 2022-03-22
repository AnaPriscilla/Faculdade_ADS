/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetodecoratormacarrao;

/**
 *
 * @author anapriscilla
 */
public class MolhoTradicional extends Adicional {

    private Adicional massa;
    public MolhoTradicional(Adicional massa){
        this.massa = massa;
    }
    public String getDescricao(){
        return massa.getDescricao() + ", molho tradicional (tomates + alho + cebolas e temperos do chefe)";
    }
    public double preco(){
        return 5 + massa.preco();
    }
}
