package ordenacao;

/**
 *
 * @author anapriscilla
 */

public class QuickSort {
 
    public static String[] quicksort(String vetor[], int inicio, int fim) {

        int meio;

        if (inicio < fim) {

            meio = partition(vetor, inicio, fim);

            quicksort(vetor, inicio, meio);

            quicksort(vetor, meio + 1, fim);

        }
        
        return vetor;
    }

    public static int partition(String vetor[], int inicio, int fim) {

        int pivo, topo, i;

        pivo = vetor[inicio].length();

        topo = inicio;

        for (i = inicio + 1; i <= fim; i++) {

            if (vetor[i].length() < pivo) {

                vetor[topo] = vetor[i];

                vetor[i] = vetor[topo + 1];

                topo++;

            }
        }

        vetor[topo] = vetor[inicio];

        return topo;
    }  
    
}