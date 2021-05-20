package com.TreeSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> myTree = new TreeSet<String>();
		
		myTree.add("hola");
		myTree.add("adios");
		myTree.add("que");
		myTree.add("tal");
		
		System.out.println(myTree);
		
		myTree.clear();
		System.out.println(myTree);
		
		
		HashSet<String> myHash = new HashSet<String>();
		
		myHash.add("hola");
		myHash.add("hola");
		myHash.add("adios");
		myHash.add("que");
		myHash.add("tal");
		
		System.out.println(myHash);
		
		List<String> myList = new ArrayList<String>(myHash);
		Collections.sort(myList);
		System.out.println(myList);
		
	}

}
