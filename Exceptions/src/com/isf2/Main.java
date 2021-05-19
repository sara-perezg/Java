package com.isf2;

public class Main {

	
	public static void methodThrowingException() throws RuntimeException{
		int i = 0;
		String cadenas[] = {
		"Cadena 1",
		"Cadena 2",
		"Cadena 3",
		"Cadena 4"
		};
		
		
		for (i=0; i<=4; i++) {
			
			if (i == 4) {
				throw new RuntimeException();
			}else {
				System.out.println(cadenas[i]);
			}
		}			
	}
	public static void main(String[] args) {
		
		try {
			methodThrowingException();
		} catch (RuntimeException e) {
			// TODO: handle exception
			System.out.println();
		}
	}
}
