/*
 */
package projetodecoratormacarrao;

/**
 *
 * @author anapriscilla
 */
public abstract  class Massa {
    String descricao = "Massa";

	public String getDescricao() {
		return descricao;
	}
        
	public abstract double preco();
}

