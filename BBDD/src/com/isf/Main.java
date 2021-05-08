package com.isf;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ConexionDB cBD = new ConexionDB();
		
		System.out.println("Mostrando todos los empleados...");
		cBD.getAllEmpleados();
		System.out.println("\nMostrando el empleado con id = 1...");
		cBD.getEmpleadoByID(1);
		
		System.out.print("\nIntroduzca el id: ");
		String id = input.next();
		System.out.print("Introduzca el Nombre: ");
		String nombre = input.next();
		
		cBD.insertEmpleado(id, nombre);
		
		System.out.println("\nBuscando por puesto FrontEnd...");
		cBD.consultaPorPuesto("FrontEnd");
		System.out.println();
		
		input.close();
	}
}
