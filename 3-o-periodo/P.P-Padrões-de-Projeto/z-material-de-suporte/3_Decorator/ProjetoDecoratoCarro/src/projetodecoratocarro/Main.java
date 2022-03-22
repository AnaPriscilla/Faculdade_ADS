/*
 */

package projetodecoratocarro;

/**
 *
 * @author anapriscilla
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Carro veiculo1 = new Captiva();
        System.out.println("-------------------------------------------------");
        System.out.println("Carro:   "+ veiculo1.getDescricao());
        System.out.println("Preco:  " + veiculo1.preco());
        System.out.println("-------------------------------------------------");
        veiculo1 = new KitMultimidia(veiculo1);
        System.out.println("Carro:   "+ veiculo1.getDescricao());
        System.out.println("Preco:  " + veiculo1.preco());
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
        veiculo1 = new KitTurbo(veiculo1);
        System.out.println("Carro:   "+ veiculo1.getDescricao());
        System.out.println("Preco:  " + veiculo1.preco());
        System.out.println("-------------------------------------------------");
        System.out.println();
        
        Carro veiculo2 = new Celta();
        System.out.println("-------------------------------------------------");
        System.out.println("Carro:   "+ veiculo2.getDescricao());
        System.out.println("Preco:  " + veiculo2.preco());
        veiculo2 = new ArCondicionado(veiculo2);
         System.out.println("-------------------------------------------------");
        System.out.println("Carro:   "+ veiculo2.getDescricao());
        System.out.println("Preco:  " + veiculo2.preco());
        veiculo2 = new TrioEletrico(veiculo2);
         System.out.println("-------------------------------------------------");
        System.out.println("Carro:   "+ veiculo2.getDescricao());
        System.out.println("Preco:  " + veiculo2.preco());
        veiculo2 = new DirecaoEletrica(veiculo2);
         System.out.println("-------------------------------------------------");
        System.out.println("Carro:   "+ veiculo2.getDescricao());
        System.out.println("Preco:  " + veiculo2.preco());
    }

}
