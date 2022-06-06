/*
 */
package Exercicio03;

/**
 *
 * @author anapriscilla
 */
public class Cd {

    private String titulo;
    private String artista;
    private int qtdMusicas;
    private double preco;
    private String comentarios;

    public Cd() {

    }

    public Cd(String titulo, String artista, int qtdMusicas, double preco, String comentarios) {
        super();
        this.titulo = titulo;
        this.artista = artista;
        this.qtdMusicas = qtdMusicas;
        this.preco = preco;
        this.comentarios = comentarios;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getQtdMusicas() {
        return qtdMusicas;
    }

    public void setQtdMusicas(int qtdMusicas) {
        this.qtdMusicas = qtdMusicas;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}

