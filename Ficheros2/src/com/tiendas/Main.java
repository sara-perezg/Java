package com.tiendas;

import java.util.ArrayList;
import java.util.Iterator;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		ArrayList<String> tiendas = new ArrayList<String>();
		String path = "tiendas3.txt";
		
		File file = new File(path);
		
		Scanner input = null;
		try {
			input = new Scanner(file);
			while (input.hasNextLine()) {
				tiendas.add((String) input.nextLine());			
			}
			System.out.println("----------------");
			for (Iterator<String> iterator = tiendas.iterator(); iterator.hasNext();) {
				String string = (String) iterator.next();
				System.out.println(string);
			}
			System.out.println("----------------");
			for (int i = 0; i < tiendas.size(); i++) {
				if (i % 2 == 0) {
					System.out.println(tiendas.get(i));
				}
			}
			
			System.out.println("----------------");
			for (int i = 0; i < tiendas.size(); i++) {
				System.out.printf("%s tiene %d caracteres\n", tiendas.get(i), tiendas.get(i).length());
			}
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("Fichero no encontrado");
		}finally {
			try {				
				input.close();
			} 
			catch(NullPointerException e) {
				System.out.println("Error al cerrar el archivo");
			}
		}
		
	}
}
