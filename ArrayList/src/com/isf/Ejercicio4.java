package com.isf;

import java.util.ArrayList;
public class Ejercicio4 {
	public static void main(String[] args) {
		ArrayList<String> cadenas = new ArrayList<String>();
		cadenas.add("escribiendo");
		cadenas.add("en una");
		cadenas.add("misma linea");
		cadenas.add("cadenas");
		cadenas.add("usando ArrayList");
		
		for (int i = 0; i < cadenas.size(); i++) {
			Object obj = cadenas.get(i);
			String cadena = obj.toString();
			cadena = cadena.toUpperCase();
			System.out.print(cadena+" ");
		}
	}
}
