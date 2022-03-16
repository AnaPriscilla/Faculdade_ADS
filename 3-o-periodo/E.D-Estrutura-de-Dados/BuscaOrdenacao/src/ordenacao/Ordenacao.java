package ordenacao;

public class Ordenacao {

    public String[] insertionSort(String[] vetor) {
        long tempoinicial = System.currentTimeMillis();
        for (int i = 0; i < vetor.length; i++) {
            String atual = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j].length() >= atual.length()) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = atual;
        }
        long tempofinal = System.currentTimeMillis();
        long tempototal = tempofinal - tempoinicial;
        System.out.println("Tempo de Processamento de InsertionSort: " + tempototal + " ms");
        return vetor;
    }

    public String[] selectionSort(String[] vetor) {
        long tempoinicial = System.currentTimeMillis();
        for (int i = 0; i < vetor.length; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j].length() < vetor[indiceMinimo].length()) {
                    indiceMinimo = j;
                }
            }

            String tmp = vetor[indiceMinimo];
            vetor[indiceMinimo] = vetor[i];
            vetor[i] = tmp;
        }
        long tempofinal = System.currentTimeMillis();
        long tempototal = tempofinal - tempoinicial;
        System.out.println("Tempo de Processamento de SelectionSort: " + tempototal + " ms");
        return vetor;
    }

    public String[] bubbleSort(String vetor[]) {
        long tempoinicial = System.currentTimeMillis();
        for (int i = vetor.length; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                if (vetor[j - 1].length() > vetor[j].length()) {
                    String aux = vetor[j];
                    vetor[j] = vetor[j - 1];
                    vetor[j - 1] = aux;
                }
            }
        }
        long tempofinal = System.currentTimeMillis();
        long tempototal = tempofinal - tempoinicial;
        System.out.println("Tempo de Processamento de BubbleSort: " + tempototal + " ms");
        return vetor;
    }

    public String[] mergeSort(String[] array) {
        long tempoinicial = System.currentTimeMillis();
        MergeSort.mergeSort(array, array.length);
        long tempofinal = System.currentTimeMillis();
        long tempototal = tempofinal - tempoinicial;
        System.out.println("Tempo de Processamento de MergeSort: " + tempototal + " ms");
        return array;
    }
    
    public String[] quickSort(String[] array) {
        long tempoinicial = System.currentTimeMillis();
        array = QuickSort.quicksort(array, 0, (array.length - 1));
        //QuickSort.quickSort(array, 0);
        long tempofinal = System.currentTimeMillis();
        long tempototal = tempofinal - tempoinicial;
        System.out.println("Tempo de Processamento de QuickSort: " + tempototal + " ms");
        return array;
    }
    
    public String BuscaSeq(String A[], String x) {
        long tempoinicial = System.currentTimeMillis();
        String saida = "Nao encontrado";
        int i;
        for (i = 0; i < A.length; i++) {
            if (x.equals(A[i])) {
                long tempofinal = System.currentTimeMillis();
                long tempototal = tempofinal - tempoinicial;
                System.out.println("Tempo de Processamento de BuscaSeq: " + tempototal + " ms");
                return saida = A[i];
            }
        }
        return saida;
    }
 
    public String BuscaBin(String A[], String x, int inicio, int fim) {
        String saida = "Nao encontrado";
        int meio;
        if (inicio > fim) {
            return saida; // false;
        }
        meio = (inicio + fim) / 2;
        //System.out.println(meio + " " + inicio + " " + fim);
        if (x == A[meio]) {
            return saida = A[meio]; // true;
        } else if (x.compareToIgnoreCase(A[meio]) < 0) {
            return (BuscaBin(A, x, inicio, meio - 1));
        } else {
            return (BuscaBin(A, x, meio + 1, fim));
        }
    }

    public void imprimirVetor(int[] array) {
        for (int counter = 0; counter < (array.length - 1); counter++) {
            System.out.println(array[counter]);
        }
    }
}
