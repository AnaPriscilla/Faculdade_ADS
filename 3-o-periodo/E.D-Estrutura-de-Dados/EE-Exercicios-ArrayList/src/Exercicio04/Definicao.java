/*
04 - Crie um programa que deverá ler do usuário uma definição da quantidade de números
    que deverão ser adicionados a um ArrayList de inteiros. Após a definição, gere
    aleatoriamente esta quantidade números (limitada entre 1 – 100) e armazene em um
    ArrayList. Por fim, imprima o ArrayList na ordem original e depois ORDENE o
    ArrayList e imprima-o em ordem crescente e decrescente.
 */
package Exercicio04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author anapriscilla
 */
public class Definicao {
     public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
         
        System.out.println("Digite a quantidade de números (1 - 100) que deverá ser criados para ordenação:\n");
        int quantidade = scan.nextInt();
         
        List<Integer> listadenumeros = new ArrayList<>();
 
        Random random = new Random();
        for (int i = 0; i < quantidade; i++) {
            listadenumeros.add(random.nextInt(quantidade));
        }
 
        System.out.println("Ordem Original : " + listadenumeros);
 
        Collections.sort(listadenumeros);
        System.out.println("Ordem Crescente : " + listadenumeros);
 
        Collections.reverse(listadenumeros);
 
        System.out.println("Ordem Decrescente : " + listadenumeros);
 
    }
}
