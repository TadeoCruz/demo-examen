/**
 * 
 */
package com.examen.exeption;

/**
 * Exepcion para cliente no existente
 */
public class ClienteNotFound extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6666648955512780594L;

	public ClienteNotFound() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClienteNotFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public ClienteNotFound(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ClienteNotFound(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ClienteNotFound(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	
	
}
