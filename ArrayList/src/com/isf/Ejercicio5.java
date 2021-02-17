package com.isf;

import java.util.ArrayList;
import java.util.Iterator;
public class Ejercicio5 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("APRENDIENDO");
		list.add("A");
		list.add("USAR");
		list.add("ITERATOR");
		list.add("EN JAVA");
		list.add("!");
		
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());;
		}
	}
}
