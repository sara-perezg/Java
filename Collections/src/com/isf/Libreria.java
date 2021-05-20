package com.isf;

import java.util.Iterator;
import java.util.LinkedList;
public class Libreria {
	static LinkedList<Libro> libreria;
	
	
	public void addLibro(Libro libro) {
		libreria.add(libro);
	}
	
	public void showLibreria(LinkedList<Libro> libreria) {
		System.out.println(libreria);
	}
	
	public void removeLibroByISBN(String isbn, LinkedList<Libro> libreria) {
		
		Iterator<Libro> iterator = libreria.iterator();
		while (iterator.hasNext()) {
			Libro libro = (Libro) iterator.next();
			if (libro.getIsbn().equals(isbn)) {
				
			}
		}
	}
}
