/*
FILA: Quando o número é inserido fica em fila - ou seja - se for inserido 
por ultimo ele vai estar como ultimo elemento inserido.
 */
package executaveis;

import dados.*;
import java.util.Scanner;

/**
 *
 * @author anapriscilla
 */
public class MainFila {

    public static void main(String[] args) throws EmptyListException {

        Scanner sc = new Scanner(System.in);

        Fila fila = new Fila();

        int opcaoSair = 0;
        do {

            System.out.println("---FILA---\n");
            System.out.println("(1) Inserir novo Elemento\n"
                    + "(2) Remover Elemento\n"
                    + "(3) Buscar Elemento\n"
                    + "(4) Imprimir Elementos\n"
                    + "(0) Sair\n");

            opcaoSair = sc.nextInt();

            switch (opcaoSair) {
                case 1:
                    System.out.println("Digite um número para adicionar na Fila:");
                    int numeroParaAdicionar = sc.nextInt();
                    fila.insereNoFim(numeroParaAdicionar);
                    break;
                case 2:
                    System.out.println("Digite um número para remover da Fila:");
                    int numeroParaRemover = sc.nextInt();
                    fila.removerPorElemento(numeroParaRemover);
                    break;
                case 3:
                    System.out.println("Digite um número para pesquisar na Fila:");
                    int numeroParaPesquisar = sc.nextInt();
                    //Assim fica mais fácil para usar com telas, pois armazena na variável.
                    boolean saidafila = fila.buscarElemento(numeroParaPesquisar);
                    System.out.println(saidafila);
                    
                    //Para imprimir no console, pois não precisa armazenar na variável.
                    /*System.out.println(fila.buscarElemento(numeroParaPesquisar));*/
                    break;
                case 4:
                    System.out.println("\nFila: " + fila);
                    break;
            }

        } while (opcaoSair != 0);

    }
}
