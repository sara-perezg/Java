package com.ej2;

import java.io.File;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "NUEVODIR/fichero2.txt";
		File f = new File(path);
		
		try {	
			System.out.println("Nombre: " + f.getName());
			System.out.println("Path: " + f.getPath());
			System.out.println("Nombre: " + f.getAbsolutePath());
			if (f.canWrite()) {
				System.out.println("El archivo se puede escribir");
			}else {
				System.out.println("El archivo NO se puede escribir");
			}
			if (f.canRead()) {
				System.out.println("El archivo se puede leer");
			}else {
				System.out.println("El archivo NO se puede leer");
			}
			System.out.println("Tamaño: " + f.length());
			if (f.isDirectory()) {
				System.out.println("El archivo es un directorio");
			}else {
				System.out.println("El archivo NO es un directorio");
			}
			if (f.isFile()) {
				System.out.println("El archivo es un fichero");
			}else {
				System.out.println("El archivo NO es un fichero");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
