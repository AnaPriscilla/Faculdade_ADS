/*
 */
package adapter.hdmi.vga;

/**
 *
 * @author anapriscilla
 */
public class Adaptador implements MediaPlayer {
 private final Media media;
 public Adaptador(Media pacote) {
    media = pacote;
 }
 @Override
 public void rodar(String nomedoarquivo) {
   System.out.print("Adaptado para a ");
   media.rodarArquivo(nomedoarquivo);
 }
}
