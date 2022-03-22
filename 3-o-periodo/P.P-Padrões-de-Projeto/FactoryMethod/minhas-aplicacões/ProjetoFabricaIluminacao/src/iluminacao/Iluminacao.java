/*
 */
package iluminacao;

/**
 *
 * @author anapriscilla
 */
public abstract class Iluminacao {
    //Atributos
    private String tipo;
    private String tamanho;
    private float preco;

    //Metodos
    public abstract String descricao();
    
    public Iluminacao(String tipo, String tamanho, float preco) {
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
}
