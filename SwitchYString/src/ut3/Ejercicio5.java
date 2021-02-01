package ut3;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Introduzca un texto:");
		String textoUsuario = new String(input.nextLine()); //nextLine para que no pare al encontrarse un espacio en blanco
		String[] palabras = textoUsuario.split(" ");
		System.out.println("Palabras encontradas en el texto:");
		for (int i = 0; i < palabras.length; i++) {
			System.out.println(palabras[i]);
		}
		input.close();
	}

}
