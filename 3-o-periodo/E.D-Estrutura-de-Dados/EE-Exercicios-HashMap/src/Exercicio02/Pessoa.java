/*
 */
package Exercicio02;

/**
 *
 * @author anapriscilla
 */
 import java.util.Date;

public class Pessoa {

    private String nome;
    private String cpf;
    private Date dataNascimento;
    private double peso;

    public Pessoa() {

    }

    public Pessoa(String nome, String CPF, Date nascimento, double peso) {

        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}

