/*
 */
package adapter.hdmi.vga;

/**
 *
 * @author anapriscilla
 */
public class HDMI implements MediaPlayer {
 @Override
 public void rodar(String nomedoarquivo) {
    System.out.println("Cabo: " + nomedoarquivo);
 }
}