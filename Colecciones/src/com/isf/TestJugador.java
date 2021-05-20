package com.isf;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.HashSet;
public class TestJugador {

	public static LinkedList<Jugador> addJugador(LinkedList<Jugador> jugadores){
		
		Scanner input = new Scanner (System.in);
		System.out.println("Introduce el nombre del jugador:");
		String nombre = input.next();
		System.out.println("Introduce la edad del jugador:");
		int edad = input.nextInt();
		System.out.println("Introduce el nombre del equipo");
		String nombreEquipo = input.next();
		System.out.println("Introduce el numero de canastas:");
		int numCanastasIntroducidas = input.nextInt();
		System.out.println("Introduce el nombre de la ciudad");
		String ciudad = input.next();
		
		Jugador jugador = new Jugador(nombre, edad, nombreEquipo, numCanastasIntroducidas, ciudad);
		
		jugadores.add(jugador);
		return jugadores;
	}
	
	public static int getJugadorByName(LinkedList<Jugador> jugadores) {
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce el nombre del jugador");
		String name = input.next();
		for (int i = 0; i < jugadores.size(); i++) {
			if (jugadores.get(i).nombre.equalsIgnoreCase(name)) {
				return i;
			}
		}
		return -1;
	}
	
	public static Jugador modifyCanastas(int newCanastas, Jugador jugador) {
		jugador.numCanastasIntroducidas = newCanastas;
		return jugador;
	}
	
	public static LinkedList<Jugador> removeByCanastas(int totalCanastas, LinkedList<Jugador> jugadores){
		
		for (Iterator iterator = jugadores.iterator(); iterator.hasNext();) {
			Jugador jugador = (Jugador) iterator.next();
			if (jugador.numCanastasIntroducidas < totalCanastas) {
				iterator.remove();
			}
		}
		return jugadores;
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		LinkedList<Jugador> jugadores = new LinkedList<Jugador>();
		
		int control = 0;
		do {
			System.out.println("Introduzca la opcion que desee"
					+ "\n1) Introducir un nuevo jugador"
					+ "\n2) Consulta los datos de un jugador apartir de su nombre"
					+ "\n3) Modifica las canastas introducidas por un jugador"
					+ "\n4) Borra el jugador en funcion de las canastas"
					+ "\n5) Borra toda la coleccion"
					+ "\n6) Enseñar los jugadores"
					+ "\n7) Mostrar unicos"
					+ "\n8) Salir");
			control = input.nextInt();
			
			switch (control) {
			case 1:
				jugadores = addJugador(jugadores);
				break;
			case 2:
				int pos = getJugadorByName(jugadores);
				if(pos != -1)
					System.out.println(jugadores.get(pos));
				break;
			case 3:
				Jugador jugador = jugadores.get(getJugadorByName(jugadores));
				System.out.println("Introduzca el nuevo valor de las canastas:");
				int newCanastas = input.nextInt();
				jugador = modifyCanastas(newCanastas, jugador);
				break;
			case 4:
				System.out.println("Introduce el numero de canastas:");
				int totalCanastas = input.nextInt();
				jugadores = removeByCanastas(totalCanastas,jugadores);
				break;
			case 5:
				jugadores.removeAll(jugadores);
				break;
			case 6:
				System.out.println(jugadores);
				break;
			case 7:
				System.out.println("Sin duplicados");
				HashSet<Jugador> jugadoresUnique = new HashSet<Jugador>(jugadores);
				System.out.println(jugadoresUnique);
				
				break;	
			default:
				if(control != 8)
					System.out.println("Opction no valida");
				break;
			}
		} while (control != 8);
		System.out.println("Adios!");
		input.close();
	}
}
