package test;

public class TestOrdenacao {

    // Ordena um array de strings
    static void selectionSort(String arr[], int n) {  
    // Um ​​por um move o limite do subarray não classificado
    
        for (int i = 0; i < n - 1; i++) {
            
            // Encontra o elemento mínimo no array não ordenado
            int min_index = i;
            String minStr = arr[i];
            for (int j = i + 1; j < n; j++) {
                
            /*compareTo() retornará um valor -value,
            se string1 (arr[j]) for menor que string2 (minStr)*/
            // Se arr[j] for menor que minStr
                if (arr[j].compareTo(minStr) < 0) {
                    // Torna arr[j] como minStr e atualiza min_idx
                    minStr = arr[j];
                    min_index = j;
                }
            }
            
            // Trocando o elemento mínimo
            // encontrado com o primeiro elemento.
            if (min_index != i) {
                String temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String args[]) {
        String arr[] = {"Ola", "Aloo", "Cacete","Bola"};
        int n = arr.length;
        System.out.println("A matriz dada é");

        // Imprimindo o array antes de ordenar
        for (int i = 0; i < n; i++) {
            System.out.println(i + ": " + arr[i]);
        }
        System.out.println();

        selectionSort(arr, n);

        System.out.println("A matriz ordenada é");

        // Imprimindo o array após a ordenação
        for (int i = 0; i < n; i++) {
            System.out.println(i + ": " + arr[i]);
        }
    }
}


