/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dados;

/**
 *
 * @author User
 */
public class Pilha<T> extends Lista{

	public Pilha() {
		
	}

	public void empilha(T elemento) throws EmptyListException{
		
	insereNoFim(elemento);
			
	}
	public void desempilha() throws EmptyListException{
		removeNoFim();
	}

}
