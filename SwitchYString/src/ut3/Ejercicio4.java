package ut3;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static void showData(String[][] personas) {
		// funcion que recorre la matriz de personas y la enseña por pantalla
		System.out.println("-------- Datos guardados ---------");
		System.out.println("Nombre\tEmail");
		for (int i = 0; i < personas.length; i++) {
			for (int j = 0; j < personas[0].length; j++) {
				System.out.print(personas[i][j]+"\t");
			}
			System.out.println("");
		}
	}
	public static String getEmail(String name, String[][] personas) {
		// funcion que recorre una matriz y busca el string name. Si lo encuentra devuelve el email de esa fila correspondiente a ese nombre
		String email = new String("Not found"); //inicializamos a Not found en caso de que no lo encuentre
		for (int i = 0; i < personas.length; i++) {
			if(personas[i][0].equals(name)) { // primera posicion son nombres
				email = personas[i][1]; // segunda los emails
				return email; 
			}
		}
		return email;
	}
	
	public static void checkForEmail(String[][] personas) {
		// funcion que recorre la matriz y busca email que no contengan el simbolo '@'
		for (int i = 0; i < personas.length; i++) {
			if(personas[i][1].indexOf("@") == -1) { // indexOf devuelve el valor -1 cuando no encuentra el string '@' en el email (segunda posicion del array)
				System.out.println(personas[i][1]); // enseñamos por pantalla el email que no tenga '@'
			}
		}
	}
	public static void main(String[] args) {


//		creamos una matriz que contenga las 5 peronas [5][2]
		final int NPERSONAS = 5;
		String[][] personas = new String[NPERSONAS][2];
		
//		String[][] personas = new String[][]{persona1, persona2};
		Scanner input = new Scanner (System.in);
		
		System.out.print("================================================================\n"
				         + "  Programa que almacena los nombres y los emails de 5 personas  \n"
				         + "================================================================\n");
		
//		pedimos al usuario que introduzca los datos
		for (int i = 0; i < personas.length; i++) {
			System.out.print("Introduza su nombre: ");
			personas[i][0] = input.next(); //nombre en posicion 1
			System.out.print("Introduzca su email: ");
			personas[i][1] = input.next(); // emails en posicion 2
		}
		
		boolean program = true;
		
		do {
			System.out.println("\nIntroduzca la opcion que desee realizar:\n"
					+ "1) Enseñar los datos\n"
					+ "2) Buscar un email por nombre\n"
					+ "3) Visualizar los email que no contengan el simbolo '@'\n"
					+ "4) Salir\n");
			int option = input.nextInt();
			if(option>0 || option < 5) {
				switch (option) {
				case 1:
					showData(personas); // enseñamos los datos por pantalla
					break;
				case 2:
					System.out.print("------------------\nIntroduzca el nombre que desea buscar: "); // le pedimos al usuario que busque un email por el nombre de la persona
					String name = input.next();
					String email = getEmail(name, personas); // buscamos el email 
					System.out.printf("El email de %s es %s\n------------------\n", name, email); // enseñamos por pantalla
					break;
				case 3:
					// enseñamos por pantalla los email que no contengan '@'
					System.out.println("------------------\nLos emails que no tienen el simbolo '@' son:");
					checkForEmail(personas);
					System.out.println("------------------");
					break;
				case 4:
					program = false;
					System.out.println("\nFin del programa");
				}
			}else {
				System.out.println("Error opcion no valida");
			}
		}while(program);

		input.close();
	}

}
