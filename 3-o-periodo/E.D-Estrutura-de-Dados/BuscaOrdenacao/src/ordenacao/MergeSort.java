package ordenacao;

public class MergeSort {

    /*public static String[] sort(String[] array) {
       
        if (array.length <= 1) { 
            return array;
        }
        int meio = array.length / 2;
        String[] dir = array.length % 2 == 0 ? new String[meio] : new String[meio + 1];
        String[] esq = new String[meio];

        String[] aux = new String[array.length];

        for (int i = 0; i < meio; i++) {
            esq[i] = array[i];
        }

        int auxIndex = 0;
        for (int i = meio; i < array.length; i++) {
            dir[auxIndex] = array[i];
            auxIndex++;
        }

        esq = sort(esq);
        dir = sort(dir);

        aux = mergesort(esq, dir);

        return aux;
    }

    static String[] mergesort(String[] esq, String[] dir) {
        String[] aux = new String[esq.length + dir.length];

        int indexDir = 0, indexEsq = 0, indexAux = 0;

        while (indexEsq < esq.length || indexDir < dir.length) {
            if (indexEsq < esq.length && indexDir < dir.length) {
                if (esq[indexEsq].length() <= dir[indexDir].length()) {
                    aux[indexAux] = esq[indexEsq];
                    indexAux++;
                    indexEsq++;
                } else {
                    aux[indexAux] = dir[indexDir];
                    indexAux++;
                    indexDir++;
                }
            } else if (indexEsq < esq.length) {
                aux[indexAux] = esq[indexEsq];
                indexAux++;
                indexEsq++;
            } else if (indexDir < dir.length) {
                aux[indexAux] = dir[indexDir];
                indexAux++;
                indexDir++;
            }
        }
        return aux;
    }*/
    public static void mergeSort(String[] arr, int len) {
        if (len < 2) {
            return;
        }

        int mid = len / 2;
        String[] left_arr = new String[mid];
        String[] right_arr = new String[len - mid];

        // Dividindo array em dois e copiando em dois arrays separados
        int k = 0;
        for (int i = 0; i < len; ++i) {
            if (i < mid) {
                left_arr[i] = arr[i];
            } else {
                right_arr[k] = arr[i];
                k = k + 1;
            }
        }
        // Chamando recursivamente a funï¿½ï¿½o para dividir ainda mais os subarrays
        mergeSort(left_arr, mid);
        mergeSort(right_arr, len - mid);

        // Chamando o mï¿½todo de mesclagem em cada subdivisï¿½o
        merge(left_arr, right_arr, arr, mid, len - mid);
    }

    static void merge(String[] left_arr, String[] right_arr, String[] arr, int left_size, int right_size) {

        int i = 0, l = 0, r = 0;

        // Os loops while verificam as condiï¿½ï¿½es de mesclagem
        while (l < left_size && r < right_size) {

            if (left_arr[l].length() < right_arr[r].length()) {
                arr[i++] = left_arr[l++];
            } else {
                arr[i++] = right_arr[r++];
            }
        }
        while (l < left_size) {
            arr[i++] = left_arr[l++];
        }
        while (r < right_size) {
            arr[i++] = right_arr[r++];
        }
    }
}
