package com.isf.Ejercicio3;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce el nombre del archivo: ");
		String fileName = input.next();
		try {
			File file = new File(fileName);
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			String line;
			
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error leyendo el fichero. Asegurese que esta en el directorio 'src' y que ha añadido la extension");
		}
		
		
		input.close();
		
	}

}
