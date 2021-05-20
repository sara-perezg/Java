package com.isf;

public class Alumno extends Persona{
	private int nota;

	public Alumno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Alumno(String name, String lastName, int age,int nota) {
		super(name, lastName, age);
		// TODO Auto-generated constructor stub
		this.nota = nota;
	}
	public Alumno(String name, String lastName) {
		super(name, lastName);
		// TODO Auto-generated constructor stub
	}
	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Alumno [nota=" + nota + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + nota;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		if (nota != other.nota)
			return false;
		return true;
	}
	
	
}
