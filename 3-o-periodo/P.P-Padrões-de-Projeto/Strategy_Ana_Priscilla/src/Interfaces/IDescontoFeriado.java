/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Dados.Venda;

/**
 * Interface que define a base para as estratégias
 * @author anapriscilla
 */
public interface IDescontoFeriado {
    
    double calcularDesconto(Venda venda);
    
}
