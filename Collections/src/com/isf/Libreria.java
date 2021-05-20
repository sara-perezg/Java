package com.isf;

import java.util.Iterator;
import java.util.LinkedList;
public class Libreria {
	LinkedList<Libro> libreria = new LinkedList<Libro>();
	
	public Libreria() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Libreria(LinkedList<Libro> libreria) {
		super();
		this.libreria = libreria;
	}


	public void addLibro(Libro libro) {
		libreria.add(libro);
	}
	
	public void showLibreria(LinkedList<Libro> libreria) {
		System.out.println(libreria);
	}
	
	public void removeLibroByISBN(String isbn) {
		Iterator<Libro> iterator = libreria.iterator();
		while (iterator.hasNext()) {
			Libro libro = (Libro) iterator.next();
			if (libro.getIsbn().equals(isbn)) {
				iterator.remove();
			}
		}
	}
	public void removeLibroByTitulo(String titulo) {
		Iterator<Libro> iterator = libreria.iterator();
		while (iterator.hasNext()) {
			Libro libro = (Libro) iterator.next();
			if (libro.getTitulo().equals(titulo)) {
				iterator.remove();
			}
		}
	}
	
	public void showLibreria() {
		System.out.println(libreria);
	}
	
	public int size() {
		return libreria.size();
	}
}
