package ut3;
public class Ejercicio2 {
	public static void main(String[] args) {
		int rand;
		int cont1 = 0, cont5 = 0, cont10 = 0, contRest = 0;
		for (int i = 0; i < 100; i++) {
			rand = (int)(Math.random()*10 +1);
			switch (rand) {
			case 1:
				cont1++;
				break;
			case 5:
				cont5++;
				break;
			case 10:
				cont10++;
				break;
			default:
				contRest++;
				break;
			}
		}
		System.out.printf("Numero de veces que ha aparecido cada uno de los numeros\n"
				+ "1: %d\n5: %d\n10: %d\nEl resto: %d", cont1, cont5, cont10, contRest);
	}
}
