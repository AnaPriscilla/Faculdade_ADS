/*
 */
package brinquedos;

/**
 *
 * @author anapriscilla
 */
public abstract class Brinquedo {
    //Atributos
    private String tipo;
    private String nome;
    private String pecas;
    private String idade;
    private float preco;

//Metodos
    public abstract String descricao();
    
    public Brinquedo(String tipo, String nome, String pecas, String idade, float preco) {
        this.tipo = tipo;
        this.nome = nome;
        this.pecas = pecas;
        this.idade = idade;
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPecas() {
        return pecas;
    }

    public void setPecas(String pecas) {
        this.pecas = pecas;
    }
    
     public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }


    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
}
