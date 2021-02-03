package com.isf;

public class Persona {
	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;
	private String nacionalidad;
	
	public Persona(){
	//* Inicializar la clase Persona
		super();
	}
	public Persona(String dni,String nombre,String apellidos,int
	edad,String nacionalidad) {
	//* Introducir los datos de la persona (dni, nombre, apellidos,
//		edad y nacionalidad)
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.nacionalidad = nacionalidad;
	}
	public String getDni() {
	//* Retornar el DNI
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
	//* Retornar el nombre
		return nombre;
	}
	public void setNombre(String nombre) {
	//* Introduce el nombre
		this.nombre = nombre;
	}
	public String getApellidos() {
	//* Retornar el apellido
		return apellidos;
	}
	public void setApellidos(String apellidos) {
	//* Introduce el apellido
		this.apellidos = apellidos;
	}
	public int getEdad() {
	//* Retornar la edad
		return edad;
	}
	public void setEdad(int edad) {
	//* Introduce la edad
		this.edad = edad;
	}
	public String getNacionalidad() {
	//* Retornar la nacionalidad.
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
	//* Introduce la nacionalidad
		this.nacionalidad = nacionalidad;
	}
	public boolean equals(Persona p){
	//* Dado una persona p de tipo Persona, devuelve true si
//		coinciden todos los atributos (nombre, apellidos, dni, edad y
//		nacionalidad), y devuelve false en caso contrario.
		return this.dni == p.getDni() && this.nombre == p.getNombre() && this.apellidos == p.apellidos && this.edad == p.getEdad() && this.nacionalidad == p.getNacionalidad();		
	}
	public String toString(){
	//* Devuelve un STRING con un mensaje de la forma (por
//		ejemplo):
//		DNI 1111 NOMBRE Luis APELLIDOS Perez EDAD 23
//		NACIONALIDAD España
		return "DNI " + dni + "NOMBRE " + nombre + "APELLIDOS " + apellidos + "EDAD " + edad + "NACIONALIDAD " + nacionalidad;
		
	}
//		CLASE LIB
}
