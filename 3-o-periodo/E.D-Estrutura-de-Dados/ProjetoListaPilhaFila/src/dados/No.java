/*
 */
package dados;

/**
 *
 * @author anapriscilla
 */
public class No<T> {
	
	
	private T elemento;
	No<T> proximoNo;
	
	
	
	public No() {
		this.proximoNo = null;
	}

	public No(T elemento) {
		this.elemento = elemento;
	}

	public No(T elemento, No<T> proximoNo) {
		this.elemento = elemento;
		this.proximoNo = proximoNo;
	}

	public T getElemento() {
		return elemento;
	}

	public void setElemento(T elemento) {
		this.elemento = elemento;
	}

	public No<T> getProximoNo() {
		return proximoNo;
	}

	public void setProximoNo(No<T> proximoNo) {
		this.proximoNo = proximoNo;
	}
	
    }

