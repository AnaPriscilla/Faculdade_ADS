/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

import Interfaces.IDescontoFeriado;

/**
 * Classe que tem os dados da venda
 * @author anapriscilla
 */
public class Venda {

    private double valorTotal;
    private String feriado;
    protected IDescontoFeriado estrategiaDeCalculo = null;
    
    //Implementação do Singleton com passagem de parâmetros
    private static Venda instanceSingleton;
    
    public static Venda getInstance(double valorTotal, String feriado) {
        if (instanceSingleton == null) {
            instanceSingleton = new Venda(valorTotal, feriado);
        }
        return instanceSingleton;
    }

    // Método construtor
    private Venda(double valorTotal, String feriado) {
        this.valorTotal = valorTotal;
        this.feriado = feriado;

        switch (this.feriado) {
            case "Natal" -> {
                this.estrategiaDeCalculo = new CalcularDescontoNatal();
            }
            case "Dia das mães" -> {
                this.estrategiaDeCalculo = new CalcularDescontoDiaDasMaes();
            }
            case "Páscoa" -> {
                this.estrategiaDeCalculo = new CalcularDescontoPascoa();
            }
            default -> this.valorTotal = valorTotal;
        }

    }
    
    // Método que cálcula o desconto baseado na instancia definida no construtor de acordo com o Feriado informado
    public double calcularDesconto(){
        return this.estrategiaDeCalculo.calcularDesconto(this);
    }

    // GETTERS E SETTERS
    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getFeriado() {
        return feriado;
    }

    public void setFeriado(String feriado) {
        this.feriado = feriado;
    }

}
