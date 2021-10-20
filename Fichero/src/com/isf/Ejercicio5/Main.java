package com.isf.Ejercicio5;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> nLista = new ArrayList<Integer>();
		String fileName1 = "listadoNumerosBlancos.txt";
		String fileName2 = "listadoNumerosEspacios.txt";
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduzca numeros por pantalla. Cuando quiera terminar el programa introduzca 'q'");
		
		String entrada = input.next();
		
		do {	
			try {
				Integer n = Integer.parseInt(entrada);
				nLista.add(n);								
			} catch (Exception e) {
				System.out.println("Error. Tiene que introducir un numero");
			}
			entrada = input.next();
		} while ((!entrada.equalsIgnoreCase("q")));
		
		input.close();
		
		try {
			File file1 = new File(fileName1);
			File file2 = new File(fileName2);
			
			BufferedWriter bw1 = new BufferedWriter(new FileWriter(file1));
			BufferedWriter bw2 = new BufferedWriter(new FileWriter(file2));
			
			for (Integer integer : nLista) {
				bw1.write(String.format("%d ", integer));
				bw2.write(String.format("%d\n", integer));
			}
			bw1.close();
			bw2.close();
			
			System.out.println("Fin del programa. Adios!");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error escribiendo los archivos");
		}
		
		
		
	}

}
