/*
LISTA: Pode-se escolher onde vai inserir no início, fim por posição do índice.
 */
package executaveis;

import dados.*;
import java.util.Scanner;

/**
 *
 * @author anapriscilla
 */
public class MainLista {

    public static void main(String[] args) throws EmptyListException {
        
       Scanner sc = new Scanner(System.in);

        Lista l = new Lista();

        int opcaoSair = 0;
        do {

            System.out.println("---LISTA---\n");
            System.out.println("(1) Inserir novo Elemento\n"
                    + "(2) Remover Elemento\n"
                    + "(3) Buscar Elemento\n"
                    + "(4) Imprimir Elementos\n"
                    + "(0) Sair");

            opcaoSair = sc.nextInt();

            switch (opcaoSair) {
                case 1:
                    int opcaoInsercao = 1;
                    System.out.println("(1) Inserir no Início\n"
                                      +"(2) Inserir no Fim\n"
                                      +"(3) Inserir por Posição");
                    opcaoInsercao = sc.nextInt();
                    switch (opcaoInsercao) {
                        case 1:
                            System.out.println("Digite um número para inserir na Lista:");
                            int numeroParaAdicionarNoInicio = sc.nextInt();
                            l.insereNoInicio(numeroParaAdicionarNoInicio);
                            break;
                        case 2:
                            System.out.println("Digite um número para inserir na Lista:");
                            int numeroParaAdicionarNoFim = sc.nextInt();
                            l.insereNoFim(numeroParaAdicionarNoFim);
                            break;
                        case 3:
                            int posicaoLista = 0;
                            System.out.println("Digite a posição da lista para adicionar o novo número:");
                            posicaoLista = sc.nextInt();
                                    
                            System.out.println("Digite um número para inserir na Lista:");
                            int numeroParaAdicionarPorPosicao = sc.nextInt();
                            l.inserirNaPosicao(posicaoLista, numeroParaAdicionarPorPosicao);
                            break;
                    }
                    break;
                case 2:
                    int opcaoRemocao = 1;
                    System.out.println("(1) Remover no Início\n"
                                      +"(2) Remover no Fim\n"
                                      +"(3) Remover por Valor\n"
                                      +"(4) Remover por Posição");
                    opcaoRemocao = sc.nextInt();
                    switch (opcaoRemocao) {
                        case 1:
                            l.removeNoInicio();
                            break;
                        case 2:
                            l.removeNoFim();
                            break;
                        case 3:
                            System.out.println("Digite o valor que deseja remover:");
                            int valorParaRemover = sc.nextInt();
                            
                            l.removerPorElemento(valorParaRemover);
                            break;
                        case 4:
                            System.out.println("Digite a posição que deseja remover:");
                            int posicaoParaRemover = sc.nextInt();
                            
                            l.removerPosicao(posicaoParaRemover);
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Digite um número para pesquisar na Lista:");
                    int numeroParaPesquisar = sc.nextInt();
                    l.buscarElemento(numeroParaPesquisar);
                    break;
                case 4:
                    System.out.println("\nLista: " + l);
                    break;
            }

        } while (opcaoSair != 0);
    }

}
