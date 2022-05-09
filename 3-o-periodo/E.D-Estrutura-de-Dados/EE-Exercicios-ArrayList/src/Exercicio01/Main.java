/*
01 - Crie um objeto chamado Cliente com os atributos: id, nome, idade, telefone. Faça um
    programa para solicitar os dados de vários clientes e armazenar em um ArrayList até que
    se digite um número de ID negativo. Em seguida exiba os dados de todos os clientes via
    SystemOut, formatando cada objeto separado por linhas.
 */
package Exercicio01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author anapriscilla
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("_____________________CADASTRO-DE-CLIENTE_____________________");
        System.out.println("Digites os dados solicitados a seguir:");
        System.out.println("-> ID: número inteiro positivo maior que 0.");
        System.out.println("-> Nome: String");
        System.out.println("-> Idade: Inteiro");
        System.out.println("-> Telefone: String ");
        System.out.println("SAIR: Utilize um número negativo");
        System.out.println("_____________________________________________________________\n");

        ArrayList<Cliente> cadastroCliente = new ArrayList<Cliente>();

        Scanner entrada = new Scanner(System.in);
        int id, idade;
        String nome, telefone;

        while (true) {
            System.out.print("Informe o ID co cliente: ");
            id = entrada.nextInt();
            if (id < 0) {
                break; 
            }
            System.out.print("Informe o Nome do cliente: ");
            nome = entrada.next();

            System.out.print("Informe a idade do cliente: ");
            idade = entrada.nextInt();

            System.out.print("Informe o telefone do cliente: ");
            telefone = entrada.next();

            cadastroCliente.add(new Cliente(id, nome, idade, telefone));
            System.out.println("____________________________________________________________");
            System.out.println("*Deseja finalizar? Digite Nº negativo (ex: -1) no ID\n");
        }

        System.out.println("\n_____________________CLIENTES-CADASTRADOS_____________________\n");
        for (int i = 0; i < cadastroCliente.size(); i++) {
            cadastroCliente.get(i).imprime();
        }
        System.out.println("____________________________________________________________\n");
    }

}
