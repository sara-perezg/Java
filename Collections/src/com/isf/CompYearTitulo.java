package com.isf;

import java.util.Comparator;
public class CompYearTitulo implements Comparator<Libro> {

	@Override
	public int compare(Libro o1, Libro o2) {
		
		if (o1.getYearEdicion() > o2.getYearEdicion()) {
			return 1;
		}
		if (o1.getYearEdicion()< o2.getYearEdicion()) {
			return -1;
		}
		return o1.getTitulo().compareToIgnoreCase(o2.getTitulo());
		
	}

}
