package com.isf;

import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.File;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		String path = "alumnos.dat";
		try {
			HashMap<Integer,Alumno> alumnos = new HashMap<Integer, Alumno>();
			alumnos.put(1, new Alumno("Sara","Pere"));
			alumnos.put(2, new Alumno("Ester","Pere"));
			alumnos.put(3, new Alumno("Xiang","Zhou"));
			alumnos.put(4, new Alumno("Yahel","Pere"));
			
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
			oos.writeObject(alumnos);
			oos.close();
			
			try {
				
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
				System.out.println(ois.readObject());
				ois.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
