package figura;

import java.util.ArrayList;
public class Test {

	public static void main(String[] args) {
		ArrayList<Figura> figuras = new ArrayList<Figura>();
		
		figuras.add(new Triangulo("verde",9,4,9,3,4));
		figuras.add(new Circulo("rojo",2));
		figuras.add(new Rectangulo("azul",12,3));
		
		for (Figura figura : figuras) {
			System.out.println(figura.toString());
		}
	}
}
