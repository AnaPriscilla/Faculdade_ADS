/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package projetoadapter_pp;

/**
 *
 * @author eugenio
 */
//Classe Atualmente em uso.
public class Calculando implements Matematica {
    public int potencia(int base, int expoente){
        int valor = 1;
        for(int n = 0; n < expoente; n++) valor = valor * base;
        return valor;
    }
    public int raizQuadrada(int valor){
        int numero = valor;
        int raiz = 0;
        int impar = 1;
        while (numero>=impar){
            numero = numero - impar;
            impar = impar + 2;
            raiz++;
        }
        return raiz;
    }
}
