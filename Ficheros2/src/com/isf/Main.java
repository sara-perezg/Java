package com.isf;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Main {

	public static void main(String[] args) {
		
		ArrayList<PartidoFutbol> partidos = new ArrayList<PartidoFutbol>();
		String path = "partidos.txt";
		File file = new File(path);
		
		try {
			Scanner input = new Scanner(file);
			while (input.hasNextLine()) {
				String string = input.nextLine();
				String[] elementos = string.split(":");
				
				PartidoFutbol partido = new PartidoFutbol(
						elementos[0],
						elementos[1],
						Integer.parseInt(elementos[2]),
						Integer.parseInt(elementos[3]));
				partidos.add(partido);
			}
			input.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		}

		System.out.println(partidos);
	}
}
