/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package senai.com.br.funcionalidades;

/**
 *
 * @author anapriscilla
 */
public class resultado_Ana_Priscilla {
    
    private registro_candidato_Ana_Priscilla candidato;
    private double qtdVotos;
    private double percentualVotos;
    
    public resultado_Ana_Priscilla(registro_candidato_Ana_Priscilla candidato, double qtdVotos) {
        this.candidato = candidato;
        this.qtdVotos = qtdVotos;
    }
    
    public registro_candidato_Ana_Priscilla getCandidato() {
        return candidato;
    }
    
    public double getQtdVotos() {
        return qtdVotos;
    }
    
    public double getPercentualVotos() {
        return percentualVotos;
    }
    
    public void setPercentualVotos(double percentual) {
        this.percentualVotos = percentual;
    }
    
    @Override
    public String toString() {
        return "Resultado da votação: " + this.candidato.getNome() + " com " 
                + String.valueOf(this.qtdVotos) + " votos e " + String.valueOf(this.percentualVotos) + "% do total.";
    }
    
}
