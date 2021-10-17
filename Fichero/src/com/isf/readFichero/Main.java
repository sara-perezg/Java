package com.isf.readFichero;
import com.isf.newFichero.Alumno;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		String fileName = "alumnos.txt";
		File file = new File(fileName);
		Scanner scanner;
		int nAlumnos;
		try {
			scanner = new Scanner(file);
			ArrayList<String> data = new ArrayList<String>(); 			
			while(scanner.hasNextLine()) {
				data.add(scanner.nextLine());
			}
			nAlumnos = data.size()/8;
			
			for (int i = 0; i < nAlumnos; i++) {
				for (int j = 0; j < 7; j++) {
					alumnos.add(data.get(i));
				}
				for
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error de lectura del archivo "+ fileName);
		}finally {
			System.out.println("Archivo leido correctamente");
		}
		
	}
}
