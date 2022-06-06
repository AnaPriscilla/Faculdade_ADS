/*
    1. Faça um programa que leia uma frase e informe o número de ocorrências de cada palavra
    da frase. Use o HashMap para fazer essa contagem.
 */
package Exercicio01;

/**
 *
 * @author anapriscilla
 */
import java.util.HashMap;
import java.util.Scanner;

public class OcorrenciasFrase {

    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            HashMap<String, Integer> ocorrencia = new HashMap<>();
            
            System.out.println("Digite uma frase qualquer: ");
            String frase = entrada.nextLine();
            
            String[] palavras = frase.split(" ");
            int cont;
            
            for (String palavra : palavras) {
                if (ocorrencia.containsKey(palavra)) {
                    cont = ocorrencia.get(palavra);
                    cont++;
                    ocorrencia.replace(palavra, cont);
                } else {
                    ocorrencia.put(palavra, 1);
                }
            }
            
            for (String chave : ocorrencia.keySet()) {
                System.out.println(chave + " : " + ocorrencia.get(chave));
            }
        }
    }

}
