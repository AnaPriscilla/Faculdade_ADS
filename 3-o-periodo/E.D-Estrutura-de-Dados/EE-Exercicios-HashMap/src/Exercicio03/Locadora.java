/*
    3. Considere que se pretende modelar uma locadora de CDs e DVDs. Um CD possui os
    seguintes Atributos: Título (String), nomeArtistaOuBanda (String), qntMusicas (int),
    preco (Double) e comentário (String). Já um DVD possui os seguintes Atributos: título
    (String), nomeDiretor (String), anoLancamento (int), comentário (String). Nessa locadora
    terão presentes as informações de novos itens que vão sendo adquiridos ao longo do
    tempo. Desta forma, faça um programa que deverá disponibilizar a classe Locadora que
    se baseia nos seguintes requisitos:

    a. Deve permitir acrescentar um novo CD ou DVD às entradas já existentes;
    b. Deve permitir a busca por um CD ou DVD pelo seu nome;
    c. Deve permitir procurar CDs e DVDs pelo nome do artista ou pelo nome
    do Diretor;
    d. Deve permitir listar (toString) toda a informação presente nos CDs e
    DVDs.

    Portanto, construa as classes CD e DVD e implemente a classe que modela a biblioteca
    utilizando duas HashMap para armazenar os dados de CDs e DVDs respectivamente.
 */
package Exercicio03;

/**
 *
 * @author anapriscilla
 */
import java.util.HashMap;
import java.util.Scanner;

public class Locadora {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        HashMap<String, Cd> mapCd = new HashMap<>();
        HashMap<String, Dvd> mapDvd = new HashMap<>();

        int loop = 1;
        while (loop == 1) {

            int menu = showMenu(entrada);

            switch (menu) {
                case 5:
                    loop = 0;
                    break;
                case 1:
                    System.out.println("""
                                           [1] -> Adicionar CD
                                           [2] -> Adicionar DVD""");
                    int aux = entrada.nextInt();
                    while (aux < 1 || aux > 2) {
                        System.out.println("""
                                              [2] -> Adicionar DVDEntrada inv\u00e1lida! Por favor, Digite [1] ou [2] conforme as op\u00e7\u00f5es: [1] -> Adicionar CD
                                           """);
                        aux = entrada.nextInt();
                    }   if (aux == 1) {
                        Cd novo = criaCd(entrada);
                        mapCd.put(novo.getTitulo(), novo);
                    } else if (aux == 2) {
                        Dvd novo = criaDvd(entrada);
                        mapDvd.put(novo.getTitulo(), novo);
                    }   break;
                case 2:
                    System.out.println("Digite o nome do CD ou DVD para buscar: ");
                    String busca = entrada.next();
                    if (mapCd.containsKey(busca)) {
                        System.out.println(mapCd.get(busca).toString());
                    } else if (mapDvd.containsKey(busca)) {
                        System.out.println(mapDvd.get(busca).toString());
                    } else {
                        System.out.println("Não existe CD ou DVD com esse título");
                    }   break;
                case 3:
                    System.out.println("Digite o nome do artista ou diretor: ");
                    String diretor = entrada.next();
                    int c = 0;
                    for (String key : mapCd.keySet()) {
                        if (mapCd.get(key).getArtista().equals(diretor)) {
                            System.out.println("Dados do CD: " + mapCd.get(key).toString());
                            c++;
                        }
                    }   for (String key : mapDvd.keySet()) {
                        if (mapDvd.get(key).getNomeDiretor().equals(diretor)) {
                            System.out.println("Dados do DVD: " + mapDvd.get(key).toString());
                            c++;
                        }
                    }   if (c == 0) {
                        System.out.println("Não existe registro do artista ou diretor");
                    }   break;
                case 4:
                    System.out.println("""
                                       Dados de todos os CDs: 
                                       """);
                    for (String key : mapCd.keySet()) {
                        System.out.println(mapCd.get(key).toString());
                    }   System.out.println("""
                                           Dados de todos os DVDs: 
                                           """);
                    for (String key : mapDvd.keySet()) {
                        System.out.println(mapDvd.get(key).toString());
                    }   break;
                default:
                    break;
            }

        }

        entrada.close();
    }

    private static int showMenu(Scanner menu) {

        System.out.println("________DIGITE A OPÇÃO | LOCADORA________");
        System.out.println("[1] -> Acrescentar CD ou DVD ao acervo");
        System.out.println("[2] -> Buscar CD ou DVD pelo título");
        System.out.println("[3] -> Buscar CD ou DVD pelo artista ou diretor");
        System.out.println("[4] -> Listar acervo");
        System.out.println("[5] -> Sair");
        System.out.println("""
                           __________________________________________
                           """);
        int entrada = menu.nextInt();

        while (entrada < 1 || entrada > 5) {
            System.out.println("ERRO! Digite conforme as opções apresentadas no menu");
            System.out.println("________DIGITE A OPÇÃO | LOCADORA________");
            System.out.println("[1] -> Acrescentar CD ou DVD ao acervo");
            System.out.println("[2] -> Buscar CD ou DVD pelo título");
            System.out.println("[3] -> Buscar CD ou DVD pelo artista ou diretor");
            System.out.println("[4] -> Listar acervo");
            System.out.println("[5] -> Sair");
            System.out.println("""
                           __________________________________________
                           """);
            entrada = menu.nextInt();

        }
        return entrada;
    }

    private static Cd criaCd(Scanner criaC) {
        System.out.print("Digite o título: ");
        String titulo = criaC.next();

        System.out.print("Digite o artista: ");
        String artista = criaC.next();

        System.out.print("Digite a quantidade de músicas: ");
        int qtdMusicas = criaC.nextInt();

        System.out.print("Digite o preço: ");
        double preco = criaC.nextDouble();

        System.out.print("Digite o comentário: ");
        String comentarios = criaC.nextLine();
        System.out.println();

        Cd novo = new Cd(titulo, artista, qtdMusicas, preco, comentarios);
        return novo;
    }

    public static Dvd criaDvd(Scanner criaD) {
        System.out.print("Digite o nome do titulo: ");
        String titulo = criaD.next();

        System.out.print("Digite o nome do diretor: ");
        String diretor = criaD.next();

        System.out.print("Digite o ano do lançamento: ");
        int ano = criaD.nextInt();

        System.out.print("Digite o comentário: ");
        String comentarios = criaD.next();

        Dvd novo = new Dvd(titulo, diretor, ano, comentarios);
        return novo;
    }

}
