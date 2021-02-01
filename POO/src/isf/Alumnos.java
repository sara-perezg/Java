package isf;

public class Alumnos {
	
	//* Considera tu los atributos necesarios. 
	private String nombre;
	private double no = 0;
	//* Constructores de la clase Alumnos
	public Alumnos ()
	{ }
	public Alumnos (String nom, double no)
	{this.nombre = nom;
	 this.no = no; }
	//* getnota retorna la nota
	public double getNota()
	{ return no;}
	//* fijar la nota en el alumno
	public void setNota(double no)
	{ this.no = no;}
	//* getnombre retorna el nombre
	public String getNombre()
	{ return nombre;}
	//* pone la nota en el alumno
	public void setNombre(String nom)
	{ this.nombre = nom; }
	//* sumar notas
	public double sumarnotas(double nota)
	{ 	double suma = no + nota;
		return suma;}
}
