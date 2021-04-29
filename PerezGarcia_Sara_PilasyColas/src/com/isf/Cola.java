package com.isf;

import java.util.ArrayList;

public class Cola extends ColeccionSimple {
	
	public Cola() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cola(ArrayList<Object> array) {
		super(array);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Object extraer() {
		// TODO Auto-generated method stub
		if(!estaVacia()) {
			Object o = array.get(0);
			array.remove(0);
			
			return o;
		}
		return new Object();
	}

}
