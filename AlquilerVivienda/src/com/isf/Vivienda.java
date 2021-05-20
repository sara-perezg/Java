package com.isf;

public class Vivienda {
	private int codVivienda;
	private int numHab;
	private String dir;
	private double precio;
	
	public Vivienda() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Vivienda(int codVivienda, int numHab, String dir, double precio) {
		super();
		this.codVivienda = codVivienda;
		this.numHab = numHab;
		this.dir = dir;
		this.precio = precio;
	}
	
	public int getCodVivienda() {
		return codVivienda;
	}
	
	public void setCodVivienda(int codVivienda) {
		this.codVivienda = codVivienda;
	}
	
	public int getNumHab() {
		return numHab;
	}
	
	public void setNumHab(int numHab) {
		this.numHab = numHab;
	}
	
	public String getDir() {
		return dir;
	}
	
	public void setDir(String dir) {
		this.dir = dir;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return "Vivienda [codVivienda=" + codVivienda + ", numHab=" + numHab + ", dir=" + dir + ", precio=" + precio
				+ "]";
	}
	
	
}
