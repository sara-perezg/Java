package com.isf;

public class Jugador {
	public String nombre;
	public int edad;
	public String nombreEquipo;
	public int numCanastasIntroducidas;
	public String ciudad;
	
	public Jugador() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Jugador(String nombre, int edad, String nombreEquipo, int numCanastasIntroducidas, String ciudad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.nombreEquipo = nombreEquipo;
		this.numCanastasIntroducidas = numCanastasIntroducidas;
		this.ciudad = ciudad;
	}
	
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", edad=" + edad + ", nombreEquipo=" + nombreEquipo
				+ ", numCanastasIntroducidas=" + numCanastasIntroducidas + ", ciudad=" + ciudad + "]\n";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ciudad == null) ? 0 : ciudad.hashCode());
		result = prime * result + edad;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((nombreEquipo == null) ? 0 : nombreEquipo.hashCode());
		result = prime * result + numCanastasIntroducidas;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		if (ciudad == null) {
			if (other.ciudad != null)
				return false;
		} else if (!ciudad.equals(other.ciudad))
			return false;
		if (edad != other.edad)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (nombreEquipo == null) {
			if (other.nombreEquipo != null)
				return false;
		} else if (!nombreEquipo.equals(other.nombreEquipo))
			return false;
		if (numCanastasIntroducidas != other.numCanastasIntroducidas)
			return false;
		return true;
	}
	
}
