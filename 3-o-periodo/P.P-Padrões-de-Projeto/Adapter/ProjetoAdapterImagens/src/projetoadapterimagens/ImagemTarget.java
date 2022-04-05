/*
 */
package projetoadapterimagens;

/**
 *
 * @author anapriscilla
 */
public interface ImagemTarget {
	public String carregarImagem(String nomeDoArquivoDoUsuario);
	public int desenharImagem(int posicaoX, int posicaoY, int largura, int altura);
}
