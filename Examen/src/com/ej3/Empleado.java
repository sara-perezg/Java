package com.ej3;

public class Empleado {
	private String nombre;
	private String nacimiento;
	private int categoria;
	private double sueldo;
	
	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empleado(String nombre, String nacimiento, int categoria, double sueldo) {
		super();
		this.nombre = nombre;
		this.nacimiento = nacimiento;
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

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double d) {
		this.sueldo = d;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", nacimiento=" + nacimiento + ", categoria=" + categoria + ", sueldo="
				+ sueldo + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (categoria != other.categoria)
			return false;
		if (nacimiento == null) {
			if (other.nacimiento != null)
				return false;
		} else if (!nacimiento.equals(other.nacimiento))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (Double.doubleToLongBits(sueldo) != Double.doubleToLongBits(other.sueldo))
			return false;
		return true;
	}
	
	
}
