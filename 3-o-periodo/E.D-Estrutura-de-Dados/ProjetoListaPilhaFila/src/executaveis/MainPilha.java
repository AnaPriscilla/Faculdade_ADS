/*
PILHA: Adiciona no ínicio, por exemplo, se adicionar por ultimo o número aparecerá como primeiro.
 */
package executaveis;

import dados.*;
import java.util.Scanner;


/**
 *
 * @author anapriscilla
 */

public class MainPilha {

    public static void main(String[] args) throws EmptyListException {

        Scanner sc = new Scanner(System.in);

        Pilha p = new Pilha();

        int opcaoSair = 0;
        do {

            System.out.println("---PILHA---\n");
            System.out.println("(1) Inserir novo Elemento\n"
                    + "(2) Remover Elemento\n"
                    + "(3) Buscar Elemento\n"
                    + "(4) Imprimir Elementos\n"
                    + "(0) Sair");

            opcaoSair = sc.nextInt();

            switch (opcaoSair) {
                case 1:
                    System.out.println("Digite um número para adicionar na Pilha:");
                    int numeroParaAdicionar = sc.nextInt();
                    p.insereNoInicio(numeroParaAdicionar);
                    break;
                case 2:
                    System.out.println("Digite um número para remover da Pilha:");
                    int numeroParaRemover = sc.nextInt();
                    p.removerPorElemento(numeroParaRemover);
                    break;
                case 3:
                    System.out.println("Digite um número para pesquisar na Pilha:");
                    int numeroParaPesquisar = sc.nextInt();
                    p.buscarElemento(numeroParaPesquisar);
                    break;
                case 4:
                    System.out.println("\nPilha: " + p);
                    break;
            }

        } while (opcaoSair != 0);

    }
}
