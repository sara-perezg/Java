package com.isf;

public class Alumno {

	private int nExp;
	private String nombre;
	private String apellidos;
	private int edad;
	private String tel;
	private String email;
	private String dni;
	private String fechaN;
	private int nota;
	
	public Alumno() {super();};
	public Alumno(String nombre, String apellidos, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
	public Alumno(int nExp, String nombre, String apellidos, int edad, String tel, String email, String dni,String fechaN, int nota) {
		super();
		this.nExp = nExp;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.tel = tel;
		this.email = email;
		this.dni = dni;
		this.fechaN = fechaN;
		this.nota = nota;
	}
	
	public int getnExp() {
		return nExp;
	}
	public void setnExp(int nExp) {
		this.nExp = nExp;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getFechaN() {
		return fechaN;
	}
	public void setFechaN(String fechaN) {
		this.fechaN = fechaN;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	@Override
	public String toString() {
		return "Alumno [nExp=" + nExp + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", tel="
				+ tel + ", email=" + email + ", dni=" + dni + ", fechaN=" + fechaN + ", nota=" + nota + "]";
	}
	
	
}
