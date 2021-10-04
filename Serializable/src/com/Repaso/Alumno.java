package com.Repaso;

public class Alumno extends Persona{

	private static final long serialVersionUID = 4067709077765946499L;
	private int nota;

	public Alumno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Alumno(String nombre, String apellido1,int nota) {
		super(nombre, apellido1);
		// TODO Auto-generated constructor stub
		this.nota = nota;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Alumno [nota=" + nota + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
