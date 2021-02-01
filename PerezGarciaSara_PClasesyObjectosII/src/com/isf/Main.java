package com.isf;

public class Main {

	public static void main(String[] args) {
				
		// generamos los objetos de clase Alumno
		Alumno alumno1 = new Alumno("pepe", "garcia", 13);
		Alumno alumno2 = new Alumno("pepa", "perez", 14);
		Alumno alumno3 = new Alumno("pepa", "perez", 14);
		
//		añadimos las notas a los alumnos
		alumno1.setNota(5);
		alumno2.setNota(5);
		alumno3.setNota(5);
		
		Alumno alumnos[] = new Alumno[] {alumno1,alumno2,alumno3};

//		imprimimos por pantalla los valores que tienen sus atributos con toString()
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println(alumnos[i].toString());
		}
		
//		comprobamos que los objetos alumno2 y alumno3 sean iguales
		if(alumno2.equals(alumno3)) {
			System.out.println("Los alumno2 y alumno3 son iguales.");
		}else {
			System.out.println("Los alumnos 2 y alumnos3 no son iguales.");
		}
		
	}

}
