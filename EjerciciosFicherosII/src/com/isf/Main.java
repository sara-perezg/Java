package com.isf;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myDir = "NUEVODIR";
		String path1 = myDir + "\\fichero1.txt";
		String path2 = myDir + "\\fichero2.txt";
		try {
			boolean created = (new File(myDir)).mkdir();
			if (created) {
				System.out.println("Directorio creado con existo");
			}
			try {
				File file1 = new File(path1);
				File file2 = new File(path2);
				String newName = myDir + "\\fichero1nuevo.txt";
				if (file1.createNewFile()&& file2.createNewFile()) {
					System.out.println("Ficheros creados correctamente!");
				}
				File file3 = new File(newName);
				boolean created1 = file1.renameTo(file3);
				if (created1) {
					System.out.println("Archivo renombrado correctamente");
				}
				
//				fos.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
