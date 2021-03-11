package com.isf;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Introduce la base del exponencial: ");
		double n = input.nextDouble();
		System.out.print("Introduce el exponente: ");
		double exp = input.nextDouble();
		System.out.printf("El resultado de %.1f^%.1f es %f", n,exp, exponencial(n,exp));
		input.close();
	}
	public static double exponencial(double n, double exp) {
		if(exp == 1) {
			return n;
		}else if (exp > 0) {
			return n * exponencial(n,exp-1);
		}
		else{
			return 1/n*1/exponencial(n,Math.abs(exp)-1);
		}
		
	}
}