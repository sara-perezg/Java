package com.isf;

import java.util.ArrayList;
public class Agenda {
	ArrayList<Persona> agenda = new ArrayList<Persona>();

	public Agenda() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Agenda(ArrayList<Persona> agenda) {
		super();
		this.agenda = agenda;
	}

	@Override
	public String toString() {
		return "Agenda [agenda=" + agenda + "]";
	}
	
	public void add(Persona persona) {
		agenda.add(persona);
		System.out.println(persona + " añadido correctamente.");
	}
	
	public void remove(Persona persona) {
		for (int i = 0; i < agenda.size(); i++) {
			if (agenda.get(i).equals(persona)) {
				agenda.remove(i);
			}
		}
		
	}
	public int buscar(Persona persona) {
		for (int i = 0; i < agenda.size(); i++) {
			if (agenda.get(i).equals(persona)) {
				return i;
			}
		}
		return -1;
	}
}
