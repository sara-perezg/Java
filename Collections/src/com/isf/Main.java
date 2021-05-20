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
		
		libreria.addLibro(new Libro("isbn1", "Antonia", 2000,personajes,autores));
		libreria.addLibro(new Libro("isbn2", "Filomena", 1669,personajes,autores));
		libreria.addLibro(new Libro("isbn3", "Ruguberta", 1838,personajes,autores));
		libreria.addLibro(new Libro("isbn4", "Esmenegilda", 1838,personajes,autores));

	
		System.out.println("Libreria ascendente");
		libreria.sortByYearAsc();
		libreria.showLibreria();

		System.out.println("Libreria descendente");
		libreria.sortByYearDesc();
		libreria.showLibreria();
		
		System.out.println("Libreria alfabeticamente ascendente");
		libreria.sortByTituloAsc();
		libreria.showLibreria();

		System.out.println("Libreria alfabeticamente descendente");
		libreria.sortByTituloDesc();
		libreria.showLibreria();
		
		System.out.println("Libreria por año y despues por alfabeticamente descendente");
		libreria.sortByYearTitulo();
		libreria.showLibreria();
		
		libreria.removeLibroByTitulo("Ruguberta");
		libreria.showLibreria();
		
		libreria.removeLibroByISBN("isbn1");
		libreria.showLibreria();
		
	}
}
