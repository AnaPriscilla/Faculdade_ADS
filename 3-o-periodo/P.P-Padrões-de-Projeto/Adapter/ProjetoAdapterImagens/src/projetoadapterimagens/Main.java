/*
 */
package projetoadapterimagens;

/**
 *
 * @author anapriscilla
 */
public class Main {
	public static void main(String[] args) {
            
            ImagemTarget imagem = new Adapter();
            imagem.carregarImagem("exemplo.png");
            imagem.desenharImagem(2, 2, 25, 25);
           
	}
}

