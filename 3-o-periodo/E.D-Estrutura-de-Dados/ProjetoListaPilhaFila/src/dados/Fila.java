/*
 */
package dados;

/**
 *
 * @author anapriscilla
 */
public class Fila<T> extends Lista {

    public Fila() {
    }

    public void enfileira(T elemento) throws EmptyListException {

        insereNoFim(elemento);
    }

    public void desenfileirar() throws EmptyListException {
        removeNoInicio();
    }
}