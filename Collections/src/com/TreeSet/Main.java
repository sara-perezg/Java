package com.TreeSet;

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
	}

}
