package com.isf;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno alumno1 = new Alumno("pepe", "garcia", 3);
		Alumno alumno2 = new Alumno("pepa", "perez", 4);
		Alumno alumno3 = new Alumno("pepa", "perez", 4);
		
		Alumno alumnos[] = new Alumno[] {alumno1,alumno2,alumno3};

		for (int i = 0; i < alumnos.length; i++) {
			System.out.println(alumnos[i].toString());
		}
		
		if(alumno2.equals(alumno3)) {
			System.out.println("Los alumno2 y alumno3 son iguales.");
		}else {
			System.out.println("Los alumnos 2 y alumnos3 no son iguales.");
		}
		
	}

}
