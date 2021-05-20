package com.isf;

public class PartidoFutbol {

	private String equipoLocal;
	private String equipoVisitante;
	private int golesLocal;
	private int golesVisitante;
	public PartidoFutbol() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PartidoFutbol(String equipoLocal, String equipoVisitante, int golesLocal, int golesVisitante) {
		super();
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
		this.golesLocal = golesLocal;
		this.golesVisitante = golesVisitante;
	}
	public String getEquipoLocal() {
		return equipoLocal;
	}
	public void setEquipoLocal(String equipoLocal) {
		this.equipoLocal = equipoLocal;
	}
	public String getEquipoVisitante() {
		return equipoVisitante;
	}
	public void setEquipoVisitante(String equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}
	public int getGolesLocal() {
		return golesLocal;
	}
	public void setGolesLocal(int golesLocal) {
		this.golesLocal = golesLocal;
	}
	public int getGolesVisitante() {
		return golesVisitante;
	}
	public void setGolesVisitante(int golesVisitante) {
		this.golesVisitante = golesVisitante;
	}
	@Override
	public String toString() {
		return "PartidoFutbol [equipoLocal=" + equipoLocal + ", equipoVisitante=" + equipoVisitante + ", golesLocal="
				+ golesLocal + ", golesVisitante=" + golesVisitante + "]";
	}
	
	
}
