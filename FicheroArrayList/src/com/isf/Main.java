package com.isf;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
public class Main {
	
	public static void parsePartidos(ArrayList<PartidoFutbol> partidos) {
		for (PartidoFutbol p : partidos) {			
			System.out.printf("%s %d - %d %s\n", 
					p.getNombreEquipoLocal(), p.getGolesEquipoLocal(),
					p.getGolesEquipoVisitante(), p.getNombreEquipoVisitante());
		}
	}
	
	public static ArrayList<PartidoFutbol> removeNoEmpates(ArrayList<PartidoFutbol> partidos) {
		
		for (int i = 0; i < partidos.size(); i++) {
			if (partidos.get(i).getGolesEquipoVisitante() != partidos.get(i).getGolesEquipoLocal()) {
				partidos.remove(i);
				i--;
			}
		}
		return partidos;
	}
	public static void main(String[] args) {
		System.out.println("... Nos creamos un ArrayList de los objetos de la clase \"PartidosFutbol\"...");
		ArrayList<PartidoFutbol> partidos = new ArrayList<PartidoFutbol>();
		String path = "partidos.txt";
		File fichero = new File(path);
		try {
			Scanner s = new Scanner(fichero);
			System.out.println("El contenido del fichero es");
			System.out.println("---------------------------------------");
			while (s.hasNextLine()){
				// Obtengo una linea del fichero (un partido de fútbol)
				String linea = s.nextLine();
				System.out.println(linea);
				// Obtengo los datos del partido de futbol
				String [] cortarString = linea.split(":");
				// Creo un objeto de la clase "PartidoFutbol"
				PartidoFutbol partido = new PartidoFutbol();
				// Pongo los atributos al objeto "partido"
				partido.setNombreEquipoLocal(cortarString[0]);
				partido.setNombreEquipoVisitante(cortarString[1]);
				partido.setGolesEquipoLocal(Integer.parseInt(cortarString[2]));
				partido.setGolesEquipoVisitante(Integer.parseInt(cortarString[3]));
				// Añadimos el objeto "partido" al ArrayList
				partidos.add(partido);
			}
			s.close();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("\n... Resultados de los partidos de futbol...");
		parsePartidos(partidos);
		System.out.println("\n... Eliminamos los partido de futbol cuyo resultado no sea un empate...\n");
		partidos = removeNoEmpates(partidos);
		System.out.printf("\nQuedan %d partidos\n", partidos.size());
		System.out.println("\nResultados de los partidos de Futbol con empate");
		System.out.println("---------------------------------------");
		parsePartidos(partidos);
	}
}

