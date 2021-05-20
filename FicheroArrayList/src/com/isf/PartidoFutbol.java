package com.isf;

public class PartidoFutbol {
	private String nombreEquipoLocal;
	private String nombreEquipoVisitante;
	private int golesEquipoLocal;
	private int golesEquipoVisitante;
	
	public PartidoFutbol() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PartidoFutbol(String nombreEquipoLocal, String nombreEquipoVisitante, int golesEquipoLocal,
			int golesEquipoVisitante) {
		super();
		this.nombreEquipoLocal = nombreEquipoLocal;
		this.nombreEquipoVisitante = nombreEquipoVisitante;
		this.golesEquipoLocal = golesEquipoLocal;
		this.golesEquipoVisitante = golesEquipoVisitante;
	}
	public String getNombreEquipoLocal() {
		return nombreEquipoLocal;
	}
	public void setNombreEquipoLocal(String nombreEquipoLocal) {
		this.nombreEquipoLocal = nombreEquipoLocal;
	}
	public String getNombreEquipoVisitante() {
		return nombreEquipoVisitante;
	}
	public void setNombreEquipoVisitante(String nombreEquipoVisitante) {
		this.nombreEquipoVisitante = nombreEquipoVisitante;
	}
	public int getGolesEquipoLocal() {
		return golesEquipoLocal;
	}
	public void setGolesEquipoLocal(int golesEquipoLocal) {
		this.golesEquipoLocal = golesEquipoLocal;
	}
	public int getGolesEquipoVisitante() {
		return golesEquipoVisitante;
	}
	public void setGolesEquipoVisitante(int golesEquipoVisitante) {
		this.golesEquipoVisitante = golesEquipoVisitante;
	}
	@Override
	public String toString() {
		return "PartidoFutbol [nombreEquipoLocal=" + nombreEquipoLocal + ", nombreEquipoVisitante="
				+ nombreEquipoVisitante + ", golesEquipoLocal=" + golesEquipoLocal + ", golesEquipoVisitante="
				+ golesEquipoVisitante + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + golesEquipoLocal;
		result = prime * result + golesEquipoVisitante;
		result = prime * result + ((nombreEquipoLocal == null) ? 0 : nombreEquipoLocal.hashCode());
		result = prime * result + ((nombreEquipoVisitante == null) ? 0 : nombreEquipoVisitante.hashCode());
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
		PartidoFutbol other = (PartidoFutbol) obj;
		if (golesEquipoLocal != other.golesEquipoLocal)
			return false;
		if (golesEquipoVisitante != other.golesEquipoVisitante)
			return false;
		if (nombreEquipoLocal == null) {
			if (other.nombreEquipoLocal != null)
				return false;
		} else if (!nombreEquipoLocal.equals(other.nombreEquipoLocal))
			return false;
		if (nombreEquipoVisitante == null) {
			if (other.nombreEquipoVisitante != null)
				return false;
		} else if (!nombreEquipoVisitante.equals(other.nombreEquipoVisitante))
			return false;
		return true;
	}
	
	
}
