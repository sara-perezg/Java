package com.isf;

import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			ArrayList<Empleado> empleados = new ArrayList<Empleado>();
			empleados.add(new Empleado("Rafa"));
			empleados.add(new Directivo("Maria"));
			empleados.add(new Operario("Alfonso"));
			empleados.add(new Oficial("Luis"));
			empleados.add(new Tecnico("Pablo"));
			
//			Empleado emp2 = new Empleado("Maria");
//			Directivo emp2 = new Directivo("Maria");
//			Operario emp3 = new Operario("Alfonso");
//			Oficial emp4 = new Oficial("Luis");
//			Tecnico emp5 = new Tecnico("Pablo");
			
			for (int i = 0; i < empleados.size(); i++) {
				System.out.println(empleados.get(i).toString());
			}
			
	}

}
