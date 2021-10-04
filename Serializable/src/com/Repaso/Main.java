package com.Repaso;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Alumno al1 = new Alumno("sara","perez",4);
		Alumno al2 = new Alumno("xiang","perez",4);
		Alumno al3 = new Alumno("ester","perez",4);
		Alumno al4 = new Alumno("luna","perez",4);

		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		alumnos.add(al1);
		alumnos.add(al2);
		alumnos.add(al3);
		alumnos.add(al4);
		String path = "alumnosRepaso.dat";
		
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(path));
			
			oos.writeObject(alumnos);

			System.out.println("Archivo creado correctamente");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error de escritura");
		}finally {
			try {
				oos.close();		
				System.out.println("Archivo cerrado correctamente");
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println("Error al cerrar el archivo");
			}
		}
		
		
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(path));
		
			ArrayList<Alumno> alumnosLeidos = (ArrayList<Alumno>) ois.readObject();
			for (int i = 0; i < alumnosLeidos.size(); i++) {
				System.out.println(alumnosLeidos);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("El archivo no se ha encontrado");
		}catch(Exception e3){
			System.out.println("Error de lectura");
		}finally {
			
			try {
				ois.close();
				System.out.println("Archivo cerrado correctamente");
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println("Error al cerrar el archivo");
			}
		}
		
		
	}

}
