/*
 */
package dados;

/**
 *
 * @author User
 */
public class Lista<T> {

    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private int tamanho;

    public Lista() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanho = 0;
    }

//Inserir No Início
    public void insereNoInicio(T elemento) throws EmptyListException {
        if (buscarElemento(elemento)) {
            throw new EmptyListException("Elemento já existe");
        }
        if (estaVazia()) {
            primeiroNo = ultimoNo = new No<T>(elemento);
        } else {
            primeiroNo = new No<T>(elemento, primeiroNo);
        }

        this.tamanho++;
    }

//Inserir No Fim
    public void insereNoFim(T elemento) throws EmptyListException {
        if (buscarElemento(elemento)) {
            throw new EmptyListException("Elemento já existe");
        }
        if (estaVazia()) {
            primeiroNo = ultimoNo = new No<T>(elemento);
        } else {
            ultimoNo = ultimoNo.proximoNo = new No<T>(elemento);
        }
        this.tamanho++;
    }// fim do método insereNoFim

//Inserir por Posição
    public void inserirNaPosicao(int posicao, T elemento) throws EmptyListException {

        if (buscarElemento(elemento)) {
            throw new EmptyListException("Elemento já existe");
        }

        if (posicao >= this.tamanho) {
            throw new EmptyListException("Posição inválida.");
        }

        if (posicao == 0) {
            No<T> novoNo = new No<T>(elemento);
            novoNo.setProximoNo(this.primeiroNo);
            this.primeiroNo = novoNo;
        } else if (posicao == this.tamanho - 1) {
            No<T> novoNo = new No<T>(elemento);
            No<T> noAnterior = recuperarNo(posicao - 1);
            No<T> noAtual = recuperarNo(posicao);
            noAnterior.setProximoNo(novoNo);
            novoNo.setProximoNo(noAtual);

        } else {
            No<T> noAnterior = recuperarNo(posicao - 1);
            No<T> noAtual = recuperarNo(posicao);
            No<T> novoNo = new No<T>(elemento);
            noAnterior.setProximoNo(novoNo);
            novoNo.setProximoNo(noAtual);

        }
        this.tamanho++;
    }

//Remover por posição
    public void removerPosicao(int posicao) throws EmptyListException {

        if (buscarElemento(recuperarElemento(posicao)) == false) {
            throw new EmptyListException("Elemento não existe");
        }

        if (posicao >= this.tamanho) {
            throw new IllegalArgumentException(String.format("Posição inválida", posicao));
        } else if (posicao == 0) {
            No<T> proximoNo = this.primeiroNo.getProximoNo();
            this.primeiroNo.setProximoNo(null);
            this.primeiroNo = proximoNo;
        } else if (posicao == this.tamanho - 1) {
            No<T> penultimoNo = recuperarNo(this.tamanho - 2);
            this.ultimoNo = penultimoNo;
        } else {
            No<T> noAnterior = recuperarNo(posicao - 1);
            No<T> proximoNo = recuperarNo(posicao + 1);
            No<T> noAtual = recuperarNo(posicao);
            noAnterior.setProximoNo(proximoNo);
            noAtual.setProximoNo(null);
        }
        this.tamanho--;
    }

//Remove No Início
    public T removeNoInicio() throws EmptyListException {

        if (estaVazia()) {
            throw new EmptyListException("está Vazia");
        }
        T removedItem = primeiroNo.getElemento();

        if (primeiroNo == ultimoNo) {
            primeiroNo = ultimoNo = null;
        } else {
            primeiroNo = primeiroNo.getProximoNo();
        }
        this.tamanho--;
        return removedItem;
    }

//Remove No Fim
    public T removeNoFim() throws EmptyListException {
        if (estaVazia()) {
            throw new EmptyListException("esta Vazia");
        }

        T removedItem = ultimoNo.getElemento();

        if (primeiroNo == ultimoNo) {
            primeiroNo = ultimoNo = null;
        } else {
            No<T> current = primeiroNo;

            while (current.getProximoNo() != ultimoNo) {
                current = current.getProximoNo();
            }

            ultimoNo = current;
            current.setProximoNo(null);
        }

        this.tamanho--;
        return removedItem;
    }

//Remove Por elemento
    public String removerPorElemento(T elemento) throws EmptyListException {

        No<T> elementoRemovido = null;
        if (estaVazia()) {
            throw new EmptyListException("está vazia");
        }

        if (buscarElemento(elemento)) {

            elementoRemovido = new No<T>(elemento);
            int indiceAserRemovido = localizarIndice(elemento);
            if (indiceAserRemovido == (this.tamanho - 1)) {
                removeNoFim();
            } else {
                removerPosicao(indiceAserRemovido);

            }
        } else {
            throw new EmptyListException("Elemento nao existente");
        }

        return "Elemento removido: " + elementoRemovido.getElemento();

    }

//Localiza o elemento pelo indice
    public int localizarIndice(T elemento) throws EmptyListException {
        for (int i = 0; i < tamanho; i++) {
            No<T> noAtual = recuperarNo(i);
            if (noAtual.getElemento() != null && noAtual.getElemento().equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

//Confere se o elemento existe na lista
    public boolean buscarElemento(T elemento) throws EmptyListException {
        for (int i = 0; i < tamanho; i++) {
            No<T> noAtual = recuperarNo(i);
            if (noAtual.getElemento() != null && noAtual.getElemento().equals(elemento)) {
                return true;
            }
        }
        return false;
    }

//Recupera o no usando a posição
    private No<T> recuperarNo(int posicao) throws EmptyListException {
        if (posicao >= this.tamanho) {
            throw new EmptyListException("Posição inválida");
        }

        No<T> resultado = null;
        for (int i = 0; i <= posicao; i++) {

            if (i == 0) {
                resultado = this.primeiroNo;
            } else {
                resultado = resultado.getProximoNo();
            }
        }
        return resultado;
    }

//Recupera o elemento usando sua posição
    public T recuperarElemento(int posicao) throws EmptyListException {
        No<T> no = recuperarNo(posicao);
        if (no != null) {
            return no.getElemento();
        }

        return null;
    }

//Confere se a lista esta Vazia
    public boolean estaVazia() {
        return primeiroNo == null;
    }

//Retorna quantos elementos Há na lista
    public int tamanho() {
        return this.tamanho;
    }

//Imprime todos os elementos da Lista
    @Override
    public String toString() {

        if (estaVazia()) {
            return "Vazia";
        } else {
            No<T> noAtual = this.primeiroNo;
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("[ ");
            stringbuilder.append(noAtual.getElemento() != null ? noAtual.getElemento().toString() : "<nulo>");
            stringbuilder.append(" -> ");

            while (noAtual.getProximoNo() != null) {
                stringbuilder.append(noAtual.getProximoNo().getElemento() != null ? noAtual.getProximoNo().getElemento().toString() : "<nulo>");
                stringbuilder.append(" -> ");
                noAtual = noAtual.getProximoNo();
            }

            stringbuilder.append("]");
            return stringbuilder.toString();
        }

    }
}
