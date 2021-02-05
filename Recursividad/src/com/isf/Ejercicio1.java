package com.isf;

import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Introduce un numero para sumar sus digitos: ");
		int n = input.nextInt();
		System.out.printf("La suma de los digitos de %d es %d", n, sumarDigitos(n));
		input.close();
	}
	
	public static int sumarDigitos(int n) {
		if(n<10)
			return n;
		return n%10 + sumarDigitos(n/10);
	}
}
