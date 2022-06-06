/*
 */
package Exercicio04;

/**
 *
 * @author anapriscilla
 */
public class Estado {

    private int cod;
    private String nome;
    private String sigla;

    public Estado() {

    }

    public Estado(int cod, String nome, String sigla) {
        super();
        this.cod = cod;
        this.nome = nome;
        this.sigla = sigla;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

}
