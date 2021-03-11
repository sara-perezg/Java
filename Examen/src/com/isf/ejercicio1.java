package com.isf;
//1. Pides una cadena y la imprimes a la inversa y a la mitad
import java.util.Scanner;
public class ejercicio1 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Introduce una cadena: ");
		String cadena = input.next();
		int longitud = cadena.length() -1;
		while(longitud >= 0) {
			System.out.print(cadena.charAt(longitud));
			longitud--;
		}
		System.out.println();
		int mitad = (int)cadena.length()/2;
		for (int i = 0; i < mitad; i++) {
			System.out.print(cadena.charAt(i));
		}
		input.close();
		
	}
}
