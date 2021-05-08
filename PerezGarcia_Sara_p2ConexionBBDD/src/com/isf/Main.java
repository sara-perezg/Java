package com.isf;

import java.util.Scanner;
public class Main {
	
	public static String[] getDatosEmpleado() {
		Scanner input = new Scanner(System.in);

		System.out.print("Introduzca el nombre:");
		String nombre = input.next();
		System.out.print("Introduzca el primer apellido:");
		String apellido1 = input.next();
		System.out.print("Introduzca el segundo apellido:");
		String apellido2 = input.next();
		
		return new String[] {nombre,apellido1,apellido2};
	}
	public static String getID() {		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Introduzca el id del empleado al que desea acceder:");
		String id = input.next();
		return id;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		ConectorDB cDB = new ConectorDB();
		
		int control = 0;
		do {
			System.out.println("\nIntroduzca la opcion que desee:"
					+ "\n1) Inserccion de un empleado"
					+ "\n2) Actualizacion del nombre de un empleado"
					+ "\n3) Eliminacion de un empleado"
					+ "\n4) Mostrar la base de datos"
					+ "\n5) Mostrar a un empleado"
					+ "\n6) Salir del programa");
			System.out.print("Opcion: ");
			control = input.nextInt();
			
			switch (control) {
			case 1:
				String[] datosEmpleado = getDatosEmpleado();
				cDB.insertEmpleado(datosEmpleado[0], datosEmpleado[1], datosEmpleado[2]);
				break;
			case 2:
				System.out.println("Mostrando la tabla Empleados...");
				cDB.showAllEmpleados();
				String id = getID();
				System.out.print("Introduzca el nuevo nombre:");
				String newNombre = input.next();
				cDB.updateNombreEmpleado(id, newNombre);
				break;
			case 3:
				cDB.deleteEmpleado(getID());
				break;
			case 4:
				cDB.showAllEmpleados();
				break;
			case 5:
				cDB.showEmpleadoByID(getID());
				break;
			default:
				break;
			}
		} while (control != 6);
		
		System.out.println("\nFin del programa.\nAdios!");
		
		input.close();
	}

}
