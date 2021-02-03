package com.isf;

public class Biblioteca {
	
	private Libro[] libros;
	private int cont; // el numero de libros que tenemos en la libreria
	private static int n = 10; // tama�o total de la libreria (max 10)
	
	public Biblioteca(){
		//* Este m�todo obligatoriamente debe ir generando todos los libros guard�ndolos en el array. Dicho de otro modo, debemos
//		de tener guardada la informaci�n de los libros en un array de 10 elementos.
		libros = new Libro[n];
	}
	public Biblioteca(Libro[] libros, int cont){
	//* Dado un libro de tipo Libro [] introducir los libros y un n�mero de libros que viene dado por el par�metro CONT.
		this.libros = libros;
		this.cont = cont;
	}
	public Libro[] getLibros() {
	//* RETORNAR LOS LIBROS.
		return libros;
	}
	public void setLibros(Libro[] libros) {
	//* Introduce el n�mero de libros.
		this.libros = libros;
	}
	public int getCont() {
	//* RETORNA EL NUMERO DE LIBROS;
		return cont;
	}
	public void setCont(int cont) {
	//* Introduce el n�mero de libros que viene dado por el par�metro CONT
		this.cont = cont;
	}
	public static int getN() {
	//* RETORNAR EL n�mero N que libros que tenemos (en este caso 10);
		return n;
	}
	public boolean equals(Biblioteca biblioteca){
	//* Devuelve TRUE si los libros de la biblioteca no son los mismos y FALSE en caso contrario. Tener en cuenta que
//		tenemos GUARDADO LOS LIBROS en un array de libros.
		boolean equals = true;
		if(n == getN() && this.cont == biblioteca.getCont()) { //getN() es de biblioteca como es static no hace falta poner biblioteca.getN()
			for (int i = 0; i < biblioteca.libros.length; i++) {
				if(!this.libros[i].equals(biblioteca.libros[i])) { // si no son iguales uno de los libros pues ya devolvemos false
					equals = false;
					return equals;
				}
			}
			return equals; // si todos son iguales devolvemos true
		}else {
			return false; // si n y count son diferentes no hace falta buscar en los libros
		}
		
	}
	public String toString(){
	//* Devuelve un STRING donde se va guardando todos los mensajes que tiene cada posici�n del array libros.
		String ST = "";
		for (int i = 0; i < libros.length; i++) {
			ST = ST + libros[i].toString() + "\n"; //siendo ST una variable de tipo String
		}
		return ST;
	}
	public boolean buscar(long isbn){
	/*Devuelve true si el libro est� en la biblioteca. Devuelve false si el libro no est� en la biblioteca. Tener en
	cuenta los libros est�n en un array */
		boolean existe = false;
		for (int i = 0; i < libros.length; i++) {
			if(libros[i].getIsbn() == isbn) {
				existe = true;
				return true;
			}
		}
		return existe;
	}
	private int buscarPos(long isbn){
	//* Dado un ISBN de un libro, devuelve la posici�n donde est� dentro del array y si no est� devuelve un -1.
		int pos = -1;
		for (int i = 0; i < libros.length; i++) {
			if(libros[i].getIsbn() == isbn) {
				pos = i;
				return pos;
			}
		}
		return pos;
	}
	public boolean insertar(Libro libro){
	/*Si tengo espacio en la biblioteca y no hay otro libro con ese mismo c�digo isbn SE INSERTA el libro que viene
	dado por el par�metro libro. Se aconseja usar el m�todo	anterior BUSCARPOS*/
		boolean inserted = false;
		if (buscarPos(libro.getIsbn()) != -1) {
			for (int i = 0; i < libros.length; i++) {
				if(libros[i] == null) {
					libros[i] = libro;
					inserted = true;
					return inserted;
				}
			}
			System.out.println("Biblioteca llena");
			return inserted;
		}
		System.out.println("Libro ya existente");
		return inserted;
	}
	public boolean eliminar(long isbn){
	/*Si existe un libro con ese isbn en la biblioteca lo borro en caso contrario no hago nada. Se aconseja usar el m�todo
	BUSCARPOS*/ 
		int pos = buscarPos(isbn);
		if ( pos != -1) {
			libros[pos] = null;
			return true;
		}else {
			return false;
		}
	}
}
