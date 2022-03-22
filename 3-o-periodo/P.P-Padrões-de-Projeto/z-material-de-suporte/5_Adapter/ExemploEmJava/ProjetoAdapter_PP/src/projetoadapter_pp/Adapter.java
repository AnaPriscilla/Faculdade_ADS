/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package projetoadapter_pp;

/**
 *
 * @author eugenio
 */
//Classe adaptadora da interface matemática com classe Math do Java.
public class Adapter implements Matematica{
    public int potencia(int base, int expoente){
        int valor = (int)(Math.pow(base, expoente));
        return valor;
    }
    public int raizQuadrada(int valor){
        return (int)(Math.sqrt(valor));
    }
}
