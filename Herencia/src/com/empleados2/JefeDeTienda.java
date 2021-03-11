package com.empleados2;

import java.util.ArrayList;
public class JefeDeTienda extends Empleado {

	private int categoria = 1;
	private String codigoTienda;
	private ArrayList<String> vendedores;
	
	public JefeDeTienda() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JefeDeTienda(String nombre, String nacimiento, String puesto, int categoria, double sueldo) {
		super(nombre, nacimiento, puesto, categoria, sueldo);
		// TODO Auto-generated constructor stub
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	public String getCodigoTienda() {
		return codigoTienda;
	}
	public void setCodigoTienda(String codigoTienda) {
		this.codigoTienda = codigoTienda;
	}
	public ArrayList<String> getVendedores() {
		return vendedores;
	}
	public void setVendedores(ArrayList<String> vendedores) {
		this.vendedores = vendedores;
	}
	
	@Override
	public String toString() {
		return "JefeDeTienda [categoria=" + categoria + ", codigoTienda=" + codigoTienda + ", vendedores=" + vendedores
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
