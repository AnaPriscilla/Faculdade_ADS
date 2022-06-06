/*
 */
package Exercicio04;

/**
 *
 * @author anapriscilla
 */
public class Cidade {

    private int cod;
    private int uf;
    private String nome;

    public Cidade() {

    }

    public Cidade(int cod, int uf, String nome) {
        super();
        this.cod = cod;
        this.uf = uf;
        this.nome = nome;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getUf() {
        return uf;
    }

    public void setUf(int uf) {
        this.uf = uf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
