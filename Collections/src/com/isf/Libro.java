package com.isf;

import java.util.LinkedList;

public class Libro {

	private String isbn;
	private String titulo;
	private int yearEdicion;
	private LinkedList<String> personajes;
	private LinkedList<String> autores;
	
	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Libro(String isbn, String titulo, int yearEdicion, LinkedList<String> personajes,
			LinkedList<String> autores) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.yearEdicion = yearEdicion;
		this.personajes = personajes;
		this.autores = autores;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getYearEdicion() {
		return yearEdicion;
	}
	public void setYearEdicion(int yearEdicion) {
		this.yearEdicion = yearEdicion;
	}
	public LinkedList<String> getPersonajes() {
		return personajes;
	}
	public void setPersonajes(LinkedList<String> personajes) {
		this.personajes = personajes;
	}
	public LinkedList<String> getAutores() {
		return autores;
	}
	
	public void setAutores(LinkedList<String> autores) {
		this.autores = autores;
	}
	
	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", yearEdicion=" + yearEdicion + ", personajes="
				+ personajes + ", autores=" + autores + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autores == null) ? 0 : autores.hashCode());
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		result = prime * result + ((personajes == null) ? 0 : personajes.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		result = prime * result + yearEdicion;
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
		Libro other = (Libro) obj;
		if (autores == null) {
			if (other.autores != null)
				return false;
		} else if (!autores.equals(other.autores))
			return false;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		if (personajes == null) {
			if (other.personajes != null)
				return false;
		} else if (!personajes.equals(other.personajes))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		if (yearEdicion != other.yearEdicion)
			return false;
		return true;
	}
	
}
