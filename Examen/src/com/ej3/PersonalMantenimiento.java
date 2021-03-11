package com.ej3;

import java.util.ArrayList;
public class PersonalMantenimiento extends Empleado {
	private ArrayList<String> labores;

	public PersonalMantenimiento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonalMantenimiento(String nombre, String nacimiento, float sueldo, ArrayList<String> labores) {
		super(nombre, nacimiento, 4, sueldo);
		// TODO Auto-generated constructor stub
		this.labores = labores;
	}

	public ArrayList<String> getLabores() {
		return labores;
	}

	public void setLabores(ArrayList<String> labores) {
		this.labores = labores;
	}

	@Override
	public String toString() {
		return "PersonalMantenimiento [labores=" + labores + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonalMantenimiento other = (PersonalMantenimiento) obj;
		if (labores == null) {
			if (other.labores != null)
				return false;
		} else if (!labores.equals(other.labores))
			return false;
		return true;
	}
	
	public void increaseSueldo() {
		this.setSueldo(this.getSueldo()*1.05); //aumentamos sueldo
		this.setSueldo(this.getSueldo()*0.99); //quitamos impuestos
	}
}
