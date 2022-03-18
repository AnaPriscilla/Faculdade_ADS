/*
 */
package model_Ana_Priscilla;

/**
 *
 * @author anapriscilla
 */
public class Votacao {
        //Vetor de 3 posições
        public String[] botao = new String[3];
        public int[] quantidadeDeVotos = new int[3];
        int totalDeVotos;

        //Métodos 
        public void iniciar() {
            botao[0] = "1º Candidato ";
            botao[1] = "2º Candidato ";
            botao[2] = "3º Candidato ";
            quantidadeDeVotos[0] = 0;
            quantidadeDeVotos[1] = 0;
            quantidadeDeVotos[2] = 0;
            totalDeVotos = 0;
        }

        public void votar(int botao) {
            quantidadeDeVotos[botao]++;
            totalDeVotos++;
        }

        public double calcularPorcentagem(int botao) {
            return (double) (quantidadeDeVotos[botao] * 100.0 / totalDeVotos);
        }

        public String resultadoDaVotacao() {
            String resultado = "\nQuantidade de votos por candidato: \n";
            for (int i = 0; i < 3; i++) {
                resultado = resultado + botao[i] + ": " + quantidadeDeVotos[i] + " votos\n";
            }
            resultado += "\nPorcentagem de cada candidato na votação: \n";
            for (int i = 0; i < 3; i++) {
                resultado = resultado + botao[i] + ": " + calcularPorcentagem(i) + "%\n";
            }
            return resultado;
        }
    }

