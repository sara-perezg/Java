package com.myExceptions;

class exceptionIndex extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8404255934429495478L;

	public exceptionIndex() {
		super();
		// TODO Auto-generated constructor stub
	}

	public exceptionIndex(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}

public class Main {
	
	public static void methodThrowingException() throws exceptionIndex{
		int i = 0;
		String cadenas[] = {
		"Cadena 1",
		"Cadena 2",
		"Cadena 3",
		"Cadena 4"
		};
		
		
		for (i=0; i<=4; i++) {
			
			if (i == 4) {
				throw new exceptionIndex("Error en indice");
			}else {
				System.out.println(cadenas[i]);
			}
		}			
	}
	
	public static void main(String[] args) {
		
		try {
			methodThrowingException();
		} catch (exceptionIndex e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
