package ordenacao;

/**
 *
 * @author anapriscilla
 */

public class MergeSort {
    
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
        // Chamando recursivamente a função para dividir ainda mais os subarrays
        mergeSort(left_arr, mid);
        mergeSort(right_arr, len - mid);

        // Chamando o m todo de mesclagem em cada subdivisisão
        merge(left_arr, right_arr, arr, mid, len - mid);
    }

    static void merge(String[] left_arr, String[] right_arr, String[] arr, int left_size, int right_size) {

        int i = 0, l = 0, r = 0;

        // Os loops while verificam as condições de mesclagem
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
