/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package projetoadapter_pp;

/**
 *
 * @author eugenio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Utilizando a classe que foi inicialmente criada;
        //Matematica calcular = new Calculando();
        
        // Utilizando a classe adapter - classe adaptada
        Matematica calcular = new Adapter();
        
        int raiz = calcular.raizQuadrada(16);
        int potencia = calcular.potencia(3, 2);
        System.out.println("Raiz Quadrada de 16 = " + raiz);
        System.out.println("Potencia de 3 elevado 2 = " + potencia);





    }

}
