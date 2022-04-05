/*
 */
package projetoadapterimagens;

/**
 *
 * @author anapriscilla
 */
public class Adapter extends Surface implements ImagemTarget {

	public String carregarImagem(String nomeDoArquivoDoUsuario) {
		Imagem_CarregarSurface(nomeDoArquivoDoUsuario);
            return null;
	}

	public int desenharImagem(int posicaoX, int posicaoY, int largura, int altura) {
		Imagem_DesenharSurface(largura, altura, posicaoX, posicaoY);
            return 0;
	}
}
