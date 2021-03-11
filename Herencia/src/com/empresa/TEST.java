package com.empresa;

public class TEST {

	public static void main(String[] args) {
		Empleado emp1 = new Empleado("pepe", "3264545Y", 40, true, 3000.60);
		Programador emp2 = new Programador("pepa", "3264545Y", 24, false, 5000,50,"Java");
		Empleado emp3 = new Empleado("pepin", "3264545Y", 21, true, 412.0);
		
		System.out.println("Imprimendo empleado 1...");
		System.out.println(emp1.toString());
		System.out.println();
		System.out.println("Clasificacion " + emp1.clasificacion());
		System.out.println();
		System.out.println("Imprimendo empleado 2...");
		System.out.println(emp2.toString());
		System.out.println();
		System.out.println("Clasificacion " + emp2.clasificacion());
		System.out.println("\n");
		System.out.println("Aumentamos el sueldo de pepa un 10%...");
		emp2.aumento(10);
		System.out.println("\n");
		System.out.println(emp2.toString());
		System.out.println("\nImprimendo empleado 3...");
		System.out.println(emp3.toString());
		System.out.println("\n");
		System.out.println("Clasificacion " + emp3.clasificacion());
	}
}
