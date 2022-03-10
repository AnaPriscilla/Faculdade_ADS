/*
 */
package senai.com.br.funcionalidades;

/**
 *
 * @author anapriscilla
 */
public class Votacao {
    //Vetor de 4 posições
    public String[] botao = new String[4];
    public int[] quantidadeDeVotos = new int[4];
    int totalDeVotos;
   
   //Métodos 
    public void iniciar(){
        botao[0] = "1";
        botao[1] = "2";
        botao[2] = "3";
        quantidadeDeVotos[0] = 0;
        quantidadeDeVotos[1] = 0;
        quantidadeDeVotos[2] = 0;
        totalDeVotos = 0;
    }
    
    public void votar(int botao){
        quantidadeDeVotos[botao]++;
        totalDeVotos++;
    }
    
    public float calcularPorcentagem(int botao){
        return (float) ((float) quantidadeDeVotos[botao] * 100.0 / (float) totalDeVotos);
    }
    
    public String resultadoDaVotacao(){
        String resultado="Quantidade de Votos: \n";
        for (int i = 0; i < 3 ; i++){
            resultado = resultado + botao[i] + "| :" + quantidadeDeVotos[i]+ "\n";
        }
        resultado += "Porcentagem da Votação: \n";
        for (int i = 0; i < 3 ; i++){
            resultado = resultado + botao[i] + "| : " + calcularPorcentagem(i) + "%\n";
        }
        return resultado;
    }
}
