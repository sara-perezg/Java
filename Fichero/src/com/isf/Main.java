package com.isf;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.FileWriter;

public class Main {

	public static void ejemploEscribeFichTexto(String nomFich,int i, double x, String str) throws IOException{
		
		PrintWriter out = null;
		
		try {
			// Abre el fichero
			out = new PrintWriter(new FileWriter(nomFich));
			// escribe los datos en el fichero
			out.println("Entero: "+i+" Real: "+ x);
			out.println("String: "+ str);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("There was an error");
		}finally {
			if(out != null)
				out.close();
		}
		
	}
	
	public static void generaListado(String nomFich, ArrayList<Alumno> listaAlumnos) throws IOException{
		PrintWriter out = null;
		
		try {
			out = new PrintWriter(new FileWriter(nomFich));
			for (Alumno a : listaAlumnos) {
				out.printf("%-25s DNI:%s Nota:%f%n", a.nombre,a.dni,a.nota);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("There was an error");
		}finally {
			if (out != null)
				out.close();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
		
		listaAlumnos.add(new Alumno("Pepe Garcia Hernandez", 123456789,5.0));
		listaAlumnos.add(new Alumno("Lolo Hernandez Garcia", 234567891,0.0));
		listaAlumnos.add(new Alumno("Manu Lopez Gomez", 345678901,10.0));
		
		
		try {
			ejemploEscribeFichTexto("fichero1.txt",11,22.2,"hola");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			generaListado("listadoAlumnos.txt", listaAlumnos);
		} catch (IOException e) {
			// TODO: handle exception
		}
	}

}
