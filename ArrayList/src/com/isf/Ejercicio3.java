package com.isf;

import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Introduce cuantos numeros quieres sumar: ");
		int n = input.nextInt();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			System.out.println("Introduce el numero "+(i+1));
			int userN = input.nextInt();
			numbers.add(userN);
		}
		double mean = 0;
		for (int i = 0; i < numbers.size(); i++) {
			mean += numbers.get(i);
			System.out.printf("El numero %d + ",numbers.get(i));
		}
		System.out.println("es = "+mean/n);
		input.close();
	}
}
