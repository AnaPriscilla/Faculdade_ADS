/*
 */
package Exercicio02;

import java.util.ArrayList;

/**
 *
 * @author anapriscilla
 */
public class Telefones {

    private ArrayList<Contatos> listaDeContatos = new ArrayList<Contatos>();

    public ArrayList<Contatos> getContatos() {
        return listaDeContatos;
    }

    public void setContatos(ArrayList<Contatos> contatos) {
        this.listaDeContatos = contatos;
    }

    public void imprimindoListaDeContatos() {
        if (listaDeContatos.size() == 0) {
            System.out.println("Lista de contatos vazia");
        } else {
            System.out.println("__________Lista-de-Contatos__________");
            for (int i = 0; i < listaDeContatos.size(); i++) {
                System.out.println(listaDeContatos.get(i).getNome() + ": " + listaDeContatos.get(i).getNumero() + " index: " + i);
            }
        }
    }

    public void adicionarContatos(Contatos contatos) {
        listaDeContatos.add(contatos);
        System.out.println("Contato Adicionado");
    }

    public void atualizarContatos(String nome, Contatos novoContato) {
        int posicao = procurarContato(nome);
        if (posicao< 0) {
            System.out.println("Contato não encontrado");
        }
        listaDeContatos.set(posicao, novoContato);
        System.out.println("Contato atualizado");
    }

    public void removerContato (int posicao) {
        try {
            listaDeContatos.remove(posicao);
            System.out.println("Contato removido");
        } catch (Exception e) {
            System.out.println("Contato não encontrado para ser removido");
        }
    }

    public int procurarContato(Contatos contato) {
        return listaDeContatos.indexOf(contato);
    }

    public int procurarContato(String nomeContato) {
        for (int i = 0; i < listaDeContatos.size(); i++) {
            Contatos contact = listaDeContatos.get(i);
            if (contact.getNome().toLowerCase().equals(nomeContato.toLowerCase())) {
                return i;
            }
        }
        return -1;
    }

}
