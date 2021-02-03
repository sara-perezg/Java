package com.isf;

public class Libro {
	//* Definir un atributo PRIVADO de tipo LONG llamado ISBN para almacenar el ISBN del libro.
	//* Definir un atributo PRIVADO de tipo string llamado TITULO para guardar el título del libro.
	//* Definir un atributo PRIVADO de tipo PERSONA llamado AUTOR para guardar el autor del libro.
	//* Definir un atributo PRIVADO de tipo INT llamado PAGINAS para guardar el número de páginas del libro.
	
	private long isbn;
	private String titulo;
	private Persona autor;
	private int paginas;

	public Libro(){
	//* Inicializar los atributos de la clase Libro definidos anteriormente
		super();
		isbn = 0;
		titulo = "No definido";
		autor = null;
		paginas = 0;
	}
	public Libro(long isbn,String titulo,Persona autor,int paginas){
	//* Introduce el isbn, titulo, autor y páginas.
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
	}
	public long getIsbn() {
	//* Retorna el isbn
		return isbn;
	}
	public void setIsbn(long isbn) {
	//** Introduce el isbn
		this.isbn = isbn;
	}
	public String getTitulo() {
	//* Retorna el titulo
		return titulo;
	}
	public void setTitulo(String titulo) {
	//* Introduce el titulo
		this.titulo = titulo;
	}
	public Persona getAutor() {
	//* Retorna el autor;
		return autor;
	}
	public void setAutor(Persona autor) {
	//* Introduce el autor;
		this.autor = autor;
	}
	public int getPaginas() {
	//* Retorna el número de páginas;
		return paginas;
	}
	public void setPaginas(int paginas) {
	//* Introduce el número de páginas
		this.paginas = paginas;
	}
	public boolean equals(Libro l){
	//* Dado un libro L, retorna TRUE si tienen el mismo ISBN, titulo, autor y número de páginas. Retorno FALSE en casa
//	contrario.
		return this.isbn == l.isbn && this.titulo == l.titulo && this.autor.equals(l.autor) && this.paginas == l.paginas;
	}
	public String toString(){
	//* Devuelve un STRING con un mensaje de la forma (por ejemplo):
//	ISBN 100000 TITULO las meninas AUTOR Juan Perez	Número de Páginas 1000
		return "ISBN " + isbn +  "TITULO " + titulo + "AUTOR " + autor.getNombre()+"Número de Páginas " +paginas;
	}
}
