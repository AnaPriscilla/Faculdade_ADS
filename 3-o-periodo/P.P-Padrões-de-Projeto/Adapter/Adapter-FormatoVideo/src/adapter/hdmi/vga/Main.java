/*
 */
package adapter.hdmi.vga;

/**
 *
 * @author anapriscilla
 */
public class Main {
 public static void main(String[] args) {
    MediaPlayer player = new HDMI();
    player.rodar("HDMI");
    
    player = new Adaptador(new VGAentrada());
    player.rodar("VGA");
    
 }
}
