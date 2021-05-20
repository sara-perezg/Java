package com.isf;

import java.util.Comparator;
public class CompTituloAsc implements Comparator<Libro> {

	@Override
	public int compare(Libro o1, Libro o2) {
		return o1.getTitulo().compareToIgnoreCase(o2.getTitulo());
	}
}
