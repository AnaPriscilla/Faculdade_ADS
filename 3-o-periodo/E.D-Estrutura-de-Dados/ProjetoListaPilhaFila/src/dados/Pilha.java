/*
 */
package dados;

/**
 *
 * @author anapriscilla
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
