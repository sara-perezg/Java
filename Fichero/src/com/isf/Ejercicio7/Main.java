package com.isf.Ejercicio7;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		String superCarpeta = "curso";
		String asig1Carpeta = superCarpeta + "/asig1";
		String asig2Carpeta = superCarpeta + "/asig2";
		String fichero1 = "1aEvalucion";
		String fichero2 = "2aEvalucion";
		
		String[] carpetas = new String[]{superCarpeta,asig1Carpeta,asig2Carpeta};
		String[] asigCarpetas = new String[]{asig1Carpeta,asig2Carpeta};
		
		for(String carpeta:carpetas) {
			File cFile = new File(carpeta);
//			comprobamos que el directorio no exista
			if (!cFile.exists()) {
//				si se crea correctamente el directorio
				if (cFile.mkdir()) {
					System.out.println(carpeta + " creado correctamente");
				}else {
					System.out.println("Error al crear " + carpeta);
				}
			}
		}
		
		for (String asigCarpeta:asigCarpetas) {
			String[] directorios = new String[] {asigCarpeta + "/" + fichero1,asigCarpeta + "/" + fichero2};
			for (String directorio:directorios) {		
				try {
					FileWriter cFile = new FileWriter(new File(directorio));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("Error al escribir los ficheros de evalucion");
				}
			}	
		}
		
	}
}
