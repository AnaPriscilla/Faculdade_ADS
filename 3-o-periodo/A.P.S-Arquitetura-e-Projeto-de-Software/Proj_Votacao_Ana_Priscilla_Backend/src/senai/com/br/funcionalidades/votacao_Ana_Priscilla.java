/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package senai.com.br.funcionalidades;

/**
 *
 * @author anapriscilla
 */
public class votacao_Ana_Priscilla {
    
    private String nomeEleitor;
    private registro_candidato_Ana_Priscilla candidato;
    
    public votacao_Ana_Priscilla(String nomeEleitor, registro_candidato_Ana_Priscilla candidato) {
        this.nomeEleitor = nomeEleitor;
        this.candidato = candidato;
    }
    
    public String getNomeEleitor() {
        return this.nomeEleitor;
    }
    
    public void setNome(String nomeEleitor) {
        this.nomeEleitor = nomeEleitor;
    }
    
    public registro_candidato_Ana_Priscilla getCandidato() {
        return this.candidato;
    }
    
}
