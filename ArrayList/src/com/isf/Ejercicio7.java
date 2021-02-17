package com.isf;

import java.util.ArrayList;
public class Ejercicio7 {
	public static void main(String[] args) {
		System.out.println("... Creamos un ArrayList de Nombres ...");
		ArrayList<String> nombres = new ArrayList<String>();
		System.out.println("... Añadimos 5 elmentos al arraylist ...");
		nombres.add("Jorge");
		nombres.add("Luis");
		nombres.add("Pepe");
		nombres.add("Jorge");
		nombres.add("Jorge");
		nombres.add("Pablo");
		nombres.add("Julian");
		System.out.println();
		System.out.println("\n----- Nombres por defecto --------");
		for (String string : nombres) {
			System.out.print(string + " / ");
		}
		System.out.println();
		System.out.println("\n----- Añadimos a Paco -------");
		nombres.add(2,"Paco");
		for (String string : nombres) {
			System.out.print(string + " / ");
		}
		nombres.remove(0);
		System.out.println();
		System.out.println("\n------ Eliminamos a Luis -------");
		for (String string : nombres) {
			System.out.print(string + " / ");
		}
		System.out.println();
		System.out.println("\n------ Eliminamos los Jorges -------");
		
		for (int i = 0; i < nombres.size(); i++) {
			if(nombres.get(i) == "Jorge") {
				nombres.remove(i);
				i--;
			}
			System.out.print(nombres.get(i) + " / ");
		}
	}
}
