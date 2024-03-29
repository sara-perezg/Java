package com.isf;

public class Apliacacion {

	public static ColeccionSimple rellenar(ColeccionSimple cs) {
		int total = 10;
		for (int i = 1; i <= total; i++) {
			cs.add(i);
		}
		return cs;
	}
	
	public static ColeccionSimple imprimirYVaciar(ColeccionSimple cs) {
		
		while(!cs.estaVacia()) {
			System.out.println(cs.toString());
			cs.extraer();
		}
		return cs;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Apartado 1. Rellenar, imprimir y vaciar una pila
		System.out.println("Creando una Pila...");
		Pila miPila = new Pila();
		
		miPila = (Pila) rellenar(miPila);
		System.out.println("Pila creada por el metodo rellenar()");
		System.out.println(miPila);
		System.out.println("Llamando al metodo imprimirYVaciar()...");
		miPila = (Pila) imprimirYVaciar(miPila);
		System.out.println("Pila tras la ejecucion del metodo anterior:");
		System.out.println(miPila);

//		Apartado 2. Rellenar, imprimir y vaciar una cola
		System.out.println("\nCreando una Cola...");
		Cola miCola= new Cola();
		
		miCola = (Cola) rellenar(miCola);
		System.out.println("Cola creada por el metodo rellenar()");
		System.out.println(miCola);
		System.out.println("Llamando al metodo imprimirYVaciar()..");
		miCola = (Cola) imprimirYVaciar(miCola);
		System.out.println("Cola tras la ejecucion del metodo anterior:");
		System.out.println(miCola);
		
//		Apartado 3. Rellenar con varios objetos, imprimir y vaciar la pila anterior
		System.out.println("\nAņadiendo varios objetos a la anterios Pila...");
		miPila.add(1);
		miPila.add("string");
		miPila.add(true);
		miPila.add(1.4);
		System.out.println("Pila creada:");
		System.out.println(miPila);
		System.out.println("Llamando al metodo imprimirYVaciar()...");
		miPila = (Pila) imprimirYVaciar(miPila);
		System.out.println("Pila tras la ejecucion del metodo anterior:");
		System.out.println(miPila);
		
		System.out.println("\n\nFin del programa\n Adios!");
	}

}
