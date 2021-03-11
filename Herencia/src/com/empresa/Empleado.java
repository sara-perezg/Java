package com.empresa;

public class Empleado {
	private String nombre;
	private String cedula;
	private int edad;
	private boolean casado;
	private double salario;
	
	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empleado(String nombre, String cedula, int edad, boolean casado, double salario) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.edad = edad;
		this.casado = casado;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [\nnombre=" + nombre + "\ncedula=" + cedula + "\nedad=" + edad + "\ncasado=" + casado
				+ "\nsalario=" + salario + "]";
	}

	public void aumento(double aumento) {
		salario +=  (salario * aumento/100);
	}
	
	public String clasificacion() {
		if(edad <= 21) return "principiante";
		else if (edad >= 22 && edad <= 35) return "intermedio";
		else 
			return "senior";
	}
}
