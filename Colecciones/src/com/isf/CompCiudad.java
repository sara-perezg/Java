package com.isf;

import java.util.Comparator;
public class CompCiudad implements Comparator<Jugador>{

	@Override
	public int compare(Jugador o1, Jugador o2) {
		// TODO Auto-generated method stub
		int myInt = o1.ciudad.equalsIgnoreCase(o2.ciudad) ? 1 : 0;
		return myInt;
	}
	

}
