/*
    2. Faça um programa que considere uma Pessoa como um conjunto de atributos, entre eles,
    CPF (String), nome (String), data de nascimento (Date) peso (Double). Crie a classe
    Pessoa com os atributos acima, os métodos get e set, Construtor e toString(); Utilize um
    HashMap para armazenar as pessoas cadastradas. Por fim, crie a classe RH, que permita:

    a. Cadastrar pessoas sem CPF repetidos;
    b. Listar todas as pessoas identificadas pelo CPF;
    c. Listar o nome e CPF da pessoa mais idosa e mais jovem.
    d. Listar média do Peso da das pessoas;
    e. Atualizar os dados de uma Pessoa pesquisando pelo CPF;
    f. Remover os dados de uma Pessoa pesquisando pelo CPF;
 */
package Exercicio02;

/**
 *
 * @author anapriscilla
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Rh {

    public static void main(String[] args) {

        HashMap<String, Pessoa> map = new HashMap<>();
        Scanner entrada = new Scanner(System.in);
        int loop = 1;
        try {

            while (loop == 1) {
                int menu = showMenu(entrada);

                if (menu == 7) {
                    loop = 0;
                } else if (menu == 1) {
                    Pessoa pessoa = criaPessoa(entrada, map);
                    map.put(pessoa.getCpf(), pessoa);
                    System.out.println("\n" + "Pessoa adiciona no HashMap");
                } else if (menu == 2) {
                    System.out.println("Digite o CPF da pessoa para pesquisar o nome: ");
                    String cpf = entrada.next();
                    if (map.isEmpty()) {
                        System.out.println("Nenhuma pessoa foi cadastrada!");
                    } else {
                        if (map.containsKey(cpf)) {
                            Pessoa aux = (Pessoa) map.get(cpf);
                            System.out.println("O nome da pessoa é: " + aux.getNome());
                        } else {
                            System.out.println("Não existe usuario cadastrado com esse CPF");
                        }
                    }
                } else if (menu == 3) {

                    String chaveMaior = "", chaveMenor = "";
                    Date idadeMaior = null, idadeMenor = null;

                    if (map.isEmpty()) {
                        System.out.println("Não existe nenhum cadastro!");
                    } else {

                        for (String key : map.keySet()) {

                            if (idadeMaior == null) {
                                idadeMaior = idadeMenor = map.get(key).getDataNascimento();
                                chaveMaior = chaveMenor = key;

                            } else {

                                if (idadeMaior.after(map.get(key).getDataNascimento())) {
                                    idadeMaior = map.get(key).getDataNascimento();
                                    chaveMaior = key;

                                } else if (idadeMenor.before(map.get(key).getDataNascimento())) {
                                    idadeMenor = map.get(key).getDataNascimento();
                                    chaveMenor = key;
                                }

                            }

                        }

                        System.out.println("Nome da pessoa mais jovem: " + map.get(chaveMenor).getNome() + "\n" + "CPF: "
                                + map.get(chaveMenor).getCpf());

                        System.out.println("Nome da pessoa mais idosa: " + map.get(chaveMaior).getNome() + "\n" + "CPF: "
                                + map.get(chaveMaior).getCpf());

                    }

                } else if (menu == 4) {
                    int c = 0;
                    double media = 0;
                    for (String key : map.keySet()) {
                        c++;
                        media += map.get(key).getPeso();
                    }
                    media = media / c;
                    System.out.println("A média de peso das pessoas cadastradas: " + media + "kg");
                } else if (menu == 5) {
                    System.out.println("Digite o CPF da pessoa que deseja atualizar os dados: ");
                    String input = entrada.next();

                    if (map.containsKey(input)) {
                        System.out.println("Digite o 1º nome da pessoa: ");
                        String nome = entrada.next();

                        System.out.println("Digite a data de nascimento da pessoa no formato dd/mm/yyyy: ");
                        String aux = entrada.next();
                        Date nascimento = new SimpleDateFormat("dd/mm/yyyy").parse(aux);

                        System.out.println("Digite o peso da pessoa:");
                        double peso = entrada.nextDouble();

                        Pessoa pessoa = new Pessoa(nome, input, nascimento, peso);
                        map.replace(input, pessoa);
                        System.out.println("Dados alterados com sucesso!");
                    } else {
                        System.out.println("CPF não consta no cadastro!");
                    }
                } else if (menu == 6) {
                    System.out.print("Digite o CPF do cadastro que deseja remover: ");
                    String input = entrada.next();
                    if (map.containsKey(input)) {
                        map.remove(input);
                        System.out.println("Dados removidos com sucesso!");
                    } else {
                        System.out.println("CPF não consta no cadastro!");
                    }
                }

            }
        } catch (ParseException e) {

            e.printStackTrace();
        }
        entrada.close();
    }

    private static int showMenu(Scanner mostrar) {
        System.out.println("________ESCOLHA UMA OPÇÃO________ " + "\n");
        System.out.println("[1] -> Realizar cadastro de uma pessoa");
        System.out.println("[2] -> Pesquisar por CPF");
        System.out.println("[3] -> Listar nome e CPF da pessoa mais idosa e mais jovem");
        System.out.println("[4] -> Listar media do peso das pessoas que foram cadastradas");
        System.out.println("[5] -> Atualizar os dados de uma Pessoa pesquisando pelo CPF");
        System.out.println("[6] -> Remover os dados de uma Pessoa pesquisando pelo CPF");
        System.out.println("[7] -> Sair");
        System.out.println("_______________________________________" + "\n");
        int entrada = mostrar.nextInt();

        while (entrada > 7 || entrada < 1) {

            System.out.println("Erro! Digite novamente sua escolha" + "\n");
            System.out.println("________ESCOLHA UMA OPÇÃO________ " + "\n");
            System.out.println("[1] -> Realizar cadastro de uma pessoa");
            System.out.println("[2] -> Pesquisar por CPF");
            System.out.println("[3] -> Listar nome e CPF da pessoa mais idosa e mais jovem");
            System.out.println("[4] -> Listar media do peso das pessoas que foram cadastradas");
            System.out.println("[5] -> Atualizar os dados de uma Pessoa pesquisando pelo CPF");
            System.out.println("[6] -> Remover os dados de uma Pessoa pesquisando pelo CPF");
            System.out.println("[7] -> Sair");
            System.out.println("_______________________________________" + "\n");
            entrada = mostrar.nextInt();
        }

        return entrada;
    }

    private static String verificaCpf(Scanner verifica, String cpf, HashMap<String, Pessoa> map) {
        if (!map.isEmpty()) {
            while (map.containsKey(cpf)) {
                System.out.print("Ja existe um usuário com esse CPF. Por favor! Digite outro: ");
                cpf = verifica.next();
            }
        }
        return cpf;
    }

    private static Pessoa criaPessoa(Scanner cria, HashMap<String, Pessoa> map) throws ParseException {
        System.out.print("Digite o 1º nome da pessoa: ");
        String nome = cria.next();

        System.out.print("Digite o CPF da pessoa: ");
        String cpf = cria.next();
        cpf = verificaCpf(cria, cpf, map);

        System.out.print("Digite a data de nascimento da pessoa no formato dd/mm/yyyy: ");
        String aux = cria.next();
        Date nascimento = new SimpleDateFormat("dd/mm/yyyy").parse(aux);

        System.out.print("Digite o peso da pessoa: ");
        double peso = cria.nextDouble();

        Pessoa pessoa = new Pessoa(nome, cpf, nascimento, peso);

        return pessoa;
    }
}
