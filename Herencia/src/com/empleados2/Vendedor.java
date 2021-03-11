package com.empleados2;

public class Vendedor extends Empleado{
	private int categoria = 2;
	private String codigoVendedor;
	private int nVentas;
	
	
	
	public Vendedor() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Vendedor(String nombre, String nacimiento, String puesto, int categoria, double sueldo) {
		super(nombre, nacimiento, puesto, categoria, sueldo);
		// TODO Auto-generated constructor stub
	}

	public Vendedor(String nombre, String nacimiento, String puesto, int categoria, double sueldo, int categoria2,
			String codigoVendedor, int nVentas) {
		super(nombre, nacimiento, puesto, categoria, sueldo);
		categoria = categoria2;
		this.codigoVendedor = codigoVendedor;
		this.nVentas = nVentas;
	}


	public int getCategoria() {
		return categoria;
	}



	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}



	public String getCodigoVendedor() {
		return codigoVendedor;
	}



	public void setCodigoVendedor(String codigoVendedor) {
		this.codigoVendedor = codigoVendedor;
	}



	public int getnVentas() {
		return nVentas;
	}



	public void setnVentas(int nVentas) {
		this.nVentas = nVentas;
	}



	@Override
	public String toString() {
		return "Vendedor [categoria=" + categoria + ", codigoVendedor=" + codigoVendedor + ", nVentas=" + nVentas
				+ ", toString()=" + super.toString() + "]";
	}



	public void aumentoVentas() {
		if(nVentas >50) {
			super.setSueldo(super.getSueldo()+100);
		}
	}
}
