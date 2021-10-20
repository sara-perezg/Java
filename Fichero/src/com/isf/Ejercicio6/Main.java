package com.isf.Ejercicio6;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> wLista = new ArrayList<String>();
		String fileName1 = "listadoPalabras.txt";
		
		Scanner input = new Scanner(System.in);
		System.out.println("Introduzca palabras por pantalla. Cuando quiera terminar el programa introduzca 'q'");
		String entrada = input.next();
		
		do {	
			wLista.add(entrada);								
			entrada = input.next();
		} while ((!entrada.equalsIgnoreCase("q")));
		
		input.close();
		
//		ordenamos la lista
		Collections.sort(wLista);
		
		try {
			File file1 = new File(fileName1);
			BufferedWriter bw1 = new BufferedWriter(new FileWriter(file1));
			
			for (Integer i = 1; i<= wLista.size();i++) {
				bw1.write(String.format("%d. %s\n",i,wLista.get(i-1)));
			}
			bw1.close();
			
			System.out.println("Fin del programa. Adios!");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error escribiendo los archivos");
		}
		
		
		
	}

}
