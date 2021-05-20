package com.ej3Repaso;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.StringBuffer;
public class Main {

	public static void createFichero(int n, String path) throws IOException{
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < n; i++) {
			sb.append(i);
		}
		oos.writeObject(sb);
			
		oos.close();
	}
	public static void main(String[] args) {
		
		String path = "misNumeros.txt";
		int n = 5;
		try {
			createFichero(n,path);
		} catch (IOException e) {			
			System.out.println("Error en la creacion del fichero");
		}
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
			System.out.println(ois.readObject());
			ois.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error en la lectura del archivo");
		}
	}
}
