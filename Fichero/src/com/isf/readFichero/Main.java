package com.isf.readFichero;
import com.isf.newFichero.Alumno;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Alumno> alumnoAL = new ArrayList<Alumno>();
		String fileName = "alumnos.txt";
		File file = new File(fileName);
		Scanner scanner;
		String dataString = "";
		try {
			scanner = new Scanner(file);
					
			while(scanner.hasNextLine()) {
				dataString += scanner.nextLine() + ";";
			}
			
			dataString = dataString.replace(',', '.');
			String[] alumnos = dataString.split(">");
			
			for (int i = 1; i < alumnos.length; i++) {
				String alumno = alumnos[i];
				String[] datosAlumno = alumno.split(";");
				String nombre = datosAlumno[0];
				String dni = datosAlumno[1];
				Integer tel = Integer.parseInt(datosAlumno[2]);
				String asig1 = datosAlumno[3];
				double nota1 = Double.parseDouble(datosAlumno[4]);
				String asig2 = datosAlumno[5];
				double nota2 = Double.parseDouble(datosAlumno[6]);
				
				Alumno al = new Alumno(nombre,dni,tel,asig1,nota1,asig2,nota2);
				alumnoAL.add(al);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error de lectura del archivo "+ fileName);
		}finally {
			System.out.println("Archivo leido correctamente");
		}
		
		try {
			for (Alumno a : alumnoAL) {
				String nombre = a.nombreApellidos.replaceAll(" ", "");
				FileWriter writer = new FileWriter(new File(nombre + ".txt"));
				BufferedWriter bw = new BufferedWriter(writer);
				String datos = String.format(">%s\n%s\n%d\n%s\n%f\n%s\n%f\n%f\n",
						a.nombreApellidos, a.dni, a.tel,a.asignatura1,a.nota1,a.asignatura2, a.nota2, a.promedio);
				System.out.println(datos);
				bw.write(datos);
				bw.close();
				writer.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error intentando crear archivo");
		}
		
	}
}
