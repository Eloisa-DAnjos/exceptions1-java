package model.exceptions;

//a classe RuntimeException NÃO OBRIGA a tratar ou propagar exceções
// A classe Exception OBRIGA a tratar ou propagar exceções

public class DomainException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}
}
