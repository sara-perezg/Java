package com.isf;

public class Main {

	public static void main(String[] args) {
		
		int i = 0;
		String cadenas[] = {
		"Cadena 1",
		"Cadena 2",
		"Cadena 3",
		"Cadena 4"
		};
		
		try {
			for (i=0; i<=4; i++) System.out.println(cadenas[i]);			
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Error indice fuera de rango");
		}
	}
}
