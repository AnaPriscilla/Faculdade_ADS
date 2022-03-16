package ordenacao;

public class QuickSort {
 

    public static String[] quicksort(String vet[], int ini, int fim) {

        int meio;

        if (ini < fim) {

            meio = partition(vet, ini, fim);

            quicksort(vet, ini, meio);

            quicksort(vet, meio + 1, fim);

        }
        
        return vet;

    }

 

    public static int partition(String vet[], int ini, int fim) {

        int pivo, topo, i;

        pivo = vet[ini].length();

        topo = ini;

 

        for (i = ini + 1; i <= fim; i++) {

            if (vet[i].length() < pivo) {

                vet[topo] = vet[i];

                vet[i] = vet[topo + 1];

                topo++;

            }

        }

        vet[topo] = vet[pivo];

        return topo;

    }
}