package com.isf;

import java.util.ArrayList;
import java.util.Scanner;
public class Numero {
	ArrayList<Integer> numbers = new ArrayList<Integer>();

	public Numero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Numero(ArrayList<Integer> numbers) {
		super();
		this.numbers = numbers;
	}

	@Override
	public String toString() {
		return "Numero [numbers=" + numbers + "]";
	}
	
	public ArrayList<Integer> leerNumeros() {
		Scanner input = new Scanner(System.in);
		
		int number;// = input.nextInt();
		
		System.out.println("Introduce los numeros que queras. Si quieres parar introduce -99");
		number = input.nextInt();
		while(number != -99) {
			numbers.add(number);
			number = input.nextInt();
		}
		input.close();
		return numbers;
	}
	
	public int realizarSuma() {
		int suma = 0;
		
		for (Integer integer : numbers) {
			suma += integer;
		}
		return suma;
	}
	
	public double realizarMedia() {
		return realizarSuma()/numbers.size();
	}
	public void resultados() {
		System.out.println("Numeros:");
		for (Integer integer : numbers) {
			System.out.print(integer + " ");
		}
//		toString();
		System.out.println("\nSuma de los numeros: " + realizarSuma());
		double media = realizarMedia();
		System.out.println("Media de los numeros: " + media);
		System.out.println("Numeros superiores a la media: ");
		for (Integer integer : numbers) {
			if (integer > media) {
				System.out.println(integer + " ");
			}
		}
	}
	
}
