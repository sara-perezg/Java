package com.isf.newFichero;

public class Alumno {
	public String nombreApellidos;
	public String dni;
	public int tel;
	public String asignatura1;
	public double nota1;
	public String asignatura2;
	public double nota2;
	public double promedio = 0.0;
	
	public Alumno() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Alumno(String nombreApellidos, String dni, int tel, String asignatura1, double nota1, String asignatura2,
			double nota2) {
		super();
		this.nombreApellidos = nombreApellidos;
		this.dni = dni;
		this.tel = tel;
		this.asignatura1 = asignatura1;
		this.nota1 = nota1;
		this.asignatura2 = asignatura2;
		this.nota2 = nota2;
		
		setPromedio();
	}
	
	@Override
	public String toString() {
		return "Alumno [nombreApellidos=" + nombreApellidos + ", dni=" + dni + ", tel=" + tel + ", asignatura1="
				+ asignatura1 + ", nota1=" + nota1 + ", asignatura2=" + asignatura2 + ", nota2=" + nota2 + ", promedio="
				+ promedio + "]";
	}
	
	public void setPromedio() {
		promedio = (nota1 + nota2)/2;
	}
	
}
