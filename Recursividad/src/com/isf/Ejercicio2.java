package com.isf;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Introduce la base del exponencial: ");
		int n = input.nextInt();
		System.out.print("Introduce el exponente: ");
		int exp = input.nextInt();
		System.out.printf("El resultado de %d^%d es %d", n,exp, exponencial(n,exp));
		input.close();
	}
	public static int exponencial(int n, int exp) {
		if(exp==1)
			return n;
		return n * exponencial(n,exp-1);
	}
}
