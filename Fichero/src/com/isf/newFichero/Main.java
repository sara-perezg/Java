package com.isf.newFichero;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
			
		alumnos.add(new Alumno("al1 ap1 ap1","000000A",600000000,"BBDD", 6.3,"prog",9));
		alumnos.add(new Alumno("al2 ap2 ap2","000000B",600000001,"BBDD", 7.3,"prog",6));
		
		try {
			FileWriter writer = new FileWriter(new File("alumnos.txt"));
			BufferedWriter bw = new BufferedWriter(writer);
			
			for (Alumno a : alumnos) {
				String datos = String.format("%s\n%s\n%d\n%s\n%f\n%s\n%f\n%f\n",
						a.nombreApellidos, a.dni, a.tel,a.asignatura1,a.nota1,a.asignatura2, a.nota2, a.promedio);
				System.out.println(datos);
				bw.write(datos);
			}
			bw.close();
			writer.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error intentando crear archivo");
		}
		
	}
}
