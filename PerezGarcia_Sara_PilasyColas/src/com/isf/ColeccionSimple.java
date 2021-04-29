package com.isf;

import java.util.ArrayList;
public abstract class ColeccionSimple {
	
//	inicializamos el array smp a un array vacio
	public ArrayList<Object> array = new ArrayList<Object>(); 
	
	
	public ColeccionSimple() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ColeccionSimple(ArrayList<Object> array) {
		super();
		this.array = array;
	}

	public boolean estaVacia() {
		return array.isEmpty();
	}
	
//	metodo abstracto que se va a sobreescribir en las clases hijas
	public abstract Object extraer();
	
	public Object primero() {
		if (!estaVacia()) {
			return array.get(0);
		}
		return new Object();
	}
	
	public void add(Object o) {
		array.add(o);
	}
	
	public String toString() {
		return array.toString();
	}
	
//	conseguimos directamente el tamaño de nuestro array
	public int size() {
		if(!estaVacia()) {
			return array.size();
		}
		return -1;
	}
}
