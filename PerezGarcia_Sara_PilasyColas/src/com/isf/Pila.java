package com.isf;

import java.util.ArrayList;

public class Pila extends ColeccionSimple {
	
	public Pila() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pila(ArrayList<Object> array) {
		super(array);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object extraer() {
		// TODO Auto-generated method stub
		if(!estaVacia()) {
			int last = array.size()-1;
			Object o = array.get(last);
			array.remove(last);
			
			return o;
		}
		return new Object();
	}
}
