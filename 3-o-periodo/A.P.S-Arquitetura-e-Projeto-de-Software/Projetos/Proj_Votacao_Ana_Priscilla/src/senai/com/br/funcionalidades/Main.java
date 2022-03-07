/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package senai.com.br.funcionalidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author anapriscilla
 */
public class Main {

    public static void main(String[] args) {
        // Abrindo o scanner para ler os dados do usuário
        Scanner s = new Scanner(System.in);

        System.out.println("BORA COMEÇAR A VOTAÇÃO!!!\n\n");

        System.out.println("\n\nInforme o primeiro candidato: ");
        String nomeCandidato = s.nextLine();
        // Criando a primeira instancia de candidato com o nome digitado pelo usuario
        registro_candidato_Ana_Priscilla candidato1 = new registro_candidato_Ana_Priscilla(nomeCandidato);

        System.out.println("\n\nInforme o segundo candidato: ");
        String nomeCandidato2 = s.nextLine();
        // Criando a primeira instancia de candidato com o nome digitado pelo usuario
        registro_candidato_Ana_Priscilla candidato2 = new registro_candidato_Ana_Priscilla(nomeCandidato2);

        System.out.println("\n\nInforme o terceiro candidato: ");
        String nomeCandidato3 = s.nextLine();
        // Criando a primeira instancia de candidato com o nome digitado pelo usuario
        registro_candidato_Ana_Priscilla candidato3 = new registro_candidato_Ana_Priscilla(nomeCandidato3);
        
        // Criando lista de votações
        List<votacao_Ana_Priscilla> votacoes = new ArrayList<>();

        int opcaoMenu;
        // FAZENDO O MENU DE VOTAÇÃO
        do {
            System.out.print("##------------MENU-----------##\n\n");
            System.out.print("| Opção 1 - Votar            |\n");
            System.out.print("| Opção 2 - Sair             |\n");

            opcaoMenu = s.nextInt();

            switch (opcaoMenu) {
                case 1 -> {
                    Scanner scan = new Scanner(System.in);
                    System.out.print("\n\nDigite o nome do eleitor: ");
                    String nomeEleitor = scan.nextLine();

                    System.out.print("\nDigite 1 para votar no " + candidato1
                            + "\nDigite 2 para votar no " + candidato2
                            + "\nDigite 3 para votar no " + candidato3);

                    int numeroDigitado = s.nextInt();

                    switch (numeroDigitado) {
                        case 1 -> {
                            votacao_Ana_Priscilla votacao = new votacao_Ana_Priscilla(nomeEleitor, candidato1);
                            votacoes.add(votacao);
                        }
                        case 2 -> {
                            votacao_Ana_Priscilla votacao = new votacao_Ana_Priscilla(nomeEleitor, candidato2);
                            votacoes.add(votacao);
                        }
                        case 3 -> {
                            votacao_Ana_Priscilla votacao = new votacao_Ana_Priscilla(nomeEleitor, candidato3);
                            votacoes.add(votacao);
                        }
                        default ->
                            System.out.println("\nO valor digitado é inválido!");
                    }
                }
            }
        } while (opcaoMenu == 1);
        
        // Pegando o total de votos pelo tamanho da lista de votações
        double totalVotos = votacoes.size();
        double totalVotosCandidato1 = 0;
        double totalVotosCandidato2 = 0;
        double totalVotosCandidato3 = 0;
        // Iterando sobre as votações para contar os votos de cada candidato
        for (votacao_Ana_Priscilla voto : votacoes) {
            if (voto.getCandidato() == candidato1) {
                totalVotosCandidato1++;
            }
            if (voto.getCandidato() == candidato2) {
                totalVotosCandidato2++;
            }
            if (voto.getCandidato() == candidato3) {
                totalVotosCandidato3++;
            }
        }
        resultado_Ana_Priscilla resultado = new resultado_Ana_Priscilla(candidato1, totalVotosCandidato1);
        double percentualCandidato1 = ((totalVotosCandidato1 / totalVotos) * 100);
        resultado.setPercentualVotos(percentualCandidato1);
        
        resultado_Ana_Priscilla resultado2 = new resultado_Ana_Priscilla(candidato2, totalVotosCandidato2);
        double percentualCandidato2 = ((totalVotosCandidato2 / totalVotos) * 100);
        resultado2.setPercentualVotos(percentualCandidato2);
        
        resultado_Ana_Priscilla resultado3 = new resultado_Ana_Priscilla(candidato3, totalVotosCandidato3);
        double percentualCandidato3 = ((totalVotosCandidato3 / totalVotos) * 100);
        resultado3.setPercentualVotos(percentualCandidato3);
        
        if (totalVotosCandidato1 > totalVotosCandidato2 && totalVotosCandidato1 > totalVotosCandidato3) {
            System.out.println(resultado);
        }
        if (totalVotosCandidato2 > totalVotosCandidato1 && totalVotosCandidato2 > totalVotosCandidato3) {
            System.out.println(resultado2);
        }
        if (totalVotosCandidato3 > totalVotosCandidato1 && totalVotosCandidato3 > totalVotosCandidato2) {
            System.out.println(resultado3);
        }
    }

}
