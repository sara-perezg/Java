package com.isf;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		int opcion;
		Scanner input = new Scanner(System.in);
		Biblioteca biblioteca = new Biblioteca();
		Libro libro;
		long isbn;
		String titulo;
		Persona autor;
		int nPags;
		do{
			System.out.println("1. Insertar un libro");
			System.out.println("2. Eliminar un libro");
			System.out.println("3. Buscar un libro");
			System.out.println("4. Mostrar todos los libros");
			System.out.println("0. Salir de la aplicación");
			System.out.print("Elige opción: ");
			opcion = input.nextInt();
			input.nextLine(); //limpiamos el buffer
			switch(opcion){
				case 1:
					// *crear un libro introduciendo toda su información POR TECLADO, es decir,	isbn, titulo, dni, nombre, apellidos, edad,
//					nacionalidad y número de páginas. Insertar los datos anteriormente tecleados en el libro de modo que habrá que
//					decir SI EL LIBRO SE HA INSERTADO CORRECTAMENTE o no en cuyo caso lo normal es que este la biblioteca LLENA y
//					no se haya podido meter mas libros.
					System.out.println("Introduzca el ISBN, titulo, autor y paginas del libro:");
//					----- atributos del libro -----
					System.out.print("ISBN: ");
					isbn = input.nextInt();
					System.out.print("Titulo: ");
					titulo = input.next();
					System.out.print("Numero de Páginas: ");
					nPags = input.nextInt();
//					----- atributos del autor -----
					System.out.print("Nombre Autor: ");
					String autorNombre = input.next();
					System.out.print("Apellidos Autor: ");
					String autorApellidos = input.next();
					System.out.print("DNI Autor: ");
					String autorDNI = input.next();
					System.out.print("Nacionalidad Autor: ");
					String autorNac = input.next();
					System.out.print("Edad Autor: ");
					int autorEdad = input.nextInt();
					autor = new Persona(autorDNI,autorNombre,autorApellidos, autorEdad, autorNac);
					libro = new Libro(isbn,titulo,autor,nPags);
					
					if (biblioteca.insertar(libro)) {
						System.out.println("Libro insertado correctamente.");
					}else {
						System.out.println("El libro no se ha podido insertar.");
					}
					break;
				case 2:
					//* Dado un ISBN (que Habra que leer por teclado), eliminar dicho libro de la biblioteca. Puede suceder de que ese libro
//					no esté con lo cual habría que decir que dicho libro NO SE PUEDE BORRAR	PORQUE NO ESTA EN LA BIBLIOTECA., 
					System.out.print("Dame el ISBN: ");
					isbn = input.nextLong();
					if(biblioteca.buscarPos(isbn)==-1) {
						
					}
					break;
				case 3:
					//* Dado un ISBN (que habrá que leer por teclado), buscar dicho libro de la biblioteca. Puede suceder de que ese libro no esté con
//					lo cual habría que decir que dicho libro NO ESTA EN LA BIBLIOTECA.
					break;
				case 4:
					//* Mostrar todos los libros de la biblioteca
					break;
				case 0:
					System.out.println("Gracias por usar mi	biblioteca");
					 break;
				default:
					System.out.println("Opción incorrecta");
			}
		}while(opcion != 0);
		
	}
}
