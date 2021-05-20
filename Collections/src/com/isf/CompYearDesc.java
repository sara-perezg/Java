package com.isf;

import java.util.Comparator;

public class CompYearDesc implements Comparator<Libro> {

	@Override
	public int compare(Libro o1, Libro o2) {
		// TODO Auto-generated method stub
		if (o1.getYearEdicion() > o2.getYearEdicion()) {
			return -1;
		}
		if (o1.getYearEdicion() < o2.getYearEdicion()) {
			return 1;
		}
		return 0;
	}

	
}
