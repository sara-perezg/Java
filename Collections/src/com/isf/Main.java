package com.isf;

import java.util.LinkedList;
public class Main {
	
	public static void main(String[] args) {
		
		Libreria libreria = new Libreria();
		LinkedList<String> autores = new LinkedList<String>();
		autores.add("autor1");
		autores.add("autor2");

		LinkedList<String> personajes = new LinkedList<String>();
		personajes.add("personajes1");
		personajes.add("personajes2");
		
		Libro l1 = new Libro("isbn1", "titulo1", 2000,personajes,autores);
		
		libreria.addLibro(l1);
		
		libreria.showLibreria();
		
		Libro l2 = new Libro("isbn2", "titulo2", 1669,personajes,autores);
		libreria.addLibro(l2);
		libreria.showLibreria();
	
		libreria.sortByYearAsc();

		libreria.removeLibroByTitulo("titulo2");
		libreria.showLibreria();
		
		libreria.removeLibroByISBN("isbn1");
		libreria.showLibreria();
		
	}
}
