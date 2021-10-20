package com.isf.Ejercicio2;
import java.io.File;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		String fileName = "alumnos.txt";
		File file = new File(fileName);
		Scanner scanner;
		
		try {
			scanner = new Scanner(file);
			
			while(scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
			scanner.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al leer el archivo");
		}
		
	}
}
