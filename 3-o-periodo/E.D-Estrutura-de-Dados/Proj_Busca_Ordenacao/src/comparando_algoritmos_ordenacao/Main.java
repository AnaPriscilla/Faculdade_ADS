
package comparando_algoritmos_ordenacao;

import java.io.IOException;


public class Main {
     
    public static void main(String[] args) {
        int[] vetor = new int[800];
        
        for(int i=0; i < vetor.length; i++){
            vetor[i] = (int) Math.floor(Math.random() * vetor.length);
        }
        
        long inicio, fim;
        Resultado resultado;
        
        System.out.println("\n\nSelectionSort");
        inicio = System.currentTimeMillis();
        resultado = SelectionSort.sort(vetor.clone());
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim-inicio) + "ms");
        System.out.println("Trocas: " + resultado.getTrocas());
        
        System.out.println("\n\nBubbleSort");
        inicio = System.currentTimeMillis();
        resultado = BubbleSort.sort(vetor.clone());
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim-inicio) + "ms");
        System.out.println("Trocas: " + resultado.getTrocas());
        
        System.out.println("\n\nInsertionSort");
        inicio = System.currentTimeMillis();
        resultado = InsertionSort.sort(vetor.clone());
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim-inicio) + "ms");
        System.out.println("Trocas: " + resultado.getTrocas());
        
        System.out.println("\n\nQuickSort");
        inicio = System.currentTimeMillis();
        resultado = QuickSort.sort(vetor.clone(), 0, vetor.length);
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim-inicio) + "ms");
        System.out.println("Trocas: " + resultado.getTrocas());
        
    }
}
