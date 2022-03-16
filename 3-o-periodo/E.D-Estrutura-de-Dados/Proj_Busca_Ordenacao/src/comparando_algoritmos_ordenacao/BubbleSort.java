/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparando_algoritmos_ordenacao;

/**
 *
 * @author anapriscilla
 */
public class BubbleSort {
    public static Resultado sort(int[] vetor){
        int trocas = 0;
        //BUBBLE SORT O(N^2)
        int aux;
        for(int i = 0; i < vetor.length; i++){ // O(N)
            for(int j = i + 1; j < vetor.length; j++){ //O(N)
                if (vetor[i] > vetor[j]){
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                    trocas++;
                }
            }
        }
        return new Resultado(vetor, trocas);
    }
}
