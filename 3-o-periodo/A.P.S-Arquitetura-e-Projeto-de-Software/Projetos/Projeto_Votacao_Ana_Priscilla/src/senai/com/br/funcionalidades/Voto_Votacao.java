/*
 */
package senai.com.br.funcionalidades;

/**
 *
 * @author anapriscilla
 */
public class Voto_Votacao {
     Votacao voto;
    
    public Voto_Votacao(){
        voto = new Votacao();
        voto.iniciar();
    }
    
    public void votar(int opcao){
        voto.votar(opcao);
    }
    
    public String exibirResultado(){
        return voto.resultadoDaVotacao();
    }
}
