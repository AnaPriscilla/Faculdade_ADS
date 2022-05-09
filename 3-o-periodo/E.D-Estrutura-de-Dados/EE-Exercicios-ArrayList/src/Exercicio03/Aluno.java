/*
 */
package Exercicio03;

/**
 *
 * @author anapriscilla
 */
public class Aluno {
   //matrícula, nome, notaBimestre1 e notaBimestre2

    private String matricula;
    private String nome;
    private int notaBimestre_1, notaBimestre_2;

    public Aluno() {

    }

    public Aluno(String matricula, String nome, int notaBimestre_1, int notaBimestre_2) {

        this.matricula = matricula;
        this.nome = nome;
        this.notaBimestre_1 = notaBimestre_1;
        this.notaBimestre_2 = notaBimestre_2;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNotaBimestre_1() {
        return notaBimestre_1;
    }

    public void setNotaBimestre_1(int notaBimestre_1) {
        this.notaBimestre_1 = notaBimestre_1;
    }

    public int getNotaBimestre_2() {
        return notaBimestre_2;
    }

    public void setNotaBimestre_2(int notaBimestre_2) {
        this.notaBimestre_2 = notaBimestre_2;
    }

}
