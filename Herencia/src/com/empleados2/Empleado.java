package com.empleados2;

public class Empleado {
	private String nombre;
	private String nacimiento;
	private String puesto;
	private int categoria;
	private double sueldo;
	
	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Empleado(String nombre, String nacimiento, String puesto, int categoria, double sueldo) {
		super();
		this.nombre = nombre;
		this.nacimiento = nacimiento;
		this.puesto = puesto;
		this.categoria = categoria;
		this.sueldo = sueldo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNacimiento() {
		return nacimiento;
	}
	
	public void setNacimiento(String nacimiento) {
		this.nacimiento = nacimiento;
	}
	
	public String getPuesto() {
		return puesto;
	}
	
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	public int getCategoria() {
		return categoria;
	}
	
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	
	public double getSueldo() {
		return sueldo;
	}
	
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", nacimiento=" + nacimiento + ", puesto=" + puesto + ", categoria="
				+ categoria + ", sueldo=" + sueldo + "]";
	}
	
	
}
