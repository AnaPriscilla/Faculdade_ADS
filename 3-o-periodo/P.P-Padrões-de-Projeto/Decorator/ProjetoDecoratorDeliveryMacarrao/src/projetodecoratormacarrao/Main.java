/*
 */
package projetodecoratormacarrao;

/**
 *
 * @author anapriscilla
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Massa macarrao1 = new Penne();
        System.out.println("-------------------------------------------------");
        System.out.println("Massa: "+ macarrao1.getDescricao());
        System.out.println("Preço: " + macarrao1.preco());
        System.out.println("OPÇÃO COM ADICIONAIS:");
        macarrao1 = new MolhoTradicional(macarrao1);
        System.out.println("Massa: " + macarrao1.getDescricao());
        System.out.println("Preço: " + macarrao1.preco());
        System.out.println("-------------------------------------------------");
        macarrao1 = new Azeitonas(macarrao1);
        System.out.println("Massa:  "+ macarrao1.getDescricao());
        System.out.println("Preço:  " + macarrao1.preco());
        System.out.println("-------------------------------------------------");
        macarrao1 = new CarneMoida(macarrao1);
        System.out.println("Massa:  "+ macarrao1.getDescricao());
        System.out.println("Preço:  " + macarrao1.preco());
        System.out.println("-------------------------------------------------");
        
        
        Massa macarrao2 = new Concha();
        System.out.println("-------------------------------------------------");
        System.out.println("Massa: "+ macarrao2.getDescricao());
        System.out.println("Preço: " + macarrao2.preco());
        System.out.println("OPÇÃO COM ADICIONAIS:");
        
        macarrao2 = new MolhoTradicional(macarrao2);
        System.out.println("Massa: " + macarrao2.getDescricao());
        System.out.println("Preço: " + macarrao2.preco());
        System.out.println("-------------------------------------------------");
    
        macarrao2 = new CarneMoida(macarrao2);
        System.out.println("Massa:  "+ macarrao2.getDescricao());
        System.out.println("Preço:  " + macarrao2.preco());
        System.out.println("-------------------------------------------------");

        
        Massa macarrao3 = new Fusilli();
        System.out.println("-------------------------------------------------");
        System.out.println("Massa: "+ macarrao3.getDescricao());
        System.out.println("Preço: " + macarrao3.preco());
        System.out.println("OPÇÃO COM ADICIONAIS:");
        macarrao3 = new CarneMoida(macarrao3);
        System.out.println("Massa:  "+ macarrao3.getDescricao());
        System.out.println("Preço:  " + macarrao3.preco());
        System.out.println("-------------------------------------------------");
    }
    
}
