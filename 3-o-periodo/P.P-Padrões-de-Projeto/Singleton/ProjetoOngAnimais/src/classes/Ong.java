/*

 */
package classes;

/**
 *
 * @author anapriscilla
 */
public class Ong {
    
   //private static Ong instanceSingleton;
    private final String nomeDaOng = "ABRIGO PATINHAS DE CARINHO";
    private int numeroDoAnimal = 0;
    
    //Implementação do Singleton
    private static Ong instanceSingleton;

    private Ong(){}

    public static
         
        Ong getInstance(){

        if( instanceSingleton == null ){

            instanceSingleton = new Ong();
        }

        return instanceSingleton;
    }
    
    public String getNomeDaOng(){
        return nomeDaOng;
    }

    public int getNumeroDoAnimal() {
        return numeroDoAnimal;
    }

    public void setNumeroDoAnimal() {
        this.numeroDoAnimal++;
    }
   
}
