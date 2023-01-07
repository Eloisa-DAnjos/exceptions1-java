package model.exceptions;

//a classe RuntimeException N�O OBRIGA a tratar ou propagar exce��es
// A classe Exception OBRIGA a tratar ou propagar exce��es

public class DomainException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}
}
