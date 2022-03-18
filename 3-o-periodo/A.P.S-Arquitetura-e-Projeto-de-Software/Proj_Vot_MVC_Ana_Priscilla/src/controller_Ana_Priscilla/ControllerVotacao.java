/*
Precisei importar a clase Votacao
 */
package controller_Ana_Priscilla;

import model_Ana_Priscilla.Votacao;

/**
 *
 * @author anapriscilla
 */
  public class ControllerVotacao {

        Votacao voto;

        public ControllerVotacao() {
            voto = new Votacao();
            voto.iniciar();
        }

        public void votar(int opcao) {
            voto.votar(opcao);
        }

        public String exibirResultado() {
            return voto.resultadoDaVotacao();
        }
    }

