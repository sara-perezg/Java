package ut3;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dado;
		int cont1 = 0, cont2 = 0, cont3 = 0,cont4 = 0,cont5 = 0,cont6 = 0;
		for (int i = 0; i < 1000; i++) {
			dado = (int)(Math.random()*6) + 1;
			
			switch (dado) {
			case 1:
				cont1++;
				break;
			case 2:
				cont2++;
				break;
			case 3:
				cont3++;
				 break;
			case 4:
				cont4++;
				break;
			case 5:
				cont5++;
				break;
			case 6:
				cont6++;
				break;
			}
		}
		System.out.printf("Numero de veces que ha aparecido cada cara del dado\n"
				+ "1: %d\n2: %d\n3: %d\n4: %d\n5: %d\n6: %d", cont1, cont2, cont3, cont4, cont5, cont6);
	}

}
