/*
    Projeto para Ong que resgata animais (gatos e cachorros) em situação de mals tratos ou de rua. 
    Objetivo: Registro dos moradores do abrigo (Ong).
 */
package projetoonganimais;
import classes.*;

/**
 *
 * @author anapriscilla
 */
public class ProjetoOngAnimais {
    
     public static void main(String[] args) {

            Ong ongUnica = Ong.getInstance();
            //Ong ongTeste = new Ong();
            /*Ong ongNovaInstancia = Ong.getInstance();
            System.out.println("Comparação Instancias: " + ongNovaInstancia + " = " + ongUnica );*/

            Animal animalAbrigo = new Animal("cachorro","Cyndi","fêmea", 5, ongUnica);
            System.out.println(animalAbrigo.animalRegistrado());
     
            Animal animalAbrigo1 = new Animal("gato", "Onça", "fêmea", 10, ongUnica);
            System.out.println(animalAbrigo1.animalRegistrado());

            Animal animalAbrigo2 = new Animal("gato", "Becca", "fêmea", 7, ongUnica);
            System.out.println(animalAbrigo2.animalRegistrado());
            
            Animal animalAbrigo3 = new Animal("gato", "Levitte", "macho", 1, ongUnica);
            System.out.println(animalAbrigo3.animalRegistrado());
          
            Animal animalAbrigo4 = new Animal("cachorro", "Leão", "macho", 3, ongUnica);
            System.out.println(animalAbrigo4.animalRegistrado());
           
    }
}
