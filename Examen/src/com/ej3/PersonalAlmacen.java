package com.ej3;

public class PersonalAlmacen extends Empleado {
	private int codigoAlmacen;

	public PersonalAlmacen() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonalAlmacen(String nombre, String nacimiento, float sueldo,int codigoAlmacen) {
		super(nombre, nacimiento, 3, sueldo);
		// TODO Auto-generated constructor stub
		this.codigoAlmacen = codigoAlmacen;
	}

	public int getCodigoAlmacen() {
		return codigoAlmacen;
	}

	public void setCodigoAlmacen(int codigoAlmacen) {
		this.codigoAlmacen = codigoAlmacen;
	}

	@Override
	public String toString() {
		return "PersonalAlmacen [codigoAlmacen=" + codigoAlmacen + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonalAlmacen other = (PersonalAlmacen) obj;
		if (codigoAlmacen != other.codigoAlmacen)
			return false;
		return true;
	}
	
	public void increaseSueldo() {
		this.setSueldo(this.getSueldo()*1.1); //aumentamos sueldo
		this.setSueldo(this.getSueldo()*0.98); //quitamos impuestos
	}
	
}
