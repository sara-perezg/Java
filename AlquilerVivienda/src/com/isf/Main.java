package com.isf;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Main {

	public static Queue<Vivienda> addNew(Queue<Vivienda> viviendas){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduzca el codigo de la vivienda:");
		int codigo = input.nextInt();
		System.out.println("Introduzca la categoria:");
		int cat = input.nextInt();
		input.nextLine();
		System.out.println("Introduzca la direccion:");
		String dir = input.nextLine();
		System.out.print("Introduzca el precio de alquiler:");
		double precio = Double.parseDouble(input.nextLine());
//		input.close();
		Vivienda vivienda = new Vivienda(codigo,cat,dir,precio);
		viviendas.add(vivienda);
		return viviendas;
	}
	
	public static void show(Queue<Vivienda> viviendas) {
		for(Vivienda vivienda : viviendas) {
			System.out.println(vivienda.toString());
		}
	}
	
	public static void getViviendas(int numHab, double precio, Queue<Vivienda> viviendas){
		boolean notFound = true;
		for (Vivienda vivienda : viviendas) {
			if (vivienda.getNumHab() >= numHab && vivienda.getPrecio() <= precio) {
				System.out.println(vivienda);
				notFound = false;
			}
		}
		if(notFound) {
			System.out.println("No existen viviendas con esas caracteristicas");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue viviendas = new LinkedList<Vivienda>();
		viviendas.add(new Vivienda(1,2,"mi dir", 4));
		viviendas.add(new Vivienda(2,3,"mi dir", 5));
		Scanner input = new Scanner(System.in);
		int control = 0;
		do {
			System.out.println("1) Introduce una vivienda"
					+ "\n2) Enseñar la viviendas"
					+ "\n3) Consultar por precio de alquiler y categoria"
					+ "\n4) Borrar"
					+ "\n5) Salir");
			System.out.print("Introduce una opcion: ");
			control = input.nextInt();
			switch (control) {
			case 1:
				viviendas = addNew(viviendas);
				break;
			case 2:
				show(viviendas);
				break;
			case 3:
				System.out.println("Introduce el numero de habitaciones:");
				int numHab = input.nextInt();
				System.out.println("Introduce el precio:");
				double precio = input.nextDouble();
				getViviendas(numHab, precio, viviendas);
				break;
			case 4:
				viviendas.clear();
				System.out.println("Viviendas borradas correctamente.");
				break;
			}
		} while (control != 5);
		System.out.println("Adios!");
	}
}
