/*
02 - Criar um ArrayList de String chamado telefones. Criar um menu onde o usuário pode
    escolher entre adicionar telefone, remover telefone, listar telefones e Sair. No listar mostre
    a posição do telefone no array, isto facilitará para remover o telefone passando a posição.
    Informe ao usuário caso ele digite opções inválidas.
    Exemplo:
    Escolha uma opção:
    (a) adicionar telefone,
    (r) remover telefone
    (l) listar telefones
    (s) Sair.
 */
package Exercicio02;

import java.util.Scanner;

/**
 *
 * @author anapriscilla
 */
public class Main {

    public static void main(String[] args) {

        menuImprimir();
        boolean sair = false;
        while (!sair) {
            System.out.println("Escolha: ");
            String escolha = scanner.next();
            scanner.nextLine();

            switch (escolha) {
                case "a":
                    adicionarContato();
                    break;
                case "r":
                    removerContato();
                    break;
                case "l":
                    listaDeContatos();
                    break;
                case "n":
                    atualizarContatos();
                    break;
                case "p":
                    procurarContato();
                    break;
                case "s":
                    sair = true;
                    sair();
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    menuImprimir();
            }
        }
    }

    private static Scanner scanner = new Scanner(System.in);
    private static Telefones numeroTelefone = new Telefones();

    private static void menuImprimir() {
        System.out.println("__________MENU__________");
        System.out.println("a - Adicionar contato: ");
        System.out.println("r - Remover contato: ");
        System.out.println("l - Lista de contatos: ");
        System.out.println("n - Atualizar contato: ");
        System.out.println("p - Procurar: ");
        System.out.println("s - Sair");
    }

    private static void listaDeContatos() {
        numeroTelefone.imprimindoListaDeContatos();
    }

    private static void adicionarContato() {
        System.out.println("Digite o nome do contato: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o número do contato: ");
        String numero = scanner.next();
        scanner.nextLine();

        numeroTelefone.adicionarContatos(new Contatos(nome, numero));
    }

    private static void atualizarContatos() {
        System.out.println("Digite o contato que deseja atualizar: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o novo nome do contato: ");
        String novoNome = scanner.nextLine();
        System.out.println("Digite o novo número de contato: ");
        String novoNumero = scanner.next();
        scanner.nextLine();

        Contatos novoContato = new Contatos(novoNome, novoNumero);

        numeroTelefone.atualizarContatos(nome, novoContato);
    }

    private static void removerContato() {
        System.out.println("Digite o contato(index) que deseja remover: ");
        int position = scanner.nextInt();

        numeroTelefone.removerContato(position);
    }

    private static void procurarContato() {
        System.out.println("Digite o nome do contato: ");
        String nome = scanner.nextLine();

        int posicaoDoContato = numeroTelefone.procurarContato(nome);
        if (posicaoDoContato < 0) {
            System.out.println("Contato não encontrado");
        }
        System.out.println(nome + ": " + numeroTelefone.getContatos().get(posicaoDoContato).getNumero());
    }

    private static void sair() {
        System.out.println("__________fim__________");
    }
}
