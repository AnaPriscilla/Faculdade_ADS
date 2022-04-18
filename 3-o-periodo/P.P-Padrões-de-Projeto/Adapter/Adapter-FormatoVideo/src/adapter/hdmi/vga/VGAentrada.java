/*
 */
package adapter.hdmi.vga;

/**
 *
 * @author anapriscilla
 */
public class VGAentrada implements Media {
 @Override
 public void rodarArquivo(String nomedoarquivo) {
    System.out.println("entrada: " + nomedoarquivo);
 }
}