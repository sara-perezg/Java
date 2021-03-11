package com.ej3;

public class Vendedor extends Empleado{
	private int codigoVendedor;
	private int numVentas;

	public Vendedor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vendedor(String nombre, String nacimiento,float sueldo, int codigoVendedor, int numVentas) {
		super(nombre, nacimiento, 2, sueldo);
		this.codigoVendedor = codigoVendedor;
		this.numVentas = numVentas;
		
		if(numVentas >50) {
			this.setSueldo(this.getSueldo()+100);
			this.numVentas = 0;
		}
	}


	public int getCodigoVendedor() {
		return codigoVendedor;
	}

	public void setCodigoVendedor(int codigoVendedor) {
		this.codigoVendedor = codigoVendedor;
	}

	public int getNumVentas() {
		return numVentas;
	}

	public void setNumVentas(int numVentas) {
		this.numVentas = numVentas;
	}

	@Override
	public String toString() {
		return "Vendedor [codigoVendedor=" + codigoVendedor + ", numVentas=" + numVentas + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vendedor other = (Vendedor) obj;
		if (codigoVendedor != other.codigoVendedor)
			return false;
		if (numVentas != other.numVentas)
			return false;
		return true;
	}
	
	public void increaseSueldo() {
		this.setSueldo(this.getSueldo()*1.2); //aumentamos sueldo
		this.setSueldo(this.getSueldo()*0.95); //quitamos impuestos
	}
	
}
