package com.ej3;

import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.StringBuffer;
public class Main {

	public static void crearArchivo(int n, String path) {
			
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < n; i++) {
				sb.append(i);
			}
			oos.writeObject(sb);
			oos.close();
			System.out.println("Archivo creado correctamente");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		String path = "miFicheroBinario.dat";
		
		crearArchivo(7,path);
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
			System.out.println(ois.readObject());
			ois.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
