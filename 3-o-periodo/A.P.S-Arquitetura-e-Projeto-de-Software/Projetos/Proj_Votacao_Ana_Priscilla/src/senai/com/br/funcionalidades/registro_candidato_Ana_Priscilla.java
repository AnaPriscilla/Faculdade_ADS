/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package senai.com.br.funcionalidades;

/**
 *
 * @author anapriscilla
 */
public class registro_candidato_Ana_Priscilla {
    
    private String nome;
    
    public registro_candidato_Ana_Priscilla(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return "Candidato: " + this.nome;
    }
    
}
