package com.ej3;

import java.util.ArrayList;
public class JefeTienda extends Empleado {
	private int codigoTienda;
	private ArrayList<String> nombresVendedores;
	
	public JefeTienda() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JefeTienda(String nombre, String nacimiento, float sueldo, int codigoTienda, ArrayList<String> nombresVendedores) {
		super(nombre, nacimiento,  3, sueldo);
		// TODO Auto-generated constructor stub
		this.codigoTienda = codigoTienda;
		this.nombresVendedores = nombresVendedores;
	}
	public int getCodigoTienda() {
		return codigoTienda;
	}
	public void setCodigoTienda(int codigoTienda) {
		this.codigoTienda = codigoTienda;
	}
	public ArrayList<String> getNombresVendedores() {
		return nombresVendedores;
	}
	public void setNombresVendedores(ArrayList<String> nombresVendedores) {
		this.nombresVendedores = nombresVendedores;
	}
	@Override
	public String toString() {
		return "JefeTienda [codigoTienda=" + codigoTienda + ", nombresVendedores=" + nombresVendedores + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		JefeTienda other = (JefeTienda) obj;
		if (codigoTienda != other.codigoTienda)
			return false;
		if (nombresVendedores == null) {
			if (other.nombresVendedores != null)
				return false;
		} else if (!nombresVendedores.equals(other.nombresVendedores))
			return false;
		return true;
	}
	
	public void increaseSueldo() {
		this.setSueldo(this.getSueldo()*1.15); //aumentamos sueldo
		this.setSueldo(this.getSueldo()*0.97); //quitamos impuestos
	}
	
}
