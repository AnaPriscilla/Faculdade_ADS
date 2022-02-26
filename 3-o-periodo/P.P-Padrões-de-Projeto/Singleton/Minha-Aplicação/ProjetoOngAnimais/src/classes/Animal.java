/*

 */
package classes;

/**
 *
 * @author anapriscilla
 */
public class Animal {

    private String especieAnimal = "";
    private String nomeAnimal = "";
    private String sexoAnimal = "";
    private int idadeAnimal = 0;
    private Ong ong = null;   
            
    public Animal(String especieAnimal, String nomeAnimal, String sexoAnimal, int idadeAnimal, Ong abrigoPatinhasCarinho){
        this.especieAnimal = especieAnimal;
        this.nomeAnimal = nomeAnimal;
        this.sexoAnimal = sexoAnimal;
        this.idadeAnimal = idadeAnimal;
        ong = abrigoPatinhasCarinho;
        abrigoPatinhasCarinho.setNumeroDoAnimal();
    }

     public String animalRegistrado(){
        String imprimir = "***DADOS DO ANIMAL*** \n";
        imprimir += "Espécie: " + especieAnimal + "\n";
        imprimir += "Nome: " + nomeAnimal + "\n";
        imprimir += "Ong de Animais: " + ong.getNomeDaOng() + "\n";
        imprimir += "Número: " + ong.getNumeroDoAnimal() + "\n";
        imprimir += "Sexo: " + sexoAnimal + "\n";
        imprimir += "Idade: " + idadeAnimal + " anos" + "\n";
        imprimir += """
                    ________________
                    
                    """;
        return imprimir;
        
    }  
}

