package com.isf;

import java.util.ArrayList;
import java.util.Iterator;
public class Ejercicio1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Aprendiendo");
		list.add("a");
		list.add("programar");
		list.add("en");
		list.add("Java");
		list.add("con");
		list.add("ArrayList");
		
//		forma 1
		for (String word : list) {
			System.out.println(word);
		}
		System.out.println("------------");
//		forma 2
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("------------");
//		forma 3
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
