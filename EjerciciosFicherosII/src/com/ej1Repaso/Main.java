package com.ej1Repaso;

import java.io.File;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myDir = "NuevoDirRepaso";
		String pathFile1 = myDir + "\\fichero1Repaso.txt";
		String pathFile2 = myDir + "\\fichero2Repaso.txt";
		String pathFileNewName = myDir + "\\fichero1RepasoNuevoNombre.txt";
		String pathFile3 = myDir + "\\fichero3Repaso.txt";
		
		File file1 = new File(pathFile1);
		File file2 = new File(pathFile2);
		
		try {
			boolean created = new File(myDir).mkdir();
			if (created) {
				System.out.println("Directorio creado con existo");
				try {
					if (file1.createNewFile() && file2.createNewFile()) {
						System.out.println("Ficheros creados correctamente");
					}
					File fileNewName = new File(pathFileNewName);
					file1.renameTo(fileNewName);
					System.out.println("Fichero 1 renombrado correctamente");
					
					File file3 = new File(pathFile3);
					if (file3.createNewFile()) {
						System.out.println("Archivo 3 creado correctamente");
					}
					if (file2.delete()) {
						System.out.println("Archivo 2 eliminado correctamente");
					}
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error en la creacion y eliminacion de archivos de los archivos");
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error en la creacion del directorio");
		}
	}

}
