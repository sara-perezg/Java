package com.isf;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Agenda miAgenda = new Agenda();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduzca los datos de la persona: ");
//		System.out.println("Para salir introduzca q/Q");
//		String user = input.next();
		String user = "";
		do {

			System.out.println("Nombre:");
			String name = input.nextLine();
			System.out.println("Apellido:");
			String lastName = input.nextLine();
			System.out.println("Direccion:");
			String dir = input.nextLine();
			System.out.println("Telefono:");
			int tel = input.nextInt();
			miAgenda.add(new Persona(tel, name, lastName, dir));
			System.out.println("Para salir introduzca q/Q");
			user = input.next();
		}while (user.toUpperCase().charAt(0) != 'Q') ;
		System.out.println(miAgenda.toString());
		input.close();


	}
}
