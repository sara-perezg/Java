package ut3;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dado, check;
		int par = 0, impar = 0;
		for (int i = 0; i < 1000; i++) {
			dado = (int)(Math.random()*6) + 1;
			check = dado%2;
			switch (check) {
			case 0:
				par++;
				break;
			case 1:
				impar++;
				break;
			}
		}
		System.out.printf("Numero de veces que han aparecido numeros pares e impares en las 1000 tiradas\n"
				+ "Par: %d\nImpar: %d\n", par, impar);
	}

}
