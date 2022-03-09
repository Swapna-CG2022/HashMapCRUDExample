package com.cg.hashmapcrudexample;

public class PriceNotValidException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4787284126953082379L;
	String message;

	public PriceNotValidException(String message) {
		super(message);
		this.message = message;
	}
	
	
}
