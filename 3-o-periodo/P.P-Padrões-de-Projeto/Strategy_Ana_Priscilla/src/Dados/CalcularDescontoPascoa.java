/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

import Interfaces.IDescontoFeriado;

/**
 * Classe de estratégia
 * @author anapriscilla
 */
public class CalcularDescontoPascoa implements IDescontoFeriado {

    // Método que aplica a regra/estratégia de desconto no Pascoa
    @Override
    public double calcularDesconto(Venda venda) {
        double desconto = 7;
        double valorComDesconto = venda.getValorTotal() - ((venda.getValorTotal() / 100) * desconto);
        return valorComDesconto;
    }
    
}
