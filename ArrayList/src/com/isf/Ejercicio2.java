package com.isf;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.Iterator;
public class Ejercicio2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Aprendiendo");
		list.add("a");
		list.add("programar");
		list.add("en");
		list.add("Java");
		list.add("con");
		list.add("ArrayList");
		
//		System.out.println("------------");
//		forma 2
//		for (int i = 0; i < list.size(); i++) {
//			if (i%2 == 0) {
//				System.out.println(list.get(i));
//			}
//		}
		Iterator<String> it = list.iterator();
		int pos = 0;
		while (it.hasNext()) {
			if (pos%2 == 0) {
				System.out.println(it.next());
			}else{
				it.next();
			}
			pos++;
		}
	}
}
