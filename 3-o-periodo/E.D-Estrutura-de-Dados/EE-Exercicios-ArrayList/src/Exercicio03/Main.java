/*
03 - Implemente em Java um programa para controle da situação dos alunos de Sistemas de
    Informação na disciplina de Estrutura de Dados. Crie uma classe Aluno com os seguintes
    atributos: n° de matrícula, nome, notaBimestre1 e notaBimestre2 (valide as notas, onde
    0.0 ≤ nota ≤ 10) em seguida insira o construtor (que deverá conter estes 4 atributos) e
    métodos Get e Set para eles.
    Em seguida, crie a classe Principal que deverá conter o método Main. A classe Principal
    deverá ler os 4 atributos de pelo menos 3 alunos utilizando o Scanner, e para cada leitura
    completa deverá criar um objeto do tipo Aluno, onde ao final os objetos Aluno criados
    deverão ser armazenados em um Arraylist <Aluno>, que representa uma lista de alunos.
    Por fim, utilize um Interator “for (Aluno a : listaAlunos)” para informar a situação dos
    alunos presentes na listaAlunos, caso a média das notaBimestre1 e notaBimestre2 seja
    maior que 6.0 o programa deverá informar que o aluno está APROVADO, caso contrário
    informe REPROVADO.
    a. A média aritmética das 2 notas lidas; Ex. Fulano obteve média: 8,5
    b. Uma mensagem de acordo com as regras: Até 4 (Reprovado); Entre 4 e 6 (Exame);
    de 6 para cima (Aprovado);
    c. O total de alunos;
    d. Quantidade de alunos Aprovados, Reprovados e de Exame.
    e. A Média da classe.
    f. O nome e a média dos alunos com a maior e menor média respectivamente.
    ➢ As letras ‘a’ e ‘b’ deverão ser mostradas para cada aluno e as letras ‘c’, ‘d’, ‘e’, ‘f’ deverão
    ser mostradas ao se encerrar a coleta de notas dos alunos.
 */
package Exercicio03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author anapriscilla
 */
public class Main {

    public static void main(String args[]) {

        ArrayList<Aluno> lista_alunos = new ArrayList();

        Scanner entrada = new Scanner(System.in);

        Aluno aluno = null;

        int cont = 0, sair = 0;
        String matricula, nome;
        String iniciar;
        int nota_1Bimestre, nota_2Bimestre;
        
        System.out.println("__________CONTROLE-SITUAÇÃO-ALUNO__________");
        System.out.println("Digite uma letra para iniciar");
        

        do {
           iniciar = entrada.nextLine();
            
            System.out.print("Digite a matricula:");
            matricula = entrada.nextLine();

            System.out.print("Digite o nome do aluno:");
            nome = entrada.nextLine();

            System.out.print("Digite a 1ª nota:");
            nota_1Bimestre = entrada.nextInt();
            
            if (nota_1Bimestre < 0 || nota_1Bimestre > 10) {
                while (nota_1Bimestre < 0 || nota_1Bimestre > 10) {

                    System.out.print("Nota não pode ser menor que 0 ou maior que 10 ");

                    System.out.print("Nota do 1º Bimestre:");
                    nota_1Bimestre = entrada.nextInt();
                }
            }

            System.out.print("Digite a nota do 2º Bimestre:");
            nota_2Bimestre = entrada.nextInt();

            if (nota_2Bimestre < 0 || nota_2Bimestre > 10) {
                while (nota_2Bimestre < 0 || nota_2Bimestre > 10) {

                    System.out.println("Nota não pode ser menor que 0 e maior a 10");

                    System.out.println("Digite a nota do 2º Bimestre: ");
                    nota_2Bimestre = entrada.nextInt();

                }

            }
            lista_alunos.add(aluno = new Aluno(matricula, nome, nota_1Bimestre, nota_2Bimestre));
            cont++;

            if (cont == 3) {

                System.out.println("Inserir outro aluno?");
                System.out.println("[1] inserir um novo aluno");
                System.out.println("[2] sair");
                sair = entrada.nextInt();
                switch (sair) {
                    case 1:
                        cont--;
                        break;
                    case 2:
                        System.out.println("fim");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            }

        } while (cont < 3 && sair != 2);

        int alunos_Exame = 0;
        int alunos_Aprovados = 0;
        int alunos_Reprovados = 0;
        double media_Classe = 0;
        String Aluno_Menor_Media = "", Aluno_Maior_Media = "";
        double menor_Media = 0, maior_Media = 0;

        for (Aluno alunos : lista_alunos) {

            System.out.println(" Matricula do Aluno: " + alunos.getMatricula());
            System.out.println(" Aluno: " + alunos.getNome() + " Média: "
                    + ((double) (alunos.getNotaBimestre_1() + alunos.getNotaBimestre_2()) / 2));

            if ((double) (alunos.getNotaBimestre_1() + alunos.getNotaBimestre_2()) / 2 >= 6) {
                System.out.println(" APROVADO ");
                alunos_Aprovados++;
            } else if ((double) (alunos.getNotaBimestre_1() + alunos.getNotaBimestre_2()) / 2 > 4
                    && ((double) alunos.getNotaBimestre_1() + alunos.getNotaBimestre_2()) / 2 < 6) {
                System.out.println(" Em exame!");
                alunos_Exame++;
            } else {
                System.out.println(" REPROVADO ");
                alunos_Reprovados++;

            }

            if (menor_Media == 0) {

                menor_Media = (double) (alunos.getNotaBimestre_1() + alunos.getNotaBimestre_2()) / 2;
            }

            if (maior_Media == 0) {

                menor_Media = (double) (alunos.getNotaBimestre_1() + alunos.getNotaBimestre_2()) / 2;
            }
            if ((double) (alunos.getNotaBimestre_1() + alunos.getNotaBimestre_2()) / 2 < menor_Media) {

                menor_Media = (double) (alunos.getNotaBimestre_1() + alunos.getNotaBimestre_2()) / 2;

                Aluno_Menor_Media = alunos.getNome();
            } else if ((double) (alunos.getNotaBimestre_1() + alunos.getNotaBimestre_2()) / 2 > maior_Media) {

                maior_Media = (double) (alunos.getNotaBimestre_1() + alunos.getNotaBimestre_2()) / 2;
                Aluno_Maior_Media = alunos.getNome();

            }

            media_Classe += (double) (alunos.getNotaBimestre_1() + alunos.getNotaBimestre_2()) / 2;

            System.out.println("\n\n\n");
        }

        System.out.println(" Média da classe: " + media_Classe / lista_alunos.size());
        System.out.println(" Aluno com maior média: " + Aluno_Maior_Media + " Média: " + maior_Media);
        System.out.println(" Aluno com menor média: " + Aluno_Menor_Media + " Média: " + menor_Media);
        System.out.println(" Nº de Alunos APROVADOS: " + alunos_Aprovados);
        System.out.println(" Nº de Alunos REPROVADOS: " + alunos_Reprovados);
        System.out.println(" Nº de Alunos em exame: " + alunos_Exame);
        alunos_Exame = 0;
        alunos_Aprovados = 0;
        alunos_Reprovados = 0;
        media_Classe = 0;
    }
}

