package com.isf;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Collections;
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
	
	public void addPrimero(Libro libro) {
		libreria.add(0, libro);
	}
	
	public void addEnd(Libro libro) {
		libreria.add(libro);
	}
	
	public Libro getFirst() {
		return libreria.get(0);
	}
	
	public Libro getLast() {
		return libreria.get(libreria.size()-1);
	}
	
	public void sortByYearAsc() {
		Collections.sort(libreria);
		showLibreria();
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
