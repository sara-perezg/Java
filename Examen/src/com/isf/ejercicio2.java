package com.isf;
//2. Un array que almacena x numeros con un menu de tres opciones (eliminar repetidos, 
//poner un nunero en la posicion que quieras y mostrar) 
import java.util.ArrayList;
import java.util.Scanner;
public class ejercicio2 {
	
	public static ArrayList<Integer> removeRepetidos(ArrayList<Integer> numeros){
		
		ArrayList<Integer> numerosUnique = new ArrayList<Integer>();
		
		for (int i = 0; i < numeros.size(); i++) {
			if(numerosUnique.contains(numeros.get(i)) == false){
				numerosUnique.add(numeros.get(i));
			}
		}
		return numerosUnique;
	}
	
	public static void show(ArrayList<Integer> numeros) {
		for (int i = 0; i < numeros.size(); i++) {
			System.out.print(numeros.get(i));
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(2);
		
		int control = 0;
		
		do {
			System.out.println("Programa de numeros"
					+ "\n1)Eliminar numeros repetidos"
					+ "\n2)Poner un numero en la posicion que quieras"
					+ "\n3)Mostrar los numeros"
					+ "\n4)Salir");
			System.out.print("Introduzca una opcion: ");
			control = input.nextInt();
			switch (control) {
			case 1:
				numeros = removeRepetidos(numeros);
				show(numeros);
				break;
			case 2:
				System.out.print("Introduzca la posicion donde quiera insertar el numero: ");
				int pos = input.nextInt();
				System.out.print("Introduzca el numero: ");
				int num = input.nextInt();
				numeros.add(pos, num);
				show(numeros);
				break;
			case 3:
				show(numeros);
				break;
			default:
				System.out.println("Opcion no valida");
				break;
			}
			System.out.println();
		} while (control != 4);
		
		System.out.println("Adios!");
		input.close();
	}
}
