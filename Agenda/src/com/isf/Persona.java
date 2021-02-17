package com.isf;

public class Persona {
	private int tel;
	private String nombre;
	private String apellido1;
	private String dir;
	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Persona(int tel, String nombre) {
		super();
		this.tel = tel;
		this.nombre = nombre;
	}

	public Persona(int tel, String nombre, String apellido1, String dir) {
		super();
		this.tel = tel;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.dir = dir;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	@Override
	public String toString() {
		return "Persona [tel=" + tel + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", dir=" + dir + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido1 == null) ? 0 : apellido1.hashCode());
		result = prime * result + ((dir == null) ? 0 : dir.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + tel;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Persona other = (Persona) obj;
		if (apellido1 == null) {
			if (other.apellido1 != null)
				return false;
		} else if (!apellido1.equals(other.apellido1))
			return false;
		if (dir == null) {
			if (other.dir != null)
				return false;
		} else if (!dir.equals(other.dir))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (tel != other.tel)
			return false;
		return true;
	}
	public boolean equalsName(String string) {
		return nombre == string;
	}

}
