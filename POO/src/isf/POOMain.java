package isf;

public class POOMain {
	
	public static void main(String[] args) {
//		---------------- Ejercicio Cuenta -------------
		System.out.println("---------------- Ejercicio Cuenta -------------");
		Cuenta a = new Cuenta();
		Cuenta b = new Cuenta(10.5);
		System.out.printf("El Saldo de la cuenta a es de %f\n", a.getSaldo());
		System.out.printf("El Saldo de la cuenta b es de %f\n", b.getSaldo());
		double ingreso = 2.3;
		System.out.printf("Voy a ingresar %f\n", ingreso);
		a.ingreso(ingreso);
		double retira = 3.5;
		System.out.printf("Voy a sacar %f\n", retira);
		b.reintegro(retira);
		System.out.printf("El Saldo de la cuenta a es de %f\n", a.getSaldo());
		System.out.printf("El Saldo de la cuenta b es de %f\n", b.getSaldo());
		
//		-------------- Ejercicio Alumnos -----------
		System.out.println("---------------- Ejercicio Alumnos -------------");
		
		final int ALUMNOS = 5;
		Alumnos al1 = new Alumnos();
		Alumnos al2 = new Alumnos("Luis", 5);
		Alumnos al3 = new Alumnos("Pepe", 6);
		Alumnos al4 = new Alumnos("Jose", 4);
		Alumnos al5 = new Alumnos("David", 3);
		
		double media = al1.sumarnotas(al2.sumarnotas(al3.sumarnotas(al4.sumarnotas(al5.sumarnotas(0)))))/ALUMNOS;
		System.out.printf("La nota media de los %d alumnos es %f",ALUMNOS, media);
	}
}
