package isf;
import java.util.Scanner;
public class Suma {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Introduzca cuantas veces quiere sumar: ");
		int times = input.nextInt();
		
		for (int i = 0; i < times; i++) {
			System.out.print("Introduzca un numero: ");
			int userInt = input.nextInt();
			@SuppressWarnings("deprecation")
			Integer int1 = new Integer(userInt);
			
			System.out.print("Introduzca otro numero: ");
			userInt = input.nextInt();
			@SuppressWarnings("deprecation")
			Integer int2 = new Integer(userInt);
			
			@SuppressWarnings("deprecation")
			Integer int3 = new Integer((int1.intValue()+int2.intValue()));
			
			System.out.printf("Suma:\n%d + %d = %d\n", int1.intValue(), int2.intValue(),int3.intValue());
		}
		input.close();
		
	}
}
