package com.sara;
import java.util.Scanner;
import java.util.Arrays;


public class MiTresEnRaya {

 // ---- generar matriz -----
	public static char[][] generateTablero(char emptySpace){
//		funcion que genera una matriz 3x3 tipu char con "-" en todas sus posiciones
		char[][] tablero = new char[3][3];
		
		for (int i = 0; i < tablero.length; i++){
			for (int j = 0; j < tablero[0].length; j++){
				tablero[i][j] = emptySpace; // si queremos cambiar el simbolo default
				}
			}
		return tablero;
	}

  // ------ show tablero -------
	public static void showTablero(char[][] tablero){
//		funcion que enseña una matriz por pantalla para dimensiones 3x3 en forma de tablero
		System.out.println(" ----------- ");
		for (int i = 0; i < tablero.length; i++){
			for (int j = 0; j < tablero[0].length; j++){
				System.out.printf("| %s ",String.valueOf(tablero[i][j]));
				}
			System.out.println("|");
			}
		System.out.println(" ----------- ");
	}
	
//	--------- adding new position to the tablero ---------- 
	public static char[][] addPosition(char[][] tablero,int row, int col, char simbol){
//		funcion que dado un tablero, la posicion de filas y columnas, introduce el simbolo dado para esa posicion
		tablero[row][col] = simbol;
		return tablero; // devuelve el tablero tipo char
	}
	
//	-------- getCol --------
	public static char[] getCol(char[][] tablero, int position){
//		funcion que para una matriz dada 3x3, devuelve la columna selecionada en tipo array
		char[] column = new char[3];
		
		for (int i = 0; i < tablero.length; i++) {
			column[i] = tablero[i][position]; // la posicion smp sera fija para obtener las columnas
		}
		return column;
	}
	
//	-------- getRow -------
	public static char[] getRow(char[][] tablero, int position){
		//idem que getCol pero para filas
		char[] row = new char[3];
		
		for (int i = 0; i < tablero.length; i++) {
			row[i] = tablero[position][i]; //en este caso las filas quedan siempre fijas
		}
		return row;
	}
	
//	----- solving the game --------
	public static boolean solved(char[][] tablero, char simbol){
		// funcion que resuelve si en el tablero (matrix 3x3) hay un 3 en raya
		// hay que especificar para que simbolo hay que buscar el tres en raya si para X o para O
//		con la variable simbol
		boolean tableroSolved = false; // devuleve true si está resuelto y false si no lo esta
		
		char[] solution = new char[3]; //array con 3 posiciones iguales a las del simbolo dato
		char[] tableroCol = new char[3]; // varible que ira tomando las columnas del tablero
		char[] tableroRow = new char[3]; // idem pero con las filas
		char[] diagonal1 = new char[]{tablero[0][0], tablero[1][1],tablero[2][2]}; //la diagonal descendente
		char[] diagonal2 = new char[]{tablero[0][2], tablero[1][1],tablero[2][0]}; // diagonal ascendente
		
//		initializating el array solution
		for (int i = 0; i < solution.length; i++) {
			solution[i] = simbol; // dependiendo del jugador va a ser un simbolo u otro
		}
		
//		checking rows and cols
		for (int i = 0; i < tablero.length; i++) {
			tableroRow = getRow(tablero,i); // obtenemos la primera fila
			tableroCol = getCol(tablero,i); // la primera columna
//			si la fila o la columna esta formada por tres simbolos iguales
			if( Arrays.equals(tableroRow, solution) || Arrays.equals(tableroCol, solution)){ 
				tableroSolved = true;
				return tableroSolved; // el tablero esta resuelto
			}
		}
		
//		checking the diagonals
		// si alguna diagonal esta formada por los tres simbolos iguales
		if(Arrays.equals(diagonal1, solution) || Arrays.equals(diagonal2, solution)){
			tableroSolved = true;
			return tableroSolved; // el tablero esta resuelto
		}
		
		return tableroSolved; // si no hay tres en raya en ningua de las filas, columnas o diagonales, el tablerono esta resulto (false)
	}
	
//	-------- unsolved tablero --------
	public static boolean unsolved(char[][] tablero){
		// esta funcion comprueba que sigue habiendo posiciones donde poner X o O
		// va de la mano de solved. Si no existen mas "-" y no el tablero no esta solucionado. Es que no hay solucion posible
		boolean unsolved = true;
		
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				if(tablero[i][j] == "-".charAt(0)) { // si todavia quedan posiciones donde poner
					unsolved = false; // el tablero sigue sin estar resuelto
					return unsolved;
				}
			}
		}
		return unsolved;  // (true) si no queda ninguna posicion libre, el trablero esta sin resolver
	}
	
// ---------- check correct position -----
	public static boolean checkPosition(char[][] tablero,int i, int j) {
		// funcion que comprueba que la posicion elegida por el usuario es valida
		//devuelve un booleano true si todo esta bien, o false si algo falla
		boolean correct = true;
		
		if (i < 0 || i > 3 || j < 0 || j > 3) { //tiene que estar entre 0 y 2 ( 1 y 3 para el usuario)
			System.out.println("Posicion no valida! Los valores de fila y columna tienen que estar entre 1 y 3.");
			showTablero(tablero);
			correct = false;
			return correct;
		}
		
		if(tablero[i][j] == "O".charAt(0) || tablero[i][j] == "X".charAt(0)) { // no puede sobreesecibir una posicion
			System.out.println("Posicion no valida! No puede sobreescribir esta posicion.");
			showTablero(tablero);
			correct = false;
			return correct;
		}
		return correct; // si todo esta okay correct = true
	}
	
 // =========== MAIN ===============
	public static void main(String[] args) {
		
		int userRow, userCol, totalPlays = 0; // posiciones elegidas por el usuario y numero de la jugada para controlar a que jugador le toca
		char simbol, emptySpace = "-".charAt(0); // el signo que se va a estar usando en funcion del jugador
		String player,player1,player2; // nombre que se va a usar en cada turno, y nomber del primer y segundo jugador
		boolean tableroSolved, tableroUnSolved, correctPosition; //variables de control
		Scanner input = new Scanner(System.in);

//		presentacion del juego
		System.out.println("Bienvenido al tres en raya!");
		System.out.println("El jugador 1 (X) vs el jugador 2 (O)");
		char[][] tablero = generateTablero(emptySpace);
		showTablero(tablero);
		
//		pedimos al usuario que introduzca los nombres de los jugadores para personalizar la partida
		System.out.print("Introduzca el nombre del jugador 1: ");
		player1 = input.next();
		System.out.print("Introduzca el nombre del jugador 2: ");
		player2 = input.next();
		
		tableroSolved = false; // al inicio del juego siempre estara el tablero sin resovler

		// vamos a repetir el ciclo hasta que un jugador gane, o no haya solucion posible
		do { 
			if(totalPlays%2 == 0){ // turnos pares son del primer jugador
				player = player1;
				simbol = "X".charAt(0);
			}else { // turnos impares del segundo
				player = player2;
				simbol = "O".charAt(0);
			}
			
			// en el caso de que el usuario no introduzca correctamente una posicion 
//			se le pedira que la vuelva a introducir hasta que sea correcta
			do{
//				pedimos al usuario que introduzca las posiciones
				System.out.printf("~~~~~ Turno de %s ~~~~~\n", player); //player estara personalizado en funcion del turno
				System.out.print("Introduzca la fila: ");
				userRow = input.nextInt()-1;
				System.out.print("Introduzca la columna: ");
				userCol = input.nextInt()-1;
				
//				comprobamos que es una posicion valida
				correctPosition = checkPosition(tablero,userRow,userCol);
				
				if(correctPosition) { //si es valida la posicion la añadimos
					tablero = addPosition(tablero,userRow,userCol, simbol); // añadimos el simbolo del jugador correspondiente
					// vemos si esta resuleto el tablero
					tableroSolved = solved(tablero,simbol); 
					
					if(tableroSolved) { // si esta resuelto imprimimos un mensaje por pantalla
						System.out.printf("Enhorabuena %s, ha ganado!\n", player);
					}
				}
			}while(correctPosition == false); // se repite hasta que la posicion dada por el usuario sea correcta
			
			showTablero(tablero); 
			totalPlays++; // siguiente turno
			tableroUnSolved = unsolved(tablero); // comprobamos que no se hayan acabado las posiciones libres
			
			if(tableroUnSolved) { // si esta sin resolver (no hay mas "-") se acaba el juego y se imprime por pantalla
				System.out.println("Se acabo el juego, no hay un ganador...");
			}
		}while(tableroSolved == false && tableroUnSolved == false);
		
		input.close();
		
	}
}