/*
01 - Crie um objeto chamado Cliente com os atributos: id, nome, idade, telefone. Faça um
     programa para solicitar os dados de vários clientes e armazenar em um ArrayList até que
     se digite um número de ID negativo. Em seguida exiba os dados de todos os clientes via
     SystemOut, formatando cada objeto separado por linhas.
 */
package Exercicio01;

/**
 *
 * @author anapriscilla
 */
public class Cliente {
    //Atributos: id, nome, idade, telefone. 

    private int id;
    private String nome;
    private int idade;
    private String telefone;

    //Metodos Get e Set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //Para imprimir 
    public void imprime() {
        System.out.println(String.format("ID: " + this.getId()
                + "| Nome: " + this.getNome() + "| Idade: " + this.getIdade() + " anos"
                + "| Telefone: " + this.getTelefone()));
    }

    //Método construtor
    public Cliente(int id, String nome, int idade, String telefone) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

}
