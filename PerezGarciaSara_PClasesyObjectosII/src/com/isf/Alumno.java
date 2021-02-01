package com.isf;

public class Alumno {

//	atributos
	private int nExp;
	private String nombre;
	private String apellidos;
	private int edad;
	private String tel; // string por si tiene el "+" del +34 por ej. 
	private String email;
	private String dni; // string por la letra final
	private String fechaN; // string por los seaparadores
	private int nota;
	
//	constructores 
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
	
//	getter y setters
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
	
//	toString
	@Override
	public String toString() {
		return "Alumno [nExp=" + nExp + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", tel="
				+ tel + ", email=" + email + ", dni=" + dni + ", fechaN=" + fechaN + ", nota=" + nota + "]";
	}
	
//	equals
	@Override // para sobreescribir el metodo equals de la clase padre
	public boolean equals(Object obj) {
		Alumno al = (Alumno) obj; // convertimos el objeto obj de clase Object a clase Alumno
		return nExp == al.nExp && nombre == al.nombre && apellidos == al.apellidos && edad == al.edad &&
				tel == al.tel && email == al.email && dni == al.dni && fechaN == al.fechaN && nota == al.nota;
	}
	
	
}
