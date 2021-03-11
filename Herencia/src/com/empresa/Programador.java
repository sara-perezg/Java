package com.empresa;

public class Programador extends Empleado{
	private int lineasDeCodigoPorHora;
	private String lenguajeDominante;
	
	public Programador() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Programador(int lineasDeCodigoPorHora, String lenguajeDominante) {
		super();
		this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
		this.lenguajeDominante = lenguajeDominante;
	}
	
	public Programador(String nombre, String cedula, int edad, boolean casado, int sueldo, int lineasDeCodigoPorHora, String lenguajeDominante) {
		// TODO Auto-generated constructor stub
		super(nombre,cedula,edad,casado,sueldo);
		this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
		this.lenguajeDominante = lenguajeDominante;
	}
	public int getLineasDeCodigoPorHora() {
		return lineasDeCodigoPorHora;
	}
	public void setLineasDeCodigoPorHora(int lineasDeCodigoPorHora) {
		this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
	}
	public String getLenguajeDominante() {
		return lenguajeDominante;
	}
	public void setLenguajeDominante(String lenguajeDominante) {
		this.lenguajeDominante = lenguajeDominante;
	}
	@Override
	public String toString() {
		return super.toString() + "-> Programador [lineasDeCodigoPorHora=" + lineasDeCodigoPorHora + ", lenguajeDominante="
				+ lenguajeDominante + "]";
	}
	
}
