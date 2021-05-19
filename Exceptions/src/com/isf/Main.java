package com.isf;

//import java.io.IOException;

public class Main {

	public static void methodThrowingException() throws RuntimeException{
		int i = 0;
		String cadenas[] = {
		"Cadena 1",
		"Cadena 2",
		"Cadena 3",
		"Cadena 4"
		};
		
		
		for (i=0; i<=4; i++) System.out.println(cadenas[i]);			
	}
	
	public static void main(String[] args) {
		
		try {
			methodThrowingException();			
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("index out of range");
		}
	}
}
